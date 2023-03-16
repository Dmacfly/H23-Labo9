package ulaval.glo2003;

import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.ext.ExceptionMapper;

public class NotPermittedExceptionMapper implements ExceptionMapper<NotPermittedException> {
    @Override
    public Response toResponse(NotPermittedException exception) {
        return Response.status(403).entity(exception.getMessage()).build();
    }
}
