package com.demo.myretail.dto;

import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "ProductPriceInfo")
public class ProductPricingDTO {
	@NotNull
	@Id
	private String productId;
	private String productName;
	private PricingDTO currentPrice;

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public PricingDTO getCurrentPrice() {
		return currentPrice;
	}

	public void setCurrentPrice(PricingDTO currentPrice) {
		this.currentPrice = currentPrice;
	}

}
