import java.sql.*;

public class JdbsUtils {

    //Bu class'ta tekrarlı yapılacak işlemlerin methodları bulunacak
    private static Connection connection;
    private static Statement statement;
    private static ResultSet resultSet;

    //Database'e bağlanma methodu
    public static Connection connectToDataBase()  {

        try {
            connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "Aycap107.");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return connection;

    }

    //Medunna Database'e bağlanma methodu
    //(Host name: medunna.com, Database name: medunna_db_v2, Username: select_user, Password: Medunna_pass_@6))
    public static Connection connectToMedunnaDataBase() {

        try {
            connection = DriverManager.getConnection("jdbc:postgresql://medunna.com:5432/medunna_db_v2", "select_user", "Medunna_pass_@6");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return connection;
    }

    //Statement olusturan method

    public static Statement createStatement(){
        try {
            statement = connection.createStatement();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return statement;
    }


      //execute methodu ile query calistiran method

    public static boolean execute(String sql){

        try {
            return statement.execute(sql);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


    //executeQuery(), executeUpdate(), closeConnection() methodlari odev...


    //execute methodu ile query calistiran method

    public static ResultSet executeQuery(String sql) {

        try {
            resultSet = statement.executeQuery(sql);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return resultSet;

    }

       //Baglantiyi kapatan method

     public static void closeConnection(){
         try {
             connection.close();
             statement.close();

         } catch (SQLException e) {
             throw new RuntimeException(e);
         }

     }

    }





