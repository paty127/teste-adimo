package com.Adimo.demo.entity;
@Entity
public class Localidade {

	
		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name = "id_local",  columnDefinition = "Integer")
		private Integer id;
		
		@Column(length = 50)
		private String zona;
		
		public Localidade() {}

		public Localidade(Integer id, String zona) {
			this.id = id;
			this.zona = zona;
		}

		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public String getZona() {
			return zona;
		}

		public void setZona(String zona) {
			this.zona = zona;
		}
	}




