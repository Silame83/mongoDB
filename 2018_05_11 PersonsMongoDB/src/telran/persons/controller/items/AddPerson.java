package telran.persons.controller.items;

import java.time.LocalDate;

import telran.persons.dao.IPersonsDao;
import telran.persons.dto.Person;
import telran.view.InputOutput;

public class AddPerson extends PersonItem {

	public AddPerson(InputOutput inputOtput, IPersonsDao modifyPerson) {
		super(inputOtput, modifyPerson);
	}

	@Override
	public String displayedName() {
		return "Adding person";
	}

	@Override
	public void action() {
		Person person = enterPerson();
		Boolean res = modifyPerson.addPerson(person);
		inputOutput.displayLine(res);
	}

	private Person enterPerson() {
		int id = inputOutput.getInteger("Enter ID: ");
		String name = inputOutput.getString("Enter name: ");
		LocalDate birthdate = inputOutput.getDate("Enter your birthday: ", "YYYY-mm-dd");
		return new Person(id, name, birthdate);
	}

}
