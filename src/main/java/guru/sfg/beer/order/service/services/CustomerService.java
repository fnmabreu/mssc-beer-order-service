package guru.sfg.beer.order.service.services;

import guru.sfg.brewery.model.CustomerPagedList;
import org.springframework.data.domain.Pageable;

/**
 * Created by fabreu on 01/12/2021
 */
public interface CustomerService {

    CustomerPagedList listCustomers(Pageable pageable);
}
