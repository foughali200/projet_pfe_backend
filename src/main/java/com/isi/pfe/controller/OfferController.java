package com.isi.pfe.controller;

import com.isi.pfe.domain.Formation;
import com.isi.pfe.domain.Offer;
import com.isi.pfe.service.interfaces.OfferService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/offers")
@RestController
public class OfferController {
   private final OfferService offerService;

    public OfferController(OfferService offerService) {
        this.offerService = offerService;
    }
    @GetMapping
    public List<Offer> getAllOffer(){
        return offerService.getAllOffer();
    }

    @GetMapping("/{id}")
    public Offer getById(@PathVariable Long id) {
        return offerService.getById(id);
    }

    @PostMapping
    public void addOffer(@RequestBody Offer offer){
        offerService.addOffer(offer);

    }
    @PutMapping("/{id}")
    public void updateOffer(@RequestBody Offer offer) {
        offerService.updateOffer(offer);
    }

    @DeleteMapping("/{id}")
    public void deleteOffer(@PathVariable Long id){
        offerService.deleteOffer(id);
    }

}

