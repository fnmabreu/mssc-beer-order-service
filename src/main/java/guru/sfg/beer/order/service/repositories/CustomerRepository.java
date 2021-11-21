package guru.sfg.beer.order.service.repositories;

import guru.sfg.beer.order.service.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

/**
 * Created by fabreu on 21/11/2021
 */
public interface CustomerRepository extends JpaRepository<Customer, UUID> {
    List<Customer> findAllByCustomerNameLike(String customerName);
}
