package tn.esprit.moatazachour4ssa15.Services.Impls;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.moatazachour4ssa15.Domain.Contrat;
import tn.esprit.moatazachour4ssa15.Exception.ResourceNotFoundException;
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

        if (Contrat.getPaiements() != null) {
            Contrat.getPaiements().forEach(
                    paiement -> paiement.setContrat(Contrat)
            );
        }

        return contratRepository.save(Contrat);
    }

    @Override
    public Contrat getById(Long id) {

        return contratRepository.findById(id).orElseThrow(() ->
                new ResourceNotFoundException("Contrat", id));
    }

    @Override
    public Contrat update(Contrat Contrat) {
        Contrat existingContrat = getById(Contrat.getIdContrat());

        existingContrat.setMontantTotal(Contrat.getMontantTotal());
        // Set other values if needed in the future
        // For now we only change the contract amount
        // Not sure but in my opinion we should be able
        // to update all attributes but business wise this
        // is enough for now

        return contratRepository.save(existingContrat);
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
