package com.homework.groupofstudents;

import java.util.Arrays;

import javax.swing.JOptionPane;


public class Group implements Voencom {
	private Student[] group = new Student[10];
	private int groupCount = 0; 

	public Group(Student[] group) {
		super();
		this.group = group;
	}

	public Group() {
		super();
	}

	public Student[] getGroup() {
		return group;
	}

	public void setGroup(Student[] group) {
		this.group = group;
	} 
	
	
	

	public void addStudent (Student one) throws MyArrayIndexOutOfBoundsException{
		for (int i = 0; i < group.length; i++) {
			if(group[i] == null) {
				group[i] = one;
				groupCount++;
				return;
			}
		} throw new MyArrayIndexOutOfBoundsException("The group can`t be more than 10 students");
	}
	public void deleteStudent (Student one) {
		for (int i = 0; i < group.length;i++) {
			if (group[i] != null) {
				if (group[i] == one) {
					group[i] = null;
					groupCount--;
				}
			}
		}
	}
	public Student[] findStudent (String sureName) {
		int result = 11;
		Student[] students = new Student[groupCount];
		String[] str = new String[groupCount];
		try {
			sort();
		for(int i = 0; i < group.length;i++) {
			if (group[i] != null) {
				if (group[i].getSurename().equalsIgnoreCase(sureName)) {
					result = i;
					students[i] = group[i];
					str[i] = group[i].getName() + " " + group[i].getSurename();
				}
			}
		}
		group[result].getSurename();
			} catch (ArrayIndexOutOfBoundsException e) {
				JOptionPane.showMessageDialog(null,"There is no student with this surename " + sureName + " in this group");
			}
		if (str.length > 0)JOptionPane.showMessageDialog(null,str);
		
		return students;
	}
	public Student[] findStudentByAge (int age) {
		Student[] students = new Student[groupCount];
		String[] str = new String[groupCount];
		try {
			sort();

		for(int i = 0; i < group.length;i++) {
			if (group[i] != null) {
				if (group[i].getAge() == age) {
					students[i] = group[i];
					str[i] = group[i].getName() + " " + group[i].getSurename() + " age " +group[i].getAge();
				}
			}
		}
			} catch (ArrayIndexOutOfBoundsException e) {
				JOptionPane.showMessageDialog(null, "There is no students with this age " + age + " in this group");
			}
		if (str.length>0)JOptionPane.showMessageDialog(null,str);
		return students;
	}
	
	@Override
	public Student[] findRecruit() {
		int recruitsCount = 0;
		Student[] recruits = new Student[10];
		for (int i = 0; i < group.length;i++) {
			if (group[i] != null) {
				if (group[i].getAge() >= 18 && group[i].isSex()) {
					recruitsCount +=1;
					recruits[i] = group[i];
				}
			}
		}
		if (recruitsCount != 0) {
			String[] recs = new String[recruitsCount];
			for (int i = 0; i < recruitsCount;i++) {
				if (recruits[i] != null) {
					recs[i] = recruits[i].getName() + " " + recruits[i].getSurename();
				}
			}
			JOptionPane.showMessageDialog(null, recs, "Recruits", 1);
		} else {
			JOptionPane.showMessageDialog(null,"There are no students in this group that can be recruited to the Army","Voencom",1);
		}
		
		return recruits;
	}

	private boolean compare(String one, String two) {
		int check = 0;

        try {
            check = one.compareTo(two);

        } catch (NullPointerException e) {

            check = 0;

        }

        return (check > 0) ? false : true;
		
	}



	public void sort () {
		Student tempStr;
			
		for (int t = 0; t < groupCount - 1; t++) {
		    for (int i= 0; i < groupCount - t -1; i++) {
		        if(compare(group[i+1].getSurename(), group[i].getSurename())) {
		        		tempStr = group[i];
			            group[i]=group[i+1];
			            group[i+1]=tempStr; 	
		         } 
		     }
		}	
	}
	@Override
	public String toString() {
		String[] students = new String[groupCount];
		sort();
		String sex;
		for (int i = 0; i < groupCount;i++) {
			if (group[i].isSex()) {sex = "Man";} else {sex = "Woman";}
			students[i] = group[i].getName() + " " + group[i].getSurename() + " (age " + group[i].getAge() + ", hair " + group[i].getHairColor() + ", eyes " + group[i].getEyesColor() + ", sex " + sex + ")";
		}
		return "Total students " + groupCount + " " + Arrays.toString(students) + "";
	}
	
}
