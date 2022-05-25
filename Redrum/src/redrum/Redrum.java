package redrum;

import dao.DataSource;

public class Redrum {
    
    public static void main(String[] args) {
        
        // cria um dataSource para conexão com o banco
        DataSource dataSource = new DataSource();
        
        // fecha a conexão
        dataSource.closeDataSource();
    }
    
}
