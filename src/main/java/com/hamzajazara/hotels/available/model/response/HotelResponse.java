package com.hamzajazara.hotels.available.model.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Setter;

/**
 * 
 * @author haljazara
 *
 */
@ApiModel("Hotels Response")
@Setter
public class HotelResponse implements Comparable<HotelResponse> {

	@ApiModelProperty("Fare")
	private Integer rate;

	/*
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	@Override
	public int compareTo(HotelResponse target) {
		return this.rate.compareTo(target.rate);
	}
}
