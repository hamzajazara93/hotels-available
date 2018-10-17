package com.hamzajazara.hotels.available.service;

import java.util.List;

import com.hamzajazara.hotels.available.model.request.HotelSearchRequest;
import com.hamzajazara.hotels.available.model.response.AvailableHotelsSearchResponse;
import com.hamzajazara.hotels.available.provider.best.model.request.BestHotelSearchRequest;
import com.hamzajazara.hotels.available.provider.best.model.response.BestHotelsResponse;
import com.hamzajazara.hotels.available.provider.crazy.model.request.CrazyHotelsResponse;
import com.hamzajazara.hotels.available.provider.crazy.model.response.CrazyHotelSearchRequest;

/**
 * 
 * @author haljazara
 *
 */
public interface AvailableHotelsService {

	/**
	 * 
	 * @param hotelSearchRequest
	 * @return
	 */
	List<AvailableHotelsSearchResponse> searchHotels(HotelSearchRequest hotelSearchRequest);

	/**
	 * 
	 * @param bestHotelSearchRequest
	 * @return
	 */
	List<BestHotelsResponse> searchBestHotels(BestHotelSearchRequest bestHotelSearchRequest);

	/**
	 * 
	 * @param crazyHotelSearchRequest
	 * @return
	 */
	List<CrazyHotelsResponse> searchCrazyHotels(CrazyHotelSearchRequest crazyHotelSearchRequest);
}
