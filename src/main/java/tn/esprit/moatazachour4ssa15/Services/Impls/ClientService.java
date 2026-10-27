package tn.esprit.moatazachour4ssa15.Services.Impls;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.moatazachour4ssa15.Domain.Client;
import tn.esprit.moatazachour4ssa15.Repositories.IClientRepository;
import tn.esprit.moatazachour4ssa15.Services.IClientService;

import java.util.List;

@RequiredArgsConstructor
@Service
public class ClientService implements IClientService {

    private final IClientRepository clientRepository;

    @Override
    public Client create(Client client) {
        return clientRepository.save(client);
    }

    @Override
    public Client getById(Long id) {
        return clientRepository.findById(id).orElse(null);
    }

    @Override
    public Client update(Client client) {
        return clientRepository.save((client));
    }

    @Override
    public void delete(Long id) {
        clientRepository.deleteById(id);
    }

    @Override
    public List<Client> getAll() {
        return clientRepository.findAll();
    }
}
