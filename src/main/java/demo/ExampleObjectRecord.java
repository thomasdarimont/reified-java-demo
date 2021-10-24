package demo;

public record ExampleObjectRecord(String name) {

    public static ExampleObjectRecord fromJson(String json) {
        return JsonUtils.fromJson(json); // compiler error
    }
}
