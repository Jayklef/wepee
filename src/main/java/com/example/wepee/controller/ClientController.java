package com.example.wepee.controller;

import com.example.wepee.entity.Client;
import com.example.wepee.entity.Loan;
import com.example.wepee.model.ClientModel;
import com.example.wepee.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/clients")
public class ClientController {

    private ClientService clientService;

    @Autowired
    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Client>> getAllClients(){
        List<Client> clients = clientService.findAllClients();
        return new ResponseEntity<>(clients, HttpStatus.OK);
    }

    @PostMapping("/save")
    public ResponseEntity<Client> saveClient(@RequestBody ClientModel clientModel){
        Client newClient = clientService.saveClient(clientModel);
        return new ResponseEntity<>(newClient, HttpStatus.CREATED);
    }

    @GetMapping("/{id}/client")
    public ResponseEntity<Client> findById(@PathVariable("id") Long id){
        Client client = clientService.findById(id);
        return new ResponseEntity<>(client, HttpStatus.OK);
    }
}
