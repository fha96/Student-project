package database;

import java.sql.*;

public class MyDB {
    PreparedStatement preparedStatement;
    Connection connection;
    public MyDB() throws SQLException {
      this.connection = DriverManager.getConnection("jdbc:mysql://localhost/studentdb", "root", "root@JEA");
        System.out.println("DataBase Connected !");
    }

    public void connectDB() throws SQLException {


        String update="update  student\n" +
                "set email=? , password=?\n" +
                "where id=? ;";
        String delete="delete from studentdb.student \n"+
                "where id=?";

    }
    public ResultSet executeQuery(String query) throws SQLException {
     preparedStatement=connection.prepareStatement(query);
     return preparedStatement.executeQuery();
    }
    public void executeUpdate(String query) throws SQLException {
        preparedStatement.executeQuery(query);
        preparedStatement.executeUpdate();
    }
}
