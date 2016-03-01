/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boutique.entity;

import boutique.enumeration.TypeCodeEnum;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author admin
 */
    @Entity
public class CodePromo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(length = 32)
    private String Code;
    private TypeCodeEnum typeCodeEnum;
    private Long Valeur;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return Code;
    }

    public void setCode(String Code) {
        this.Code = Code;
    }

    public TypeCodeEnum getTypeCodeEnum() {
        return typeCodeEnum;
    }

    public void setTypeCodeEnum(TypeCodeEnum typeCodeEnum) {
        this.typeCodeEnum = typeCodeEnum;
    }

    public Long getValeur() {
        return Valeur;
    }

    public void setValeur(Long Valeur) {
        this.Valeur = Valeur;
    }
    
    
}
