package ma.projet.entities;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

@Entity
public class Homme extends Personne {
    
    @OneToMany(mappedBy="homme",fetch = FetchType.EAGER)
    List<Mariage> mariages=new ArrayList<>();
    
    public Homme(){
        
    }
    public Homme(int id, String nom, String prenom, String telephone, String adresse, Date dateNaissance ){
        super(id,nom,prenom,telephone,adresse,dateNaissance);
        
    }
    public Homme( String nom, String prenom, String telephone, String adresse, Date dateNaissance ){
        super(nom,prenom,telephone,adresse,dateNaissance);
        
    }
}
