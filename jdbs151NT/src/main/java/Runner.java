public class Runner {

    public static void main(String[] args) {

        //Database'e baglan
        JdbsUtils.connectToDataBase();

        //Statmewnt olustur

        JdbsUtils.createStatement();

        //Query calistir

        String sql1 = "create table workers (worker_id varchar(20), worker_name varchar(20),worker_salary int)";
        JdbsUtils.execute(sql1);





    }

}
