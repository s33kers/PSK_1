package us.martink.mybatis.entities;

public class StudentCourse {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column psk_1.student_course.student_id
     *
     * @mbg.generated Tue Mar 21 23:31:39 EET 2017
     */
    private Integer studentId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column psk_1.student_course.course_id
     *
     * @mbg.generated Tue Mar 21 23:31:39 EET 2017
     */
    private Integer courseId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column psk_1.student_course.student_id
     *
     * @return the value of psk_1.student_course.student_id
     *
     * @mbg.generated Tue Mar 21 23:31:39 EET 2017
     */
    public Integer getStudentId() {
        return studentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column psk_1.student_course.student_id
     *
     * @param studentId the value for psk_1.student_course.student_id
     *
     * @mbg.generated Tue Mar 21 23:31:39 EET 2017
     */
    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column psk_1.student_course.course_id
     *
     * @return the value of psk_1.student_course.course_id
     *
     * @mbg.generated Tue Mar 21 23:31:39 EET 2017
     */
    public Integer getCourseId() {
        return courseId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column psk_1.student_course.course_id
     *
     * @param courseId the value for psk_1.student_course.course_id
     *
     * @mbg.generated Tue Mar 21 23:31:39 EET 2017
     */
    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }
}