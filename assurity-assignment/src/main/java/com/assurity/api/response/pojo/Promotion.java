package com.assurity.api.response.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Promotion {
	@JsonProperty("Id")
	public int id;
	@JsonProperty("Name")
	public String name;
	@JsonProperty("Description")
	public String description;
	@JsonProperty("Price")
	public double price;
	@JsonProperty("MinimumPhotoCount")
	public int minimumPhotoCount;
	@JsonProperty("OriginalPrice")
	public double originalPrice;
	@JsonProperty("Recommended")
	public boolean recommended;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getMinimumPhotoCount() {
		return minimumPhotoCount;
	}
	public void setMinimumPhotoCount(int minimumPhotoCount) {
		this.minimumPhotoCount = minimumPhotoCount;
	}
	public double getOriginalPrice() {
		return originalPrice;
	}
	public void setOriginalPrice(double originalPrice) {
		this.originalPrice = originalPrice;
	}
	public boolean isRecommended() {
		return recommended;
	}
	public void setRecommended(boolean recommended) {
		this.recommended = recommended;
	}
	@Override
	public String toString() {
		return "Promotion [id=" + id + ", name=" + name + ", description=" + description + ", price=" + price
				+ ", minimumPhotoCount=" + minimumPhotoCount + ", originalPrice=" + originalPrice + ", recommended="
				+ recommended + "]";
	}
	
	
}
