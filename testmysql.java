import java.sql.*;
public class testmysql {
public static Connection getConnect(String databaseName)
	{
		try{
			            Class.forName("com.mysql.jdbc.Driver");

			            Connection con=DriverManager.getConnection(
			                    "jdbc:mysql://192.168.68.100:3306/"+databaseName,"db_cluster","bccs3_maria");
			            return con;
		 }catch(Exception e){
			            e.printStackTrace();
			            return null;
			        }
  
  public static void main(String args[]) throws SQLException {
		Connection con = testmysql.getConnect("uni_training");
		if (con != null) {
			Statement stmt = con.createStatement();
			
			
// Thêm dữ liệu vào bảng
//		      String sql = "INSERT INTO staff " +
//		                   "VALUES (1, 'Nam', 'H122', '1999-07-27')";
//		      stmt.executeUpdate(sql);		
			
// xóa dữ liệu tại staff_id=1
//		      String sql = "delete from staff where staff_id=1";
//	      stmt.executeUpdate(sql);
			
// thay đổi dữ liệu staff_code=cCode tại staff_name='Nam'
//	      String sql = "update staff set staff_code = 'Code' where staff_name='Nam'";
//	      stmt.executeUpdate(sql);
	      
				
			ResultSet rs = stmt.executeQuery("SELECT * FROM staff");
			
// hiển thị thông tên các cột để nhập kiểu dữ liệu
			ResultSetMetaData rsmd=rs.getMetaData();
			System.out.println("Tong so cot la: "+rsmd.getColumnCount());
			System.out.println("Ten cua cot thu nhat la: "+rsmd.getColumnName(1));
			System.out.println("Ten kieu cua cot thu nhat la: "+rsmd.getColumnTypeName(1));
			System.out.println("Ten cua cot thu 2 la: "+rsmd.getColumnName(2));
			System.out.println("Ten kieu cua cot 2 la: "+rsmd.getColumnTypeName(2));
			System.out.println("Ten cua cot thu 3 la: "+rsmd.getColumnName(3));
			System.out.println("Ten kieu cua cot thu 3 la: "+rsmd.getColumnTypeName(3));
			System.out.println("Ten cua cot thu 4 la: "+rsmd.getColumnName(4));
			System.out.println("Ten kieu cua cot thu 4 la: "+rsmd.getColumnTypeName(4));
			
			while (rs.next())
				System.out.println(rs.getInt(1) + " - " + rs.getString(2) + " - " + rs.getString(3) + "-"
						+ rs.getString(4));
		}else
		{
			System.out.println("co loi xay ra trong qua trinh thuc hien");
			
		}
		
	}
	}
  
  
  
  
  
}
