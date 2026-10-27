package tn.esprit.moatazachour4ssa15.Services;

import tn.esprit.moatazachour4ssa15.Domain.Reservation;

import java.util.List;

public interface IReservationService {
    Reservation create(Reservation Reservation);
    Reservation getById(Long id);
    Reservation update(Reservation Reservation);
    void delete(Long id);
    List<Reservation> getAll();
}
