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
public class Transition
{

    @Id
    private Long id;

    private String idTransition;

    @ManyToOne
    private Activity from;

    @ManyToOne
    private Activity to;

    private TransitionEnum type;

    @ManyToOne
    private WorkflowProcess process;

}
