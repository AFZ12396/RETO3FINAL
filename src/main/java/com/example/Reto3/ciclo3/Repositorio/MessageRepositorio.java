/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Reto3.ciclo3.Repositorio;

import com.example.Reto3.ciclo3.Interface.MessageInterface;
import com.example.Reto3.ciclo3.Modelo.Message;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MessageRepositorio {
    @Autowired
    private MessageInterface messageCrudRepository;
    
       public List<Message> getAll(){
        return (List<Message>) messageCrudRepository.findAll();
    }
       
     public Optional<Message> getMessage(int id){
        return messageCrudRepository.findById(id);
    }

    public Message save(Message message){
        return messageCrudRepository.save(message);
    }
    
}


