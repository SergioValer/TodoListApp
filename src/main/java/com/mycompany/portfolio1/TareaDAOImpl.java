
package com.mycompany.portfolio1;


import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TareaDAOImpl implements TareaDAO {
    private SessionFactory sessionFactory;

    public TareaDAOImpl() {
  
        Configuration configuration = new Configuration().configure("hibernate.cfg.xml");
        sessionFactory = configuration.buildSessionFactory();
    }

    @Override
    public Tarea obtenerPorId(Long id) {
        Session session = sessionFactory.openSession();
        Tarea tarea = session.get(Tarea.class, id);
        session.close();
        return tarea;
    }

    @Override
    public List<Tarea> obtenerTodas() {
        Session session = sessionFactory.openSession();
        List<Tarea> tareas = session.createQuery("FROM Tarea", Tarea.class).list();
        session.close();
        return tareas;
    }

    @Override
    public void crear(Tarea tarea) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(tarea);
        transaction.commit();
        session.close();
    }

    @Override
    public void actualizar(Tarea tarea) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.update(tarea);
        transaction.commit();
        session.close();
    }

    @Override
    public void eliminar(Tarea tarea) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(tarea);
        
        transaction.commit();
        session.close();
    }
}