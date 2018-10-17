package com.hamzajazara.hotels.available.provider.best;

import java.util.List;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.hamzajazara.hotels.available.provider.best.model.request.BestHotelSearchRequest;
import com.hamzajazara.hotels.available.provider.best.model.response.BestHotelsResponse;

/**
 * 
 * @author haljazara
 *
 */
@FeignClient("best-hotels")
@RibbonClient("best-hotels")
public interface BestHotelsProvider {

	/**
	 * 
	 * @param bestHotelSearchRequest
	 * @return
	 */
	@RequestMapping(value = "/search", method = RequestMethod.POST)
	List<BestHotelsResponse> searchBestHotels(@RequestBody BestHotelSearchRequest bestHotelSearchRequest);
}
