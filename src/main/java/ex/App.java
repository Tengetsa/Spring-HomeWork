package ex;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class App {

    public static void main(String[] args) {
        Gson gson = new GsonBuilder().create();
        Person person = new Person("Sergei", "Ivanov", 21);
        System.out.println("Person: " + person);

        String jsonString = gson.toJson(person);
        System.out.println("JSON: " + jsonString);

        Person person2 = gson.fromJson(jsonString, Person.class);
        System.out.println("fromJson: " + person2);

   }
}