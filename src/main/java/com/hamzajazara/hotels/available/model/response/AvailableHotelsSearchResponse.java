package com.hamzajazara.hotels.available.model.response;

import java.util.Arrays;
import java.util.List;

import com.hamzajazara.hotels.available.provider.best.model.response.BestHotelsResponse;
import com.hamzajazara.hotels.available.provider.crazy.model.request.CrazyHotelsResponse;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@ApiModel("Available Hotels Search Request")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class AvailableHotelsSearchResponse extends HotelResponse {
	@ApiModelProperty("Provider Name")
	private String providerName;

	@ApiModelProperty("Hotel Name")
	private String hotelName;

	@ApiModelProperty("Fare")
	private double fare;

	@ApiModelProperty("Amenities")
	private List<String> amenities;

	public <T extends HotelResponse> AvailableHotelsSearchResponse(T hotelsResponse) {
		if (hotelsResponse instanceof BestHotelsResponse) {
			super.setRate(((BestHotelsResponse) hotelsResponse).getRate());
			providerName = "Best Hotels";
			hotelName = ((BestHotelsResponse) hotelsResponse).getHotelName();
			fare = ((BestHotelsResponse) hotelsResponse).getFare();
			amenities = Arrays.asList(((BestHotelsResponse) hotelsResponse).getAmenities().split("\\s*,\\s*"));
		} else if (hotelsResponse instanceof CrazyHotelsResponse) {
			super.setRate(((CrazyHotelsResponse) hotelsResponse).getRate().trim().toCharArray().length + 1);
			providerName = "Crazy Hotels";
			hotelName = ((CrazyHotelsResponse) hotelsResponse).getHotelName();
			fare = ((CrazyHotelsResponse) hotelsResponse).getPrice();
			amenities = ((CrazyHotelsResponse) hotelsResponse).getAmenities();
		}
	}
}
