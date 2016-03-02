/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boutique.service;

import boutique.entity.Article;
import boutique.entity.Commande;
import boutique.entity.Utilisateur;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author admin
 */

public interface RechercheArticleService extends CrudRepository<Article, Long>{
    
    public List<Article> findByCategorieOrderByPrixAsc(Article article,Long prix);
    
    public List<Article> findByCategorieOrderByPrixDesc(Article article,Long prix);
    
    public List<Commande> findByCommandeAndUtilisateur(Commande commande, Utilisateur u);
    
}
