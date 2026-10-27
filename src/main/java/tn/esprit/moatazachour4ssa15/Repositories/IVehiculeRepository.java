package tn.esprit.moatazachour4ssa15.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.moatazachour4ssa15.Domain.Vehicule;

public interface IVehiculeRepository extends JpaRepository<Vehicule, Long> {
}
