package org.example;

import org.hibernate.SessionFactory;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){
        SessionFactory factory = HibernateUtil.getSessionFactory();//создаем хайбернейт утил
    }
}
