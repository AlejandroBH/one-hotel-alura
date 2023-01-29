package factory;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class ConnectionFactory {
    
    private DataSource dataSource;
    
    public ConnectionFactory() {
        var cpds = new ComboPooledDataSource();
        cpds.setJdbcUrl("jdbc:mysql://localhost/hotelalura?useTimezone=true&serverTimezone=UTC");
        cpds.setUser("root");
        cpds.setPassword("root");
        cpds.setMaxPoolSize(10);
        
        this.dataSource = cpds;
    }

    public Connection recuperaConexion() {
        try {
            return this.dataSource.getConnection();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
