package mybatis;

import lombok.Data;

//롬복 멤버변수에 @Data만 붙여주면 알아서 게터세터랑 다 만들어줌.
@Data
public class ParameterDTO {
	private String user_id; 	//사용자 아이디
	private String board_idx; 	//게시판 일련번호
	
	//검색기능 추가
	private String searchField; //검색할 필드명
	private String searchTxt; 	//검색어
	//페이징 기능 추가
	private int start; 			//게시물 구간의 시작
	private int end; 			//게시물 구간의 끝
	
	
}
