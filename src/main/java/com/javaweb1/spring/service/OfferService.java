package com.javaweb1.spring.service;

import com.javaweb1.spring.dto.*;

import java.util.List;

public interface OfferService {
    OfferDTO createOffer(CreateOfferRequest request);
    List<OfferDTO> listOffers();
    OfferDTO getOffer(String id);
    OfferDTO updateOffer(String id, UpdateOfferRequest request);
    OfferDTO acceptOffer(String id, AcceptOfferRequest request);
    OfferDTO startWork(String id);
    OfferDTO deliverWork(String id);
    OfferDTO acceptDelivery(String id, AcceptDeliveryRequest request);
    OfferDTO invoiceOffer(String id);
}
