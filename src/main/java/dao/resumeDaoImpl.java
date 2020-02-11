package dao;

import domain.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class resumeDaoImpl implements resumeDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Employee> getEmployee(String query) {
        Session session = sessionFactory.getCurrentSession();
        return session.createNamedQuery(query,Employee.class).list();
    }
}
