package demo;

public class ExampleObjectPojo {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static ExampleObjectPojo fromJson(String json) {
        return JsonUtils.fromJson(json);
    }

    @Override
    public String toString() {
        return "ExampleObject{" +
                "name='" + name + '\'' +
                '}';
    }
}