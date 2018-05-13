package telran.persons.controller.items;

import telran.persons.dao.IPersonsDao;
import telran.view.InputOutput;

public class RemovePerson extends PersonItem {

	public RemovePerson(InputOutput inputOutput, IPersonsDao modifyPerson) {
		super(inputOutput, modifyPerson);
	}

	@Override
	public String displayedName() {
		return "Removing person";
	}

	@Override
	public void action() {
		int person = inputOutput.getInteger("Enter ID person: ");
		boolean res = modifyPerson.removePerson(person);
		inputOutput.displayLine(res);
	}

}
