package guru.sfg.beer.order.service.services.beer;

import guru.sfg.brewery.model.BeerDto;

import java.util.Optional;
import java.util.UUID;

/**
 * Created by fabreu on 22/11/2021
 */
public interface BeerService {

    Optional<BeerDto> getBeerById(UUID uuid);

    Optional<BeerDto> getBeerByUpc(String upc);
}
