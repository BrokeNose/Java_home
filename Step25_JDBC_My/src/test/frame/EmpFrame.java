package test.frame;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import test.dao.EmpDao;
import test.dto.EmpDto;
/*
 *  emp 테이블과 dept 테이블을 이용한 프레임 만들기
 *  
 *  JTable 에 출력할 내용은
 *  
 *  사원번호 | 이름 | 급여 | 부서명 | 입사일
 *  
 */
public class EmpFrame extends JFrame implements ActionListener{
	//필드 
	DefaultTableModel model;
	
	//생성자
	public EmpFrame() {
		
		setLayout(new BorderLayout());
		
		String[] colNames= {"사원번호","이름","급여","부서명","입사일"};
		model=new DefaultTableModel(colNames, 0);
		JTable table=new JTable();
		table.setModel(model);
		
		JScrollPane scPane=new JScrollPane(table);
		add(scPane, BorderLayout.CENTER);
		
		JPanel northPanel=new JPanel();
		JButton testBtn1=new JButton("output");
		JButton testBtn2=new JButton("insert");
		JButton testBtn3=new JButton("delete");
		JButton testBtn4=new JButton("update");
		
		northPanel.add(testBtn1);
		northPanel.add(testBtn2);
		northPanel.add(testBtn3);
		northPanel.add(testBtn4);
	
		
		testBtn1.addActionListener(this);
		testBtn2.addActionListener(this);
		testBtn3.addActionListener(this);
		testBtn4.addActionListener(this);
		
		testBtn1.setActionCommand("output");
		testBtn2.setActionCommand("insert");
		testBtn3.setActionCommand("delete");
		testBtn4.setActionCommand("update");
		
		add(northPanel, BorderLayout.NORTH);
		
		
		setBounds(100,100,500,500);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new EmpFrame();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String ac = e.getActionCommand();
		EmpDao dao=EmpDao.getInstance();
		List<EmpDto> list=dao.getList();
		
		if (ac.equals("output")) {
			
			for (EmpDto tmp : list) {
				Object[] data=
					{tmp.getEmpno(),tmp.getEname(),tmp.getSal(),tmp.getDeptno(),tmp.getHiredate()};
				model.addRow(data);
			}
		}else if(ac.equals("insert")) {
			//입력창 띄우기
			String numMsg=JOptionPane.showInputDialog(this, "사원번호 입력");
			String enameMsg=JOptionPane.showInputDialog(this, "사원이름 입력");
			String salMsg=JOptionPane.showInputDialog(this, "급여 입력");
			String deptnoMsg=JOptionPane.showInputDialog(this, "부서번호 입력");
			String hiredateMsg=JOptionPane.showInputDialog(this, "입사일 입력");
			
			dao.insert(new EmpDto(Integer.parseInt(numMsg), enameMsg,Double.parseDouble(salMsg), Integer.parseInt(deptnoMsg), hiredateMsg);
			
		}else if(ac.equals("delete")) {
			
		}else if(ac.equals("update")) {
			
		}
		
		
		
	}
	
	
}
