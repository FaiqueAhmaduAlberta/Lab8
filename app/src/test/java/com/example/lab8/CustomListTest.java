package com.example.lab8;


import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;


//import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {

    private CustomList list;
    /**
     * create a mocklist for my citylist
     * @return
     */
    public CustomList MockCityList(){
        list = new CustomList(null,new ArrayList<>());
        return list;
    }
    @Test
    public void addCityTest(){
        list = MockCityList();
        int listSize = list.getCount();
        list.addCity(new City("Estevan", "SK"));
        assertEquals(list.getCount(),listSize + 1);
    }

    @Test
    public void hasCityTest(){
    list = MockCityList();
    City thisCity = new City("Estevan", "SK");
    list.addCity(thisCity);
    Assertions.assertTrue(list.hasCity(thisCity));
    }

    @Test
    public void deleteCityTest(){
        list = MockCityList();
        City thisCity = new City("Estevan", "SK");
        list.addCity(thisCity);
        list.deleteCity(thisCity);
        Assertions.assertFalse(list.hasCity(thisCity));
    }
    /**
    public void countCitiesTest() {
        list = MockCityList();
        City thisCity = new City("Estevan", "SK");
        list.addCity(thisCity);
        assertEquals(list.countCities(),1);
    }*/
}