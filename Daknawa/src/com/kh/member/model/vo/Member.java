package com.kh.member.model.vo;

public class Member {

	private int userNo; 	  	   //	user_NO	NUMBER
	private String userId;  	   //	user_ID	VARCHAR2(12 BYTE)
	private String userPwd; 	   //	user_PWD	VARCHAR2(15 BYTE)
	private String userNickName; //	user_NICKNAME	VARCHAR2(30 BYTE)
	private String userName; 	   //	user_NAME	VARCHAR2(15 BYTE)
	private String email; 		   //	EMAIL	VARCHAR2(30 BYTE)
	private int phone;			   //	PHONE	NUMBER
	private String birth;		   //	BIRTH	DATE
	private String gender;		   //	GENDER	CHAR(3 BYTE)
	private String address;		   //	ADDRESS	VARCHAR2(150 BYTE)
	private String blackList;	   //	BLACKLIST	CHAR(1 BYTE)
	private int userPoint;	   //	user_POINT	NUMBER
	private String status;		   //	STATUS	CHAR(1 BYTE)
	
	public Member() { }

	public Member(int userNo, String userId, String userPwd, String userNickName, String userName,
			String email, int phone, String birth, String gender, String address, String blackList, int userPoint,
			String status) {
		super();
		this.userNo = userNo;
		this.userId = userId;
		this.userPwd = userPwd;
		this.userNickName = userNickName;
		this.userName = userName;
		this.email = email;
		this.phone = phone;
		this.birth = birth;
		this.gender = gender;
		this.address = address;
		this.blackList = blackList;
		this.userPoint = userPoint;
		this.status = status;
	}
	
	public Member(String userId, String userPwd, String userNickName, String userName, String email, int phone,
			String birth, String gender, String address) {
		super();
		this.userId = userId;
		this.userPwd = userPwd;
		this.userNickName = userNickName;
		this.userName = userName;
		this.email = email;
		this.phone = phone;
		this.birth = birth;
		this.gender = gender;
		this.address = address;
	}

	public int getUserNo() {
		return userNo;
	}

	public void setUserNo(int userNo) {
		this.userNo = userNo;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserPwd() {
		return userPwd;
	}

	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}

	public String getUserNickName() {
		return userNickName;
	}

	public void setUserNickName(String userNickName) {
		this.userNickName = userNickName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getBlackList() {
		return blackList;
	}

	public void setBlackList(String blackList) {
		this.blackList = blackList;
	}

	public int getUserPoint() {
		return userPoint;
	}

	public void setuserPoint(int userPoint) {
		this.userPoint = userPoint;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Member [userNo=" + userNo + ", userId=" + userId + ", userPwd=" + userPwd
				+ ", userNickName=" + userNickName + ", userName=" + userName + ", email=" + email + ", phone="
				+ phone + ", birth=" + birth + ", gender=" + gender + ", address=" + address + ", blackList="
				+ blackList + ", userPoint=" + userPoint + ", status=" + status + "]";
	}
}
