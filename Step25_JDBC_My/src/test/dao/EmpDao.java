package test.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import test.dto.EmpDto;
import test.dto.MemberDto;
import test.util.DBConnect;

public class EmpDao {
	//single ton 으로 사용할수 있도록 구조를 잡으세요.
	private static EmpDao dao;
	
	private EmpDao() {}
	
	public static EmpDao getInstance() {
		if(dao==null) {
			dao=new EmpDao();
		}
		return dao;
		
	}
	//사원 목록을 리턴해주는 메소드
	public List<EmpDto> getList(){
		//필요한 지역변수 만들기
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		//회원 정보를 저장할 List 객체 생성
		List<EmpDto> list= new ArrayList<>();
		
		try {
			conn=new DBConnect().getConn();
			String sql="SELECT empno,ename,sal,dname,hiredate FROM emp,dept"
					+" WHERE emp.deptno = dept.deptno"+ " ORDER BY empno ASC";
			pstmt=conn.prepareStatement(sql);
			//쿼리문 수행하고 ResultSet 리턴 받기
			rs=pstmt.executeQuery();
			while (rs.next()) {
				//커서가 위치한 곳의 회원정보 읽어내기
				int empno=rs.getInt("empno");
				String ename=rs.getString("ename");
				double sal=rs.getDouble("sal");
				String dname=rs.getString("dname");
				String hiredate=rs.getString("hiredate");
				//회원정보를 MemberDto 객체에 담아서
				EmpDto dto= new EmpDto(empno,ename,sal,dname,hiredate);
				//List 에 누적 시키기
				list.add(dto);
			}
		}catch(SQLException se) {
			se.printStackTrace();
		}finally {
			try {
				if(rs!=null)rs.close();
				if(pstmt!=null)pstmt.close();
				if(conn!=null)conn.close();
			}catch(Exception e) {}
		}
		return list;
	}
	
	//사원정보 저장하는 메소드
	public boolean insert(EmpDto dto) {
		Connection conn=null;
		PreparedStatement pstmt=null;
		int flag=0;
		try {
			//connection 객체의 참조값 얻어오기
			conn=new DBConnect().getConn();
			String sql="INSERT INTO member (empno,ename,sal,deptno,hiredate) "
					+ "VALUES(?, ?, ?, ?, ?)";
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, dto.getEmpno());
			pstmt.setString(2, dto.getEname());
			pstmt.setDouble(3, dto.getSal());
			pstmt.setInt(4, dto.getDeptno());
			pstmt.setString(5, dto.getHiredate());
			flag=pstmt.executeUpdate();
		}catch(SQLException se) {
			se.printStackTrace();
		}finally {
			try {
				if(pstmt!=null)pstmt.close();
				if(conn!=null)conn.close();
			}catch(Exception e) {}
		}
		if(flag>0) {
			return true;	
		}else {
			return false;
		}
	}
	
}
