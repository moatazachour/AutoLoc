package tn.esprit.moatazachour4ssa15.Services.Impls;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.moatazachour4ssa15.Domain.Employee;
import tn.esprit.moatazachour4ssa15.Repositories.IEmployeeRepository;
import tn.esprit.moatazachour4ssa15.Services.IEmployeeService;

import java.util.List;

@RequiredArgsConstructor
@Service
public class EmployeeService implements IEmployeeService {

    final IEmployeeRepository employeeRepository;

    @Override
    public Employee create(Employee Employee) {
        return employeeRepository.save(Employee);
    }

    @Override
    public Employee getById(Long id) {
        return employeeRepository.findById(id).orElse(null);
    }

    @Override
    public Employee update(Employee Employee) {
        return employeeRepository.save(Employee);
    }

    @Override
    public void delete(Long id) {
        employeeRepository.deleteById(id);
    }

    @Override
    public List<Employee> getAll() {
        return employeeRepository.findAll();
    }
}
