package com.demo.myretail.service;

import com.demo.myretail.dto.ProductPricingDTO;

public interface ProductService {

	
	ProductPricingDTO findById(String productId);

	ProductPricingDTO update(String productId);

}
