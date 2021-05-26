package gergo.quarkus.getting.started;

import javax.enterprise.context.ApplicationScoped;
import java.util.List;

@ApplicationScoped
public class CatService {

    public List<Cat> lisCats(){
        return CatRepo.INTANCE.getCats();
    }

    public Cat getCat(String name){
        return CatRepo.INTANCE.getCats().stream().filter(c -> c.getName().toUpperCase().equals(name.toUpperCase())).findFirst().orElse(new Cat("not found",""));
    }
}
