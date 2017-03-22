package us.martink.vm;

import lombok.Getter;
import us.martink.mybatis.entities.Course;
import us.martink.mybatis.entities.Student;
import us.martink.services.IndexService;

import javax.enterprise.inject.Model;
import javax.inject.Inject;
import java.io.Serializable;
import java.util.List;

/**
 * Created by tadas.
 */
@Model
public class IndexVm {

    @Getter
    private Course course = new Course();
    @Getter
    private Student student = new Student();

    @Inject
    private IndexService indexService;


    public List<Student> getAllStudents() {
        return indexService.getAllStudents();
    }

    public void createStudent() {
        indexService.createStudent(course, student);
    }
}
