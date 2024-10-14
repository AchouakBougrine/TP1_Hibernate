package ma.projet.test;

import java.util.Date;
import ma.projet.entity.Produit;
import ma.projet.service.ProduitService;
import ma.projet.util.HibernateUtil;
 
public class TestProduit {
 
    public static void main(String[] args) {
 HibernateUtil.getSessionFactory().openSession();
        //Creation des produits
        ProduitService ps = new ProduitService();
        ps.create(new Produit("ZARA", "AA123", new Date("2019/04/18"), 800, "TSHIRT ZARA"));
        ps.create(new Produit("SHEIN", "BB234", new Date("2024/09/29"), 200, "JUPE SHEIN"));
        ps.create(new Produit("DONT CALL ME JENNNYFER", "AAA654", new Date("2020/09/08"), 700, "PANTALON"));
        ps.create(new Produit("ACER", "QWERTY", new Date("2017/7/1"), 3500, "PC DELL"));
        ps.create(new Produit("MANGO", "HG9988", new Date("2012/04/28"), 400, "VESTE"));
        //Liste des produits
        for (Produit e : ps.findAll()) {
            System.out.println(e.getMarque());
        }
        //Les informations du produit dont id = 2
        for (Produit p : ps.findAll()) {
            if (p.getId() == 2) {
                System.out.println(p.getId() + " , " + p.getMarque() + " , " + p.getReference() + " , " + p.getDateAchat() + " , " + p.getPrix() + " , " + p.getDesignation());
            }
        }
        //Supprimer le produit dont id = 3
        ps.delete(ps.findById(3));
        //Modifier les informations du produit dont id = 1,
        Produit p = ps.findById(1);
        if (p != null) {
            p.setMarque("SHEIN");
            p.setReference("BB234");
            p.setDateAchat(new Date("2024/09/29"));
            p.setPrix(200);
            p.setDesignation("JUPE SHEIN");
            ps.update(p);
        }
        //Afficher la liste des produits dont le prix est supérieur à 100 DH
        for (Produit pp : ps.findAll()) {
            if (pp.getPrix() > 100) {
                System.out.println("" + pp.getMarque());
            }
        }
    }
}