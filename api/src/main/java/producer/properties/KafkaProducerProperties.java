package producer.properties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@Data
@AllArgsConstructor
@Getter
@ConfigurationProperties(prefix = "kafka.producer")
public class KafkaProducerProperties {
    private String bootstrap;
    private String topic;

}
