package com.eatza.order.service.itemservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.eatza.order.dto.ItemFetchDto;

@FeignClient (name="restaurant-service",url="http://localhost:8099/restaurant/item/id")
public interface ItemClient {

	//@RequestLine("GET /{itemId}")
	@GetMapping("/{itemId}")
	ItemFetchDto findByItemId(@PathVariable("itemId") Long itemId);
}
