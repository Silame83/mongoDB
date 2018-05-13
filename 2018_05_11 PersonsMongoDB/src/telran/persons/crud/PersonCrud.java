package telran.persons.crud;

import java.time.LocalDate;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import telran.persons.dto.Person;

@Document(collection = "persons")
public class PersonCrud {
	@Id
	private int id;
	private String name;
	private LocalDate birthDate;

	public PersonCrud(Person person) {
		id = person.getId();
		name = person.getName();
		birthDate = person.getBirthdate();
	}

	public PersonCrud() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public Person getPerson() {
		Person res = new Person(id, name, birthDate);
		return res;
	}
}
