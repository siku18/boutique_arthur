/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boutique.service;

import boutique.entity.Commande;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author admin
 */
public interface CommandeService extends CrudRepository<Commande, Long>{
    
}
