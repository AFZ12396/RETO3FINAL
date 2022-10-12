/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Reto3.ciclo3.Repositorio;

import com.example.Reto3.ciclo3.Interface.ReservationInterface;
import com.example.Reto3.ciclo3.Modelo.Reservation;;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ReservationRepositorio {
    @Autowired
    private ReservationInterface reservationCrudRepository;
    
       public List<Reservation> getAll(){
        return (List<Reservation>) reservationCrudRepository.findAll();
    }
       
     public Optional<Reservation> getReservation(int id){
        return reservationCrudRepository.findById(id);
    }

    public Reservation save(Reservation reservation){
        return reservationCrudRepository.save(reservation);
    }
}

    

