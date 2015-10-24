package com.CTracker.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class RoleAndPermission {

	@Id
	@GeneratedValue
	private Integer id;
	private String name;
	
	private Boolean create;
	private Boolean read;
	private Boolean update;
	private Boolean delete;
	
	// relations
	@OneToOne
	private User user;
	
	//relation methods
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
		//------
	

	public Integer getId() {
		return id;
	}
	public Boolean getCreate() {
		return create;
	}
	public void setCreate(Boolean create) {
		this.create = create;
	}
	public Boolean getRead() {
		return read;
	}
	public void setRead(Boolean read) {
		this.read = read;
	}
	public Boolean getUpdate() {
		return update;
	}
	public void setUpdate(Boolean update) {
		this.update = update;
	}
	public Boolean getDelete() {
		return delete;
	}
	public void setDelete(Boolean delete) {
		this.delete = delete;
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
	
	
	
}
