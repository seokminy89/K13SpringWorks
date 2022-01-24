package autoscan;

import org.springframework.stereotype.Repository;

@Repository
public class LottoVO {
	private int userLottoNum;
	private int randomLottoNum;
	private String result;
	public LottoVO() {
		System.out.println("lottoVO create object");
	}
	public int getUserLottoNum() {
		return userLottoNum;
	}
	public void setUserLottoNum(int userLottoNum) {
		this.userLottoNum = userLottoNum;
	}
	public int getRandomLottoNum() {
		return randomLottoNum;
	}
	public void setRandomLottoNum(int randomLottoNum) {
		this.randomLottoNum = randomLottoNum;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	
}
