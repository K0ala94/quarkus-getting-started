package gergo.quarkus.getting.started;

import org.jboss.resteasy.annotations.jaxrs.PathParam;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/cats")
public class CatsEndpoint {

    @Inject
    CatService catService;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return catService.lisCats().toString();
    }

    @Produces(MediaType.TEXT_PLAIN)
    @Path("/{name}")
    @GET
    public String hello(@PathParam String name) {
        return catService.getCat(name).toString();
    }
}