package models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="SCHOOLS")
public class schools {

	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@Column(name="NAME")
	private String Name;
	
	@Column(name="TOWN")
	private String Town;
	
	@Column(name="CITY")
	private String City;
	
	@Column(name="STREET")
	private String Street;
	
	@Column(name="NUMBER")
	private String Number;

	
	
	
	public schools() {
		super();
	}
	
	

	public schools(String name, String town, String city, String street,
			String number) {
		super();
		Name = name;
		Town = town;
		City = city;
		Street = street;
		Number = number;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getTown() {
		return Town;
	}

	public void setTown(String town) {
		Town = town;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	public String getStreet() {
		return Street;
	}

	public void setStreet(String street) {
		Street = street;
	}

	public String getNumber() {
		return Number;
	}

	public void setNumber(String number) {
		Number = number;
	}
	
	
}
