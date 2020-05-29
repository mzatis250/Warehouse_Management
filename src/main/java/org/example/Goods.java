package org.example;

import java.util.UUID;

public class Goods {
    private String nameofGoods;
    private String typeofGoods;
    private int availableAmount;
    private UUID goodsId;
    private boolean isAvailable;
    private int cost;
    public Goods(String nameofGoods, String typeofGoods, int availableAmount, UUID goodsId, boolean isAvailable) {
        this.nameofGoods=nameofGoods;
        this.typeofGoods=typeofGoods;
        this.availableAmount=availableAmount;
        this.goodsId=goodsId;
        this.isAvailable=isAvailable;
    }
    public Goods(String typeofGoods) {
        this.typeofGoods=typeofGoods;
    }
}
