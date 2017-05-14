package com.demo.myretail.dao;

import com.demo.myretail.dto.ProductPricingDTO;

public interface ProductDao {

	ProductPricingDTO findById(String productId);

	ProductPricingDTO update(String productId);

}
