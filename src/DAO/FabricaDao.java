package DAO;

import java.sql.Connection;
import java.sql.SQLException;

import database.Conexao;

public class FabricaDao {
	
	Connection conn = null;
	AlunoDao alunoDao = null;
	TreinoDao treinoDao = null;
	
	public FabricaDao() throws SQLException {
		this.conn = new Conexao().createConnection();
	}
	
	public AlunoDao fabricaAlunoDao (){
		if(this.alunoDao == null) {
			alunoDao = new AlunoDao(this.conn);
		}
		
		return alunoDao;
	}
	
	public TreinoDao fabricaTreinoDao (){
		if(this.treinoDao == null) {
			treinoDao = new TreinoDao(this.conn);
		}
		
		return treinoDao;
	}
}
