package com.isi.pfe.controller;

import com.isi.pfe.domain.Competence;
import com.isi.pfe.domain.Formation;
import com.isi.pfe.service.interfaces.FormationService;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/formations")
@RestController
public class FormationController {
    private final FormationService formationService;

    public FormationController(FormationService formationService) {
        this.formationService = formationService;
    }

    @GetMapping
    public List<Formation> getAllFormations(){
        return formationService.getAllFormations();
    }

    @GetMapping("/{id}")
    public Formation getById(@PathVariable Long id) {
        return formationService.getById(id);
    }
    @PostMapping
    public void addFormation(@RequestBody Formation formation){
        formationService.addFormation(formation);
    }
    @PutMapping
    public void updateFormation(@RequestBody Formation formation) {
        formationService.updateFormation(formation);
    }

    @DeleteMapping("/{id}")
    public void deleteFormation(@PathVariable Long id){
        formationService.deleteFormation(id);
    }


}
