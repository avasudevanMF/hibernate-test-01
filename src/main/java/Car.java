
import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author preetham
 */

@Entity
@Table(name = "car")
public class Car {
	@Id
	private int id;
	private String name;
	// private Collection<CarOwner> owners = new ArrayList<>(); // mappedBy="owners"

	public Car() {
		// TODO Auto-generated constructor stub
	}

	public Car(String name) {
		this.name = name;
	}

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
	/*
	 * public Collection<CarOwner> getOwners() { return owners; }
	 * 
	 * public void setOwners(Collection<CarOwner> owners) { this.owners = owners; }
	 */

	@Override
	public String toString() {
		return "Car [id=" + id + ", name=" + name + "]";
	}
}
