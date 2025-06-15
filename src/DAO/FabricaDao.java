package DAO;

import database.Conexao;

public class FabricaDao {
	
	public static AlunoDao fabricaAlunoDao (){
		return new AlunoDao(Conexao.teste());
	}
	
	public static TreinoDao fabricaTreinoDao (){
		return new TreinoDao(Conexao.getConnection());
	}
}
