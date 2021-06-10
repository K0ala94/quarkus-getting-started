package gergo.quarkus.getting.started.business;

import gergo.quarkus.getting.started.dao.OwnerRepo;
import gergo.quarkus.getting.started.model.Owner;

import javax.enterprise.context.ApplicationScoped;
import java.util.List;

@ApplicationScoped
public class OwnerService {

    public List<Owner> listOwners(){

        return OwnerRepo.INSTANCE.getAllOwners();
    }

}
