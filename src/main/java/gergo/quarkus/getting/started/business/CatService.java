package gergo.quarkus.getting.started.business;

import gergo.quarkus.getting.started.dao.CatRepo;
import gergo.quarkus.getting.started.model.Cat;

import javax.enterprise.context.ApplicationScoped;
import java.util.List;
import java.util.stream.Collectors;

@ApplicationScoped
public class CatService {

    public List<Cat> listCats(){
        return CatRepo.INTANCE.getAllCats();
    }

    public Cat getCat(String name){
        return CatRepo.INTANCE.getAllCats().stream().filter(c -> c.getName().toUpperCase().equals(name.toUpperCase())).findFirst().orElse(new Cat("not found"));
    }

    public List<Cat> getCatsByOwner(String ownerName){

        return CatRepo.INTANCE.getAllCats().stream().filter( c -> c.getOwner().toUpperCase().equals(ownerName.toUpperCase())).collect(Collectors.toList());
    }

    public Cat createCat(Cat cat){
        return CatRepo.INTANCE.addCat(cat);
    }
}
