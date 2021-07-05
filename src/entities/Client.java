package entities;

import java.util.Date;

public class Client {
	
	private int id;
	private String name;
	private String document;
	private Date born_at;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDocument() {
		return document;
	}
	public void setDocument(String document) {
		this.document = document;
	}
	public Date getBorn_at() {
		return born_at;
	}
	public void setBorn_at(Date born_at) {
		this.born_at = born_at;
	}
	

}
