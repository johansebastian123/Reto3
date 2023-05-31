package com.grupoG32.reto3.service;

import com.grupoG32.reto3.dbo.ClientDbo;
import com.grupoG32.reto3.dbo.ReportClientsDbo;
import com.grupoG32.reto3.model.ClientModel;
import com.grupoG32.reto3.repoditory.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

@Service
public class ClientService {
    @Autowired
    ClientRepository clientRepository;

    public List<ClientModel> obtener(){
        return clientRepository.findAll();
    }

    public void crear(ClientModel client){
       clientRepository.save(client);
    }

    public void eliminar(int id){
        clientRepository.deleteById(id);
    }

    public void actualizar(ClientDbo clientInput) {
        Optional<ClientModel> clientDb = clientRepository.findById(clientInput.getIdClient());
                if(clientDb.isPresent()){
                    ClientModel client = clientDb.get();
                    if (clientInput.getAge() != null){
                        client.setAge(clientInput.getAge());
                    }
                    if (clientInput.getName() != null){
                        client.setName(clientInput.getName());
                    }
                    if (clientInput.getEmail() != null){
                        client.setEmail(clientInput.getEmail());
                    }
                    if (clientInput.getPassword() != null){
                        client.setPassword(clientInput.getPassword());
                    }
                    if (clientInput.getReservations() != null){
                        client.setReservations(clientInput.getReservations());
                    }
                    if (clientInput.getMessages() != null){
                        client.setMessages(clientInput.getMessages());
                    }
                    clientRepository.save(client);
                }
    }

    public Optional<ClientModel> obtenerPorId(int id) {
        return clientRepository.findById(id);
    }

    public List<ReportClientsDbo> reportClients() {
        List<ReportClientsDbo> listReporClientsDbo = new LinkedList<>();

        List<ClientModel> listclients = clientRepository.reportClient();
        for (ClientModel client : listclients) {
            int totalReservas = client.getReservations().size();
            ReportClientsDbo reportClientsDbo = new ReportClientsDbo(totalReservas,client);
            listReporClientsDbo.add(reportClientsDbo);
        }

        return listReporClientsDbo;
    }
}

