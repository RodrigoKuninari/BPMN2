/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufms.facom.sad.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Rodrigo Kuninari
 */
@Entity
public class WorkflowProcess
{

    @Id
    private Long id;

    private String idWorkflowProcess;

    private String name;

}
