package us.martink.vm;

import lombok.Getter;
import us.martink.entities.University;
import us.martink.services.UniversityService;

import javax.enterprise.inject.Model;
import javax.inject.Inject;
import java.util.List;

/**
 * Created by tadas.
 */
@Model
public class UniversityVm {

    @Getter
    private University university = new University();

    @Inject
    private UniversityService universityService;

    public List<University> getAllUniversities() {
        return universityService.getAllUniversities();
    }

    public void createUniversity() {
        universityService.createUniversity(university);
    }
}
