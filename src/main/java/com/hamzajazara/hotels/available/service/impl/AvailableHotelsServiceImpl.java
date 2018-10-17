package com.hamzajazara.hotels.available.service.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hamzajazara.hotels.available.model.request.HotelSearchRequest;
import com.hamzajazara.hotels.available.model.response.AvailableHotelsSearchResponse;
import com.hamzajazara.hotels.available.provider.best.BestHotelsProvider;
import com.hamzajazara.hotels.available.provider.best.model.request.BestHotelSearchRequest;
import com.hamzajazara.hotels.available.provider.best.model.response.BestHotelsResponse;
import com.hamzajazara.hotels.available.provider.crazy.CrazyHotelsProvider;
import com.hamzajazara.hotels.available.provider.crazy.model.request.CrazyHotelsResponse;
import com.hamzajazara.hotels.available.provider.crazy.model.response.CrazyHotelSearchRequest;
import com.hamzajazara.hotels.available.service.AvailableHotelsService;

@Service
public class AvailableHotelsServiceImpl implements AvailableHotelsService {

	@Autowired
	private CrazyHotelsProvider crazyHotelsProvider;

	@Autowired
	private BestHotelsProvider bestHotelsProvider;

	/*
	 * @see
	 * com.hamzajazara.hotels.available.service.AvailableHotelsService#searchHotels(
	 * com.hamzajazara.hotels.available.model.request.HotelSearchRequest)
	 */
	@Override
	public List<AvailableHotelsSearchResponse> searchHotels(HotelSearchRequest hotelSearchRequest) {
		List<AvailableHotelsSearchResponse> availableHotelsSearchResponses = new ArrayList<>();
		searchBestHotels(new BestHotelSearchRequest(hotelSearchRequest)).forEach(bestHotel -> {
			availableHotelsSearchResponses.add(new AvailableHotelsSearchResponse(bestHotel));
		});

		searchCrazyHotels(new CrazyHotelSearchRequest(hotelSearchRequest)).forEach(crazyHotel -> {
			availableHotelsSearchResponses.add(new AvailableHotelsSearchResponse(crazyHotel));
		});

		Collections.sort(availableHotelsSearchResponses);
		return availableHotelsSearchResponses;
	}

	/*
	 * @see com.hamzajazara.hotels.available.service.AvailableHotelsService#
	 * searchBestHotels(com.hamzajazara.hotels.available.provider.best.model.request
	 * .BestHotelSearchRequest)
	 */
	@Override
	public List<BestHotelsResponse> searchBestHotels(BestHotelSearchRequest bestHotelSearchRequest) {
		return bestHotelsProvider.searchBestHotels(bestHotelSearchRequest);
	}

	/*
	 * @see com.hamzajazara.hotels.available.service.AvailableHotelsService#
	 * searchCrazyHotels(com.hamzajazara.hotels.available.provider.crazy.model.
	 * response.CrazyHotelSearchRequest)
	 */
	@Override
	public List<CrazyHotelsResponse> searchCrazyHotels(CrazyHotelSearchRequest crazyHotelSearchRequest) {
		return crazyHotelsProvider.searchCrazyHotels(crazyHotelSearchRequest);
	}
}
