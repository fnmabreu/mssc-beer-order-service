package guru.sfg.beer.order.service.repositories;

import guru.sfg.beer.order.service.domain.BeerOrderLine;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.UUID;

/**
 * Created by fabreu on 21/11/2021
 */
public interface BeerOrderLineRepository extends PagingAndSortingRepository<BeerOrderLine, UUID> {
}
