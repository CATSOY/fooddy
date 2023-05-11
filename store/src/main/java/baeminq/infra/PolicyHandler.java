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

    @Autowired
    FoodCookingRepository foodCookingRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString) {}

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='OrderPlaced'"
    )
    public void wheneverOrderPlaced_Ordercopy(
        @Payload OrderPlaced orderPlaced
    ) {
        OrderPlaced event = orderPlaced;
        System.out.println(
            "\n\n##### listener Ordercopy : " + orderPlaced + "\n\n"
        );

        // Sample Logic //
        FoodCooking.ordercopy(event);
    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='Paid'"
    )
    public void wheneverPaid_StatusUpdate(@Payload Paid paid) {
        Paid event = paid;
        System.out.println(
            "\n\n##### listener StatusUpdate : " + paid + "\n\n"
        );

        // Sample Logic //
        FoodCooking.statusUpdate(event);
    }
}
