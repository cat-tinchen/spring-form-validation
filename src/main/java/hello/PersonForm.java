package hello;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class PersonForm {

    @NotNull(message = "{person.name.NotNull}")
    @Size(min=2, max=30, message = "{person.name.Size}")
    private String name;

    @NotNull(message = "{person.age.NotNull}")
    @Min(value = 18, message = "{person.age.Min}")
    private Integer age;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String toString() {
        return "Person(Name: " + this.name + ", Age: " + this.age + ")";
    }
}
