package com.isi.pfe.service.interfaces;

import com.isi.pfe.domain.Offer;

import java.util.List;

public interface OfferService {
    List<Offer> getAllOffer();

    Offer getById(Long id);

    void addOffer(Offer offer);

    void updateOffer(Offer offer);

    void deleteOffer(Long id);
}
