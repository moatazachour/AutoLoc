package tn.esprit.moatazachour4ssa15.Services;

import tn.esprit.moatazachour4ssa15.Domain.Maintenance;

import java.util.List;

public interface IMaintenanceService {
    Maintenance create(Maintenance Maintenance);
    Maintenance getById(Long id);
    Maintenance update(Maintenance Maintenance);
    void delete(Long id);
    List<Maintenance> getAll();
}
