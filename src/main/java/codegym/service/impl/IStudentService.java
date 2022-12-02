package codegym.service.impl;

import codegym.model.Student;
import codegym.service.ICRUD_Service;

import java.util.List;

public interface IStudentService extends ICRUD_Service<Student> {
    List<Student> findByName(String name);
}
