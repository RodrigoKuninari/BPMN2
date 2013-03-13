/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufms.facom.sad.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 *
 * @author Rodrigo Kuninari
 */
@Entity
public class Pool
{

    @Id
    private Long id;

    private String idPool;

    private String name;

    @OneToOne
    private WorkflowProcess process;

    private Boolean boundaryVisible;

}
