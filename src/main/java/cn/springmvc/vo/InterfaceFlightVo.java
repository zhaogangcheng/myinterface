package cn.springmvc.vo;

public class InterfaceFlightVo {

	   //first  1:MU5122 2:H舱  3:333 4:17:55  5:北京 首都机场  6:20:10  7: 上海 虹桥机场   8:隔日中转  9 剩余座位  10票面价： 12 最后价格
	   //second 1： MU583   2：N舱  3：773 4：13:00  5：上海 浦东机场   6： 10:05   7：洛杉矶 洛杉矶国际机场
	private int id;
	private String firstFlightCode;
	private String firstFlightSpace;
	private String firstFlightNum;
	private String firstFlightStartFlyTime;
	private String firstFlightStartFlyAddress;
	private String firstFlightArrivedTime;
	private String firstFlightArrivedAddress;
	private String firstFlightISTomorrow;
	private String firstFlightLeftSeat;
	private String firstFlightSVGPrice;
	private String firstFlightLastPrice;
	private String secondFlightCode;
	private String secondFlightSpace;
	private String secondFlightNum;
	private String secondFlightStartFlyTime;
	private String secondFlightStartFlyAddress;
	private String secondFlightArrivedTime;
	private String secondFlightArrivedAddress;
	
	
	private String xfirstFlightCode;
	private String xfirstFlightSpace;
	private String xfirstFlightNum;
	private String xfirstFlightStartFlyTime;
	private String xfirstFlightStartFlyAddress;
	private String xfirstFlightArrivedTime;
	private String xfirstFlightArrivedAddress;
	private String xfirstFlightISTomorrow;
	private String xfirstFlightLeftSeat;
	private String xsecondFlightCode;
	private String xsecondFlightSpace;
	private String xsecondFlightNum;
	private String xsecondFlightStartFlyTime;
	private String xsecondFlightStartFlyAddress;
	private String xsecondFlightArrivedTime;
	private String xsecondFlightArrivedAddress;
	
