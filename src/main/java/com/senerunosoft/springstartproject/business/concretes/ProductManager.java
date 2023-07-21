package com.senerunosoft.springstartproject.business.concretes;

import com.senerunosoft.springstartproject.business.abstracts.ProductService;
import com.senerunosoft.springstartproject.core.utilities.results.DataResults;
import com.senerunosoft.springstartproject.core.utilities.results.Result;
import com.senerunosoft.springstartproject.core.utilities.results.SuccessDataResult;
import com.senerunosoft.springstartproject.dataAccess.abstracts.ProductDao;
import com.senerunosoft.springstartproject.entities.concretes.Product;
import com.senerunosoft.springstartproject.entities.dtos.ProductWithCategoryDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductManager implements ProductService {

    private ProductDao productDao;

    @Autowired
    public ProductManager(ProductDao productDao) {
        super();
        this.productDao = productDao;
    }


    @Override
    public DataResults<List<Product>> getAll() {
        return new SuccessDataResult<List<Product>>(this.productDao.findAll(), "Data Listelendi");
    }

    @Override
    public Result add(Product product) {
        this.productDao.save(product);
        return new SuccessDataResult<Product>("Ürün eklendi");
    }

    @Override
    public DataResults<Product> getByProductName(String productName) {
        return new SuccessDataResult<Product>(this.productDao.getByProductName(productName), "Data Listelendi");
    }

    @Override
    public DataResults<Product> getProductById(int productId) {
        return new SuccessDataResult<Product>(this.productDao.getProductById(productId),"Data Listelendi");
    }

    @Override
    public DataResults<Product> getByProductNameAndCategoryId(String productName, int categoryId) {
        return new SuccessDataResult<Product>(this.productDao.getByProductNameAndCategory_CategoryId(productName, categoryId), "Data Listelendi");

    }

    @Override
    public DataResults<List<Product>> getByProductNameOrCategoryId(String productName, int categoryId) {
        return new SuccessDataResult<List<Product>>(this.productDao.getByProductNameOrCategory_CategoryId(productName, categoryId), "Data Listelendi");

    }

    @Override
    public DataResults<List<Product>> getByCategoryIn(List<Integer> categories) {
        return new SuccessDataResult<List<Product>>(this.productDao.getByCategory_CategoryIdIn(categories), "Data Listelendi");

    }

    @Override
    public DataResults<List<Product>> getByProductNameContains(String productName) {
        return new SuccessDataResult<List<Product>>(this.productDao.getByProductNameContains(productName), "Data Listelendi");

    }

    @Override
    public DataResults<List<Product>> getByProductNameStartsWith(String productName) {
        return new SuccessDataResult<List<Product>>(this.productDao.getByProductNameStartsWith(productName), "Data Listelendi");

    }

    @Override
    public DataResults<List<Product>> getByNameAndCategory(String productName, int categoryId) {
        return new SuccessDataResult<List<Product>>(this.productDao.getByNameAndCategory(productName, categoryId), "Data Listelendi");

    }

    @Override
    public DataResults<List<Product>> getAll(int pageNo, int pageSize) {
        Pageable pageable = PageRequest.of(pageNo - 1, pageSize);
        return new SuccessDataResult<List<Product>>(this.productDao.findAll(pageable).getContent());
    }

    @Override
    public DataResults<List<Product>> getAllSorted() {
        Sort sort = Sort.by(Sort.Direction.DESC, "productName");
        return new SuccessDataResult<List<Product>>(this.productDao.findAll(sort), "Başarılı");
    }

    @Override
    public DataResults<List<ProductWithCategoryDto>> getProductWithCategoryDetails() {
        return new SuccessDataResult<List<ProductWithCategoryDto>>(this.productDao.getProductWithCategoryDetails(), "Başarılı");
    }
}
