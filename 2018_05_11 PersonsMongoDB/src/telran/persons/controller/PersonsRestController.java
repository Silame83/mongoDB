package telran.persons.controller;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import telran.persons.dao.IPersonsDao;
import telran.persons.dto.Person;

@SpringBootApplication
@ComponentScan(basePackages = "telran.persons.dao")
@EnableMongoRepositories("telran.persons.mongo.repo")
@RestController
public class PersonsRestController {
	@Autowired
	IPersonsDao persons;

	/*
	 * @GetMapping("/") String onlyForTest() { persons.addPerson(new Person); return
	 * "Ok"; }
	 */

	@PostMapping("/add_person")
	Boolean add_person(Person person) {
		return persons.addPerson(new Person(231, "Dima", LocalDate.of(1980, 5, 25)));
	}

	@PostMapping("/remove_person")
	Boolean remove_person(int id) {
		return persons.removePerson(id);
	}

	@GetMapping("/get_person")
	Person get_person(int id) {
		return persons.getPerson(id);
	}

	@PostMapping("/update_name")
	Boolean update_name(int id, String name) {
		return persons.updateName(id, name);
	}

	public static void main(String[] args) {
		SpringApplication.run(PersonsRestController.class, args);
	}

}
