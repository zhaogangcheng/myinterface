package cn.springmvc.vo;

public class InterfaceResultVo {
	
	//first  1:MU5122 2:H舱  3:333 4:17:55  5:北京 首都机场  6:20:10  7: 上海 虹桥机场   8:隔日中转  9 剩余座位  10票面价： 12 最后价格
	//second 1： MU583   2：N舱  3：773 4：13:00  5：上海 浦东机场   6： 10:05   7：洛杉矶 洛杉矶国际机场
	private String gofirstCode;
	private String gofirstSpace;
	private String gofirstNum;
	private String gofirstStartFlyTime;
	private String gofirstStartFlyAddress;
	private String gofirstArrivedTime;
	private String gofirstArrivedAddress;
	private String gofirstISTomorrow;
	private String gofirstISTomorrowHour;
	private String gofirstFlyHour;
	private String gofirstLeftSeat;
	private String gofirstSVGPrice;
	private String gofirstLastPrice;
	private String gosecondCode;
	private String gosecondSpace;
	private String gosecondNum;
	private String gosecondStartFlyTime;
	private String gosecondStartFlyAddress;
	private String gosecondArrivedTime;
	private String gosecondArrivedAddress;
	
	//first  1:MU5122 2:H舱  3:333 4:17:55  5:北京 首都机场  6:20:10  7: 上海 虹桥机场   8:隔日中转 (中转) 9：中转时间  10：飞行时间   11：剩余座位  
	//second 1： MU583   2：N舱  3：773 4：13:00  5：上海 浦东机场   6： 10:05   7：洛杉矶 洛杉矶国际机场
	private String backfirstCode;
	private String backfirstSpace;
	private String backfirstNum;
	private String backfirstStartFlyTime;
	private String backfirstStartFlyAddress;
	private String backfirstArrivedTime;
	private String backfirstArrivedAddress;
	private String backfirstISTomorrow;
	private String backfirstISTomorrowHour;
	private String backfirstFlyHour;
	private String backfirstLeftSeat;
	private String backsecondCode;
	private String backsecondSpace;
	private String backsecondNum;
	private String backsecondStartFlyTime;
	private String backsecondStartFlyAddress;
	private String backsecondArrivedTime;
	private String backsecondArrivedAddress;
	public String getGofirstCode() {
		return gofirstCode;
	}
	public void setGofirstCode(String gofirstCode) {
		this.gofirstCode = gofirstCode;
	}
	public String getGofirstSpace() {
		return gofirstSpace;
	}
	public void setGofirstSpace(String gofirstSpace) {
		this.gofirstSpace = gofirstSpace;
	}
	public String getGofirstNum() {
		return gofirstNum;
	}
	public void setGofirstNum(String gofirstNum) {
		this.gofirstNum = gofirstNum;
	}
	public String getGofirstStartFlyTime() {
		return gofirstStartFlyTime;
	}
	public void setGofirstStartFlyTime(String gofirstStartFlyTime) {
		this.gofirstStartFlyTime = gofirstStartFlyTime;
	}
	public String getGofirstStartFlyAddress() {
		return gofirstStartFlyAddress;
	}
	public void setGofirstStartFlyAddress(String gofirstStartFlyAddress) {
		this.gofirstStartFlyAddress = gofirstStartFlyAddress;
	}
	public String getGofirstArrivedTime() {
		return gofirstArrivedTime;
	}
	public void setGofirstArrivedTime(String gofirstArrivedTime) {
		this.gofirstArrivedTime = gofirstArrivedTime;
	}
	public String getGofirstArrivedAddress() {
		return gofirstArrivedAddress;
	}
	public void setGofirstArrivedAddress(String gofirstArrivedAddress) {
		this.gofirstArrivedAddress = gofirstArrivedAddress;
	}
	public String getGofirstISTomorrow() {
		return gofirstISTomorrow;
	}
	public void setGofirstISTomorrow(String gofirstISTomorrow) {
		this.gofirstISTomorrow = gofirstISTomorrow;
	}
	public String getGofirstISTomorrowHour() {
		return gofirstISTomorrowHour;
	}
	public void setGofirstISTomorrowHour(String gofirstISTomorrowHour) {
		this.gofirstISTomorrowHour = gofirstISTomorrowHour;
	}
	public String getGofirstFlyHour() {
		return gofirstFlyHour;
	}
	public void setGofirstFlyHour(String gofirstFlyHour) {
		this.gofirstFlyHour = gofirstFlyHour;
	}
	public String getGofirstLeftSeat() {
		return gofirstLeftSeat;
	}
	public void setGofirstLeftSeat(String gofirstLeftSeat) {
		this.gofirstLeftSeat = gofirstLeftSeat;
	}
	public String getGofirstSVGPrice() {
		return gofirstSVGPrice;
	}
	public void setGofirstSVGPrice(String gofirstSVGPrice) {
		this.gofirstSVGPrice = gofirstSVGPrice;
	}
	public String getGofirstLastPrice() {
		return gofirstLastPrice;
	}
	public void setGofirstLastPrice(String gofirstLastPrice) {
		this.gofirstLastPrice = gofirstLastPrice;
	}
	public String getGosecondCode() {
		return gosecondCode;
	}
	public void setGosecondCode(String gosecondCode) {
		this.gosecondCode = gosecondCode;
	}
	public String getGosecondSpace() {
		return gosecondSpace;
	}
	public void setGosecondSpace(String gosecondSpace) {
		this.gosecondSpace = gosecondSpace;
	}
	public String getGosecondNum() {
		return gosecondNum;
	}
	public void setGosecondNum(String gosecondNum) {
		this.gosecondNum = gosecondNum;
	}
	public String getGosecondStartFlyTime() {
		return gosecondStartFlyTime;
	}
	public void setGosecondStartFlyTime(String gosecondStartFlyTime) {
		this.gosecondStartFlyTime = gosecondStartFlyTime;
	}
	public String getGosecondStartFlyAddress() {
		return gosecondStartFlyAddress;
	}
	public void setGosecondStartFlyAddress(String gosecondStartFlyAddress) {
		this.gosecondStartFlyAddress = gosecondStartFlyAddress;
	}
	public String getGosecondArrivedTime() {
		return gosecondArrivedTime;
	}
	public void setGosecondArrivedTime(String gosecondArrivedTime) {
		this.gosecondArrivedTime = gosecondArrivedTime;
	}
	public String getGosecondArrivedAddress() {
		return gosecondArrivedAddress;
	}
	public void setGosecondArrivedAddress(String gosecondArrivedAddress) {
		this.gosecondArrivedAddress = gosecondArrivedAddress;
	}
	public String getBackfirstCode() {
		return backfirstCode;
	}
	public void setBackfirstCode(String backfirstCode) {
		this.backfirstCode = backfirstCode;
	}
	public String getBackfirstSpace() {
		return backfirstSpace;
	}
	public void setBackfirstSpace(String backfirstSpace) {
		this.backfirstSpace = backfirstSpace;
	}
	public String getBackfirstNum() {
		return backfirstNum;
	}
	public void setBackfirstNum(String backfirstNum) {
		this.backfirstNum = backfirstNum;
	}
	public String getBackfirstStartFlyTime() {
		return backfirstStartFlyTime;
	}
	public void setBackfirstStartFlyTime(String backfirstStartFlyTime) {
		this.backfirstStartFlyTime = backfirstStartFlyTime;
	}
	public String getBackfirstStartFlyAddress() {
		return backfirstStartFlyAddress;
	}
	public void setBackfirstStartFlyAddress(String backfirstStartFlyAddress) {
		this.backfirstStartFlyAddress = backfirstStartFlyAddress;
	}
	public String getBackfirstArrivedTime() {
		return backfirstArrivedTime;
	}
	public void setBackfirstArrivedTime(String backfirstArrivedTime) {
		this.backfirstArrivedTime = backfirstArrivedTime;
	}
	public String getBackfirstArrivedAddress() {
		return backfirstArrivedAddress;
	}
	public void setBackfirstArrivedAddress(String backfirstArrivedAddress) {
		this.backfirstArrivedAddress = backfirstArrivedAddress;
	}
	public String getBackfirstISTomorrow() {
		return backfirstISTomorrow;
	}
	public void setBackfirstISTomorrow(String backfirstISTomorrow) {
		this.backfirstISTomorrow = backfirstISTomorrow;
	}
	public String getBackfirstISTomorrowHour() {
		return backfirstISTomorrowHour;
	}
	public void setBackfirstISTomorrowHour(String backfirstISTomorrowHour) {
		this.backfirstISTomorrowHour = backfirstISTomorrowHour;
	}
	public String getBackfirstFlyHour() {
		return backfirstFlyHour;
	}
	public void setBackfirstFlyHour(String backfirstFlyHour) {
		this.backfirstFlyHour = backfirstFlyHour;
	}
	public String getBackfirstLeftSeat() {
		return backfirstLeftSeat;
	}
	public void setBackfirstLeftSeat(String backfirstLeftSeat) {
		this.backfirstLeftSeat = backfirstLeftSeat;
	}
	public String getBacksecondCode() {
		return backsecondCode;
	}
	public void setBacksecondCode(String backsecondCode) {
		this.backsecondCode = backsecondCode;
	}
	public String getBacksecondSpace() {
		return backsecondSpace;
	}
	public void setBacksecondSpace(String backsecondSpace) {
		this.backsecondSpace = backsecondSpace;
	}
	public String getBacksecondNum() {
		return backsecondNum;
	}
	public void setBacksecondNum(String backsecondNum) {
		this.backsecondNum = backsecondNum;
	}
	public String getBacksecondStartFlyTime() {
		return backsecondStartFlyTime;
	}
	public void setBacksecondStartFlyTime(String backsecondStartFlyTime) {
		this.backsecondStartFlyTime = backsecondStartFlyTime;
	}
	public String getBacksecondStartFlyAddress() {
		return backsecondStartFlyAddress;
	}
	public void setBacksecondStartFlyAddress(String backsecondStartFlyAddress) {
		this.backsecondStartFlyAddress = backsecondStartFlyAddress;
	}
	public String getBacksecondArrivedTime() {
		return backsecondArrivedTime;
	}
	public void setBacksecondArrivedTime(String backsecondArrivedTime) {
		this.backsecondArrivedTime = backsecondArrivedTime;
	}
	public String getBacksecondArrivedAddress() {
		return backsecondArrivedAddress;
	}
	public void setBacksecondArrivedAddress(String backsecondArrivedAddress) {
		this.backsecondArrivedAddress = backsecondArrivedAddress;
	}

	
}
