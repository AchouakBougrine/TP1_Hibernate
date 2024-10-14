package ma.projet.classes;
import java.io.Serializable;
import java.util.Objects;
public class EmployeTacheId implements Serializable {
    private int employeId;
    private int tacheId;
    // Constructeurs
    public EmployeTacheId() {}
    public EmployeTacheId(int employeId, int tacheId) {
        this.employeId = employeId;
        this.tacheId = tacheId;
    }
    
    // hashCode et equals pour comparaison
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmployeTacheId that = (EmployeTacheId) o;
        return employeId == that.employeId && tacheId == that.tacheId;
    }
    @Override
    public int hashCode() {
        return Objects.hash(employeId, tacheId);
    }
    // Getters et setters
    public int getEmployeId() {
        return employeId;
    }
    public void setEmployeId(int employeId) {
        this.employeId = employeId;
    }
    public int getTacheId() {
        return tacheId;
    }
    public void setTacheId(int tacheId) {
        this.tacheId = tacheId;
    }
}