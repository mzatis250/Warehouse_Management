package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Employees {
    private String name;
    private UUID id;
    ArrayList<Enum> workers=new ArrayList<>();
    public Employees(String name, UUID id) {
        this.name=name;
        this.id=id;


    }
    public void AddEmployees() {
        for (int i=0; i<3;i++) {
            workers.add(Permission.Admin);
            workers.add(Permission.Normal_worker);
            workers.add(Permission.Student);
        }
    }

}
