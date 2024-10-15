package com.rt;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Response;

import java.util.UUID;

@Path("books")
public class BookResource {
    @Inject
    BookService bookService;

    @POST
    public Response createBook(Book book) {
        UUID id = bookService.create(book);
        return Response.status(Response.Status.CREATED).build();
    }

    @GET
    public Response getAllBooks() {
        return Response.ok(bookService.findAll()).build();
    }
}
