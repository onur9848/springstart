package com.senerunosoft.springstartproject.api.contollers;

import com.senerunosoft.springstartproject.business.abstracts.CategoryService;
import com.senerunosoft.springstartproject.core.utilities.results.DataResults;
import com.senerunosoft.springstartproject.entities.concretes.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/category")
public class CategoryController {
    private CategoryService categoryService;

    @Autowired
    public CategoryController(CategoryService categoryService) {
        super();
        this.categoryService = categoryService;
    }


    @GetMapping("/getall")
    public DataResults<List<Category>> getAll() {
        return this.categoryService.getAll();
    }

}
