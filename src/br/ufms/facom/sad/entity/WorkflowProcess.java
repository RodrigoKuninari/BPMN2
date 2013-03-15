/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufms.facom.sad.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author <a href="mailto:rodrigokuninari@outlook.com">Rodrigo Kuninari</a>
 */
@Entity
public class WorkflowProcess implements Serializable
{

    @Id
    private Long id;

    private String idWorkflowProcess;

    private String name;

}
