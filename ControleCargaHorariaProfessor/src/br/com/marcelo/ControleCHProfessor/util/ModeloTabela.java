package br.com.marcelo.ControleCHProfessor.util;

import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

public class ModeloTabela extends AbstractTableModel{
	
	private ArrayList linhas=null;
	private String [] colunas =null;
	
	public ModeloTabela ( ArrayList lin,String[] col){
		setLinhas(lin);
		setColunas(col);
	}
	public ArrayList getLinhas() {
		return linhas;
	}
	public void setLinhas(ArrayList linhas) {
		this.linhas = linhas;
	}
	public String[] getColunas() {
		return colunas;
	}
	public void setColunas(String[] colunas) {
		this.colunas = colunas;
	}
	public int getColumnCount(){
		return colunas.length;
		}
	
	public int getRowCount(){
		return linhas.size();
		}
	public String getColumnName(int nunCol){
		return colunas[nunCol];
	}
	public Object getValueAt(int numLin, int nunCol){
		Object[] linha = (Object[])getLinhas().get(nunCol);
		return linha[nunCol];
	}
}
