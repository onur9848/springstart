package com.senerunosoft.springstartproject.dataAccess.abstracts;

import com.senerunosoft.springstartproject.entities.concretes.Product;
import com.senerunosoft.springstartproject.entities.dtos.ProductWithCategoryDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductDao extends JpaRepository<Product, Integer> {

    Product getByProductName(String productName);
    Product getProductById(int productId);
    Product getByProductNameAndCategory_CategoryId(String productName, int categoryId);

    List<Product> getByProductNameOrCategory_CategoryId(String productName, int categoryId);

    List<Product> getByCategory_CategoryIdIn(List<Integer> categories);

    List<Product> getByProductNameContains(String productName);

    List<Product> getByProductNameStartsWith(String productName);

    @Query("FROM Product where productName=:productName and category.categoryId=:categoryId")
    List<Product> getByNameAndCategory(String productName, int categoryId);

    @Query("select new com.senerunosoft.springstartproject.entities.dtos.ProductWithCategoryDto" +
            "(p.id,p.productName,c.categoryName) FROM Category c inner join c.products p")
    List<ProductWithCategoryDto> getProductWithCategoryDetails();

}
