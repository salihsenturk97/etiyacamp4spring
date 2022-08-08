package com.etiya.northwind.business.concretes;

import com.etiya.northwind.business.abstracts.CategoryService;
import com.etiya.northwind.business.responses.products.CategoryListResponse;
import com.etiya.northwind.business.responses.products.ProductListResponse;
import com.etiya.northwind.dataAccess.abstracts.CategoryRepository;
import com.etiya.northwind.entities.concretes.Category;
import com.etiya.northwind.entities.concretes.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CategoryManager implements CategoryService {
    private CategoryRepository categoryRepository;

    @Autowired
    public CategoryManager(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public List<CategoryListResponse> getAll() {
        List<Category> result = this.categoryRepository.findAll();
        List<CategoryListResponse> responses = new ArrayList<>();
        for (Category category : result) {
            CategoryListResponse categoryListResponse = new CategoryListResponse();
            categoryListResponse.setCategoryId(category.getCategoryId());
            categoryListResponse.setCategoryName(category.getCategoryName());
            List<Integer> productIdList = new ArrayList<>();
            for (Product product : category.getProducts()) {
                productIdList.add(product.getProduct_Id());
            }
            categoryListResponse.setProductId(productIdList);
            responses.add(categoryListResponse);

        }
        return responses;
    }
}
