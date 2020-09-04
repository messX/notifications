package producer.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class WorkUnit {
    private String id;
    private String definition;
}
