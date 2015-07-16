package com.alf.bean;

import java.util.List;

import com.google.gson.annotations.SerializedName;

public class Spellcheck {

	private static final String FIELD_SUGGESTIONS = "suggestions";

	@SerializedName(FIELD_SUGGESTIONS)
	private List<String> mSuggestions;

	public Spellcheck() {

	}

	public void setSuggestions(List<String> suggestions) {
		mSuggestions = suggestions;
	}

	public List<String> getSuggestions() {
		return mSuggestions;
	}

}