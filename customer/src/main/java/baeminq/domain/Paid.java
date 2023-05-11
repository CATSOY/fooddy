package baeminq.domain;

import baeminq.infra.AbstractEvent;
import java.util.*;
import lombok.Data;

@Data
public class Paid extends AbstractEvent {

    private Long id;
    private String status;
    private String orderId;
}
