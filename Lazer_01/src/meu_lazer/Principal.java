package meu_lazer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Principal {
		
	public static void main(String[] args) {
		
	
        String connectionUrl = "jdbc:sqlserver://localhost;databaseName=Lazer;user=User;password=12345";
        
       
        
        String insertString = "INSERT INTO Pessoa (id_pessoa, nome, idade) VALUES (?, ?, ?)";
        String insertString1 = "INSERT INTO Viaja (id_viaja, companhia, id_pessoa, id_local) VALUES (?, ?, ?, ?)";
        String insertString2 = "INSERT INTO Local (id_local, local) VALUES (?, ?)";
        
        // Tabela Pessoa
        try (
        	Connection con = DriverManager.getConnection(connectionUrl); 
        	PreparedStatement stmt = con.prepareStatement(insertString);
        	) {
        	
        	Pessoa pessoa1 = new Pessoa(1, "Ana", 22);
        	
        //===========================================//
        	stmt.setInt(1, pessoa1.getId_pessoa());
        	stmt.setString(2, pessoa1.getNome());
        	stmt.setInt(3, pessoa1.getIdade());
        //===========================================//
        	
        	stmt.executeUpdate();


        } catch (SQLException e) {
        	e.printStackTrace();
        }
        
    	// Tabela Pessoa
        try (
    		Connection con = DriverManager.getConnection(connectionUrl); 
    		PreparedStatement stmt = con.prepareStatement(insertString);
    	) {
    	
    	
    	
    	Pessoa pessoa2 = new Pessoa(2, "Beatriz", 19);
    	
    //===========================================//
    	stmt.setInt(1, pessoa2.getId_pessoa());
    	stmt.setString(2, pessoa2.getNome());
    	stmt.setInt(3, pessoa2.getIdade());
    //===========================================//
    	
    	stmt.executeUpdate();

    	} catch (SQLException e) {
    	e.printStackTrace();
    	}
    
		// Tabela Passoa
    try (
    		Connection con = DriverManager.getConnection(connectionUrl); 
    		PreparedStatement stmt = con.prepareStatement(insertString);
    	) {
	
	
    	
    	Pessoa pessoa3 = new Pessoa(3, "Jonas", 30);
	
    //============================================//
    	stmt.setInt(1, pessoa3.getId_pessoa());
    	stmt.setString(2, pessoa3.getNome());
    	stmt.setInt(3, pessoa3.getIdade());
    //===========================================//
	
    	stmt.executeUpdate();

    } catch (SQLException e) {
    	e.printStackTrace();
    }

    
	// Tabela Viaja
    try (
    		Connection con = DriverManager.getConnection(connectionUrl); 
    		PreparedStatement stmt = con.prepareStatement(insertString1);
    	) {
	
    	Viaja viaja1 = new Viaja(1, "LATAM", 1, 1);
	
    //===========================================//
    	stmt.setInt(1, viaja1.getId_viaja());
    	stmt.setString(2, viaja1.getCompanhia());
    	stmt.setInt(3, viaja1.getId_pessoa());
    	stmt.setInt(4, viaja1.getId_local());
    //===========================================//
	
    	stmt.executeUpdate();

    } catch (SQLException e) {
    	e.printStackTrace();
    } 
    
	// Tabela Viaja
    try (
    		Connection con = DriverManager.getConnection(connectionUrl); 
    		PreparedStatement stmt = con.prepareStatement(insertString1);
    	) {
	
	
    	
    	Viaja viaja2 = new Viaja(2, "Turkish Airlines", 2, 2);
	
    //===========================================//
    	stmt.setInt(1, viaja2.getId_viaja());
    	stmt.setString(2, viaja2.getCompanhia());
    	stmt.setInt(3, viaja2.getId_pessoa());
    	stmt.setInt(4, viaja2.getId_local());
    //===========================================//
	
    	stmt.executeUpdate();

    } catch (SQLException e) {
    	e.printStackTrace();
    } 
    
	// Tabela Viaja
    try (
    		Connection con = DriverManager.getConnection(connectionUrl); 
    		PreparedStatement stmt = con.prepareStatement(insertString1);
    	) {
	
	
    	
    	Viaja viaja3 = new Viaja(3, "LATAM", 3, 3);
	
    //===========================================//
    	stmt.setInt(1, viaja3.getId_viaja());
    	stmt.setString(2, viaja3.getCompanhia());
    	stmt.setInt(3, viaja3.getId_pessoa());
    	stmt.setInt(4, viaja3.getId_local());
    //===========================================//
	
    	stmt.executeUpdate();

    } catch (SQLException e) {
    	e.printStackTrace();
    } 
    
    
    
    // Tabela Local
    try (
    		Connection con = DriverManager.getConnection(connectionUrl); 
    		PreparedStatement stmt = con.prepareStatement(insertString2);
    	) {
	
	
    	
    	Local local1 = new Local(1, "Miami");
	
    	//==============================
    	stmt.setInt(1, local1.getId_local());
    	stmt.setString(2, local1.getLocal());
    	//==============================
	
    	stmt.executeUpdate();

    } catch (SQLException e) {
    	e.printStackTrace();
    } 
    
    
    // Tabela Local
    try (
    		Connection con = DriverManager.getConnection(connectionUrl); 
    		PreparedStatement stmt = con.prepareStatement(insertString2);
    	) {
	
	
    	
    	Local local2 = new Local(2, "Dubai");
	
    	//==============================
    	stmt.setInt(1, local2.getId_local());
    	stmt.setString(2, local2.getLocal());
    	//==============================
	
    	stmt.executeUpdate();

    } catch (SQLException e) {
    	e.printStackTrace();
    } 
    
    
    // Tabela Local
    try (
    		Connection con = DriverManager.getConnection(connectionUrl); 
    		PreparedStatement stmt = con.prepareStatement(insertString2);
    	) {
	
	
    	
    	Local local3 = new Local(3, "EUA");
	
    	//==============================
    	stmt.setInt(1, local3.getId_local());
    	stmt.setString(2, local3.getLocal());
    	//==============================
	
    	stmt.executeUpdate();

    } catch (SQLException e) {
    	e.printStackTrace();
    }
    
    
    // faz um SELECT no banco
    try (
    		Connection con = DriverManager.getConnection(connectionUrl); 
    		Statement stmt = con.createStatement();
    	) {
    	
    	//Consulta SQL
        String SQL = "SELECT * FROM Viaja JOIN Pessoa ON Viaja.id_pessoa = Pessoa.id_pessoa";
        ResultSet rs = stmt.executeQuery(SQL); 

        
        while (rs.next()) {
        	
        	Pessoa pessoa = new Pessoa();
        	pessoa.setId_pessoa(rs.getInt("id_pessoa"));
        	pessoa.setNome(rs.getString("nome"));
        	pessoa.setIdade(rs.getInt("idade"));
        	
        	Viaja viaja = new Viaja();
        	viaja.setId_viaja(rs.getInt("id_viaja"));
        	viaja.setCompanhia(rs.getString("companhia"));
        	viaja.setId_pessoa(rs.getInt("id_pessoa"));
        	viaja.setId_local(rs.getInt("id_local"));

        	System.out.println(pessoa);
        	System.out.println(viaja);
        }
    }
    
    catch (SQLException e) {
        e.printStackTrace();
    }
    
    String deleteString = "DELETE Pessoa WHERE id_pessoa = ?";
    
    try (
    		Connection con = DriverManager.getConnection(connectionUrl); 
    		PreparedStatement stmt = con.prepareStatement(deleteString);
    	) {
    	
    	int Id_pessoa = 3;
    	stmt.setInt(3, Id_pessoa);
    	
    	stmt.executeUpdate();
    	
    	System.out.println("Pessoa removida!");
    	
    } catch (SQLException e) {
    	e.printStackTrace();
    }
	
}

}