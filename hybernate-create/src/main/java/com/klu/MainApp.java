package com.klu;
import org.hibernate.*;

import org.hibernate.cfg.Configuration;

public class MainApp {
  
  public static void main(String[] args) {
    //lode configuration $ create the sessionFactory
    
    SessionFactory factory= new Configuration().configure().buildSessionFactory();
    
    
    //open session
    
    Session session = factory.openSession();
    
    Transaction tx = session.beginTransaction();
    
    
    
    Student s= new Student("Raki");
    
    
    //save the data
    session.save(s);
    
    tx.commit();
    //close tags
    session.close();
    factory.close();
    
    System.out.println("SAVE SUCCCESSFULLY");
  
  }
}