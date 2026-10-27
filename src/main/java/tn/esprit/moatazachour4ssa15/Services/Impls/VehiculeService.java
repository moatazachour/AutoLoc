package tn.esprit.moatazachour4ssa15.Services.Impls;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.moatazachour4ssa15.Domain.Vehicule;
import tn.esprit.moatazachour4ssa15.Repositories.IVehiculeRepository;
import tn.esprit.moatazachour4ssa15.Services.IVehiculeService;

import java.util.List;

@RequiredArgsConstructor
@Service
public class VehiculeService implements IVehiculeService {

    private final IVehiculeRepository vehiculeRepository;

    @Override
    public Vehicule create(Vehicule vehicule) {
        return vehiculeRepository.save(vehicule);
    }

    @Override
    public Vehicule getById(Long id) {
        return vehiculeRepository.findById(id).orElse(null);
    }

    @Override
    public Vehicule update(Vehicule vehicule) {
        return vehiculeRepository.save(vehicule);
    }

    @Override
    public void delete(Long id) {
        vehiculeRepository.deleteById(id);
    }

    @Override
    public List<Vehicule> getAll() {
        return vehiculeRepository.findAll();
    }
}
