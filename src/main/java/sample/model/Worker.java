package sample.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="worker")
public class Worker {

    @Id
    @Column(name = "id")
	private String id;
    
    @Column(name = "name")
	private String name;
	
    @Column(name = "age")
    private int age;
    
    @Column(name = "department")
	private String department;

	public Worker () {

	}

	public Worker(String id, String name, int age, String department) {

		this.id = id;
		this.name = name;
		this.age = age;
		this.department = department;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
}
