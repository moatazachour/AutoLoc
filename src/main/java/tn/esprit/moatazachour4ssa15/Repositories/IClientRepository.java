package tn.esprit.moatazachour4ssa15.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.moatazachour4ssa15.Domain.Client;

public interface IClientRepository extends JpaRepository<Client, Long> {
}
