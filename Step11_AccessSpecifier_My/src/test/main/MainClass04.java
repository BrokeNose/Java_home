package test.main;

import test.mypac.MemberDao;

public class MainClass04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MemberDao dao=MemberDao.getInstance();
		
		dao.insert();
		dao.delete();
	}

}
