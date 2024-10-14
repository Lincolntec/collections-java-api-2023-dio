package list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PersonOrdering {
    private List<Person> personList;

    public PersonOrdering() {
        this.personList = new ArrayList<>();
    }

    public void addPerson(String name, int age, double height){
        personList.add(new Person(name, age, height));
    }

    public List<Person> sortByAge() {
        List<Person> peopleByAge = new ArrayList<>(personList);
        Collections.sort(peopleByAge);
        return peopleByAge;
    }

    public List<Person> sortByHeight() {
        List<Person> peopleByHeight = new ArrayList<>(personList);
        Collections.sort(peopleByHeight, new ComparatorByHeighet());
        return peopleByHeight;
    }

    public static void main(String[] args) {
        PersonOrdering personOrdering = new PersonOrdering();
        personOrdering.addPerson("Name One", 20, 1.56);
        personOrdering.addPerson("Name Two", 30, 1.80);
        personOrdering.addPerson("Name Three", 25, 1.70);
        personOrdering.addPerson("Name Four", 17, 1.56);

        System.out.println(personOrdering.sortByAge());
        System.out.println(personOrdering.sortByHeight());
    }

}



