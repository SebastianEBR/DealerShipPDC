package org.uniquindio.edu.co.pdc.model;

public class Employee extends People {

    private String code;
    private String job;
    private double salary;

    private Employee(Builder builder){
        super(builder);
        this.job = builder.job;
        this.salary = builder.salary;
    }

    public static class Builder extends People.Builder<Builder> {

        private String code;
        private String job;
        private double salary;

        public Builder code(String code) {
            this.code = code;
            return this;
        }

        public Builder job(String job) {
            this.job = job;
            return this;
        }

        public Builder salary(double salary) {
            this.salary = salary;
            return this;
        }

        @Override
        protected Builder self() {
            return this;
        }

        @Override
        public Employee build() {
            return new Employee(this);
        }
    }
}
