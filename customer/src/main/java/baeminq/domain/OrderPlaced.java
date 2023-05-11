package baeminq.domain;

import baeminq.infra.AbstractEvent;
import java.util.*;
import lombok.Data;

@Data
public class OrderPlaced extends AbstractEvent {

    private Long id;
    private String address;
    private String customerId;
    private String storeId;
    private List<String> options;
    private String foodId;
}
