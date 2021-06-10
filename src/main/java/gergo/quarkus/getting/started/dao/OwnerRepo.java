package gergo.quarkus.getting.started.dao;

import gergo.quarkus.getting.started.model.Cat;
import gergo.quarkus.getting.started.model.Gender;
import gergo.quarkus.getting.started.model.Owner;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public enum OwnerRepo {

    INSTANCE;


    private List<Owner> owners = Arrays.asList(new Owner("Gercsi", 26, Gender.MALE),
            new Owner("Shanni", 23, Gender.FEMALE));

    public List<Owner> getAllOwners(){
        return owners;
    }
}
