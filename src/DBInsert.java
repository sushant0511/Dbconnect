import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class DBInsert {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter your id to delete");
		int id=scanner.nextInt();
		//String name=scanner.next();

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "root");
			Statement statement=connection.createStatement();  // query execute
			String query="DELETE FROM `mydb`.`user` WHERE (`id` = '"+id+"')";
			
			int i=0;
			i=statement.executeUpdate(query);
			if(i!=0)
			{
				System.out.println("Data deleted");
			}
			//String query="UPDATE `user` SET `name` = '"+name+"' WHERE (`id` = '"+id+"')";
			
					//ResultSet set=statement.executeQuery("SELECT * FROM mydb.user");			
//			while(set.next()) // true - next data 
//			{
//				System.out.println(set.getInt("id")+"  "+set.getString(2));
//			}
			
			
//			String query="insert into user(`name`) values('"+name+"')";
//			int i=0;
//			i=statement.executeUpdate(query);
//			if(i!=0)
//			{
//				System.out.println("Data Inserted");
//			}
//			else
//			{
//				System.out.println("Try Again");
//			}
			
			
			
		} catch (Exception e) {
			
			System.out.println(e);
		}

	}

}
