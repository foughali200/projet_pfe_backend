package com.isi.pfe.service.interfaces;

import com.isi.pfe.domain.Formation;

import java.util.List;

public interface FormationService {
    List<Formation> getAllFormations();

    Formation getById(Long id);

    void deleteFormation(Long id);
    void updateFormation(Formation formation);
    void addFormation(Formation formation);
}
