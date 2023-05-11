package baeminq.domain;

import baeminq.domain.*;
import baeminq.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class CookFinished extends AbstractEvent {

    private Long id;
    private String status;
    private Object options;
    private String storeId;
    private String foodId;
    private String orderId;
}
