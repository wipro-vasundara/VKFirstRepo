import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class CustomerDAO{
	public boolean insertCustomer(Customer c){
		   
		try {
				Connection con= DBUtil.getConnection();
				String sql="insert into CustomerData values(?,?,?,?)";
				PreparedStatement pst=con.prepareStatement(sql);
				pst.setString(1,c.getCustomer_Number());
				pst.setString(2,c.getName());
				pst.setString(3,c.getAddress());
				pst.setString(4,c.getPostCode());
				
				int count=pst.executeUpdate();
				
				if (count==1)
					return true;
				else
					return false;
				
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
				return false;
			}
	}
	
	//public boolean deleteCustomer(int Customer_Number){return false;}
	//public boolean updateCustomer(int Customer_Number){return false;}
	public Customer readCustomer(String Customer_Number){
		try {
			Statement st=con.createStatement();
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter Customer Number to be read");
			int Customer_Number=scan.nextLine();
			
			String sql="select * from CustomerData where Customer_Number is "+Customer_Number;
			System.out.println(sql);
			ResultSet rs=st.executeQuery(sql);
			boolean flag=false;
			while (rs.next())
			{
				flag=true;
				System.out.println("Customer Number: "+rs.getString(1));
				System.out.println("Name: "+rs.getString(2));
				System.out.println("Address: "+rs.getString(3));
				System.out.println("Post code: "+rs.getString(4));
			}
			
			if (!flag)
			System.out.println("Record not found");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;}

	public ArrayList<Customer> selectAll(){
		ArrayList<Customer> list=new ArrayList<Customer>();
		try {
			//	Statement st=con.createStatement();
				Connection con= DBUtil.getConnection();
				String sql="select * from CustomerData";
				PreparedStatement pst=con.prepareStatement(sql);
			
				ResultSet rs=pst.executeQuery();
				
				while(rs.next())
				{
					Customer bean=new Customer();
					bean.setCustomer_Name(rs.getString("Customer Number"));
					bean.setName(rs.getString("Name"));
					bean.setAddress(rs.getString("Address"));
					bean.setPostCode(rs.getString("PostCode"));
					list.add(bean);
				}
				
				
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
				return null;
			}
		return list;
	}

}
