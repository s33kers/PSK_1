package us.martink.services;

import us.martink.entities.Student;
import us.martink.entities.University;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.transaction.Transactional;
import java.util.Collections;
import java.util.List;

/**
 * Created by tadas.
 */
@ApplicationScoped
@Named
public class UniversityService {

    @Inject
    private UniversityDAO universityDAO;

    public List<University> getAllUniversities() {
        return universityDAO.getAllUniversities();
    }

    @Transactional
    public void createUniversity (University university) {
        universityDAO.create(university);
    }

}
