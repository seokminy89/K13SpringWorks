package com.kosmo.jsonrestapi;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import mybatis.BoardDTO;
import mybatis.IAndroidDAO;
import mybatis.IBoardDAO;
import mybatis.MemberVO;
import mybatis.ParameterDTO;

@Controller
public class AndroidController {

	@Autowired
	private SqlSession sqlSession;
	
	@RequestMapping("/android/memberObject.do")
	@ResponseBody
	public ArrayList<MemberVO> memberObject(HttpServletRequest req)
	{
		//파라미터 저장용 DTO객체
		ParameterDTO parameterDTO = new ParameterDTO();
		//검색 필드 저장
		parameterDTO.setSearchField(req.getParameter("searchField"));
		//검색어 저장
		ArrayList<String> searchLists = null;
		if(req.getParameter("searchTxt")!=null) {
			/*
			검색어가 2개 이상인 경우 스페이스로 구분하여 전송하면 split을
			통해 문자열을 분리한 후 List에 하나씩 추가한다.
			 */
			searchLists = new ArrayList<String>();
			String[] sTxtArray = req.getParameter("searchTxt").split(" ");
			for(String str : sTxtArray) {
				searchLists.add(str);
			}
		}
		parameterDTO.setSearchTxt(searchLists);
		System.out.println("검색어:" + searchLists);
		
		//게시물 갯수 카운트
		int totalRecordCount = sqlSession.getMapper(IBoardDAO.class).getTotalCount(parameterDTO);
		System.out.println("totalRecordCount="+totalRecordCount);
		
		//한 페이지에 출력할 게시물의 갯수
		int pageSize = 10; 
		//페이지 번호를 출력하지 않으므로 여기서는 필요 없음(Json 방식으로 가져올것이기 때문)
		//int blockPage = 2; 
		//페이지 수 계산
		int totalPage = (int)Math.ceil((double)totalRecordCount/pageSize);
		//현재 페이지 번호
		int nowPage = (req.getParameter("nowPage")==null || req.getParameter("nowPage").equals(""))
				? 1 :Integer.parseInt(req.getParameter("nowPage"));
		//게시물의 구간 계산
		int start = (nowPage-1) * pageSize + 1;
		int end = nowPage * pageSize;
		
		//게시물의 구간을 DTO에 저장
		parameterDTO.setStart(start);
		parameterDTO.setEnd(end);
		
		//현재 페이지에 해당하는 레코드 추출
		ArrayList<MemberVO> lists =
				sqlSession.getMapper(IAndroidDAO.class).memberList(parameterDTO);
		
		//내용에 대해 줄바꿈 처리
		/*
		 * for(MemberVO dto : lists) { String temp = dto.getContent().replace("\r\n",
		 * "<br/>"); dto.setContent(temp); }
		 */
		//List 객체를 반환한다. 따라서 JSON배열 형태로 출력된다.
		return lists;
		
	}
	
	@RequestMapping("/android/memberList.do")
	@ResponseBody
	public Map<String, ArrayList> memberList(ParameterDTO parameterDTO)
	{
		ArrayList<MemberVO> record = sqlSession.getMapper(IAndroidDAO.class).memberList(parameterDTO);
		Map<String, ArrayList> map = new HashMap<String, ArrayList>();
		for(MemberVO dto : record) {
			map.put("memberList", record);
		}
		return map;
	}
	
	
}