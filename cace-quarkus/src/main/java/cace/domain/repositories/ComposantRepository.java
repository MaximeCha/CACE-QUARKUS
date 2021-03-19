package cace.domain.repositories;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import org.bson.Document;
import org.jboss.logging.Logger;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;

import cace.domain.dictionnaires.ComposantType;
import cace.domain.dictionnaires.PrixType;
import cace.domain.entity.Composant;

@ApplicationScoped
@SuppressWarnings("unchecked")
public class ComposantRepository {

	private static final Logger LOG = Logger.getLogger(ComposantRepository.class);

	@Inject
	MongoClient mongoClient;

	public void save(Composant composant) {
		LOG.info("On rentre dans le save");
		getCollection().insertOne(composantToDoc(composant));
		LOG.info("On sort du save");
	}

	public List<Composant> findAll() {
		LOG.info("On rentre dans le findAll");
		List<Composant> list = new ArrayList<>();
		MongoCursor<Document> cursor = getCollection().find().iterator();

		try {
			while (cursor.hasNext()) {
				Document document = cursor.next();
				Composant composant = new Composant();
				composant.setComposantNom(document.getString("composantType"));
				composant.setComposantType(
						ComposantType.create(((String) document.get("composantType"))));
				composant.setPrixValeur((Float) document.get("prix"));
				composant.setPrixType(PrixType.create(((String) document.get("prixType"))));
				composant.setId(document.getString("id"));
				list.add(composant);
			}
		} finally {
			cursor.close();
		}
		LOG.info("On sort du findAll");
		return list;
	}

	@SuppressWarnings("rawtypes")
	private MongoCollection getCollection() {
		return mongoClient.getDatabase("composant").getCollection("composant");
	}

	public List<Composant> findById(String id) {
		LOG.info("On rentre dans le findById");
		Document query = new Document("id", id);
		List<Composant> results = new ArrayList<>();
		LOG.info("On sort du findById");
		return (List<Composant>) getCollection().find(query).into(results);
	}

	public void delete(Composant composant) {
		// TODO Auto-generated method stub

	}

	private Document composantToDoc(Composant composant) {
		Document document = new Document().append("id", composant.getId())
				.append("composantNom", composant.getComposantNom())
				.append("composantType", ComposantType.valueOf(composant.getComposantType().toString().toUpperCase()))
				.append("prix", composant.getPrixValeur())
				.append("prixType", PrixType.valueOf(composant.getComposantType().toString().toUpperCase()));
		return document;
	}

}
