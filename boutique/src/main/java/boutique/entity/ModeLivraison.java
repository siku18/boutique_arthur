/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boutique.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author admin
 */
    @Entity
public class ModeLivraison implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(length = 32)
    private String nom;
    private Long cout;
    
    @OneToMany(mappedBy = "modeLivraison")
    private List<Commande> Commande = new ArrayList<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Long getCout() {
        return cout;
    }

    public void setCout(Long cout) {
        this.cout = cout;
    }

    public List<Commande> getCommande() {
        return Commande;
    }

    public void setCommande(List<Commande> Commande) {
        this.Commande = Commande;
    }
    
    
}
