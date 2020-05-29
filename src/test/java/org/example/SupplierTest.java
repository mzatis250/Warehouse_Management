<<<<<<< HEAD
package org.example;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SupplierTest {
    Supplier supplier;

    @Before
    public void initClasses(){
        supplier=new Supplier.SupplierBuilder("Nike", "Debrecen").build();
    }

    @Test
    public void checkSupplierBuilder(){
        System.out.println(supplier);
        Assert.assertNotNull(supplier);
    }

    @Test
    public void setSupplierNum() {

    }

    @Test
    public void setTypeofGoods() {

    }

    @Test
    public void build() {
    }

    @Test
    public void testToString() {
    }

    @Test
    public void testToString1() {
    }
=======
package org.example;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SupplierTest {
    Supplier supplier;

    @Before
    public void initClasses(){
        supplier=new Supplier.SupplierBuilder("Nike", "Debrecen").build();
    }

    @Test
    public void checkSupplierBuilder(){
        System.out.println(supplier);
        Assert.assertNotNull(supplier);
    }

    @Test
    public void setSupplierNum() {

    }

    @Test
    public void setTypeofGoods() {

    }

    @Test
    public void build() {
    }

    @Test
    public void testToString() {
    }

    @Test
    public void testToString1() {
    }
>>>>>>> 331e81758f001274e09795594db7f79bec80e3e8
}