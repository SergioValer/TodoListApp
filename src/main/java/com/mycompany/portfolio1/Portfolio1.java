


package com.mycompany.portfolio1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;




public class Portfolio1 {

    public static void main(String[] args) {
        
      Configuration configuration = new Configuration().configure("hibernate.cfg.xml");
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        
        pantalla x = new pantalla();
        x.setVisible(true);
        System.out.println("Hello World!");
    }
}
