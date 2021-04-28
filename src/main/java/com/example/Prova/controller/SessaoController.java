package com.example.Prova.controller;

import com.example.Prova.dao.SessaoDao;
import com.example.Prova.model.Sessao;
import com.google.gson.Gson;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("/sessao")
public class SessaoController {

    @GET
    @Path("list")
    @Produces("application/json")
    public Response listSessao(){

        SessaoDao dao = new SessaoDao();
        List<Sessao> sessoes = dao.listSessao();
        return Response.ok(new Gson().toJson(sessoes)).build();

    }
    @POST
    @Path("new")
    @Produces("application/json")
    public Response newSessao()
    {
        SessaoDao dao = new SessaoDao();
        dao.newSessao();

        return null;
    }
}
