package com.example.lab8;


import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;


//import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {
    @Test
    public void add(){
        CustomList mocklist;
        mocklist =  new CustomList(null, new ArrayList<City>());
        City city = new City("NEW CITY", "NEW PROVINCE");
        mocklist.addCity(city);
        assertTrue( mocklist.countCities() == 1);
    }

    @Test
    public void has() {
        CustomList mocklist;
        mocklist =  new CustomList(null, new ArrayList<City>());
        City city = new City("NEW CITY", "NEW PROVINCE");
        mocklist.addCity(city);
        assertEquals(true, mocklist.hasCity(city));
    }
    @Test
    public void delete() {
        CustomList mocklist;
        mocklist =  new CustomList(null, new ArrayList<City>());
        City city = new City("NEW CITY", "NEW PROVINCE");
        mocklist.addCity(city);
        mocklist.delete(city);
        assertEquals(false, mocklist.hasCity(city));
    }
}
