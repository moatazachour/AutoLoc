package tn.esprit.moatazachour4ssa15.Services.Impls;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.moatazachour4ssa15.Domain.Maintenance;
import tn.esprit.moatazachour4ssa15.Repositories.IMaintenanceRepository;
import tn.esprit.moatazachour4ssa15.Services.IMaintenanceService;

import java.util.List;

@RequiredArgsConstructor
@Service
public class MaintenanceService implements IMaintenanceService {

    private final IMaintenanceRepository maintenanceRepository;

    @Override
    public Maintenance create(Maintenance Maintenance) {
        return maintenanceRepository.save(Maintenance);
    }

    @Override
    public Maintenance getById(Long id) {
        return maintenanceRepository.findById(id).orElse(null);
    }

    @Override
    public Maintenance update(Maintenance Maintenance) {
        return maintenanceRepository.save(Maintenance);
    }

    @Override
    public void delete(Long id) {
        maintenanceRepository.deleteById(id);
    }

    @Override
    public List<Maintenance> getAll() {
        return maintenanceRepository.findAll();
    }
}
