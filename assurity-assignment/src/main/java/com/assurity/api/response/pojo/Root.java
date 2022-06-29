package com.assurity.api.response.pojo;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Root {
	@JsonProperty("CategoryId")
	public int categoryId;
	@JsonProperty("Name")
	public String name;
	@JsonProperty("Path")
	public String path;
	@JsonProperty("CanListAuctions")
	public boolean canListAuctions;
	@JsonProperty("CanListClassifieds")
	public boolean canListClassifieds;
	@JsonProperty("CanRelist")
	public boolean canRelist;
	@JsonProperty("LegalNotice")
	public String legalNotice;
	@JsonProperty("DefaultDuration")
	public int defaultDuration;
	@JsonProperty("AllowedDurations")
	public ArrayList<Integer> allowedDurations;
	@JsonProperty("Fees")
	public Fees fees;
	@JsonProperty("FreePhotoCount")
	public int freePhotoCount;
	@JsonProperty("MaximumPhotoCount")
	public int maximumPhotoCount;
	@JsonProperty("IsFreeToRelist")
	public boolean isFreeToRelist;
	@JsonProperty("Promotions")
	public ArrayList<Promotion> promotions;
	@JsonProperty("EmbeddedContentOptions")
	public ArrayList<Object> embeddedContentOptions;
	@JsonProperty("MaximumTitleLength")
	public int maximumTitleLength;
	@JsonProperty("AreaOfBusiness")
	public int areaOfBusiness;
	@JsonProperty("DefaultRelistDuration")
	public int defaultRelistDuration;
	@JsonProperty("CanUseCounterOffers")
	public boolean canUseCounterOffers;
	public int getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	public boolean isCanListAuctions() {
		return canListAuctions;
	}
	public void setCanListAuctions(boolean canListAuctions) {
		this.canListAuctions = canListAuctions;
	}
	public boolean isCanListClassifieds() {
		return canListClassifieds;
	}
	public void setCanListClassifieds(boolean canListClassifieds) {
		this.canListClassifieds = canListClassifieds;
	}
	public boolean isCanRelist() {
		return canRelist;
	}
	public void setCanRelist(boolean canRelist) {
		this.canRelist = canRelist;
	}
	public String getLegalNotice() {
		return legalNotice;
	}
	public void setLegalNotice(String legalNotice) {
		this.legalNotice = legalNotice;
	}
	public int getDefaultDuration() {
		return defaultDuration;
	}
	public void setDefaultDuration(int defaultDuration) {
		this.defaultDuration = defaultDuration;
	}
	public ArrayList<Integer> getAllowedDurations() {
		return allowedDurations;
	}
	public void setAllowedDurations(ArrayList<Integer> allowedDurations) {
		this.allowedDurations = allowedDurations;
	}
	public Fees getFees() {
		return fees;
	}
	public void setFees(Fees fees) {
		this.fees = fees;
	}
	public int getFreePhotoCount() {
		return freePhotoCount;
	}
	public void setFreePhotoCount(int freePhotoCount) {
		this.freePhotoCount = freePhotoCount;
	}
	public int getMaximumPhotoCount() {
		return maximumPhotoCount;
	}
	public void setMaximumPhotoCount(int maximumPhotoCount) {
		this.maximumPhotoCount = maximumPhotoCount;
	}
	public boolean isFreeToRelist() {
		return isFreeToRelist;
	}
	public void setFreeToRelist(boolean isFreeToRelist) {
		this.isFreeToRelist = isFreeToRelist;
	}
	public ArrayList<Promotion> getPromotions() {
		return promotions;
	}
	public void setPromotions(ArrayList<Promotion> promotions) {
		this.promotions = promotions;
	}
	public ArrayList<Object> getEmbeddedContentOptions() {
		return embeddedContentOptions;
	}
	public void setEmbeddedContentOptions(ArrayList<Object> embeddedContentOptions) {
		this.embeddedContentOptions = embeddedContentOptions;
	}
	public int getMaximumTitleLength() {
		return maximumTitleLength;
	}
	public void setMaximumTitleLength(int maximumTitleLength) {
		this.maximumTitleLength = maximumTitleLength;
	}
	public int getAreaOfBusiness() {
		return areaOfBusiness;
	}
	public void setAreaOfBusiness(int areaOfBusiness) {
		this.areaOfBusiness = areaOfBusiness;
	}
	public int getDefaultRelistDuration() {
		return defaultRelistDuration;
	}
	public void setDefaultRelistDuration(int defaultRelistDuration) {
		this.defaultRelistDuration = defaultRelistDuration;
	}
	public boolean isCanUseCounterOffers() {
		return canUseCounterOffers;
	}
	public void setCanUseCounterOffers(boolean canUseCounterOffers) {
		this.canUseCounterOffers = canUseCounterOffers;
	}
	@Override
	public String toString() {
		return "Root [categoryId=" + categoryId + ", name=" + name + ", path=" + path + ", canListAuctions="
				+ canListAuctions + ", canListClassifieds=" + canListClassifieds + ", canRelist=" + canRelist
				+ ", legalNotice=" + legalNotice + ", defaultDuration=" + defaultDuration + ", allowedDurations="
				+ allowedDurations + ", fees=" + fees + ", freePhotoCount=" + freePhotoCount + ", maximumPhotoCount="
				+ maximumPhotoCount + ", isFreeToRelist=" + isFreeToRelist + ", promotions=" + promotions
				+ ", embeddedContentOptions=" + embeddedContentOptions + ", maximumTitleLength=" + maximumTitleLength
				+ ", areaOfBusiness=" + areaOfBusiness + ", defaultRelistDuration=" + defaultRelistDuration
				+ ", canUseCounterOffers=" + canUseCounterOffers + "]";
	}
	
	
}
