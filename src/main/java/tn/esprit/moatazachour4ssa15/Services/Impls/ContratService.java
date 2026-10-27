package tn.esprit.moatazachour4ssa15.Services.Impls;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.moatazachour4ssa15.Domain.Contrat;
import tn.esprit.moatazachour4ssa15.Repositories.IClientRepository;
import tn.esprit.moatazachour4ssa15.Repositories.IContratRepository;
import tn.esprit.moatazachour4ssa15.Services.IContratService;

import java.util.List;

@RequiredArgsConstructor
@Service
public class ContratService implements IContratService {

    private final IContratRepository contratRepository;

    @Override
    public Contrat create(Contrat Contrat) {
        return contratRepository.save(Contrat);
    }

    @Override
    public Contrat getById(Long id) {
        return contratRepository.findById(id).orElse(null);
    }

    @Override
    public Contrat update(Contrat Contrat) {
        return contratRepository.save(Contrat);
    }

    @Override
    public void delete(Long id) {
        contratRepository.deleteById(id);
    }

    @Override
    public List<Contrat> getAll() {
        return contratRepository.findAll();
    }
}
