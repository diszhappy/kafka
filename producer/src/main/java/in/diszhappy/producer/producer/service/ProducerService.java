package in.diszhappy.producer.producer.service;

import in.diszhappy.producer.producer.config.AppConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.util.function.IntConsumer;
import java.util.stream.IntStream;

@Service
public class ProducerService {

    @Autowired
    private KafkaTemplate<String,String> kafkaTemplate;
    public double updateMessage(String msg){

        long startTime = System.nanoTime();
//        IntStream.range(0,1000000).forEach((i) ->this.kafkaTemplate.send(AppConstants.PRODUCER_TOPIC_NAME,msg+"\t"+i));
        this.kafkaTemplate.send(AppConstants.PRODUCER_TOPIC_NAME,msg);
        long endTime = System.nanoTime();
        long executionTime = endTime-startTime;
        return   (double) executionTime / 1_000_000;
    }
}
