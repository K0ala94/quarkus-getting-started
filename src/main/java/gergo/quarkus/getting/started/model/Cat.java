package gergo.quarkus.getting.started.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cat {

    public Cat (String name){
        this.name = name;
    }

    private String name;
    private String color;
    private int age;
    private float weightInKg;
    private MeowVolume meowVolume;
    private Gender gender;
    private String owner;

}


