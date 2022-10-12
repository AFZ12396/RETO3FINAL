/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Reto3.ciclo3.Servicio;
import com.example.Reto3.ciclo3.Modelo.Client;
import com.example.Reto3.ciclo3.Repositorio.ClientRepositorio;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientServicio {
    @Autowired
    private ClientRepositorio clientRepository;

    public List<Client> getAll() {
        return clientRepository.getAll();
    }

    public Optional<Client> getClient(int clientId) {
        return clientRepository.getClient(clientId);
    }

    public Client save(Client client) {
        if (client.getIdClient() == null) {
            return clientRepository.save(client);
        } else {
            Optional<Client> e = clientRepository.getClient(client.getIdClient());
            if (e.isEmpty()) {
                return clientRepository.save(client);
            } else {
                return client;
            }
        }
    }
}

    

