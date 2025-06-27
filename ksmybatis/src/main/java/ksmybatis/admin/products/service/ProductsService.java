package ksmybatis.admin.products.service;

import java.util.List;

import ksmybatis.admin.products.domain.Products;

public interface ProductsService{

	// 상품목록 조회
	List<Products> getProductList();
	
	// 상품을 등록
	void addProduct(Products products);
}
