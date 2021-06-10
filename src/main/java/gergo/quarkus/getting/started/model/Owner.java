package gergo.quarkus.getting.started.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Owner {

    private String name;
    private int age;
    private Gender gender;
}
