package org.example.databaseRelated;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.SQLException;

@Component
public class DatabaseHealthChecker {
    @Autowired
    DataSource dataSource;
    public boolean DBconnection(){
        try {
            dataSource.getConnection();
            return true;
        } catch (SQLException e) {
            return false;
        }
    }
}
