package br.cotia.quiosque.model;

import java.util.Calendar;

import org.springframework.format.annotation.DateTimeFormat;

public class Cliente {
	
		private Long id;
		private String nome;
		private String endereco;
		private String email;
		private String telefone;
		private String produto;
		private String genero;
		@DateTimeFormat (pattern = "yyyy-MM-dd")
		private Calendar nascimento;
		@DateTimeFormat (pattern = "yyyy-MM-dd")
		private Calendar dataCadastro;
		
		public Calendar getDataCadastro() {
			return dataCadastro;
		}
		public void setDataCadastro(Calendar dataCadastro) {
			this.dataCadastro = dataCadastro;
		}
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getEndereco() {
			return endereco;
		}
		public void setEndereco(String endereco) {
			this.endereco = endereco;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getTelefone() {
			return telefone;
		}
		public void setTelefone(String telefone) {
			this.telefone = telefone;
		}
		public String getProduto() {
			return produto;
		}
		public void setProduto(String produto) {
			this.produto = produto;
		}
		public String getGenero() {
			return genero;
		}
		public void setGenero(String genero) {
			this.genero = genero;
		}
		public Calendar getNascimento() {
			return nascimento;
		}
		public void setNascimento(Calendar nascimento) {
			this.nascimento = nascimento;
		}
		
		
		
		
	
		
		
}

