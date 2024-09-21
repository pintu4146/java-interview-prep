import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Person{
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

   private int age;
   private String name;
}

public class SortByAge {
    public static void main(String[] args) {

        ArrayList<Person> personArrayList = new ArrayList<>();
        for(int i=20; i<26; i++){
            personArrayList.add(new Person(i, "pin"+i));
        }
       List<Person> largestAge = personArrayList
               .stream()
               .sorted(Comparator.comparing(Person::getAge, Comparator.reverseOrder()))
               .toList();
        for(Person ele: largestAge){
            System.out.println(ele.toString());
        }
    }
}
