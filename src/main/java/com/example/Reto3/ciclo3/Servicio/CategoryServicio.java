/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Reto3.ciclo3.Servicio;

import com.example.Reto3.ciclo3.Modelo.Category;
import com.example.Reto3.ciclo3.Repositorio.CategoryRepositorio;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryServicio {
    @Autowired
    private CategoryRepositorio categoryRepository;
   
    public List<Category> getAll() {
        return categoryRepository.getAll();
    }

    public Optional<Category> getCategory(int categoryId) {
        return categoryRepository.getCategory(categoryId);
    }

    public Category save(Category category) {
        if (category.getId() == null) {
            return categoryRepository.save(category);
        } else {
            Optional<Category> category1= categoryRepository.getCategory (category.getId());
            if (category1.isEmpty()) {
                return categoryRepository.save(category);
            } else {
                return category;
            }
        }
    }  
}

    

