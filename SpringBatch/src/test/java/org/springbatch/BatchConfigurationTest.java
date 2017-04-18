package org.springbatch;

import static org.junit.Assert.*;

/**
 * Created by cenxui on 4/18/17.
 */
public class BatchConfigurationTest {
    @org.junit.Before
    public void setUp() throws Exception {
        System.out.println("set up");
    }

    @org.junit.Test
    public void step1() throws Exception {
        System.out.println("test");
    }

    @org.junit.After
    public void job() throws Exception {
        System.out.println("after");
    }


}