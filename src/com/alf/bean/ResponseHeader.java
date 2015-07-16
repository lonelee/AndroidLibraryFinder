package com.alf.bean;

import com.google.gson.annotations.SerializedName;

public class ResponseHeader {

	private static final String FIELD_STATUS = "status";
	private static final String FIELD_Q_TIME = "QTime";
	private static final String FIELD_PARAMS = "params";

	@SerializedName(FIELD_STATUS)
	private int mStatus;
	@SerializedName(FIELD_Q_TIME)
	private int mQTime;
	@SerializedName(FIELD_PARAMS)
	private Param mParam;

	public ResponseHeader() {

	}

	public void setStatus(int status) {
		mStatus = status;
	}

	public int getStatus() {
		return mStatus;
	}

	public void setQTime(int qTime) {
		mQTime = qTime;
	}

	public int getQTime() {
		return mQTime;
	}

	public void setParam(Param param) {
		mParam = param;
	}

	public Param getParam() {
		return mParam;
	}

}