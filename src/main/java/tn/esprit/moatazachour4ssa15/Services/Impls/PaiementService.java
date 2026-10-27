package tn.esprit.moatazachour4ssa15.Services.Impls;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.moatazachour4ssa15.Domain.Paiement;
import tn.esprit.moatazachour4ssa15.Repositories.IPaiementRepository;
import tn.esprit.moatazachour4ssa15.Services.IPaiementService;

import java.util.List;

@RequiredArgsConstructor
@Service
public class PaiementService implements IPaiementService {

    private final IPaiementRepository paiementRepository;

    @Override
    public Paiement create(Paiement Paiement) {
        return paiementRepository.save(Paiement);
    }

    @Override
    public Paiement getById(Long id) {
        return paiementRepository.findById(id).orElse(null);
    }

    @Override
    public Paiement update(Paiement Paiement) {
        return paiementRepository.save(Paiement);
    }

    @Override
    public void delete(Long id) {
        paiementRepository.deleteById(id);
    }

    @Override
    public List<Paiement> getAll() {
        return paiementRepository.findAll();
    }
}
