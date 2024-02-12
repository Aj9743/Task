package Sprimgmvc1_dto;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Sprpingdto {
	@Id
	private int id;
	@Override
	public String toString() {
		return "Sprpingdto [id=" + id + ", name=" + name + "]";
	}
	private String name;
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

}
