package ma.projet.service;

import java.util.List;
import ma.projet.entity.Produit;
import ma.projet.dao.IDao;
import ma.projet.util.HibernateUtil;
import org.hibernate.Session;

public class ProduitService implements IDao<Produit> {

    @Override
    public boolean create(Produit o) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(o);
        session.getTransaction().commit();
        return true;
    }

    @Override
    public boolean update(Produit o) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.update(o);
        session.getTransaction().commit();
        return true;
    }

    @Override
    public boolean delete(Produit o) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.delete(o);
        session.getTransaction().commit();
        return true;
    }

    @Override
    public Produit findById(int id) {
        Produit produit = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        produit = (Produit) session.get(Produit.class, id);
        session.getTransaction().commit();
        return produit;
    }

    @Override
    public List<Produit> findAll() {
        List<Produit> produits = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        produits = session.createQuery("from Produit").list();
        session.getTransaction().commit();
        return produits;
    }

}
