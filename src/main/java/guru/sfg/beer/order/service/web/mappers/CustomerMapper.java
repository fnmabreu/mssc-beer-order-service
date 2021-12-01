package guru.sfg.beer.order.service.web.mappers;

import guru.sfg.beer.order.service.domain.Customer;
import guru.sfg.brewery.model.CustomerDto;
import org.mapstruct.Mapper;

/**
 * Created by fabreu on 01/12/2021
 */
@Mapper(uses = {DateMapper.class})
public interface CustomerMapper {

    CustomerDto customerToDto(Customer customer);

    Customer dtoToCustomer(Customer dto);
}
