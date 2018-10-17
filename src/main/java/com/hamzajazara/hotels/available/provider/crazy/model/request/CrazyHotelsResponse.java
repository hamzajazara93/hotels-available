package com.hamzajazara.hotels.available.provider.crazy.model.request;

import java.util.List;

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
@ApiModel("Crazy Hotels Response")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class CrazyHotelsResponse extends HotelResponse {

	@ApiModelProperty("Hotel Name")
	private String hotelName;

	@ApiModelProperty("Rate")
	private String rate;

	@ApiModelProperty("Price")
	private double price;

	@ApiModelProperty("Discount")
	private double discount;

	@ApiModelProperty("Amenities")
	private List<String> amenities;
}
