package mybatis;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

@Service
public interface IAndroidDAO {

	public ArrayList<MemberVO> memberList(ParameterDTO parameterDTO);
	
	public MemberVO memberLogin(MemberVO memberVO );
}
