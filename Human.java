package com.homework.groupofstudents;

public class Human {
	private boolean sex;
	private String eyesColor;
	private String hairColor;
	public Human(boolean sex, String eyesColor, String hairColor) {
		super();
		this.sex = sex;
		this.eyesColor = eyesColor;
		this.hairColor = hairColor;
	}
	public Human() {
		super();
		// TODO Auto-generated constructor stub
	}
	public boolean isSex() {
		return sex;
	}
	public void setSex(boolean sex) {
		this.sex = sex;
	}
	public String getEyesColor() {
		return eyesColor;
	}
	public void setEyesColor(String eyesColor) {
		this.eyesColor = eyesColor;
	}
	public String getHairColor() {
		return hairColor;
	}
	public void setHairColor(String hairColor) {
		this.hairColor = hairColor;
	}
	
}
