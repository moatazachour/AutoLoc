package tn.esprit.moatazachour4ssa15.Web.Controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import tn.esprit.moatazachour4ssa15.Domain.Contrat;
import tn.esprit.moatazachour4ssa15.Services.IContratService;

import java.util.List;

@Tag(name = "Contrats", description = "Gestion des contrats de location")
@RequestMapping("contrats")
@RestController
@RequiredArgsConstructor
public class ContratController {
    private final IContratService contratService;

    @GetMapping
    public List<Contrat> findAll() {
        return contratService.getAll();
    }

    @Operation(summary = "Consulter un contrat")
    @ApiResponses({
            @ApiResponse(responseCode = "200", description = "Contrat trouvé"),
            @ApiResponse(responseCode = "404", description = "Contrat introuvable")
    })
    @GetMapping("/{id}")
    public Contrat findById(@PathVariable Long id) {
        return contratService.getById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Contrat create(@RequestBody Contrat contrat) {
        return contratService.create(contrat);
    }

    @PutMapping("/{id}")
    public Contrat update(@PathVariable Long id, @RequestBody Contrat contrat) {
        contrat.setIdContrat(id);
        return contratService.update(contrat);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteById(@PathVariable Long id) {
        contratService.delete(id);
    }
}
