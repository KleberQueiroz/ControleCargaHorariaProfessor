package br.com.marcelo.ControleCHProfessor.teste;

import br.com.marcelo.ControleCHProfessor.modelo.Faculdade;
import br.com.marcelo.ControleCHProfessor.modelo.DAO.FaculdadeDAO;

public class testeDao {

	public static void main(String[] args) {
	
		Faculdade g =new Faculdade();
		g.setNome("Anhembi Morumbi");
		g.setCampus("Vila Olimpia");
		
		FaculdadeDAO.getInstance().findAll();
		
		
		System.out.println("Opera��o realizada com sucesso");
	}

}
