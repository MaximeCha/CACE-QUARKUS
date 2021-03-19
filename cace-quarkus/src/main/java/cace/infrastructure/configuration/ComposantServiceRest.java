package cace.infrastructure.configuration;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.jboss.logging.Logger;

import cace.domain.entity.Composant;
import cace.domain.service.ComposantService;


@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
@Path("/")
@RequestScoped
public class ComposantServiceRest {

	@Inject
	private ComposantService composantCaracteristiquesEconomiquesService;
	
	private static final Logger LOG = Logger.getLogger(ComposantServiceRest.class);

    @GET
	@Path("composantCaracteristiquesEconomiques")
	public Response getComposant() {
    	LOG.info("Get Composant Caracteristiques Economiques");
		return Response.status(200).entity(composantCaracteristiquesEconomiquesService.findAll()).build();
	}

    @GET
	@Path("composantCaracteristiquesEconomiques/{id}")
	public Response getComposantById(@PathParam("id") String id) {
    	LOG.info("Get Composant by Id Caracteristiques Economiques");
		return Response.status(200).entity(composantCaracteristiquesEconomiquesService.findByIdComposant(id)).build();
	}

    @POST
	@Path("createComposantCaracteristiquesEconomiques")
	public Response createComposant(Composant composant) {
    	LOG.info("Create Composant by Id Caracteristiques Economiques");
		composantCaracteristiquesEconomiquesService.createComposant(composant);
		return Response.status(200).entity(composant).build();
	}

    @DELETE
	@Path("deleteComposantCaracteristiquesEconomiques")
	public void deleteComposant(Composant composant) {
    	LOG.info("Delete Composant Caracteristiques Economiques");
		composantCaracteristiquesEconomiquesService.deleteComposant(composant);
	}
}
