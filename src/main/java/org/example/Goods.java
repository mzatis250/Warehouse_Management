package org.example;

import java.util.UUID;
import java.util.concurrent.ThreadLocalRandom;

public class Goods {
    private String nameofGoods;
    private String typeofGoods;
    private int availableAmount;
    private String goodsId;
    private double cost;
    public Goods(String nameofGoods, String typeofGoods, int availableAmount, double cost) {
        this.nameofGoods=nameofGoods;
        this.typeofGoods=typeofGoods;
        this.availableAmount=availableAmount;
        for(int i=0; i<7; i++) {
            this.goodsId=this.goodsId.concat(String.valueOf(ThreadLocalRandom.current().nextInt(0, 9)));
        }

        this.cost=cost;
    }
    public Goods(String typeofGoods) {
        this.typeofGoods=typeofGoods;
    }

}
