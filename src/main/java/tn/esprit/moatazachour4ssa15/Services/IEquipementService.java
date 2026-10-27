package tn.esprit.moatazachour4ssa15.Services;

import tn.esprit.moatazachour4ssa15.Domain.Equipement;

import java.util.List;

public interface IEquipementService {
    Equipement create(Equipement Equipement);
    Equipement getById(Long id);
    Equipement update(Equipement Equipement);
    void delete(Long id);
    List<Equipement> getAll();
}
