package com.example.wepee.service.Impl;

import com.example.wepee.entity.Client;
import com.example.wepee.model.ClientModel;
import com.example.wepee.repository.ClientRepository;
import com.example.wepee.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientServiceImpl implements ClientService {

    private ClientRepository clientRepository;

    @Autowired
    public ClientServiceImpl(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    @Override
    public List<Client> findAllClients(){
        return clientRepository.findAll();
    }

    @Override
    public Client saveClient(ClientModel clientModel){

        Client newClient = Client.builder()
                .fullname(clientModel.getFullname())
                .age(clientModel.getAge())
                .phonenumber(clientModel.getPhonenumber())
                .bankName(clientModel.getBankName())
                .accountNumber(clientModel.getAccountNumber())
                .bvn(clientModel.getBvn())
                .nin(clientModel.getNin())
                .product(clientModel.getProduct())
                .build();
        return clientRepository.save(newClient);
    }

    @Override
    public Client findById(Long id){

        Optional<Client> client = clientRepository.findById(id);

        if (client.isEmpty()){
            throw new RuntimeException("client not found");
        }

        return clientRepository.findById(id).get();
    }
}
