package org.uniquindio.edu.co.pdc.model;

public abstract class Person {

    protected String name;
    protected String id;

    protected Person(Builder<?> builder){
        this.name = builder.name;
        this.id = builder.id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                '}';
    }

    public abstract static class Builder<T extends Builder<T>>{

        private String name;
        private String id;

        public T name(String name){
            this.name = name;
            return self();
        }

        public T id(String id){
            this.id = id;
            return self();
        }

        protected abstract T self();

        public abstract Person build();
    }
}
