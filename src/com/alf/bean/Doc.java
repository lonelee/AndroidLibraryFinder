package com.alf.bean;

import java.util.List;

import com.google.gson.annotations.SerializedName;

public class Doc {

	private static final String FIELD_P = "p";
	private static final String FIELD_ID = "id";
	private static final String FIELD_LATEST_VERSION = "latestVersion";
	private static final String FIELD_VERSION_COUNT = "versionCount";
	private static final String FIELD_G = "g";
	private static final String FIELD_A = "a";
	private static final String FIELD_TIMESTAMP = "timestamp";
	private static final String FIELD_REPOSITORY_ID = "repositoryId";
	private static final String FIELD_TEXT = "text";
	private static final String FIELD_EC = "ec";

	@SerializedName(FIELD_P)
	private String mP;
	@SerializedName(FIELD_ID)
	private String mId;
	@SerializedName(FIELD_LATEST_VERSION)
	private String mLatestVersion;
	@SerializedName(FIELD_VERSION_COUNT)
	private int mVersionCount;
	@SerializedName(FIELD_G)
	private String mG;
	@SerializedName(FIELD_A)
	private String mA;
	@SerializedName(FIELD_TIMESTAMP)
	private Long mTimestamp;
	@SerializedName(FIELD_REPOSITORY_ID)
	private String mRepositoryId;
	@SerializedName(FIELD_TEXT)
	private List<String> mTexts;
	@SerializedName(FIELD_EC)
	private List<String> mEcs;

	public Doc() {

	}

	public void setP(String P) {
		mP = P;
	}

	public String getP() {
		return mP;
	}

	public void setId(String id) {
		mId = id;
	}

	public String getId() {
		return mId;
	}

	public void setLatestVersion(String latestVersion) {
		mLatestVersion = latestVersion;
	}

	public String getLatestVersion() {
		return mLatestVersion;
	}

	public void setVersionCount(int versionCount) {
		mVersionCount = versionCount;
	}

	public int getVersionCount() {
		return mVersionCount;
	}

	public void setG(String G) {
		mG = G;
	}

	public String getG() {
		return mG;
	}

	public void setA(String A) {
		mA = A;
	}

	public String getA() {
		return mA;
	}

	public void setTimestamp(Long timestamp) {
		mTimestamp = timestamp;
	}

	public Long getTimestamp() {
		return mTimestamp;
	}

	public void setRepositoryId(String repositoryId) {
		mRepositoryId = repositoryId;
	}

	public String getRepositoryId() {
		return mRepositoryId;
	}

	public void setTexts(List<String> texts) {
		mTexts = texts;
	}

	public List<String> getTexts() {
		return mTexts;
	}

	public void setEcs(List<String> ecs) {
		mEcs = ecs;
	}

	public List<String> getEcs() {
		return mEcs;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Doc) {
			return ((Doc) obj).getId() == mId;
		}
		return false;
	}

	@Override
	public int hashCode() {
		return mId.hashCode();
	}

}