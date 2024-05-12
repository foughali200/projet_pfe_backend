package com.isi.pfe.controller;

import com.isi.pfe.domain.Experience;
import com.isi.pfe.service.interfaces.ExperienceService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/experiences")
@RestController
public class ExperienceController {

    private final ExperienceService experienceService;

    public ExperienceController(ExperienceService experienceService) {
        this.experienceService = experienceService;
    }


    @GetMapping
    public List<Experience> getAllExperience() {
        return experienceService.getAllExperience();
    }

    @PostMapping
    public void addExperience(@RequestBody Experience experience) {
        experienceService.addExperience(experience);
    }

    @PutMapping("/{id}")
    public void updateExperience(@RequestBody Experience experience) {
        experienceService.updateExperience(experience);
    }

    @GetMapping("/{id}")
    public Experience getById(@PathVariable Long id) {
        return experienceService.getById(id);
    }


    @DeleteMapping("/{id}")
    public void deleteCompetence(@PathVariable Long id) {
        experienceService.deleteCompetence(id);
    }


}
