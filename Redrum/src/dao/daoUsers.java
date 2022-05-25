package dao;

import java.sql.Connection;
import java.util.ArrayList;
import model.Usuarios;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class daoUsers {
    
  // variavel de datasource para a conexão
  private DataSource dataSource;

  // método construtor para passar o dataSource
  //comentario para att
  public daoUsers (DataSource dataSource){
    this.dataSource = dataSource;
  }
  
  // para popular os dados no arraylist de acordo com a quantidade de 
  // registros na tabela de municipios
  public ArrayList<Usuarios> readAll(){

    //Connection con = dataSource.getConnection();
    PreparedStatement ps = null;

    try{
      String SQL = "SELECT * FROM USUARIOS";

      // para mandar como uma instrução, precisa usar o PreparedStatement
      // traduz o comando SQL para execução
      ps = dataSource.getConnection().prepareStatement(SQL);

      // executa a consulta no banco
      ResultSet rs = ps.executeQuery();

      // cria a lista de resultados trazidos da tabela
      ArrayList<Usuarios> lista = new ArrayList<Usuarios>();


      // enquanto tiverem registros no ResultSet (rs), 
      // vai adicionando na lista
      while(rs.next()){

        // cria objeto de usuarios
        // cada usuario é um objeto
        Usuarios usuario = new Usuarios();
        
        usuario.setIdUsuario(rs.getInt("idUsuario"));
        usuario.setNome(rs.getString("Nome"));
        usuario.setEndereco(rs.getString("Endereco"));
        usuario.setTelefone(rs.getString("idTelefone"));
        usuario.setEmail(rs.getString("Email"));
        usuario.setSenha(rs.getString("Senha"));

        // adiciona o objeto (registro) na lista (arraylist)
        lista.add(usuario);
      }

      // fecha o statement e o datasource
      ps.close();
      dataSource.closeDataSource();
      
      // retorna os dados consultados
      return lista;
    }

    catch (SQLException ex){
      System.err.println("Erro ao recuperar dados "+ex.getMessage());
    }

    catch (Exception ex){
      System.err.println("Erro geral "+ex.getMessage());
    }

    // fecha o statement e o datasource
    dataSource.closeDataSource();

    // caso aconteça alguma coisa
    return null;

  }

  // valida usuario
  public ArrayList<Usuarios> validaUser(String email){

    //Connection con = dataSource.getConnection();
    PreparedStatement ps = null;

    try{
      String SQL = "SELECT * FROM USUARIOS WHERE Email=?";

      // para mandar como uma instrução, precisa usar o PreparedStatement
      // traduz o comando SQL para execução
      ps = dataSource.getConnection().prepareStatement(SQL);
      ps.setString(1,email);

      // executa a consulta no banco
      ResultSet rs = ps.executeQuery();
      

      // cria a lista de resultados trazidos da tabela
      ArrayList<Usuarios> lista = new ArrayList<Usuarios>();
      

      // enquanto tiverem registros no ResultSet (rs), 
      // vai adicionando na lista
      while(rs.next()){

        // cria objeto de usuarios
        // cada usuario é um objeto
        Usuarios usuario = new Usuarios();
        
        
        usuario.setIdUsuario(rs.getInt("idUsuario"));
        usuario.setNome(rs.getString("Nome"));
        usuario.setEndereco(rs.getString("Endereco"));
        usuario.setNumero(rs.getString("Numero"));
        usuario.setTelefone(rs.getString("Telefone"));
        usuario.setEmail(rs.getString("Email"));
        usuario.setSenha(rs.getString("Senha"));

        // adiciona o objeto (registro) na lista (arraylist)
        lista.add(usuario);
      }

      // fecha o statement e o datasource
      ps.close();
      //dataSource.closeDataSource();
      
      // retorna os dados consultados
      return lista;
    }

    catch (SQLException ex){
      System.err.println("Erro ao recuperar dados "+ex.getMessage());
    }

    catch (Exception ex){
      System.err.println("Erro geral "+ex.getMessage());
    }

    // fecha o statement e o datasource
    dataSource.closeDataSource();

    // caso aconteça alguma coisa
    return null;

  }
  
  public void create(Usuarios u){
        Connection con = dataSource.getConnection();
        PreparedStatement ps = null;

        try{
            String SQL = "INSERT INTO USUARIOS (Nome,Endereco,Numero,Telefone,Email,Senha) VALUES (?,?,?,?,?,?)";
            
            // para mandar como uma instrução, precisa usar o PreparedStatement
            // traduz o comando SQL para execução
            ps = con.prepareStatement(SQL);
            ps.setString(1,u.getNome());
            ps.setString(2,u.getEndereco());
            ps.setString(3,u.getNumero());
            ps.setString(4,u.getTelefone());
            ps.setString(5,u.getEmail());
            ps.setString(6,u.getSenha());

            // executa a inserção no banco
            ps.executeUpdate();
            ps.close();
           
        }
        catch (SQLException ex){
            //System.err.println("Erro ao salvar os dados "+ex.getMessage());
            JOptionPane.showMessageDialog(null,"Erro ao salvar!\n"+ex);
        }
        finally{
            // fecha o statement e o datasource
            //ps.close();
            dataSource.closeDataSource();
        }
    }
  
  public void alterar(Usuarios u){
        Connection con = dataSource.getConnection();
        PreparedStatement ps = null;

        try{
            // monta SQL
            String SQL = "UPDATE USUARIOS SET Senha=? WHERE Email=?";
            
            // para mandar como uma instrução, precisa usar o PreparedStatement
            // traduz o comando SQL para execução
            ps = con.prepareStatement(SQL);
            ps.setString(1,u.getSenha());
            ps.setString(2,u.getEmail());

            // executa a inserção no banco
            ps.executeUpdate();
            ps.close();
            
            JOptionPane.showMessageDialog(null,"Senha alterada com sucesso!");
        }
        catch (SQLException ex){
            //System.err.println("Erro ao salvar os dados "+ex.getMessage());
            JOptionPane.showMessageDialog(null,"Erro ao alterar!\n"+ex);
        }
        finally{
            // fecha o statement e o datasource
            dataSource.closeDataSource();
        }
    }
    
}
