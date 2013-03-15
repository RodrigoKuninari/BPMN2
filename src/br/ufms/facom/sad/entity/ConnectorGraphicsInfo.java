/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufms.facom.sad.entity;

import javax.persistence.MappedSuperclass;

/**
 *
 * @author <a href="mailto:rodrigokuninari@outlook.com">Rodrigo Kuninari</a>
 */
@MappedSuperclass
public abstract class ConnectorGraphicsInfo extends Coordinates
{

    private String toolId;

    private int borderColor;

}
