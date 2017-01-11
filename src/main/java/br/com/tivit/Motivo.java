/**
 * 
 */
package br.com.wck.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @author Alexandre
 *
 */
@Entity
@Table(name="motivo")
public class Motivo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2510869676557548508L;
	@Id
	@GeneratedValue
	private Integer codMotivo;
	@Column(name="motivo")
	private String nmeMotivo;	
	 
	@OneToMany(mappedBy = "motivo", targetEntity = Assunto.class, fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private List<Assunto> listAssunto;
	
	
	public Integer getCodMotivo() {
		return codMotivo;
	}
	public void setCodMotivo(Integer codMotivo) {
		this.codMotivo = codMotivo;
	}
	public String getNmeMotivo() {
		return nmeMotivo;
	}
	public void setNmeMotivo(String nmeMotivo) {
		this.nmeMotivo = nmeMotivo;
	}
	public List<Assunto> getListAssunto() {
		return listAssunto;
	}
	public void setListAssunto(List<Assunto> listAssunto) {
		this.listAssunto = listAssunto;
	}
	
	
	
	
	
	
}
