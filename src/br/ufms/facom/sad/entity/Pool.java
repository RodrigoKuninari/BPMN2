/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufms.facom.sad.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 *
 * @author <a href="mailto:rodrigokuninari@outlook.com">Rodrigo Kuninari</a>
 */
@Entity
public class Pool extends NodeGraphicsInfo implements Serializable
{

    @Id
    private Long id;

    private String idPool;

    private String name;

    @OneToOne
    private WorkflowProcess process;

    private Boolean boundaryVisible;

}
