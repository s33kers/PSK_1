package us.martink.services;

import us.martink.mybatis.dao.CourseMapper;
import us.martink.mybatis.dao.StudentCourseMapper;
import us.martink.mybatis.dao.StudentMapper;
import us.martink.mybatis.entities.Course;
import us.martink.mybatis.entities.Student;
import us.martink.mybatis.entities.StudentCourse;

import javax.enterprise.context.ApplicationScoped;
import javax.faces.bean.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by tadas.
 */
@ApplicationScoped
@Named
public class IndexService{

    @Inject
    private StudentMapper studentMapper;

    @Inject
    private CourseMapper courseMapper;

    @Inject
    private StudentCourseMapper studentCourseMapper;

    public List<Student> getAllStudents() {
        return studentMapper.selectAll();
    }

    @Transactional
    public void createStudent(Course course, Student student) {
        courseMapper.insert(course);
        studentMapper.insert(student);
        StudentCourse studentCourse = new StudentCourse();
        studentCourse.setCourseId(course.getId());
        studentCourse.setStudentId(student.getId());
        studentCourseMapper.insert(studentCourse);
    }

}