	private String from;
	private String arrive;
	private String zhongzhuan;
	private String startdate;
	private String enddate;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstFlightCode() {
		return firstFlightCode;
	}
	public void setFirstFlightCode(String firstFlightCode) {
		this.firstFlightCode = firstFlightCode;
	}
	public String getFirstFlightSpace() {
		return firstFlightSpace;
	}
	public void setFirstFlightSpace(String firstFlightSpace) {
		this.firstFlightSpace = firstFlightSpace;
	}
	public String getFirstFlightNum() {
		return firstFlightNum;
	}
	public void setFirstFlightNum(String firstFlightNum) {
		this.firstFlightNum = firstFlightNum;
	}
	public String getFirstFlightStartFlyTime() {
		return firstFlightStartFlyTime;
	}
	public void setFirstFlightStartFlyTime(String firstFlightStartFlyTime) {
		this.firstFlightStartFlyTime = firstFlightStartFlyTime;
	}
	public String getFirstFlightStartFlyAddress() {
		return firstFlightStartFlyAddress;
	}
	public void setFirstFlightStartFlyAddress(String firstFlightStartFlyAddress) {
		this.firstFlightStartFlyAddress = firstFlightStartFlyAddress;
	}
	public String getFirstFlightArrivedTime() {
		return firstFlightArrivedTime;
	}
	public void setFirstFlightArrivedTime(String firstFlightArrivedTime) {
		this.firstFlightArrivedTime = firstFlightArrivedTime;
	}
	public String getFirstFlightArrivedAddress() {
		return firstFlightArrivedAddress;
	}
	public void setFirstFlightArrivedAddress(String firstFlightArrivedAddress) {
		this.firstFlightArrivedAddress = firstFlightArrivedAddress;
	}
	public String getFirstFlightISTomorrow() {
		return firstFlightISTomorrow;
	}
	public void setFirstFlightISTomorrow(String firstFlightISTomorrow) {
		this.firstFlightISTomorrow = firstFlightISTomorrow;
	}
	public String getFirstFlightLeftSeat() {
		return firstFlightLeftSeat;
	}
	public void setFirstFlightLeftSeat(String firstFlightLeftSeat) {
		this.firstFlightLeftSeat = firstFlightLeftSeat;
	}
	public String getFirstFlightSVGPrice() {
		return firstFlightSVGPrice;
	}
	public void setFirstFlightSVGPrice(String firstFlightSVGPrice) {
		this.firstFlightSVGPrice = firstFlightSVGPrice;
	}
	public String getFirstFlightLastPrice() {
		return firstFlightLastPrice;
	}
	public void setFirstFlightLastPrice(String firstFlightLastPrice) {
		this.firstFlightLastPrice = firstFlightLastPrice;
	}
	public String getSecondFlightCode() {
		return secondFlightCode;
	}
	public void setSecondFlightCode(String secondFlightCode) {
		this.secondFlightCode = secondFlightCode;
	}
	public String getSecondFlightSpace() {
		return secondFlightSpace;
	}
	public void setSecondFlightSpace(String secondFlightSpace) {
		this.secondFlightSpace = secondFlightSpace;
	}
	public String getSecondFlightNum() {
		return secondFlightNum;
	}
	public void setSecondFlightNum(String secondFlightNum) {
		this.secondFlightNum = secondFlightNum;
	}
	public String getSecondFlightStartFlyTime() {
		return secondFlightStartFlyTime;
	}
	public void setSecondFlightStartFlyTime(String secondFlightStartFlyTime) {
		this.secondFlightStartFlyTime = secondFlightStartFlyTime;
	}
	public String getSecondFlightStartFlyAddress() {
		return secondFlightStartFlyAddress;
	}
	public void setSecondFlightStartFlyAddress(String secondFlightStartFlyAddress) {
		this.secondFlightStartFlyAddress = secondFlightStartFlyAddress;
	}
	public String getSecondFlightArrivedTime() {
		return secondFlightArrivedTime;
	}
	public void setSecondFlightArrivedTime(String secondFlightArrivedTime) {
		this.secondFlightArrivedTime = secondFlightArrivedTime;
	}
	public String getSecondFlightArrivedAddress() {
		return secondFlightArrivedAddress;
	}
	public void setSecondFlightArrivedAddress(String secondFlightArrivedAddress) {
		this.secondFlightArrivedAddress = secondFlightArrivedAddress;
	}
	public String getXfirstFlightCode() {
		return xfirstFlightCode;
	}
	public void setXfirstFlightCode(String xfirstFlightCode) {
		this.xfirstFlightCode = xfirstFlightCode;
	}
	public String getXfirstFlightSpace() {
		return xfirstFlightSpace;
	}
	public void setXfirstFlightSpace(String xfirstFlightSpace) {
		this.xfirstFlightSpace = xfirstFlightSpace;
	}
	public String getXfirstFlightNum() {
		return xfirstFlightNum;
	}
	public void setXfirstFlightNum(String xfirstFlightNum) {
		this.xfirstFlightNum = xfirstFlightNum;
	}
	public String getXfirstFlightStartFlyTime() {
		return xfirstFlightStartFlyTime;
	}
	public void setXfirstFlightStartFlyTime(String xfirstFlightStartFlyTime) {
		this.xfirstFlightStartFlyTime = xfirstFlightStartFlyTime;
	}
	public String getXfirstFlightStartFlyAddress() {
		return xfirstFlightStartFlyAddress;
	}
	public void setXfirstFlightStartFlyAddress(String xfirstFlightStartFlyAddress) {
		this.xfirstFlightStartFlyAddress = xfirstFlightStartFlyAddress;
	}
	public String getXfirstFlightArrivedTime() {
		return xfirstFlightArrivedTime;
	}
	public void setXfirstFlightArrivedTime(String xfirstFlightArrivedTime) {
		this.xfirstFlightArrivedTime = xfirstFlightArrivedTime;
	}
	public String getXfirstFlightArrivedAddress() {
		return xfirstFlightArrivedAddress;
	}
	public void setXfirstFlightArrivedAddress(String xfirstFlightArrivedAddress) {
		this.xfirstFlightArrivedAddress = xfirstFlightArrivedAddress;
	}
	public String getXfirstFlightISTomorrow() {
		return xfirstFlightISTomorrow;
	}
	public void setXfirstFlightISTomorrow(String xfirstFlightISTomorrow) {
		this.xfirstFlightISTomorrow = xfirstFlightISTomorrow;
	}
	public String getXfirstFlightLeftSeat() {
		return xfirstFlightLeftSeat;
	}
	public void setXfirstFlightLeftSeat(String xfirstFlightLeftSeat) {
		this.xfirstFlightLeftSeat = xfirstFlightLeftSeat;
	}
	public String getXsecondFlightCode() {
		return xsecondFlightCode;
	}
	public void setXsecondFlightCode(String xsecondFlightCode) {
		this.xsecondFlightCode = xsecondFlightCode;
	}
	public String getXsecondFlightSpace() {
		return xsecondFlightSpace;
	}
	public void setXsecondFlightSpace(String xsecondFlightSpace) {
		this.xsecondFlightSpace = xsecondFlightSpace;
	}
	public String getXsecondFlightNum() {
		return xsecondFlightNum;
	}
	public void setXsecondFlightNum(String xsecondFlightNum) {
		this.xsecondFlightNum = xsecondFlightNum;
	}
	public String getXsecondFlightStartFlyTime() {
		return xsecondFlightStartFlyTime;
	}
	public void setXsecondFlightStartFlyTime(String xsecondFlightStartFlyTime) {
		this.xsecondFlightStartFlyTime = xsecondFlightStartFlyTime;
	}
	public String getXsecondFlightStartFlyAddress() {
		return xsecondFlightStartFlyAddress;
	}
	public void setXsecondFlightStartFlyAddress(String xsecondFlightStartFlyAddress) {
		this.xsecondFlightStartFlyAddress = xsecondFlightStartFlyAddress;
	}
	public String getXsecondFlightArrivedTime() {
		return xsecondFlightArrivedTime;
	}
	public void setXsecondFlightArrivedTime(String xsecondFlightArrivedTime) {
		this.xsecondFlightArrivedTime = xsecondFlightArrivedTime;
	}
	public String getXsecondFlightArrivedAddress() {
		return xsecondFlightArrivedAddress;
	}
	public void setXsecondFlightArrivedAddress(String xsecondFlightArrivedAddress) {
		this.xsecondFlightArrivedAddress = xsecondFlightArrivedAddress;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getArrive() {
		return arrive;
	}
	public void setArrive(String arrive) {
		this.arrive = arrive;
	}
	public String getZhongzhuan() {
		return zhongzhuan;
	}
	public void setZhongzhuan(String zhongzhuan) {
		this.zhongzhuan = zhongzhuan;
	}
	public String getStartdate() {
		return startdate;
	}
	public void setStartdate(String startdate) {
		this.startdate = startdate;
	}
	public String getEnddate() {
		return enddate;
	}
	public void setEnddate(String enddate) {
		this.enddate = enddate;
	}
	
	
	
}
