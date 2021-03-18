package cace.domain.service;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import cace.domain.entity.Composant;
import cace.domain.repositories.ComposantRepository;

@ApplicationScoped
public class ComposantService {

	@Inject
	private ComposantRepository composantRepository;

	public void createComposant(Composant composant) {
		composantRepository.save(composant);
	}

	public List<Composant> findAll() {
		return composantRepository.findAll();
	}

	public Composant findByIdComposant(String id) {
		List<Composant> composant = composantRepository.findById(id);
		return composant.get(0);
	}

	public void updateComposant(Composant composant) {
		composantRepository.save(composant);
	}

	public void deleteComposant(Composant composant) {
		composantRepository.delete(composant);
	}
	
	

}
