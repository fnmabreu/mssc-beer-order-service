package guru.sfg.beer.order.service.services;

import guru.sfg.beer.order.service.domain.BeerOrder;

import java.util.UUID;

/**
 * Created by fabreu on 28/11/2021
 */
public interface BeerOrderManager {

    BeerOrder newBeerOrder(BeerOrder beerOrder);

    void processValidationResult(UUID beerOrderId, Boolean isValid);
}
