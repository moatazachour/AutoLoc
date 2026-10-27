package tn.esprit.moatazachour4ssa15.Services;

import tn.esprit.moatazachour4ssa15.Domain.Employee;

import java.util.List;

public interface IEmployeeService {
    Employee create(Employee Employee);
    Employee getById(Long id);
    Employee update(Employee Employee);
    void delete(Long id);
    List<Employee> getAll();
}
