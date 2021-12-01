package com.Adimo.demo.entity;

public class Locatario {
	
	import java.io.Serializable;
	import java.util.Objects;

	import javax.persistence.Column;
	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;
	import javax.validation.constraints.NotBlank;

	import org.hibernate.validator.constraints.br.CPF;

	@Entity
	public class Locatario implements Serializable {
		private static final long serialVersionUID = 1L;

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name = "id_loc")
		private Integer id;
		
		@NotBlank(message = ("Este campo é obrigatório")
		@Column(length = 50)
		private String nome;
		
		@CPF
		@NotBlank(message = ("Este campo é obrigatório")
		@Column(length = 15)
		private String cpf;
		
		@NotBlank(message = ("Este campo é obrigatório")
		@Column(length = 50)
		private String logradouro;
		
		@NotBlank(message = ("Este campo é obrigatório")
		@Column(length = 50)
		private String complemento;
		
		@NotBlank(message = "Este campo é obrigatório")
		@Column(length = 50)
		private String cidade;
		
		@NotBlank(message = "Este campo é obrigatório")
		@Column(length = 50)
		private String estado;
		
		public Locatario() {}

		public Locatario(Integer id, String nome, String cpf, String logradouro, String complemento, String cidade,
				String estado) {
			this.id = id;
			this.nome = nome;
			this.cpf = cpf;
			this.logradouro = logradouro;
			this.complemento = complemento;
			this.cidade = cidade;
			this.estado = estado;
		}

		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getCpf() {
			return cpf;
		}

		public void setCpf(String cpf) {
			this.cpf = cpf;
		}

		public String getLogradouro() {
			return logradouro;
		}

		public void setLogradouro(String logradouro) {
			this.logradouro = logradouro;
		}

		public String getComplemento() {
			return complemento;
		}

		public void setComplemento(String complemento) {
			this.complemento = complemento;
		}

		public String getCidade() {
			return cidade;
		}

		public void setCidade(String cidade) {
			this.cidade = cidade;
		}

		public String getEstado() {
			return estado;
		}

		public void setEstado(String estado) {
			this.estado = estado;
		}
	}


}
