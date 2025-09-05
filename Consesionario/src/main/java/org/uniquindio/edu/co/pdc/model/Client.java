package org.uniquindio.edu.co.pdc.model;

public class Client extends People {

    private boolean member;
    private CLevel cLevel;
    private String shippingAddress;

    private Client(Builder builder){
        super(builder);
        this.cLevel = builder.cLevel;
        this.shippingAddress = builder.shippingAddress;
    }

    public static class Builder extends People.Builder<Builder> {

        private CLevel cLevel;
        private String shippingAddress;

        public Builder cLevel(CLevel cLevel){
            this.cLevel = cLevel;
            return self();
        }

        public Builder shippingAddress(String shippingAddress){
            this.shippingAddress = shippingAddress;
            return self();
        }

        @Override
        protected Builder self() {
            return this;
        }

        @Override
        public Client build() {
            return new Client(this);
        }
    }
}
