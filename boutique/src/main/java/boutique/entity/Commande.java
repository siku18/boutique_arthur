/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boutique.entity;

import java.util.Date;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author admin
 */
public class Commande {
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateCommande;
    private Long prixTotal;
    private boolean payee;
    
}
