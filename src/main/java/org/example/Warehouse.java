package org.example;

import java.util.UUID;

public class Warehouse {

    private String warehouseName;
    private UUID warehouseId;
    private String location;

    public String getWarehouseName() {
        return warehouseName;
    }

    public UUID getWarehouseId() {
        return warehouseId;
    }

    public String getLocation() {
        return location;
    }
}
