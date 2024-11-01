package com.red_social.rest;

import controller.Dao.servicies.PersonaServicies;
import java.util.HashMap;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("personResource")
public class PersonaResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getPersonList() {
        HashMap<String, Object> responseMap = new HashMap<>();
        PersonaServicies personaService = new PersonaServicies();
        String statusMessage = "";

        try {
            // Creando y guardando primera persona
            personaService.getPersona().setNombre("Luis Fernando");
            personaService.getPersona().setApellido("Martínez Sánchez");
            personaService.getPersona().setApodo("Fercho");
            personaService.save();

            // Creando y guardando segunda persona
            personaService.getPersona().setNombre("María Isabel");
            personaService.getPersona().setApellido("Pérez Castro");
            personaService.getPersona().setApodo("Maris");
            personaService.save();

            statusMessage = "La lista está vacía: " + personaService.listAll().isEmpty();
        } catch (Exception e) {
            System.out.println("Error al guardar: " + e);
            responseMap.put("msg", "Error");
            responseMap.put("data", "Error al procesar la solicitud: " + e.getMessage());
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(responseMap).build();
        }

        responseMap.put("msg", "Ok");
        responseMap.put("data", "Test: " + statusMessage);

        return Response.ok(responseMap).build();
    }
}
