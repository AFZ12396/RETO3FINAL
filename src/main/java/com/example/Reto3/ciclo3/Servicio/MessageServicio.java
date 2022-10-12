/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Reto3.ciclo3.Servicio;
import com.example.Reto3.ciclo3.Modelo.Message;
import com.example.Reto3.ciclo3.Repositorio.MessageRepositorio;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessageServicio {
    @Autowired
    private MessageRepositorio messageRepository;
    
    public List<Message> getAll() {
        return messageRepository.getAll();
    }
        
    public Optional<Message> getMessage(int messageId) {
        return messageRepository.getMessage(messageId);
    }

    public Message save(Message message) {
        if (message.getIdMessage() == null) {
            return messageRepository.save(message);
        } else {
            Optional<Message> e = messageRepository.getMessage (message.getIdMessage());
            if (e.isEmpty()) {
                return messageRepository.save(message);
            } else {
                return message;
            }
        }
    }  
}

