package com.isi.pfe.service.impl;

import com.isi.pfe.domain.Offer;
import com.isi.pfe.repository.OfferRepository;
import com.isi.pfe.service.interfaces.OfferService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OfferServiceImpl implements OfferService {
    private final OfferRepository offerRepository;

    public OfferServiceImpl(OfferRepository offerRepository) {
        this.offerRepository = offerRepository;
    }

    @Override
    public List<Offer> getAllOffer() {
        return offerRepository.findAll();
    }

    @Override
    public void updateOffer(Offer offer) {
        Offer offerToUpdate = offerRepository.findById(offer.getId()).get();
        offerToUpdate.setDescription(offer.getDescription());
        offerToUpdate.setTitle(offer.getTitle());
        offerToUpdate.setStartDate(offer.getStartDate());
        offerToUpdate.setEndDate(offer.getEndDate());
        offerRepository.save(offerToUpdate);
    }

    @Override
    public Offer getById(Long id) {
        return offerRepository.findById(id).get();
    }

    @Override
    public void deleteOffer(Long id) {
        offerRepository.deleteById(id);
    }

    @Override
    public void addOffer(Offer offer) {
        offerRepository.save(offer);
    }
}
