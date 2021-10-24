package demo;

public record ExampleObjectRecord(String name) {

    public static ExampleObjectRecord fromJson(String json) {
        return JsonUtils.fromJson(json); // compiler error
        /*
   java: method fromJson in class demo.JsonUtils cannot be applied to given types;
  required: java.lang.Class<T>,java.lang.String
  found:    java.lang.String
  reason: cannot infer type-variable(s) T
    (actual and formal argument lists differ in length)
         */
    }
}
