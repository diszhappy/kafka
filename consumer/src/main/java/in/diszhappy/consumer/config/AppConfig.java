package in.diszhappy.consumer.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class AppConfig {

    private Logger log = LoggerFactory.getLogger(AppConfig.class);
    @KafkaListener(topics = AppConstants.TOPIC_NAME_TO_CONSUME,groupId = AppConstants.GROUP_ID)
   public void getMessages(String msg){
        log.info(msg);
   }
}
