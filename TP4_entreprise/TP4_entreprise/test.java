package TP4_entreprise;

import java.time.LocalDate;

public class test {
    public static void main(String[] args) {
        Admin admin = new Admin("Kante");
        Employee employee = new Employee("Amin");
        Employee employee1 = new Employee("Amin1");
        Employee employee2 = new Employee("Amin2");
        Employee employee3 = new Employee("Amin3");
        Tache tache = new Tache("T1", LocalDate.now(), LocalDate.of(2025, 1, 1) );
        Tache tache1 = new Tache("T2", LocalDate.now(), LocalDate.of(2025, 1, 1) );
        Tache tache2 = new Tache("T3", LocalDate.now(), LocalDate.of(2025, 1, 1) );
        Tache tache3 = new Tache("T4", LocalDate.now(), LocalDate.of(2025, 1, 1) );
        Tache tache4 = new Tache("T5", LocalDate.now(), LocalDate.of(2025, 1, 1) );

        employee.addTache(tache1);


    }
}
