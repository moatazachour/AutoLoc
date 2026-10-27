package tn.esprit.moatazachour4ssa15.Services;

import tn.esprit.moatazachour4ssa15.Domain.Agence;

import java.util.List;

public interface IAgenceService {
    Agence create(Agence Agence);
    Agence getById(Long id);
    Agence update(Agence Agence);
    void delete(Long id);
    List<Agence> getAll();
}
