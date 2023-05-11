package baeminq.infra;

import baeminq.config.kafka.KafkaProcessor;
import baeminq.domain.*;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import javax.naming.NameParser;
import javax.naming.NameParser;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class PolicyHandler {

    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString) {}

    @Autowired
    baeminq.external.OrderService orderService;

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='OrderAccepted'"
    )
    public void wheneverOrderAccepted_Notify(
        @Payload OrderAccepted orderAccepted
    ) {
        OrderAccepted event = orderAccepted;
        System.out.println(
            "\n\n##### listener Notify : " + orderAccepted + "\n\n"
        );
        // REST Request Sample

        // orderService.getOrder(/** mapping value needed */);

        // Sample Logic //

    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='OrderDenied'"
    )
    public void wheneverOrderDenied_Notify(@Payload OrderDenied orderDenied) {
        OrderDenied event = orderDenied;
        System.out.println(
            "\n\n##### listener Notify : " + orderDenied + "\n\n"
        );
        // REST Request Sample

        // orderService.getOrder(/** mapping value needed */);

        // Sample Logic //

    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='CookStarted'"
    )
    public void wheneverCookStarted_Notify(@Payload CookStarted cookStarted) {
        CookStarted event = cookStarted;
        System.out.println(
            "\n\n##### listener Notify : " + cookStarted + "\n\n"
        );
        // REST Request Sample

        // orderService.getOrder(/** mapping value needed */);

        // Sample Logic //

    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='CookFinished'"
    )
    public void wheneverCookFinished_Notify(
        @Payload CookFinished cookFinished
    ) {
        CookFinished event = cookFinished;
        System.out.println(
            "\n\n##### listener Notify : " + cookFinished + "\n\n"
        );
        // REST Request Sample

        // orderService.getOrder(/** mapping value needed */);

        // Sample Logic //

    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='FoodPicked'"
    )
    public void wheneverFoodPicked_Notify(@Payload FoodPicked foodPicked) {
        FoodPicked event = foodPicked;
        System.out.println(
            "\n\n##### listener Notify : " + foodPicked + "\n\n"
        );
        // REST Request Sample

        // orderService.getOrder(/** mapping value needed */);

        // Sample Logic //

    }
}
