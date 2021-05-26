package gergo.quarkus.getting.started;

import java.util.Arrays;
import java.util.List;

public enum CatRepo {

    INTANCE;

    private List<Cat> cats = Arrays.asList(new Cat("Bonifac", "red"), new Cat("Lady", "grey"), new Cat("Zoko", "striped"));

    public List<Cat> getCats(){
        return  cats;
    }
}
