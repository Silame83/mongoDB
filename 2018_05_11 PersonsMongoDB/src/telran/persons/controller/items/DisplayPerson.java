package telran.persons.controller.items;

import telran.persons.dao.IPersonsDao;
import telran.view.InputOutput;

public class DisplayPerson extends PersonItem {

	public DisplayPerson(InputOutput inputOutput, IPersonsDao modifyPerson) {
		super(inputOutput, modifyPerson);
	}

	@Override
	public String displayedName() {
		return "Display data about person";
	}

	@Override
	public void action() {
		int person = inputOutput.getInteger("Enter ID person");
		if (person == 0) {
			inputOutput.displayLine("Wrong ID person" + person);
		} else {
			inputOutput.displayLine(person);
		}
	}

}
