package builder;

import domain.Employee;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DataBaseQuery  {

    private StringBuilder query;

    public DataBaseQuery() {
    }

    private DataBaseQuery(DataBaseQueryBuilder dataBaseQueryBuilder) {
        this.query = dataBaseQueryBuilder.getQuery();
        Session session = HibernateSettings.getSession();
        List resultList = session.createQuery(query.toString()).getResultList();
        ArrayList<Employee> personArrayList = new ArrayList<>();
        for (int i = 0; i < resultList.size(); i++) {
            Object[] cols = (Object[]) resultList.get(i);
            Employee employee = new Employee(Long.valueOf(String.valueOf(cols[0])) ,(String) cols[1], (String) cols[2],
                    (String) cols[3], (Date) cols[4], (String) cols[5], (String) cols[6], (String) cols[7], (String) cols[8]);
            personArrayList.add(employee);
        }
        System.out.println(personArrayList);
    }

    public static class DataBaseQueryBuilder {


        private StringBuilder query = new StringBuilder("SELECT * FROM ");
        private int restrictCount = 0;

        @Override
        public String toString() {
            return query.toString();
        }


        public DataBaseQueryBuilder and() {
            query.append(" AND ");
            return this;
        }


        public DataBaseQueryBuilder or() {
            query.append(" OR ");
            return this;
        }


        public DataBaseQueryBuilder select() {
            query.append("SELECT *");
            return this;
        }


        public DataBaseQueryBuilder delete() {
            query.append("DELETE ");
            return this;
        }


        public DataBaseQueryBuilder limit(String name, String data) {
            query.append(name + " = '" + data + "' ");
            return this;
        }

        public DataBaseQueryBuilder update() {
            query.append("UPDATE ");
            return this;
        }

        public DataBaseQueryBuilder where(String table) {
            query.append(table + " WHERE ");
            return this;
        }

        public DataBaseQueryBuilder fromSourceTable(String source) {
            query.append(" FROM " + source);
            return this;
        }

        public DataBaseQueryBuilder like(String name, String data) {
            query.append(name + " LIKE '%" + data + "' ");
            return this;
        }

        public DataBaseQueryBuilder equal(String column, String value) {
            if (restrictCount == 0) {
                query.append(" WHERE ");
                restrictCount++;
            }
            query.append(column + " = '" + value + "'");
            return this;
        }

        public StringBuilder getQuery() {
            return query;
        }

        public void setQuery(StringBuilder query) {
            this.query = query;
        }


        public DataBaseQuery build() {
            return new DataBaseQuery(this);
        }
    }
}
