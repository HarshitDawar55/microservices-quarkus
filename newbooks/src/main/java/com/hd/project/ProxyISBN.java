package com.hd.project;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

@RegisterRestClient(baseUri = "http://localhost:8085")
@Path("/api/ISBN")
public interface ProxyforISBN {
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    ISBNThirteen generateISBN13();
}
