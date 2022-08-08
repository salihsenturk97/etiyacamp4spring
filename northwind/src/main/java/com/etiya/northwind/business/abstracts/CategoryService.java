package com.etiya.northwind.business.abstracts;

import com.etiya.northwind.business.responses.products.CategoryListResponse;
import com.etiya.northwind.entities.concretes.Category;

import java.util.List;

public interface CategoryService {
    List<CategoryListResponse> getAll();
}
