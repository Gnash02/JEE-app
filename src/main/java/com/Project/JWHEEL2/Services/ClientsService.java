package com.Project.JWHEEL2.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

import com.Project.JWHEEL2.Models.Client;
import com.Project.JWHEEL2.Repositories.ClientRepository;

@Service
public class ClientsService {
@Autowired
private ClientRepository clientrepository;
//return list of clients
public List<Client> getAllClients(){
	return clientrepository.findAll();
}
//save new client
public void save(Client client) {
	clientrepository.save(client);
}
//get client by id
public Optional<Client> getbyid (int id) {
	return clientrepository.findById(id);
}
//delete new client
public void delete(int id) {
	clientrepository.deleteById(id);
}
}
