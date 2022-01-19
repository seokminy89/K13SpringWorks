package springboard.command;

import java.util.ArrayList;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

import springboard.model.JDBCTemplateDAO;
import springboard.model.SpringBbsDTO;

/*
BbsCommandImpl 인터페이스를 구현했으므로 execute()메소드를 반드시
오버라이딩 해야한다. extend는 상속했다고 하고 인터페이스는 implemet(구현)이라 함
또한 해당 객체는 부모타입인 BbsCommandImpl로 참조할 수 있다.
*/
public class ListCommand implements BbsCommandImpl{
	
	@Override
	public void execute(Model model) {

		System.out.println("ListCommand > execute() 호출");
		/*
		컨트롤러에서 인자로 전달한 Model객체에는 request객체가 저장되어 있다.
		asMap()을 통해 Map컬렉션으로 변환한 후 모든 요청을 얻어온다. 
		*/
		Map<String, Object> paramMap = model.asMap();
		
		HttpServletRequest req = (HttpServletRequest)paramMap.get("req");
		
		JDBCTemplateDAO dao = new JDBCTemplateDAO();
		
		String addQueryString = "";
		String searchColumn = req.getParameter("searchColumn");
		String searchWord = req.getParameter("searchWord");
		if(searchWord!=null)
		{
			addQueryString = String.format("searchColumn=%s searchWord=%s&", searchColumn, searchWord );
			
			paramMap.put("Column", searchColumn);
			paramMap.put("Word", searchWord);
		}
		
		int totalRecordCount = dao.getTotalCount(paramMap);
		
		ArrayList<SpringBbsDTO> listRows = dao.list(paramMap);
		
		int virtualNum = 0;
		int countNum = 0;
		
		for(SpringBbsDTO row : listRows)
		{
			virtualNum = totalRecordCount --;
			row.setVirtualNum(virtualNum);
		}
		model.addAttribute("listRows", listRows);
		
		
		//dao.close();
	}
}
