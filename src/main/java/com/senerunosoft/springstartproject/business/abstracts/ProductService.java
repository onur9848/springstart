package com.senerunosoft.springstartproject.business.abstracts;

import com.senerunosoft.springstartproject.core.utilities.results.DataResults;
import com.senerunosoft.springstartproject.core.utilities.results.Result;
import com.senerunosoft.springstartproject.dataAccess.abstracts.ProductDao;
import com.senerunosoft.springstartproject.entities.concretes.Product;
import com.senerunosoft.springstartproject.entities.dtos.ProductWithCategoryDto;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductService {

    DataResults<List<Product>> getAll();
    DataResults<List<Product>> getAll(int pageNo,int pageSize);
    DataResults<List<Product>> getAllSorted();

    Result add(Product product);

    DataResults<Product> getByProductName(String productName);

    DataResults<Product> getProductById(int productId);

    DataResults<Product>  getByProductNameAndCategoryId(String productName, int categoryId);

    DataResults<List<Product>> getByProductNameOrCategoryId(String productName, int categoryId);

    DataResults<List<Product>> getByCategoryIn(List<Integer> categories);

    DataResults<List<Product>> getByProductNameContains(String productName);

    DataResults<List<Product>> getByProductNameStartsWith(String productName);

    DataResults<List<Product>> getByNameAndCategory(String productName, int categoryId);

    DataResults<List<ProductWithCategoryDto>> getProductWithCategoryDetails();
}
