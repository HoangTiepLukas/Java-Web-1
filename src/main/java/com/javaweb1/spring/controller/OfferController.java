package com.javaweb1.spring.controller;

import com.javaweb1.spring.dto.AcceptDeliveryRequest;
import com.javaweb1.spring.dto.AcceptOfferRequest;
import com.javaweb1.spring.dto.CreateOfferRequest;
import com.javaweb1.spring.dto.OfferDTO;
import com.javaweb1.spring.service.OfferService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/offers")
public class OfferController {
    private final OfferService offerService;

    public OfferController(OfferService offerService) {
        this.offerService = offerService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public OfferDTO createOffer(@RequestBody CreateOfferRequest request) {
        return offerService.createOffer(request);
    }

    @GetMapping
    public List<OfferDTO> ListOffers() {
        return offerService.listOffers();
    }

    @GetMapping("/{id}")
    public OfferDTO getOffer(@PathVariable String id) {
        return offerService.getOffer(id);
    }

    @PatchMapping("/{id}/accept-offer")
    public OfferDTO acceptOffer(@PathVariable String id, @RequestBody AcceptOfferRequest request) {
        return offerService.acceptOffer(id,request);
    }

    @PatchMapping("/{id}/start-work")
    public OfferDTO startWork(@PathVariable String id) {
        return offerService.startWork(id);
    }

    @PatchMapping("/{id}/delivery")
    public OfferDTO deliverWork(@PathVariable String id) {
        return offerService.deliverWork(id);
    }

    @PatchMapping("/{id}/accept-delivery")
    public OfferDTO acceptDelivery(@PathVariable String id, @RequestBody AcceptDeliveryRequest request) {
        return offerService.acceptDelivery(id, request);
    }

}
