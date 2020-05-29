package org.example;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Supplier {

    private String supplierName;
    private String supplierNum;
    private String supplierLoc;
    private String typeofGoods;

    private Supplier(String supplierName, String supplierNum, String supplierLoc, String typeofGoods) {
        this.supplierName=supplierName;
        this.supplierNum=supplierNum;
        this.supplierLoc=supplierLoc;
        this.typeofGoods=typeofGoods;

    }
    static class SupplierBuilder {
        private String supplierName;
        private String supplierNum;
        private String supplierLoc;
        private String typeofGoods;

        private List<Goods>goodsList;
        public SupplierBuilder(String supplierName, String supplierLoc) {
            this.supplierName=supplierName;
            this.supplierLoc=supplierLoc;
            this.supplierNum="";
                for(int i=0; i<7; i++) {
                    this.supplierNum=this.supplierNum.concat(String.valueOf(ThreadLocalRandom.current().nextInt(0, 9)));
                }
                goodsList.add(new Goods(typeofGoods));


        }
        public SupplierBuilder setSupplierNum(String supplierNum) {
            this.supplierNum=supplierNum;
            return this;
        }
        public SupplierBuilder setTypeofGoods(String typeofGoods) {
            this.typeofGoods=typeofGoods;
            return this;
        }
        public Supplier build() {
            return new Supplier(this.supplierName, this.supplierNum, this.supplierLoc, this.typeofGoods);

        }
        @Override
        public String toString() {
            return "Supplier{" +
                    "supplierName='" + supplierName + '\'' +
                    ", supplierNum='" + supplierNum + '\'' +
                    ", supplierLoc=" + supplierLoc + '\'' +
                    ", typeofGoods=" + typeofGoods +
                    '}';
        }
    }
}
