package com.isi.pfe.service.interfaces;

import com.isi.pfe.domain.Experience;

import java.util.List;

public interface ExperienceService {
    List<Experience> getAllExperience();
    Experience getById(Long id);
    void deleteExperience(Long id);
    void updateExperience(Experience experience);
    void addExperience(Experience experience);
    void deleteCompetence(Long id);
}
