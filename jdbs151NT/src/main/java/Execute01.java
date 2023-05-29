import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Execute01 {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        //1.Adim: Driver'a kaydol
        Class.forName("org.postgresql.Driver"); //JDBC 4 sonrasi yapmaya gerek yok.

        //2.Adim: Database'e baglan.
       Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","Aycap107.");

       //3.Adim: Statement olustur.
       Statement statement = connection.createStatement();

       //4> Adim: Query calistir.
        /*
       execute() methodu DDL(create, drop, alter table) ve DQL(select) ile kullanılır
       1) Eğer execute() methodu DDL ile kullanılırsa hep "false" döner. Çünkü DDL ile data çağrılmaz
       2) Eğer execute() methodu DQL ile kullanılırsa data döndüğünde "true" data dönmediğinde "false" verir.
       */


       //1.Örnek: "workers" adında bir table oluşturup "worker_id, worker_name, worker_salary" sütunlarını ekleyin.
       //create table workers (worker_id varchar(20), worker_name varchar(20),worker_salary int);
        String sql1 = "create table workers (worker_id varchar(20), worker_name varchar(20),worker_salary int)";
        boolean r1 = statement.execute(sql1);
        System.out.println("r1 = " + r1);//false

        //2.Örnek: Table'a worker_address sütunu ekleyin.
        String sql2="alter table workers add worker_adress varchar(100)";
        boolean r2 = statement.execute(sql2);
        System.out.println("r2 = " + r2);//false

        //3.Örnek: workers table'ını silin.
        String sql3 = "drop table workers";
        boolean r3 = statement.execute(sql3);
        System.out.println("r3 = " + r3);//false

        //5. Adim: Baglantiyi kapat.
        connection.close();
        statement.close();

    }
}
