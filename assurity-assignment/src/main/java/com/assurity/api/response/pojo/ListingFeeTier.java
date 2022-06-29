package com.assurity.api.response.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ListingFeeTier{
    @JsonProperty("MinimumTierPrice") 
    public int minimumTierPrice;
    @JsonProperty("FixedFee") 
    public double fixedFee;
}

