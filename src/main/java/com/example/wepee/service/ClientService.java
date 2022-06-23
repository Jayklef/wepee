package com.example.wepee.service;

import com.example.wepee.entity.Client;
import com.example.wepee.model.ClientModel;

import java.util.List;

public interface ClientService {
    List<Client> findAllClients();

    Client saveClient(ClientModel clientModel);

    Client findById(Long id);
}
