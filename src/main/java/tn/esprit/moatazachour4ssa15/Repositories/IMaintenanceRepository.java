package tn.esprit.moatazachour4ssa15.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.moatazachour4ssa15.Domain.Maintenance;

public interface IMaintenanceRepository extends JpaRepository<Maintenance, Long> {
}
