/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

/**
 *
 * @author larachicharo
 */
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author larachicharo
 */

public abstract class AbstractDAO<T> {
 protected SessionFactory sessionFactory;   
 
 public  AbstractDAO() {
     this.sessionFactory = HibernateUtil.getSessionFactory();
 }
 
 protected void save(T o) {
     Session session = this.sessionFactory.openSession();
     Transaction tx = null;
     try {
         tx = session.beginTransaction();
         session.save(o);
         tx.commit();
     } catch (HibernateException ex) {
         if (tx != null) {
             tx.rollback();
         }
         ex.printStackTrace();
     } finally {
         session.close();
     }
 }
 
 protected void update(T o) {
     T obj = null;
     Session session = this.sessionFactory.getCurrentSession();
     Transaction tx = null;
     try {
         tx = session.beginTransaction();
         session.update(o);
         tx.commit();
     } catch (HibernateException ex) {
         if (tx != null) {
             tx.rollback();
         }
     } finally {
         session.close();
     }
 }
 
 protected void delete(T o) {
     T obj = null;
     Session session = this.sessionFactory.getCurrentSession();
     Transaction tx = null;
     try {
         tx = session.beginTransaction();
         session.delete(o);
         tx.commit();
     } catch (HibernateException ex) {
         if (tx != null) {
             tx.rollback();
         }
     } finally {
         session.close();
     }
 }
 
 protected T find(Class c, int id) {
     T obj = null;
     Session session = this.sessionFactory.getCurrentSession();
     Transaction tx = null;
     try {
         tx = session.beginTransaction();
         obj = (T)session.get(c, id);
         tx.commit();
     } catch (HibernateException ex) {
         if (tx != null) {
             tx.rollback();
         }
     } finally {
         session.close();
     }
     return obj;
 }
 
 protected List<T> findAll(Class c) {
    List<T> obj = null;
     Session session = this.sessionFactory.getCurrentSession();
     Transaction tx = null;
     try {
         tx = session.beginTransaction();
         String hql = "From" + c;
         Query q = session.createQuery(hql);
         obj = (List<T>)q.list();
         tx.commit();
     } catch (HibernateException ex) {
         if (tx != null) {
             tx.rollback();
         }
     } finally {
         session.close();
     }
     return obj;
 }
}
