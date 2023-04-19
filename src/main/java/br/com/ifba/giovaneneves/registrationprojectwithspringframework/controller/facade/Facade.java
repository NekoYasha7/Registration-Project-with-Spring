package br.com.ifba.giovaneneves.registrationprojectwithspringframework.controller.facade;

import br.com.ifba.giovaneneves.registrationprojectwithspringframework.model.Student;
import br.com.ifba.giovaneneves.registrationprojectwithspringframework.service.StudentService;
import br.com.ifba.giovaneneves.registrationprojectwithspringframework.exceptions.student.ExistingRegistrationNumberException;
import br.com.ifba.giovaneneves.registrationprojectwithspringframework.exceptions.student.InvalidAgeException;
import br.com.ifba.giovaneneves.registrationprojectwithspringframework.exceptions.student.InvalidRegistrationNumberException;
import br.com.ifba.giovaneneves.registrationprojectwithspringframework.exceptions.student.StudentNotFoundException;

import java.util.List;

public class Facade implements IFacade {

    private final StudentService studentService = new StudentService();

    /**
     *
     * Inserts a student int the database
     * @param student to be added to the database.
     */
    @Override
    public boolean saveStudent(Student student) throws ExistingRegistrationNumberException, InvalidRegistrationNumberException, InvalidAgeException {
        return studentService.saveStudent(student);
    }

    /**
     *
     * Search a student in the database
     * @param id of the student to be searched.
     * @return student with the specified ID, null otherwise.
     */
    @Override
    public Student findStudentById(int id) throws StudentNotFoundException {
        return studentService.findStudentById(id);
    }

    /**
     * List all students.
     * @return a list with all students in the database.
     */
    @Override
    public List<Student> listAllStudents() {
        return studentService.listAllStudents();
    }

    /**
     *
     * @param id of the student to be removed from the database.
     * @return true if the student exists, false otherwise.
     */
    @Override
    public boolean removeStudent(int id) throws StudentNotFoundException {
        return studentService.removeStudent(id);
    }

    /**
     *
     * @param student to be updated.
     * @return true if the student exists in the database and the update was successful, false otherwise.
     */
    @Override
    public boolean updateStudent(Student student) throws StudentNotFoundException {
        return studentService.updateStudent(student);
    }

}
