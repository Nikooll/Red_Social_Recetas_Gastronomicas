package com.red_social.rest;

import com.red_social.rest.controller.Dao.servicies.PersonaServicies;
import java.util.HashMap;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

@Path("person")
public class PersonaApi {

    @Path("/list")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAllPersons() {
        HashMap<String, Object> map = new HashMap<>();
        PersonaServicies ps = new PersonaServicies();
        map.put("msg", "Ok");
        map.put("data", ps.listAll().toArray());
        return Response.ok(map).build();
    }

    @Path("/save")
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response save(HashMap<String, String> map) {
        PersonaServicies ps = new PersonaServicies();
        ps.getPersona().setNombre(map.get("nombre"));
        ps.getPersona().setApellido(map.get("apellido"));
        ps.getPersona().setApodo(map.get("apodo"));

        HashMap<String, Object> res = new HashMap<>();
        try {
            ps.save();
            res.put("msg", "Ok");
            res.put("data", "Guardado correctamente");
            return Response.ok(res).build();
        } catch (Exception e) {
            res.put("msg", "Error");
            res.put("data", e.toString());
            return Response.status(Status.INTERNAL_SERVER_ERROR).entity(res).build();
        }
    }

    @Path("/listType")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getType() {
        HashMap<String, Object> map = new HashMap<>();
        PersonaServicies ps = new PersonaServicies();
        map.put("msg", "Ok");
        map.put("data", ps.getPersona());
        return Response.ok(map).build();
    }
}
