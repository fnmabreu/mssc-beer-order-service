package guru.sfg.beer.order.service.services;


import guru.sfg.brewery.model.BeerOrderDto;
import guru.sfg.brewery.model.BeerOrderPagedList;
import org.springframework.data.domain.Pageable;

import java.util.UUID;

/**
 * Created by fabreu on 21/11/2021
 */
public interface BeerOrderService {

    BeerOrderPagedList listOrders(UUID customerId, Pageable pageable);

    BeerOrderDto placeOrder(UUID customerId, BeerOrderDto beerOrderDto);

    BeerOrderDto getOrderById(UUID customerId, UUID orderId);

    void pickupOrder(UUID customerId, UUID orderId);
}
