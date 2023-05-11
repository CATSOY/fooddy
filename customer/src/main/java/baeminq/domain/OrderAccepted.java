package baeminq.domain;

import baeminq.domain.*;
import baeminq.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class OrderAccepted extends AbstractEvent {

    private Long id;
    private String status;
    private String storeId;
    private Object options;
    private String foodId;
    private String orderId;
}
