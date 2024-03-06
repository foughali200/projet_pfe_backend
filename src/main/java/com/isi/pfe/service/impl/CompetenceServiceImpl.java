package com.isi.pfe.service.impl;

import com.isi.pfe.domain.Competence;
import com.isi.pfe.repository.CompetenceRepository;
import com.isi.pfe.service.interfaces.CompetenceService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompetenceServiceImpl implements CompetenceService {

    private final CompetenceRepository competenceRepository;

    public CompetenceServiceImpl(CompetenceRepository competenceRepository) {
        this.competenceRepository = competenceRepository;
    }

    @Override
    public List<Competence> getAllCompetences() {
        return competenceRepository.findAll();
    }

    @Override
    public void addCompetence(Competence competence) {
        competenceRepository.save(competence);
    }

    @Override
    public void deleteCompetence(Long id) {
        competenceRepository.deleteById(id);
    }

    @Override
    public void updateCompetence(Competence competence) {
        Competence competenceToUpdate = competenceRepository.getById(competence.getId());
        competenceToUpdate.setDescription(competence.getDescription());
        competenceToUpdate.setName(competence.getName());
        competenceRepository.save(competenceToUpdate);
    }

    @Override
    public Competence getById(Long id) {
        return competenceRepository.findById(id).get();
    }


}
