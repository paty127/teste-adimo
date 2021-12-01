package com.Adimo.demo.entity;

import java.io.Serializable;
import java.util.Objects;

@Entity
public class Casa  implements Serializable{
	
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer idCsa;
	
	@Column(length = 200)
	private String img;
   
	private String endereço;
	
	private Integer numero;
	
	private String telefone;
	
	@ManyToOne
	@JoinColumn(name = "fk_loc_csa")
	private Localidade localidade;
	
	public Casa() {}
	
	public Casa(Integer idCsa, String img, String endereco, Integer numero, 
			String telefone, Localidade Localidade) {
		this.Csa = idCsa;
		this.img = img;
		this.endereco = endereco;
		this.numero = numero;
		this.telefone = telefone;
		this.localidade = localidade;
	}

	public Integer getIdCsa() {
		return idCsa;
	}

	public void setIdCsa(Integer idCsa) {
		this.idCsa = idCsa;
	}

	public String getImg() {
		return img;
	}

	public void setFoto(String img) {
		this.img = img;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}


	public Localidade getLocalidade() {
		return localidade;
	}

	public void setLocalidade(Localidade Localidade) {
		this.localidade = localidade;
	}
	

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	@Override
	public int hashCode() {
		return Objects.hash(idCsa);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Casa other = (Casa) obj;
		return Objects.equals(idCsa, other.idCsa);
	}

}
