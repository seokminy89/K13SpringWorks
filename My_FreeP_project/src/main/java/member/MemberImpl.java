package member;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import util.ParameterDTO;


@Service
public interface MemberImpl {
	
	public int getTotalCount(ParameterDTO parameterDTO);
	public ArrayList<MemberVO> listPage(ParameterDTO parameterDTO);
	
	/*
	 @Param 어노테이션을 통해 파라미터를 전달하면 Mapper에서는 별칭을 통해
	 인파라미터 처리를 할 수 있다.
	 */
	public int regist(@Param("_id") String id,
			@Param("_name") String name,
			@Param("_pass") String pass,
			@Param("_phone") String phone,
			@Param("_email") String email,
			@Param("_grade") String grade);
	
	//메인 회원가입
	public int regAction(MemberVO memberVO);
	
	
	//아이디 중복체크
	public int idChk(String id) throws Exception;
	
	//회원가입시 자동으로 가입축하 쿠폰추가.
	public int coupon(MemberVO memberVO);
	
	
	//아이디 찾기
	public String find_id(String phone) throws Exception;
	
	//패스워드 수정
	public int pwAction(MemberVO memberVO);
	
	//기존 게시물의 내용을 읽어오기 위한 메서드
	public MemberVO view(ParameterDTO parameterDTO);
	
	//수정처리
	public int modify(MemberVO memberVO);
	
	//삭제처리
	public int delete(String m_code);
	
	
//	//삭제처리
//	public int delete(String idx, String id);
//	
//	//Map 컬렉션 사용을 위한 추상메서드
//	public ArrayList<MyBoardDTO> hashMapUse(Map<String, String> hMap);
//	//List 컬렉션 사용을 위한 추상메서드
//	public ArrayList<MyBoardDTO> arrayListUse(List<String> aList);
}
