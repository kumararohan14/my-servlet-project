package emplyoee;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import db.Database;

public class EmployeeDao {
  Database db;
  
  public EmployeeDao() {
	  db = new Database();
  }
	private static final String INSERT_EMPLOYEE_SQL = "INSERT INTO employee" +"(firstname, lastname, email, nic, username, password, gender,accountStatus) "+"VALUES (?, ?, ?, ?, ?, ?, ?,?)";
	private static final String UPDATE_EMPLOYEE_SQL = "";
	private static final String DELETE_EMPLOYEE_SQL = "";
	private static final String VIEW_EMPLOYEE_SQL = "";
	
	public boolean insertEmployee(Employee emp) {
		Connection con = db.getConnection();
		try {
			PreparedStatement ps = con.prepareStatement(INSERT_EMPLOYEE_SQL);
			ps.setString(1, emp.getFirstName());
			ps.setString(2, emp.getLastName());
			ps.setString(3, emp.getEmail());
			ps.setString(4, emp.getNic());
			ps.setString(5, emp.getUsername());
			ps.setString(6, emp.getPassword());
			ps.setString(7, emp.getGender());
			ps.setString(8, emp.getAccountStatus());
			ps.executeUpdate();
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}
}