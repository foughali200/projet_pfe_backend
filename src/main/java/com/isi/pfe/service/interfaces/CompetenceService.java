package com.isi.pfe.service.interfaces;

import com.isi.pfe.domain.Competence;

import java.util.List;

public interface CompetenceService {

    List<Competence> getAllCompetences();
    void addCompetence(Competence competence);

    void deleteCompetence(Long id);
    void updateCompetence(Competence competence);
    Competence getById(Long id);

}
