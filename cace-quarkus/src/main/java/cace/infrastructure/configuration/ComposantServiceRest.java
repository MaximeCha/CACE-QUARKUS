package cace.infrastructure.configuration;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.validation.Valid;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.jboss.logging.Logger;

import cace.domain.entity.Composant;
import cace.domain.service.ComposantService;


@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
@Path("")
@RequestScoped
public class ComposantServiceRest {

	@Inject
	private ComposantService composantCaracteristiquesEconomiquesService;
	
	private static final Logger LOG = Logger.getLogger(ComposantServiceRest.class);

    @GET
	@Path("/composantCaracteristiquesEconomiques")
	public List<Composant> getComposant() {
    	LOG.info("Get Composant Caracteristiques Economiques");
		return composantCaracteristiquesEconomiquesService.findAll();
	}

    @GET
	@Path("/composantCaracteristiquesEconomiques/{id}")
	public Composant getComposantById(@PathParam("id") String id) {
    	LOG.info("Get Composant by Id Caracteristiques Economiques");
		return composantCaracteristiquesEconomiquesService.findByIdComposant(id);
	}

    @POST
    @Produces(MediaType.TEXT_PLAIN)
	@Path("/createComposantCaracteristiquesEconomiques")
	public String createComposant(@Valid Composant composant) {
    	LOG.info("Create Composant by Id Caracteristiques Economiques");
		composantCaracteristiquesEconomiquesService.createComposant(composant);
		return "Composant enregistre";
	}

    @DELETE
	@Path("/deleteComposantCaracteristiquesEconomiques")
	public void deleteComposant(@Valid Composant composant) {
    	LOG.info("Delete Composant Caracteristiques Economiques");
		composantCaracteristiquesEconomiquesService.deleteComposant(composant);
	}
}
