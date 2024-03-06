package com.isi.pfe.service.impl;

import com.isi.pfe.domain.Experience;
import com.isi.pfe.repository.ExperienceRepository;
import com.isi.pfe.service.interfaces.ExperienceService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExperienceServiceImpl implements ExperienceService {

    private final ExperienceRepository experienceRepository;

    public ExperienceServiceImpl(ExperienceRepository experienceRepository) {
        this.experienceRepository = experienceRepository;
    }


    @Override
    public List<Experience> getAllExperience() {
        return experienceRepository.findAll();
    }

    @Override
    public Experience getById(Long id) {
        return experienceRepository.findById(id).get();
    }

    @Override
    public void deleteExperience(Long id) {
        experienceRepository.deleteById(id);
    }

    @Override
    public void updateExperience(Experience experience) {
        Experience experienceToUpdate = experienceRepository.findById(experience.getId()).get();
        experienceToUpdate.setCompany(experience.getCompany());
        experienceToUpdate.setDescription(experience.getDescription());
        experienceToUpdate.setPosition(experience.getPosition());
        experienceToUpdate.setEndDate(experience.getEndDate());
        experienceToUpdate.setStartDate(experience.getStartDate());
        experienceRepository.save(experienceToUpdate);
    }

    @Override
    public void addExperience(Experience experience) {
        experienceRepository.save(experience);
    }

    @Override
    public void deleteCompetence(Long id) {
        experienceRepository.deleteById(id);
    }
}
