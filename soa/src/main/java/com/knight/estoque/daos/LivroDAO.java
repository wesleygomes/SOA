package com.knight.estoque.daos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.knight.estoque.modelos.Livro;

public class LivroDAO {
	
	public List<Livro> listarLivros() {
		List<Livro> livros = new ArrayList<Livro>();
		livros.add(new Livro(2012, new ArrayList<String>(Arrays.asList("Paulo Silveira", "Adriano Almeida")), "Casa do C�digo", "Guia do Programador", "V� do \"nunca programei\" ..."));
		livros.add(new Livro(2012, new ArrayList<String>(Arrays.asList("Vin�cius Baggio Fuentes")), "Casa do C�digo", "Ruby on Rails", "Crie rapidamente aplica��es web"));
		return livros;
	}

}
