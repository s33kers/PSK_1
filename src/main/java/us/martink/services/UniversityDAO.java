package us.martink.services;

import us.martink.entities.University;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.SynchronizationType;
import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by tadas.
 */
@ApplicationScoped
@Named
public class UniversityDAO {

    @PersistenceContext(synchronization = SynchronizationType.SYNCHRONIZED)
    private EntityManager em;

    public List<University> getAllUniversities() {
        return em.createNamedQuery("University.findAll", University.class).getResultList();
    }

    @Transactional
    public void create(University university) {
        em.persist(university);
    }
}
