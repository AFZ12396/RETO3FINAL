/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Reto3.ciclo3.Interface;

import com.example.Reto3.ciclo3.Modelo.Message;
import org.springframework.data.repository.CrudRepository;

public interface MessageInterface extends CrudRepository <Message, Integer> {
    
}