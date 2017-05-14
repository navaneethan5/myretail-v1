package com.demo.myretail.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.demo.myretail.dao.ProductDao;
import com.demo.myretail.dto.ProductPricingDTO;

public class ProductServiceImpl implements ProductService{
	
	private final ProductDao productDao;

    @Autowired
    ProductServiceImpl(ProductDao productDao) {
        this.productDao = productDao;
    }

	@Override
	public ProductPricingDTO findById(String productId) {
		 ProductPricingDTO productPricingDTO = productDao.findById(productId);
	        return productPricingDTO;
	}

	@Override
	public ProductPricingDTO update(String productId) {
		ProductPricingDTO updatedPricingDTO = productDao.update(productId);

        return updatedPricingDTO;
	}

}
