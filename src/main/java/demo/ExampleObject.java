package demo;

record ExampleObject(String name) {
    public static ExampleObject fromJson(String json) {
        return JsonUtils.fromJson(json);
    }
}