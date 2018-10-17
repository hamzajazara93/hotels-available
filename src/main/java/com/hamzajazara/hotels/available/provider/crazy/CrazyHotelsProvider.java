package com.hamzajazara.hotels.available.provider.crazy;

import java.util.List;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.hamzajazara.hotels.available.provider.crazy.model.request.CrazyHotelsResponse;
import com.hamzajazara.hotels.available.provider.crazy.model.response.CrazyHotelSearchRequest;

/**
 * 
 * @author haljazara
 *
 */
@FeignClient("crazy-hotels")
@RibbonClient("crazy-hotels")
public interface CrazyHotelsProvider {

	/**
	 * 
	 * @param crazyHotelSearchRequest
	 * @return
	 */
	@RequestMapping(value = "/search", method = RequestMethod.POST)
	List<CrazyHotelsResponse> searchCrazyHotels(@RequestBody CrazyHotelSearchRequest crazyHotelSearchRequest);
}
