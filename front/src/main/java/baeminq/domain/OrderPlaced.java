package baeminq.domain;

import baeminq.domain.*;
import baeminq.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class OrderPlaced extends AbstractEvent {

    private Long id;
    private String address;
    private String customerId;
    private String storeId;
    private List<String> options;
    private String foodId;

    public OrderPlaced(Order aggregate) {
        super(aggregate);
    }

    public OrderPlaced() {
        super();
    }
}
