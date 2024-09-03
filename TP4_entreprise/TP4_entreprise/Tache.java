package TP4_entreprise;

import java.time.Duration;
import java.time.LocalDate;
import java.time.temporal.Temporal;

public class Tache {
    private String nom;
    private State state = State.in_Progress;
    private LocalDate date_debut;
    private LocalDate date_fin;
    private Duration duration;

    public Tache(String nom, LocalDate date_debut, LocalDate date_fin) {
        this.nom = nom;
        this.date_debut = date_debut;
        this.date_fin = date_fin;
        this.duration = Duration.between((Temporal) date_debut, (Temporal) date_fin);
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Tache{" +
                "nom='" + nom + '\'' +
                ", state=" + state +
                '}';
    }
}
