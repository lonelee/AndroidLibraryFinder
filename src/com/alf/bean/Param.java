package com.alf.bean;

import com.google.gson.annotations.SerializedName;

public class Param {

	private static final String FIELD_SPELLCHECK_COUNT = "spellcheck.count";
	private static final String FIELD_SPELLCHECK = "spellcheck";
	private static final String FIELD_SORT = "sort";
	private static final String FIELD_Q = "q";
	private static final String FIELD_ROWS = "rows";
	private static final String FIELD_INDENT = "indent";
	private static final String FIELD_QF = "qf";
	private static final String FIELD_DEF_TYPE = "defType";
	private static final String FIELD_WT = "wt";
	private static final String FIELD_VERSION = "version";
	private static final String FIELD_FL = "fl";

	@SerializedName(FIELD_SPELLCHECK_COUNT)
	private int mSpellcheckCount;
	@SerializedName(FIELD_SPELLCHECK)
	private String mSpellcheck;
	@SerializedName(FIELD_SORT)
	private String mSort;
	@SerializedName(FIELD_Q)
	private String mQ;
	@SerializedName(FIELD_ROWS)
	private int mRow;
	@SerializedName(FIELD_INDENT)
	private String mIndent;
	@SerializedName(FIELD_QF)
	private String mQf;
	@SerializedName(FIELD_DEF_TYPE)
	private String mDefType;
	@SerializedName(FIELD_WT)
	private String mWt;
	@SerializedName(FIELD_VERSION)
	private double mVersion;
	@SerializedName(FIELD_FL)
	private String mFl;

	public Param() {

	}

	public void setSpellcheckCount(int spellcheckCount) {
		mSpellcheckCount = spellcheckCount;
	}

	public int getSpellcheckCount() {
		return mSpellcheckCount;
	}

	public void setSpellcheck(String spellcheck) {
		mSpellcheck = spellcheck;
	}

	public String getSpellcheck() {
		return mSpellcheck;
	}

	public void setSort(String sort) {
		mSort = sort;
	}

	public String getSort() {
		return mSort;
	}

	public void setQ(String Q) {
		mQ = Q;
	}

	public String getQ() {
		return mQ;
	}

	public void setRow(int row) {
		mRow = row;
	}

	public int getRow() {
		return mRow;
	}

	public void setIndent(String indent) {
		mIndent = indent;
	}

	public String getIndent() {
		return mIndent;
	}

	public void setQf(String qf) {
		mQf = qf;
	}

	public String getQf() {
		return mQf;
	}

	public void setDefType(String defType) {
		mDefType = defType;
	}

	public String getDefType() {
		return mDefType;
	}

	public void setWt(String wt) {
		mWt = wt;
	}

	public String getWt() {
		return mWt;
	}

	public void setVersion(double version) {
		mVersion = version;
	}

	public double getVersion() {
		return mVersion;
	}

	public void setFl(String fl) {
		mFl = fl;
	}

	public String getFl() {
		return mFl;
	}

}