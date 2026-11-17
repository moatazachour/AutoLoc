package tn.esprit.moatazachour4ssa15.Web.Controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.moatazachour4ssa15.Domain.Paiement;
import tn.esprit.moatazachour4ssa15.Services.IPaiementService;

import java.util.List;

@RequestMapping("paiements")
@RestController
@RequiredArgsConstructor
public class PaiementController {
    private final IPaiementService paiementService;

    @GetMapping
    public List<Paiement> findAll() {
        return paiementService.getAll();
    }

    @GetMapping("/{id}")
    public Paiement findById(@PathVariable Long id) {
        return paiementService.getById(id);
    }
}
