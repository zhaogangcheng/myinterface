package cn.springmvc.vo;

public class InterfaceVo {
	
	//旅行类型（单程，往返）
	private String routeType;
	
	//乘客数量
	private String adtCount;
	
	//出发日期
	private String depDate;
	
	//到达日期
	private String retDate;
	
	//出发机场
	private String depAirpCd;
	
	//到达机场
	private String arrAirpCd;
	
	//用户名
	private String username;
	
	//密码
	private String password;
	
	//舱  ""不限    两舱 cabinLevel:F   cabinLevel:Y 经济舱
	private String cabinLevel;
	
	
	public String getCabinLevel() {
		return cabinLevel;
	}

	public void setCabinLevel(String cabinLevel) {
		this.cabinLevel = cabinLevel;
	}

	public String getRouteType() {
		return routeType;
	}

	public void setRouteType(String routeType) {
		this.routeType = routeType;
	}

	public String getAdtCount() {
		return adtCount;
	}

	public void setAdtCount(String adtCount) {
		this.adtCount = adtCount;
	}

	public String getDepDate() {
		return depDate;
	}

	public void setDepDate(String depDate) {
		this.depDate = depDate;
	}

	public String getRetDate() {
		return retDate;
	}

	public void setRetDate(String retDate) {
		this.retDate = retDate;
	}

	public String getDepAirpCd() {
		return depAirpCd;
	}

	public void setDepAirpCd(String depAirpCd) {
		this.depAirpCd = depAirpCd;
	}

	public String getArrAirpCd() {
		return arrAirpCd;
	}

	public void setArrAirpCd(String arrAirpCd) {
		this.arrAirpCd = arrAirpCd;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
