package com.senerunosoft.springstartproject.entities.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductWithCategoryDto {

    private int id;
    private String productName;
    private String CategoryName;


}
