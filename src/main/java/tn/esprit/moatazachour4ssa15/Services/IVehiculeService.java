package tn.esprit.moatazachour4ssa15.Services;

import tn.esprit.moatazachour4ssa15.Domain.Vehicule;

import java.util.List;

public interface IVehiculeService {
    Vehicule create(Vehicule vehicule);
    Vehicule getById(Long id);
    Vehicule update(Vehicule vehicule);
    void delete(Long id);
    List<Vehicule> getAll();
}
