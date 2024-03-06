package com.isi.pfe.service.impl;

import com.isi.pfe.domain.Formation;
import com.isi.pfe.repository.FormationRepository;
import com.isi.pfe.service.interfaces.FormationService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FormationServiceImpl implements FormationService {

    private final FormationRepository formationRepository;

    public FormationServiceImpl(FormationRepository formationRepository) {
        this.formationRepository = formationRepository;
    }

    @Override
    public List<Formation> getAllFormations() {
        return formationRepository.findAll();
    }

    @Override
    public Formation getById(Long id) {
        return formationRepository.findById(id).get();
    }

    @Override
    public void deleteFormation(Long id) {
        formationRepository.deleteById(id);
    }

    @Override
    public void updateFormation(Formation formation) {
        Formation formationToUpdate = formationRepository.findById(formation.getId()).get();
        formationToUpdate.setDescription(formation.getDescription());
        formationToUpdate.setTitle(formation.getTitle());
        formationToUpdate.setInstitution(formation.getInstitution());
        formationToUpdate.setStartDate(formation.getStartDate());
        formationToUpdate.setEndDate(formation.getEndDate());
        formationRepository.save(formationToUpdate);
    }

    @Override
    public void addFormation(Formation formation) {
        formationRepository.save(formation);
    }
}
