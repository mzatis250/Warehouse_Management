package org.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

public class Employees {
    private String name;
    private UUID id;
    private Date birth_date;
    private String tax_num;
    private String address;
    ArrayList<Enum> workers=new ArrayList<>();
    public Employees(String name, UUID id, Date birth_date, String tax_num, String address) {
        this.name=name;
        this.id=id;
        this.birth_date=birth_date;
        this.tax_num=tax_num;
        this.address=address;

    }
    public void AddEmployees() {
        for (int i=0; i<3;i++) {
            workers.add(Permission.Admin);
            workers.add(Permission.Normal_worker);
            workers.add(Permission.Student);
        }
    }

}
