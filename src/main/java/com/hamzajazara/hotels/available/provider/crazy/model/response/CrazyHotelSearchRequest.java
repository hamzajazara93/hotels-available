package com.hamzajazara.hotels.available.provider.crazy.model.response;

import java.time.LocalDateTime;
import java.time.ZoneId;

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

@ApiModel("Crazy Search Request")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class CrazyHotelSearchRequest {

	@ApiModelProperty("City")
	@NotEmpty(message = "City can't be empty")
	private String city;

	@ApiModelProperty("From")
	@NotNull(message = "From Date can't be null")
	private LocalDateTime fromDate;

	@ApiModelProperty("To")
	@NotNull(message = "To Date can't be null")
	private LocalDateTime toDate;

	@ApiModelProperty("Adults Count")
	@PositiveOrZero
	private int adultsCount;

	public CrazyHotelSearchRequest(HotelSearchRequest hotelSearchRequest) {
		city = hotelSearchRequest.getCity();
		fromDate = LocalDateTime.from(hotelSearchRequest.getFromDate().atStartOfDay().atZone(ZoneId.systemDefault()));
		toDate = LocalDateTime.from(hotelSearchRequest.getToDate().atStartOfDay().atZone(ZoneId.systemDefault()));
		adultsCount = hotelSearchRequest.getNumOfAdults();
	}
}
