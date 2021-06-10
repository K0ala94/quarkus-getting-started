package gergo.quarkus.getting.started.endpoints;

import gergo.quarkus.getting.started.business.CatService;
import gergo.quarkus.getting.started.business.OwnerService;
import gergo.quarkus.getting.started.model.Cat;
import gergo.quarkus.getting.started.model.Owner;
import org.eclipse.microprofile.graphql.*;

import javax.inject.Inject;
import java.util.List;

@GraphQLApi
public class CatsGraphqlEndpoint {

    @Inject
    CatService catService;
    @Inject
    OwnerService ownerService;

    @Query("allCats")
    @Description("Get a list of all of my cats")
    public List<Cat> getAllCats(){

        return catService.listCats();
    }

    @Query("getCat")
    public Cat getCat(@Name("name") String name){

        return catService.getCat(name);
    }

    @Query("getOwners")
    public List<Owner> getAllOwners(){

       return ownerService.listOwners();
    }

    public List<Cat> getCatsForOwner(@Source Owner owner){

       return catService.getCatsByOwner(owner.getName());
    }

    @Mutation
    public Cat createCat(Cat cat){

        return catService.createCat(cat);
    }
}
