/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufms.facom.sad.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author Rodrigo Kuninari
 */
@Entity
public class Lane
{

    @Id
    private Long id;

    private String idLane;

    private String name;

    @ManyToOne
    private Pool parentPool;

}
