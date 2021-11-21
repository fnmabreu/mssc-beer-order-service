package guru.sfg.beer.order.service.web.mappers;

import guru.sfg.beer.order.service.domain.BeerOrder;
import guru.sfg.beer.order.service.web.model.BeerOrderDto;
import org.mapstruct.Mapper;

/**
 * Created by fabreu on 21/11/2021
 */
@Mapper(uses = {DateMapper.class, BeerOrderLineMapper.class})
public interface BeerOrderMapper {

    BeerOrderDto beerOrderToDto(BeerOrder beerOrder);

    BeerOrder dtoToBeerOrder(BeerOrderDto dto);
}
