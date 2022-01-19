package springboard.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import springboard.command.BbsCommandImpl;
import springboard.command.ListCommand;
import springboard.command.ViewCommand;
import springboard.command.WriteActionCommand;
import springboard.model.JdbcTemplateConst;
import springboard.model.SpringBbsDTO;

@Controller
public class BbsController {
	
	private JdbcTemplate template;
	@Autowired
	public void setTemplate(JdbcTemplate template) {
		this.template = template;
		System.out.println("@Autowired->JDBCTemplate 연결성공");
		
		JdbcTemplateConst.template = this.template;
	}
	
	/*
	멤버변수로 선언하여 클래스에서 전역적으로 사용할 수 있다.
	해당 크래스의 모든 Command(서비스)객체는 해당 인터페이스를 구현하여 정의한다. 
	*/
	BbsCommandImpl command = null;
	
	//게시판 리스트
	@RequestMapping("/board/list.do")
	public String list(Model model, HttpServletRequest req) {
		
		model.addAttribute("req", req);
		command = new ListCommand();
		command.execute(model);
		
		return "07Board/list";
	}
	
	//글쓰기 페이지로 진입하기 위한 매핑처리
	@RequestMapping("/board/write.do")
	public String write(Model model) {
		
		return "07Board/write";
	}
	// 전송방식이 post이므로 method 까지 같이 기술해서 매핑
	@RequestMapping(value ="/board/writeAction.do", method = RequestMethod.POST)
	public String writeAction(Model model,
		HttpServletRequest req, SpringBbsDTO springBbsDTO) 
	{
		/*
		글쓰기 페이지에서 전송된 모든 폼값은 SpringBbsDTO 객체를 통해
		한번에 받을 수 있다.
		Spring에서는 커맨드 객체를 통해 이와같은 처리를 할 수 있다. 
		*/
		//request객체와 함께 Model에 저장
		model.addAttribute("req", req);
		model.addAttribute("springBbsDTO", springBbsDTO);
		//요청을 전달할 service객체를 생성한 후 execute()메서드 호출
		command = new WriteActionCommand();
		command.execute(model);
		
		//redirect: 같은 경우는 뷰를 반환하지 않고, 지정된URL(요청명)으로 이동한다.
		return "redirect:list.do?nowPage=1";
	}
	
	@RequestMapping("/board/view.do")
	public String view(Model model, HttpServletRequest req) {
		
		model.addAttribute("req", req);
		command = new ViewCommand();
		command.execute(model);
		
		return "07Board/view";
	}
}
