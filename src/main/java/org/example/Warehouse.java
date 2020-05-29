package org.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

public class Warehouse {

    private String warehouseName;
    private UUID warehouseId;
    private String location;
    private Warehouse(String warehouseName, UUID warehouseId, String location) {
        this.warehouseName=warehouseName;
        this.warehouseId=warehouseId;
        this.location=location;

    }
    private List<Employees> employeesList=new ArrayList<>();
    public String getWarehouseName() {
        return warehouseName;
    }
    public List<Employees> getEmployeesList() {return  employeesList;}
    public UUID getWarehouseId() {
        return warehouseId;
    }

    public String getLocation() {
        return location;
    }
    private List<Warehouse> warehouses = new ArrayList<>();
    public void addWarehouse(Warehouse warehouse) {this.warehouses.add(warehouse);}
    public void removeWarehouse(Warehouse warehouse) {this.warehouses.add(warehouse);}
    private static Warehouse warehouse= new Warehouse("Keleti", UUID.randomUUID(), "Budapest");
    public void addEmployees(String empname, UUID empid, Date birth_date, String tax_num, String address){
        employeesList.add(new Employees(empname, empid, birth_date, tax_num, address));
    }
}
