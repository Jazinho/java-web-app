package servlets;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

/**
 * Created by Jaśko on 2016-08-30.
 */

@Path("/message")
public class HelloResource {

    @GET
    @Path("/hel")
    public Response hej(){
        return Response.ok("Siemanko").build();
    }
}
