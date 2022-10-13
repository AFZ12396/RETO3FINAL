/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Reto3.ciclo3.Repositorio;

import com.example.Reto3.ciclo3.Interface.CategoryInterface;
import com.example.Reto3.ciclo3.Modelo.Category;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CategoryRepositorio {
     @Autowired
    private CategoryInterface categoryCrudRepository;
    
    public List<Category> getAll(){
        return (List<Category>) categoryCrudRepository.findAll();
    }
    
    public Optional<Category> getCategory(int id){
        return categoryCrudRepository.findById(id);
    }

    public Category save(Category category){
        return categoryCrudRepository.save(category);
    }
    
      public void delete (Category category){
        categoryCrudRepository.delete(category);
    }
    
}

    

