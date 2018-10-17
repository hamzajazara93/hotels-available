package com.hamzajazara.hotels.available.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hamzajazara.hotels.available.model.request.HotelSearchRequest;
import com.hamzajazara.hotels.available.model.response.AvailableHotelsSearchResponse;
import com.hamzajazara.hotels.available.service.AvailableHotelsService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@Api(tags = "Available Hotels")
public class AvailableHotelsController {

	@Autowired
	private AvailableHotelsService availableHotelsService;

	/**
	 * 
	 * @param hotelSearchRequest
	 * @return
	 */
	@PostMapping("/search")
	@ApiOperation(value = "Get Available Hotels")
	public ResponseEntity<List<AvailableHotelsSearchResponse>> availableHotels(
			@Valid @RequestBody HotelSearchRequest hotelSearchRequest) {
		List<AvailableHotelsSearchResponse> searchHotels = availableHotelsService.searchHotels(hotelSearchRequest);
		return new ResponseEntity<>(searchHotels, HttpStatus.OK);
	}
}
