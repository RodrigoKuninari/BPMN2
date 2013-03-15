/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufms.facom.sad.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author <a href="mailto:rodrigokuninari@outlook.com">Rodrigo Kuninari</a>
 */
@Entity
public class Lane extends NodeGraphicsInfo implements Serializable
{

    @Id
    private Long id;

    private String idLane;

    private String name;

    @ManyToOne
    private Pool parentPool;

}
