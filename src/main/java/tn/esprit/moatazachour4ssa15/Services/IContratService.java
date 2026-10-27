package tn.esprit.moatazachour4ssa15.Services;

import tn.esprit.moatazachour4ssa15.Domain.Contrat;

import java.util.List;

public interface IContratService {

    Contrat create(Contrat Contrat);
    Contrat getById(Long id);
    Contrat update(Contrat Contrat);
    void delete(Long id);
    List<Contrat> getAll();
}
