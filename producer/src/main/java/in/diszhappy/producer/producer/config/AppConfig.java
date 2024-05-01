package in.diszhappy.producer.producer.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class AppConfig {

    public NewTopic topic(){
        return TopicBuilder.name(AppConstants.PRODUCER_TOPIC_NAME).build();
    }
}
