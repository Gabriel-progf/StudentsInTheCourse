package model.entities;

import java.util.Objects;

public class Course implements Comparable<Course> {

	private String name;
	private Integer id;
	
	
	public Course() {
		
	}
	
	public Course(String name, Integer id) {
		super();
		this.name = name;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Course other = (Course) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public int compareTo(Course o) {
		return id.compareTo(o.getId());
	}
	
	@Override
	public String toString() {
		return name + "," + id;
	}
	
	
	
}
