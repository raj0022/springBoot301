package com.eatza.order.service.itemservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.eatza.order.dto.ItemFetchDto;

@FeignClient(name="search-service")
public interface ItemClient {

	//@RequestLine("GET /{itemId}")
	@GetMapping("/restaurant/item/id/{itemId}")
	ItemFetchDto getItemById(@PathVariable("itemId") Long itemId);
}
