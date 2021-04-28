package com.example.Prova.controller;

import com.example.Prova.dao.FilmeDao;
import com.example.Prova.model.Filme;
import com.google.gson.Gson;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("/filme")
public class FilmeController {

    @GET
    @Path("list")
    @Produces("application/json")
    public Response listFilme(){

        FilmeDao dao = new FilmeDao();
        List<Filme> filmes = dao.listFilme();
        return Response.ok(new Gson().toJson(filmes)).build();

    }
    @POST
    @Path("new")
    @Produces("application/json")
    public Response newFilme()
    {
        FilmeDao dao = new FilmeDao();
        dao.newFilme();

        return null;
    }
}
