package com.senerunosoft.springstartproject.business.abstracts;

import com.senerunosoft.springstartproject.core.utilities.results.DataResults;
import com.senerunosoft.springstartproject.entities.concretes.Category;

import java.util.List;

public interface CategoryService {

    DataResults<List<Category>> getAll();


}
