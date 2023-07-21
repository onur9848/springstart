package com.senerunosoft.springstartproject.business.concretes;

import com.senerunosoft.springstartproject.business.abstracts.CategoryService;
import com.senerunosoft.springstartproject.core.utilities.results.DataResults;
import com.senerunosoft.springstartproject.core.utilities.results.SuccessDataResult;
import com.senerunosoft.springstartproject.dataAccess.abstracts.CategoryDao;
import com.senerunosoft.springstartproject.entities.concretes.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryManager implements CategoryService {
    CategoryDao categoryDao;

    @Autowired
    public CategoryManager(CategoryDao categoryDao) {
        this.categoryDao = categoryDao;
    }

    @Override
    public DataResults<List<Category>> getAll() {
        return new SuccessDataResult<List<Category>>(this.categoryDao.findAll(), "Kategoriler Listelendi");
    }
}
