package com.hamzajazara.hotels.available.provider.best.model.response;

import com.hamzajazara.hotels.available.model.response.HotelResponse;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * 
 * @author Hamza Aljazara
 *
 */
@ApiModel("Best Hotels Response")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class BestHotelsResponse extends HotelResponse {

	@ApiModelProperty("Hotel Name")
	private String hotelName;

	@ApiModelProperty("Rate")
	private int rate;

	@ApiModelProperty("Fare")
	private double fare;

	@ApiModelProperty("Amenities")
	private String amenities;
}
