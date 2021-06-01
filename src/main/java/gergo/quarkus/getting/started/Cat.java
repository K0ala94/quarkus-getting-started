package gergo.quarkus.getting.started;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Cat {

    private String name;
    private String color;

}
