package ma.projet.test;
import java.util.Date;
import ma.projet.entities.Femme;
import ma.projet.entities.Homme;
import ma.projet.entities.Mariage;
import ma.projet.entities.Personne;
import ma.projet.service.FemmeService;
import ma.projet.service.HommeService;
import ma.projet.service.MariageService;
import ma.projet.util.HibernateUtil;
import org.hibernate.Hibernate;
public class Test {
    public static void main(String[] args) {
        FemmeService fs=new FemmeService();
        HommeService hs=new HommeService();
        MariageService ms=new MariageService();
        //fs.create());
        Femme f1=new Femme("Bougrine","Achouak","0678637494","Casablanca",new Date());
        Homme h1=new Homme("Boujar","Mohammed","0682366374","Casablanca",new Date());
        fs.create(f1);
        hs.create(h1);
        Mariage mariage=new Mariage(new Date(),null,3,h1,f1);
        ms.create(mariage);
        
    }
   
    
}
