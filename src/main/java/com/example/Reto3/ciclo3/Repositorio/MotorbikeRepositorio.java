/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Reto3.ciclo3.Repositorio;

import com.example.Reto3.ciclo3.Interface.MotorbikeInterface;
import com.example.Reto3.ciclo3.Modelo.Motorbike;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MotorbikeRepositorio {
    @Autowired
    private MotorbikeInterface motorbikeCrudRepository;
    
    public List<Motorbike> getAll(){
        return (List<Motorbike>) motorbikeCrudRepository.findAll();
    }
    
    public Optional<Motorbike> getMotorbike(int id){
        return motorbikeCrudRepository.findById(id);
    }

    public Motorbike save(Motorbike motorbike){
        return motorbikeCrudRepository.save(motorbike);
    }
    
       public void delete (Motorbike motorbike){
        motorbikeCrudRepository.delete(motorbike);
    }
}


    

