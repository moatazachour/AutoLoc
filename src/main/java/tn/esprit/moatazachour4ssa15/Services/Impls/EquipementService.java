package tn.esprit.moatazachour4ssa15.Services.Impls;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.moatazachour4ssa15.Domain.Equipement;
import tn.esprit.moatazachour4ssa15.Repositories.IEquipementRepository;
import tn.esprit.moatazachour4ssa15.Services.IEquipementService;

import java.util.List;

@RequiredArgsConstructor
@Service
public class EquipementService implements IEquipementService {

    private final IEquipementRepository equipementRepository;

    @Override
    public Equipement create(Equipement Equipement) {
        return equipementRepository.save(Equipement);
    }

    @Override
    public Equipement getById(Long id) {
        return equipementRepository.findById(id).orElse(null);
    }

    @Override
    public Equipement update(Equipement Equipement) {
        return equipementRepository.save(Equipement);
    }

    @Override
    public void delete(Long id) {
        equipementRepository.deleteById(id);
    }

    @Override
    public List<Equipement> getAll() {
        return equipementRepository.findAll();
    }
}
