/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boutique.service;

import boutique.entity.Utilisateur;
import boutique.exception.ExceptionAdresseEmailDejaUtilisee;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ok
 */
@Service
public class InscriptionService {
    @Autowired
    private UtilisateurService utilisateurService;
    public void inscription(Utilisateur u) throws ExceptionAdresseEmailDejaUtilisee{
        List<Utilisateur> listeUtilisateurs = (List<Utilisateur>) utilisateurService.findAll();
        for (Utilisateur u2 : listeUtilisateurs ){
            if(u.getEmail().equals(u2.getEmail()))
                throw new ExceptionAdresseEmailDejaUtilisee("Cette adresse email est deja associée à un utilisateur");
        }
        utilisateurService.save(u);
    }
    
}
