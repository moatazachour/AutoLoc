package tn.esprit.moatazachour4ssa15.Services;

import tn.esprit.moatazachour4ssa15.Domain.Agence;
import tn.esprit.moatazachour4ssa15.Domain.Client;

import java.util.List;

public interface IClientService {
    Client create(Client client);
    Client getById(Long id);
    Client update(Client client);
    void delete(Long id);
    List<Client> getAll();
}
