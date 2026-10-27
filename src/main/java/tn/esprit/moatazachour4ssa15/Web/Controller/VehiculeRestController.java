package tn.esprit.moatazachour4ssa15.Web.Controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.moatazachour4ssa15.Domain.Vehicule;
import tn.esprit.moatazachour4ssa15.Services.IVehiculeService;

@RequestMapping("vehicule")
@RestController
@RequiredArgsConstructor
public class VehiculeRestController {

    private final IVehiculeService vehiculeService;

    @PostMapping
    public Vehicule create(@RequestBody Vehicule vehicule) {
        return vehiculeService.create(vehicule);
    }

    @GetMapping("/{id}")
    public Vehicule getById(@PathVariable Long id) {
        return vehiculeService.getById(id);
    }
}
