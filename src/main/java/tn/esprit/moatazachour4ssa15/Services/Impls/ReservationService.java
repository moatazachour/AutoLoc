package tn.esprit.moatazachour4ssa15.Services.Impls;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.moatazachour4ssa15.Domain.Reservation;
import tn.esprit.moatazachour4ssa15.Repositories.IReservationRepository;
import tn.esprit.moatazachour4ssa15.Services.IReservationService;

import java.util.List;

@RequiredArgsConstructor
@Service
public class ReservationService implements IReservationService {

    private final IReservationRepository reservationRepository;

    @Override
    public Reservation create(Reservation Reservation) {
        return reservationRepository.save(Reservation);
    }

    @Override
    public Reservation getById(Long id) {
        return reservationRepository.findById(id).orElse(null);
    }

    @Override
    public Reservation update(Reservation Reservation) {
        return reservationRepository.save(Reservation);
    }

    @Override
    public void delete(Long id) {
        reservationRepository.deleteById(id);
    }

    @Override
    public List<Reservation> getAll() {
        return reservationRepository.findAll();
    }
}
