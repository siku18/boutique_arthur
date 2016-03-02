/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boutique.test;

import boutique.entity.Utilisateur;
import boutique.exception.ExceptionAdresseEmailDejaUtilisee;
import boutique.service.ArticleService;
import boutique.service.CategorieService;
import boutique.service.CodePromoService;
import boutique.service.CommandeService;
import boutique.service.InscriptionService;
import boutique.service.ModeLivraisonService;
import boutique.service.SousCommandeService;
import boutique.service.UtilisateurService;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import boutique.spring.SpringConfig;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 *
 * @author ETY
 */

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes=SpringConfig.class)
public class BoutiqueTest {
    
    @Autowired
    private ArticleService articleService;
    
    @Autowired
    private CategorieService categorieService;
    
    @Autowired
    private CodePromoService codePromoService;
    
    @Autowired
    private CommandeService commandeService;
        
    @Autowired
    private ModeLivraisonService modeLivraisonService;
    
    @Autowired
    private SousCommandeService sousCommandeService;
    
    @Autowired
    private UtilisateurService utilisateurService;
    
    @Autowired
    private InscriptionService inscriptionService;
    
    @Before
    public void testSupprimerTout() {
//        Categorie c = new Categorie();
//        c.setId(1L);
//        Article a = new Article();
//        a.setNom("chemise");
//        a.setCategorie(c);
//        List<Article> listeArticle =c.getArticles();
//        listeArticle.add(a);
//        c.setArticles(listeArticle);
//        //Sauvegarde dans la base de donnée des entités dans la table contenant la clé étrangère avant celles à laquelle se réfère la clé
//        categorieService.save(c);
//        articleService.save(a);
//        //Supression de la table contenant la clé étrangère (@JoinColumn) avant celle à laquelle se réfère la clé
        sousCommandeService.deleteAll();
        commandeService.deleteAll();
        utilisateurService.deleteAll();
        modeLivraisonService.deleteAll();
        articleService.deleteAll();
        categorieService.deleteAll();
    }
    
    
    @Test(expected = ExceptionAdresseEmailDejaUtilisee.class)
    public void testInscriptionUtilisateur() throws ExceptionAdresseEmailDejaUtilisee{
        Utilisateur u1 = new Utilisateur();
        u1.setEmail("yo@yeah.com");
        Utilisateur u2 = new Utilisateur();
        u2.setEmail("yo@yeah.com");
        inscriptionService.inscription(u1);
        inscriptionService.inscription(u2);
    }
    
}
