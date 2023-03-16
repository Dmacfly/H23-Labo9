package ulaval.glo2003;

import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Response;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

@Path("/drink")
public class DrinkResource {

    @POST
    public Response getDrunk(ClientRequest request) {
        long age = ChronoUnit.YEARS.between(LocalDate.parse(request.birthDate), LocalDate.now());

        if (age < 18) {
            throw new TooYoungToDrinkException(request.name);
        } else {
            return Response.status(200).entity("Don't drive!").build();
        }
    }
}
