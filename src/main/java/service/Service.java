package service;

import domain.Employee;

import java.util.List;

public interface Service {
    public List<Employee> getEmployees(String query);
}
