package org.example;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Supplier {

    private String supplierName;
    private String supplierNum;
    private String supplierLoc;
    private Goods typeofGoods;

    private Supplier(String supplierName, String supplierNum, String supplierLoc, Goods typeofGoods) {
        this.supplierName=supplierName;
        this.supplierNum=supplierNum;
        this.supplierLoc=supplierLoc;
        this.typeofGoods=typeofGoods;

    }
    static class SupplierBuilder {
        private String supplierName;
        private String supplierNum;
        private String supplierLoc;
        private Goods typeofGoods;

        public SupplierBuilder(String supplierName, String supplierLoc) {
            this.supplierName=supplierName;
            this.supplierLoc=supplierLoc;
            this.supplierNum="";
                for(int i=0; i<7; i++) {
                    this.supplierNum=this.supplierNum.concat(String.valueOf(ThreadLocalRandom.current().nextInt(0, 9)));
                }

        }
        public SupplierBuilder setSupplierNum(String supplierNum) {
            this.supplierNum=supplierNum;
            return this;
        }
        public SupplierBuilder setTypeofGoods(Goods typeofGoods) {
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
