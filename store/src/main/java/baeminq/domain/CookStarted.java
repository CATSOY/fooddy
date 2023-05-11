package baeminq.domain;

import baeminq.domain.*;
import baeminq.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class CookStarted extends AbstractEvent {

    private Long id;
    private String status;
    private List<String> options;
    private String storeId;
    private String foodId;
    private String orderId;

    public CookStarted(FoodCooking aggregate) {
        super(aggregate);
    }

    public CookStarted() {
        super();
    }
}
