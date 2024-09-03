package TP4_entreprise;
import java.util.*;

public class Employee {
    private int id;

    private String name;

    private Admin supervisor;
    private List<Tache> Taches;

    private static int i = 0;

    public Employee(String name) {
        this.name = name;
        Taches = new ArrayList<>();
        this.id = ++i;
    }

    public void addTache(Tache t) {
        Taches.add(t);
    }
    public void mettre_a_jour_status(Employee employee, State state, Tache tache) {
        if(this.Taches.contains(tache)){
            int index = Taches.indexOf(tache);
            Taches.get(index).setState(state);
        }else {
            System.out.println("Tache n'existe pas !!!");
        }

    }


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Tache> getTaches() {
        return Taches;
    }


    public Admin getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(Admin supervisor) {
        this.supervisor = supervisor;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", supervisor=" + supervisor +
                '}';
    }
}
