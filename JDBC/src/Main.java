import java.sql.*;
public class Main {
    public static void main(String[] args) {
        String url="jdbc:mysql://localhost:3306/jdb";
        String user="root";
        String pw="";
        String qry="SELECT * FROM student";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");//1
            Connection con= DriverManager.getConnection(url,user,pw);//2
            Statement stm=con.createStatement();//interface 3
            ResultSet re= stm.executeQuery(qry);//4

            String name;
            String age;
            while (re.next()){
                name=re.getString(1);
                age= re.getString(2);
                System.out.println(name);//5
                System.out.println(age);
            }
            con.close();//6

        }catch (Exception e){
            System.out.println(e);
        }
    }
}