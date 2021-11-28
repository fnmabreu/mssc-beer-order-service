package guru.sfg.beer.order.service.domain;

/**
 * Created by fabreu on 27/11/2021
 */
public enum BeerOrderEventEnum {

    VALIDATE_ORDER, VALIDATION_PASSED, VALIDATION_FAILED,
    ALLOCATED_ORDER, ALLOCATION_SUCCESS, ALLOCATION_NO_INVENTORY, ALLOCATION_FAILED,
    BEERORDER_PICKED_UP
}
