package com.demo.myretail.controller;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.demo.myretail.dto.ProductPricingDTO;
import com.demo.myretail.service.ProductService;



@RestController
@RequestMapping("/products")
public class ProductController {

	 private static final Logger LOGGER = LoggerFactory.getLogger(ProductController.class);
	 
	 private final ProductService service;

	    @Autowired
	    ProductController(ProductService service) {
	        this.service = service;
	    }
	    
	    @RequestMapping(value = "{productId}", method = RequestMethod.GET)
	    ProductPricingDTO findByProductId(@PathVariable("productId") String productId) {

	        ProductPricingDTO productPricingDTO = service.findById(productId);
	        return productPricingDTO;
	    }
	    
	    @RequestMapping(value = "{productId}", method = RequestMethod.PUT)
	    ProductPricingDTO updatePricingInfo(@RequestBody @Valid ProductPricingDTO productPricingDTO , @PathVariable("productId") String productId) {
	    	ProductPricingDTO updatedPricingDTO = service.update(productId);
	        return updatedPricingDTO;
	    }
}
