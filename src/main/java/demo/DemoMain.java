package demo;

public class DemoMain {

    public static void main(String[] args) {

        System.out.println(ExampleObjectPojo.fromJson("{\"name\": \"Test\"}"));

        System.out.println(ExampleObjectRecord.fromJson("{\"name\": \"Test\"}"));

    }
}
