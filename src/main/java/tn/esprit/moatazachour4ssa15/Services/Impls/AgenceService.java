package tn.esprit.moatazachour4ssa15.Services.Impls;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.moatazachour4ssa15.Domain.Agence;
import tn.esprit.moatazachour4ssa15.Repositories.IAgenceRepository;
import tn.esprit.moatazachour4ssa15.Services.IAgenceService;

import java.util.List;

@RequiredArgsConstructor
@Service
public class AgenceService implements IAgenceService {

    private final IAgenceRepository agenceRepository;

    @Override
    public Agence create(Agence Agence) {
        return agenceRepository.save(Agence);
    }

    @Override
    public Agence getById(Long id) {
        return agenceRepository.findById(id).orElse(null);
    }

    @Override
    public Agence update(Agence Agence) {
        return agenceRepository.save(Agence);
    }

    @Override
    public void delete(Long id) {
        agenceRepository.deleteById(id);
    }

    @Override
    public List<Agence> getAll() {
        return agenceRepository.findAll();
    }
}
