/**
 * 
 */
package br.com.wck.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author Alexandre
 *
 */
@Entity
@Table(name="assunto")
public class Assunto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8393736749074771608L;
	@Id
	@GeneratedValue
	private Integer codAssunto;
	private String assunto;

	@ManyToOne
	@JoinColumn(name="cod_motivo")
	private Motivo motivo;
	
	
	public Integer getCodAssunto() {
		return codAssunto;
	}
	public void setCodAssunto(Integer codAssunto) {
		this.codAssunto = codAssunto;
	}
	public String getAssunto() {
		return assunto;
	}
	public void setAssunto(String assunto) {
		this.assunto = assunto;
	}
	public Motivo getMotivo() {
		return motivo;
	}
	public void setMotivo(Motivo motivo) {
		this.motivo = motivo;
	}
	
	
	
	
	
	
}
