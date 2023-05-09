package br.com.ifba.giovaneneves.sms.student.service;

import br.com.ifba.giovaneneves.sms.api.resource.student.model.StudentResource;
import br.com.ifba.giovaneneves.sms.infrastructure.exceptions.student.ExistingRegistrationNumberException;
import br.com.ifba.giovaneneves.sms.infrastructure.exceptions.student.InvalidAgeException;
import br.com.ifba.giovaneneves.sms.infrastructure.exceptions.student.InvalidRegistrationNumberException;
import br.com.ifba.giovaneneves.sms.infrastructure.exceptions.student.StudentNotFoundException;
import br.com.ifba.giovaneneves.sms.student.model.Student;

import java.util.List;
import java.util.Optional;

public interface IStudentService {

    /**
     *
     * Inserts a student in the database
     * @param studentResource to be added to the database.
     */
    boolean save(StudentResource studentResource);

    /**
     *
     * Search a student in the database
     * @param id of the student to be searched.
     * @return student with the specified ID.
     */
    Optional<Student> findStudentById(long id) throws StudentNotFoundException;


    /**
     * List all students.
     * @return a list with all students in the database.
     */
    List<Student> findAllStudents();

    /**
     *
     * @param id of the student to be removed from the database.
     * @return true if the student exists, false otherwise.
     */
    boolean deleteStudentById(long id) throws StudentNotFoundException;

    /**
     *
     * @param student to be updated.
     * @return true if the student exists in the database and the update was successful, false otherwise.
     */
    public boolean updateStudent(Student student) throws StudentNotFoundException;
}
