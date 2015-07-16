package com.alf.bean;

import java.util.List;

import com.google.gson.annotations.SerializedName;

public class Response {

	private static final String FIELD_START = "start";
	private static final String FIELD_DOCS = "docs";
	private static final String FIELD_NUM_FOUND = "numFound";

	@SerializedName(FIELD_START)
	private int mStart;
	@SerializedName(FIELD_DOCS)
	private List<Doc> mDocs;
	@SerializedName(FIELD_NUM_FOUND)
	private int mNumFound;

	public Response() {

	}

	public void setStart(int start) {
		mStart = start;
	}

	public int getStart() {
		return mStart;
	}

	public void setDocs(List<Doc> docs) {
		mDocs = docs;
	}

	public List<Doc> getDocs() {
		return mDocs;
	}

	public void setNumFound(int numFound) {
		mNumFound = numFound;
	}

	public int getNumFound() {
		return mNumFound;
	}

}