package com.hefuxiang.redis.domain;

import java.io.Serializable;

/**
 * 
 * @ClassName: User 
 * @Description: 用户实体类
 * @author:HeFuXiang
 * @date: 2019年8月12日 上午8:54:32
 */
/** 
 * @ClassName: User 
 * @Description: TODO
 * @author:HeFuXiang
 * @date: 2019年8月12日 上午8:59:38  
 */
public class User implements Serializable {
	
   private Integer id;
   /**
 * @fieldName: name
 * @fieldType: String
 * @Description: 用户姓名
 */
 private String name;
   private String sex;
   
   /**
 * @fieldName: phone
 * @fieldType: String
 * @Description: 电话
 */
private String phone;
   private String eimal;
   private Integer age;
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getSex() {
	return sex;
}
public void setSex(String sex) {
	this.sex = sex;
}
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}
public String getEimal() {
	return eimal;
}
public void setEimal(String eimal) {
	this.eimal = eimal;
}
public Integer getAge() {
	return age;
}
public void setAge(Integer age) {
	this.age = age;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((age == null) ? 0 : age.hashCode());
	result = prime * result + ((eimal == null) ? 0 : eimal.hashCode());
	result = prime * result + ((id == null) ? 0 : id.hashCode());
	result = prime * result + ((name == null) ? 0 : name.hashCode());
	result = prime * result + ((phone == null) ? 0 : phone.hashCode());
	result = prime * result + ((sex == null) ? 0 : sex.hashCode());
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	User other = (User) obj;
	if (age == null) {
		if (other.age != null)
			return false;
	} else if (!age.equals(other.age))
		return false;
	if (eimal == null) {
		if (other.eimal != null)
			return false;
	} else if (!eimal.equals(other.eimal))
		return false;
	if (id == null) {
		if (other.id != null)
			return false;
	} else if (!id.equals(other.id))
		return false;
	if (name == null) {
		if (other.name != null)
			return false;
	} else if (!name.equals(other.name))
		return false;
	if (phone == null) {
		if (other.phone != null)
			return false;
	} else if (!phone.equals(other.phone))
		return false;
	if (sex == null) {
		if (other.sex != null)
			return false;
	} else if (!sex.equals(other.sex))
		return false;
	return true;
}
public User(Integer id, String name, String sex, String phone, String eimal, Integer age) {
	super();
	this.id = id;
	this.name = name;
	this.sex = sex;
	this.phone = phone;
	this.eimal = eimal;
	this.age = age;
}
public User() {
	super();
}
@Override
public String toString() {
	return "User [id=" + id + ", name=" + name + ", sex=" + sex + ", phone=" + phone + ", eimal=" + eimal + ", age="
			+ age + "]";
}

}
