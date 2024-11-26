import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class MyCollectionsTest {

    @Test
    public void testBinarySearchWithComparator() {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Alice", 25));
        people.add(new Person("Bob", 30));
        people.add(new Person("Charlie", 35));

        assertEquals(0, MyCollections.binarySearch(people, new Person("Alice", 25),
                new AgeComparator()));
        assertEquals(-4, MyCollections.binarySearch(people, new Person("Mike", 30),
                new AgeComparator()));
    }

    @Test
    public void testBinarySearchWithComparable() {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Bob", 25));
        people.add(new Person("Alice", 30));

        // Теперь явно сортируем список перед поиском
        Collections.sort(people);

        assertEquals(0, MyCollections.binarySearch(people, new Person("Alice", 30)));
        assertEquals(-3, MyCollections.binarySearch(people, new Person("Mike", 30)));
    }

}

// Также создаем отдельный компаратор по возрасту человека
class AgeComparator implements Comparator<Person> {
    @Override
    public int compare(Person p1, Person p2) {
        return p1.getAge() - p2.getAge();
    }
}

// Создаем класс человека для проверки работы с Generic
// Класс имплементируют интерфейс Comparable с методом compareTo по имени
class Person implements Comparable<Person> {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Person anotherPerson) {
        return this.name.compareTo(anotherPerson.name);
    }
}
