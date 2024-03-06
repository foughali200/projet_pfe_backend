package com.isi.pfe.controller;

import com.isi.pfe.domain.Competence;
import com.isi.pfe.service.interfaces.CompetenceService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/competences")
@RestController
public class CompetenceController {

    private final CompetenceService competenceService;

    public CompetenceController(CompetenceService competenceService) {
        this.competenceService = competenceService;
    }


    @GetMapping
    public List<Competence> getAllCompetences() {
        return competenceService.getAllCompetences();
    }

    @PostMapping
    public void addCompetence(@RequestBody Competence competence){
        competenceService.addCompetence(competence);
    }

    @PutMapping
    public void updateCompetence(@RequestBody Competence competence) {
        competenceService.updateCompetence(competence);
    }

    @GetMapping("/{id}")
    public Competence getById(@PathVariable Long id) {
        return competenceService.getById(id);
    }


    @DeleteMapping("/{id}")
    public void deleteCompetence(@PathVariable Long id){
        competenceService.deleteCompetence(id);
    }


}
