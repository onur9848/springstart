package com.senerunosoft.springstartproject.dataAccess.abstracts;

import com.senerunosoft.springstartproject.entities.concretes.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryDao extends JpaRepository<Category, Integer> {
}
