package com.alf;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;

import retrofit.Callback;
import retrofit.RestAdapter;
import retrofit.RetrofitError;
import retrofit.client.Response;

import com.alf.bean.Doc;
import com.alf.bean.SearchResult;

public class Finder {

	private static final String ENDPOINT = "http://search.maven.org";

	private static final String PACKAGE_FORMAT = "%s:%s";

	public static void main(String[] args) {
		
		// -h,--help             Help Description
		Option helpOpt = Option.builder("h")
				.longOpt("help").hasArg(false)
				.desc("Help Description").build();

		//  -f,--find <keyword>   Find Library By Keyword
		Option queryOpt = Option.builder("f")
				.longOpt("find").hasArgs()
				.argName("keyword")
				.desc("Find Library By Keyword").build();
		
		
		Option maxOpt = Option.builder("m")
				.longOpt("max").hasArg()
				.argName("count")
				.desc("Max Fesult Count").build();
		
		
		Options options = new Options();
		options.addOption(queryOpt);
		options.addOption(helpOpt);
		options.addOption(maxOpt);
		
		DefaultParser parser = new DefaultParser();
		CommandLine cl = null;
		try {
			cl = parser.parse(options, args);
			if (cl.getOptions().length > 0) {
				if (cl.hasOption("h")) {
					HelpFormatter hf = new HelpFormatter();
					hf.printHelp("Usage:", options);
				} else {
					String[] keywords = cl.getOptionValues("f");
					int max = 100;
					try {
						max = Integer.parseInt(cl.getOptionValue("m"));
					} catch (NumberFormatException e) {
					}
					findLibrary(max, keywords);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 查找lib库引用地址
	 * @param keyword
	 * @param callback 
	 * @return
	 */
	public static final void findLibrary(int max, String... keywords) {
		StringBuilder sb = new StringBuilder();
		for (String kw : keywords) {
			sb.append(kw).append(" ");
		}
		RestAdapter restAdapter = new RestAdapter.Builder().setEndpoint(ENDPOINT).build();
		MavenApi api = restAdapter.create(MavenApi.class);
		String keyword = sb.toString();
		api.getSearchResultAsync(keyword, max, new Callback<SearchResult>() {

			@Override
			public void success(SearchResult result, Response response) {
				List<Doc> docs = result.getResponse().getDocs();
				if (!docs.isEmpty()) {
					ArrayList<String> libs = new ArrayList<>();
					for (Doc doc : docs) {
						libs.add(String.format(PACKAGE_FORMAT, doc.getId(), doc.getLatestVersion()));
					}
					for (String lib : libs) {
						System.out.println("compile '" + lib + "'");
					}
				} else {
					// 拼写建议
					List<String> suggestions = result.getSpellcheck().getSuggestions();
					if (!suggestions.isEmpty()) {
						
					} else {
						
					}
				}
			}

			@Override
			public void failure(RetrofitError error) {
				
			}
		});
		
	}

}
