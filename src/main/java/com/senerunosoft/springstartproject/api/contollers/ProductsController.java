package com.senerunosoft.springstartproject.api.contollers;

import com.senerunosoft.springstartproject.business.abstracts.ProductService;
import com.senerunosoft.springstartproject.core.utilities.results.DataResults;
import com.senerunosoft.springstartproject.core.utilities.results.Result;
import com.senerunosoft.springstartproject.entities.concretes.Product;
import com.senerunosoft.springstartproject.entities.dtos.ProductWithCategoryDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
@CrossOrigin
public class ProductsController {

    private ProductService productService;

    @Autowired
    public ProductsController(ProductService productService) {
        super();
        this.productService = productService;
    }

    @GetMapping("/getAllPage")
    public DataResults<List<Product>> getAll(int pageNo,int pageSize) {
        return this.productService.getAll(pageNo,pageSize);
    }
    @GetMapping("/getAll")
    public DataResults<List<Product>> getAll() {
        return this.productService.getAll();
    }
    @GetMapping("/getAllSort")
    public DataResults<List<Product>> getAllSort() {
        return this.productService.getAllSorted();
    }

    @PostMapping("/add")
    public Result add(@RequestBody Product product) {

        return this.productService.add(product);
    }

    @GetMapping("/getByProductName")
    public DataResults<Product> getByProductName(@RequestParam String productName) {
        return this.productService.getByProductName(productName);
    }

    @GetMapping("/getProductById")
    public  DataResults<Product> getProductById(@RequestParam int productId){
        return this.productService.getProductById(productId);
    }

    @GetMapping("/getByProductNameAndCategory")
    public DataResults<Product> getByProductNameAndCategory(@RequestParam String productName,@RequestParam int categoryId) {
        return this.productService.getByProductNameAndCategoryId(productName, categoryId);
    }

    @GetMapping("/getByProductNameOrCategory")
    public DataResults<List<Product>> getByProductNameOrCategory(@RequestParam String productName,@RequestParam int categoryId) {
        return this.productService.getByProductNameOrCategoryId(productName, categoryId);
    }

    @GetMapping("/getByCategoryIn")
    public DataResults<List<Product>> getByCategoryIn(@RequestParam List<Integer> categories) {
        return this.productService.getByCategoryIn(categories);
    }

    @GetMapping("/getByProductNameContains")
    public DataResults<List<Product>> getByProductNameContains(@RequestParam String productName) {
        return this.productService.getByProductNameContains(productName);
    }

    @GetMapping("/getByProductNameStartsWith")
    public DataResults<List<Product>> getByProductNameStartsWith(@RequestParam String productName) {
        return this.productService.getByProductNameStartsWith(productName);
    }

    @GetMapping("/getByNameAndCategory")
    public DataResults<List<Product>> getByNameAndCategory(@RequestParam String productName,@RequestParam int categoryId) {
        return this.productService.getByNameAndCategory(productName, categoryId);
    }

    @GetMapping("/getProductWithCategoryDetails")
    public DataResults<List<ProductWithCategoryDto>> getProductWithCategoryDetails(){
        return this.productService.getProductWithCategoryDetails();
    }


}
