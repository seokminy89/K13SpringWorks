package springboard.command;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import springboard.model.JDBCTemplateDAO;
import springboard.model.SpringBbsDTO;

@Service
public class EditActionCommand implements BbsCommandImpl{
	
	@Autowired
	JDBCTemplateDAO dao;
	
	@Override
	public void execute(Model model) {
		
		Map<String, Object> map = model.asMap();
		
		//커맨드 객체를 통해 모든 폼값을 저장한 DTO를 가져온다.
		HttpServletRequest req = (HttpServletRequest)map.get("req");
		
		SpringBbsDTO springBbsDTO = (SpringBbsDTO)map.get("springBbsDTO");
		
		//JDBCTemplateDAO dao = new JDBCTemplateDAO();

		/*
		//위에처럼 처리하지 않으면 이렇게 폼값을 개별적으로 받아야 함 
		String idx = req.getParameter("idx");
		String name = req.getParameter("name");
		String title = req.getParameter("title");
		String contents = req.getParameter("contents");
		String pass = req.getParameter("pass");
		//dao.edit(idx, name, title, contents, pass);
		*/
		
		//DTO 객체를 DAO로 전달한다.
		dao.edit(springBbsDTO);
	}
}
