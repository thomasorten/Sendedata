package as.koding.sendedata;

import java.util.ArrayList;

/**
 * Created by thomasorten on 23.01.2018.
 */

public class AdresseBok {

    private ArrayList<Person> persons = new ArrayList<Person>();

    public void addPerson(Person incomingPerson) {
        persons.add(incomingPerson);
    }

    public ArrayList<Person> getPersons() {
        return persons;
    }

    public Person getPersonNumber(int index) {
        return persons.get(index);
    }
}
