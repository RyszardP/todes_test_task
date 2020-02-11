package dao;

import domain.Employee;

import java.util.List;

public interface resumeDao {
    List<Employee> getEmployee(String query);
}
