package telran.persons.controller.items;

import telran.persons.dao.IPersonsDao;
import telran.view.AbstractItem;
import telran.view.InputOutput;

public abstract class PersonItem extends AbstractItem {
	protected IPersonsDao modifyPerson;

	public PersonItem(InputOutput inputOutput, IPersonsDao modifyPerson) {
		super(inputOutput);
		this.modifyPerson = modifyPerson;
	}

}
