package gergo.quarkus.getting.started.dao;

import gergo.quarkus.getting.started.model.Gender;
import gergo.quarkus.getting.started.model.MeowVolume;
import gergo.quarkus.getting.started.model.Cat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public enum CatRepo {

    INTANCE;

    private List<Cat> cats =new ArrayList<>( Arrays.asList(
            new Cat("Bonifac", "red", 3, 7.8f,MeowVolume.VERY_LOUD, Gender.MALE, "Gercsi"),
            new Cat("Lady", "grey", 3, 4.5f, MeowVolume.SILENT, Gender.FEMALE, "Gercsi"),
            new Cat("Zoko", "striped", 3, 6.5f, MeowVolume.LOUD, Gender.MALE, "Shanni")));

    public List<Cat> getAllCats(){
        return  cats;
    }

    public Cat addCat(Cat newCat){
         cats.add(newCat);
         return newCat;
    }
}
