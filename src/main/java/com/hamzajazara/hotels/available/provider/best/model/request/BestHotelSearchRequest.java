package com.hamzajazara.hotels.available.provider.best.model.request;

import java.time.LocalDate;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PositiveOrZero;

import com.hamzajazara.hotels.available.model.request.HotelSearchRequest;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * 
 * @author haljazara
 *
 */
@ApiModel("Best Search Request")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class BestHotelSearchRequest {

	@ApiModelProperty("City")
	@NotEmpty(message = "City can't be empty")
	private String city;

	@ApiModelProperty(name = "From Date", example = "2018-10-13")
	@NotNull(message = "From Date can't be null")
	private LocalDate fromDate;

	@ApiModelProperty(name = "To Date", example = "2018-11-13")
	@NotNull(message = "To Date can't be null")
	private LocalDate toDate;

	@ApiModelProperty("Adults Count")
	@PositiveOrZero
	private int numOfAdults;

	public BestHotelSearchRequest(HotelSearchRequest hotelSearchRequest) {
		city = hotelSearchRequest.getCity();
		fromDate = hotelSearchRequest.getFromDate();
		toDate = hotelSearchRequest.getToDate();
		numOfAdults = hotelSearchRequest.getNumOfAdults();
	}
}
