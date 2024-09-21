import java.io.*;

public class SerializationExample {
    public static void main(String[] args) {
            Person obj = new Person("pintu", 25);
        try (FileOutputStream fos = new FileOutputStream("person.ser");
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(obj);
            System.out.println("Serialization completed. Object saved to person.ser file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (FileInputStream fis = new FileInputStream("person.ser");
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            Person deserializedPerson = (Person) ois.readObject();
            System.out.println("Deserialization completed. Deserialized object:");
            System.out.println("Name: " + deserializedPerson.getName());
            System.out.println("Age: " + deserializedPerson.getAge()); // age field will be 0 due to transient
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
