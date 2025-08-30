package org.uniquindio.edu.co.pdc.app;

import org.uniquindio.edu.co.pdc.model.*;


public class Main {
    public static void main(String[] args) throws Exception {

        Dealership dealership1 = new Dealership.Builder()
                .name("BMW")
                .nit("ramdom nit 123 ")
                .build();

        Vehicle v1 = dealership1.registerVehicle("CAR", "LCS 525", "BMW", "2026");

        Client c1 = dealership1.registerClient("Sebas", "1059", CLevel.VIP, "calle");
        Employee e1 = dealership1.registerEmployee("Sebas", "1058", "102", "sell", 100000);
        System.out.println(dealership1);
        System.out.println(v1);
        System.out.println(c1);
        System.out.println(e1);
        System.out.println(e1.getName());
    }
}
