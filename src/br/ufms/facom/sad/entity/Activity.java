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
public class Activity
{

    @Id
    private Long id;

    private String idActivity;

    private String name;

    private ActivityEnum type;

    @ManyToOne
    private WorkflowProcess process;

}
