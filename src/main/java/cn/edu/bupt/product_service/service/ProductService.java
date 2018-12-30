package cn.edu.bupt.product_service.service;

import cn.edu.bupt.product_service.domain.Product;

import java.util.List;

public interface ProductService {

    List<Product> listProduct();

    Product findById(int id);
}
