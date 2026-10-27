package tn.esprit.moatazachour4ssa15.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.moatazachour4ssa15.Domain.Agence;

public interface IAgenceRepository extends JpaRepository<Agence, Long> {
}
