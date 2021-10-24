package demo;

public class DemoMain {

    public static void main(String[] args) {

        ExampleObject exampleObject = ExampleObject.fromJson("""
                {"name": "Test"}""");
        System.out.println(exampleObject);

    }
}
