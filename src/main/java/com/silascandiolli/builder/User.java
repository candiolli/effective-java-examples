package com.silascandiolli.builder;

public class User {
    private String name;
    private String email;
    private Integer age;
    private String lastName;

    private User(Builder builder) {
        this.name = builder.name;
        this.email = builder.email;
        this.age = builder.age;
        this.lastName = builder.lastName;
    }

    public static class Builder {
        private final String name;
        private final String email;
        private Integer age;
        private String lastName;

        public Builder(String name, String email) {
            this.name = name;
            this.email = email;
        }

        public Builder age(Integer age) {
            this.age = age;
            return this;
        }

        public Builder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public User build(){
            return new User(this);
        }
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public Integer getAge() {
        return age;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
