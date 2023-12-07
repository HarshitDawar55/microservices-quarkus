package com.hd.project;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.jboss.logging.Logger;

import java.time.Instant;
import java.util.Random;

@Path("/api/ISBN")
public class ISBNResource {
    @Inject
    Logger logger;
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public ISBNClass create_new_ISBN_Number(){
        ISBNClass ISBNNumber = new ISBNClass();
        ISBNNumber.isbn10 = "10-" + new Random().nextInt(100_000);
        ISBNNumber.isbn13 = "13-" + new Random().nextInt(100_000_000);
        ISBNNumber.generationDate = Instant.now();

        // Logging the entries that are generated
        logger.info("ISBN Data Generated: " + ISBNNumber);
        return ISBNNumber;

    }
}
