package com.alf.bean;

import com.google.gson.annotations.SerializedName;


public class SearchResult {

    private static final String FIELD_SPELLCHECK = "spellcheck";
    private static final String FIELD_RESPONSE = "response";
    private static final String FIELD_RESPONSE_HEADER = "responseHeader";


    @SerializedName(FIELD_SPELLCHECK)
    private Spellcheck mSpellcheck;
    @SerializedName(FIELD_RESPONSE)
    private Response mResponse;
    @SerializedName(FIELD_RESPONSE_HEADER)
    private ResponseHeader mResponseHeader;


    public SearchResult(){

    }

    public void setSpellcheck(Spellcheck spellcheck) {
        mSpellcheck = spellcheck;
    }

    public Spellcheck getSpellcheck() {
        return mSpellcheck;
    }

    public void setResponse(Response response) {
        mResponse = response;
    }

    public Response getResponse() {
        return mResponse;
    }

    public void setResponseHeader(ResponseHeader responseHeader) {
        mResponseHeader = responseHeader;
    }

    public ResponseHeader getResponseHeader() {
        return mResponseHeader;
    }

	@Override
	public String toString() {
		return "SearchResult [mSpellcheck=" + mSpellcheck + ", mResponse=" + mResponse + ", mResponseHeader="
				+ mResponseHeader + "]";
	}

}