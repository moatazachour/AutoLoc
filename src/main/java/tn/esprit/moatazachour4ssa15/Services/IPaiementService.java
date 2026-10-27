package tn.esprit.moatazachour4ssa15.Services;

import tn.esprit.moatazachour4ssa15.Domain.Paiement;

import java.util.List;

public interface IPaiementService {
    Paiement create(Paiement Paiement);
    Paiement getById(Long id);
    Paiement update(Paiement Paiement);
    void delete(Long id);
    List<Paiement> getAll();
}
