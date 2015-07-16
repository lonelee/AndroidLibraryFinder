package com.alf;

import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Query;

import com.alf.bean.SearchResult;

public interface MavenApi {

	@GET("/solrsearch/select?rows=100&wt=json")
	public void getSearchResultAsync(@Query("q") String queryKey, Callback<SearchResult> callback);

	
	@GET("/solrsearch/select?wt=json")
	public void getSearchResultAsync(@Query("q") String queryKey, @Query("rows")int count, Callback<SearchResult> callback);
	
}
