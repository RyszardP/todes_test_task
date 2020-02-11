package builder;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateSettings {

    private static SessionFactory sessionFactory;

    static {
        try {
            sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        } catch (HibernateException e) {
            e.printStackTrace();
        }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public static Session getSession() {
        Session session = null;
        try {
            session = getSessionFactory().openSession();
        } catch (HibernateException e) {
            e.printStackTrace();
        }
        return session;
    }

    public static void closeSession(Session session) {
        if(session != null && session.isOpen())
            session.close();
    }
}
