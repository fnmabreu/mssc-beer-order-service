package guru.sfg.beer.order.service.web.model;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.time.OffsetDateTime;
import java.util.UUID;

/**
 * Created by fabreu on 21/11/2021
 */
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class CustomerDto extends BaseItem {

    @Builder
    public CustomerDto(UUID id, Integer version, OffsetDateTime createdDate, OffsetDateTime lastModifiedDate, String name) {
        super(id, version, createdDate, lastModifiedDate);
        this.name = name;
    }

    private String name;

}
