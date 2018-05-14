package telran.persons.controller.items;

import telran.persons.dao.IPersonsDao;
import telran.view.InputOutput;

public class UpdatePerson extends PersonItem {

	public UpdatePerson(InputOutput inputOutput, IPersonsDao modifyPerson) {
		super(inputOutput, modifyPerson);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String displayedName() {
		return "Update person's name";
	}

	@Override
	public void action() {
		int id = inputOutput.getInteger("Enter ID person: ");
		String newName = inputOutput.getString("Enter new name: ");
		Boolean res = modifyPerson.updateName(id, newName);
		inputOutput.displayLine(res);
	}

}
