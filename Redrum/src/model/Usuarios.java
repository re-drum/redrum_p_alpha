package model;

public class Usuarios {
    // campos da tabela
    private int    idUsuario;
    private String Nome;
    private String Endereco;
    private String Numero;
    private String Telefone;
    private String Email;
    private String Senha;

    public Usuarios(){
        
    }
    
    public Usuarios(String n, String e, String num, String t, String em, String s){
        this.Nome = n;
        this.Endereco = e;
        this.Numero = num;
        this.Telefone = t;
        this.Email = em;
        this.Senha = s;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getEndereco() {
        return Endereco;
    }

    public void setEndereco(String Endereco) {
        this.Endereco = Endereco;
    }
    
    public String getNumero() {
        return Numero;
    }

    public void setNumero(String Numero) {
        this.Numero = Numero;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String Telefone) {
        this.Telefone = Telefone;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getSenha() {
        return Senha;
    }

    public void setSenha(String Senha) {
        this.Senha = Senha;
    }
    
}
