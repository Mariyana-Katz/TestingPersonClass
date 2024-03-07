package com.zipcodewilmington.person;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 2/12/18.
 */
public class TestPerson {
    @Test
    public void testDefaultConstructor() {
        // Given
        String expectedName = "";
        Integer expectedAge = Integer.MAX_VALUE;
        Double expectedHeight = Double.MAX_VALUE;
        Double expectedWeight = Double.MAX_VALUE;
        Integer expectedBirthYear = Integer.MAX_VALUE;


        // When
        Person person = new Person();

        // Then
        String actualName = person.getName();
        Integer actualAge = person.getAge();
        Double actualHeight = person.getHeight();
        Double actualWeight = person.getWeigh();
        Integer actualbirthYear = person.getBirthYear();


        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedAge, actualAge);
        Assert.assertEquals(expectedHeight, actualHeight);
        Assert.assertEquals(expectedWeight, actualWeight);
        Assert.assertEquals(expectedBirthYear,actualbirthYear);
    }

    @Test
    public void testConstructorWithName() {
        // Given
        String expected = "Leon";

        // When
        Person person = new Person(expected);

        // Then
        String actual = person.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testConstructorWithAge() {
        // Given
        Integer expected = 5;

        // When
        Person person = new Person(expected);

        // Then
        Integer actual = person.getAge();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testConstructorWithHeightAndWeight() {
        // Given
        Double expectedHeight = 120.5;
        Double expectedWeight = 120.5;

        // When
        Person person = new Person(expectedHeight, expectedWeight);

        // Then
        Double actualHeight = person.getHeight();
        Double actualWeight = person.getWeigh();

        Assert.assertEquals(expectedHeight, actualHeight);
        Assert.assertEquals(expectedWeight, actualWeight);
    }

    @Test
    public void testConstructorWithBirthYear() {
        // Given
        Integer expected = 2000;

        // When
        Person person = new Person(expected);

        // Then
        Integer actual = person.getBirthYear();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testConstructorWithAllParams() {
        // Given
        Integer expectedAge = 5;
        String expectedName = "Leon";
        Double expectedHeight = 120.5;
        Double expectedWeight = 120.5;
        Integer expextedBirthYear = 2000;


        // When
        Person person = new Person(expectedName, expectedAge, expectedHeight, expectedWeight, expextedBirthYear);

        // Then
        Integer actualAge = person.getAge();
        String actualName = person.getName();
        Double actualHeight = person.getHeight();
        Double actualWeight = person.getWeigh();
        Integer actualBirthYear = person.getBirthYear();

        Assert.assertEquals(expectedAge, actualAge);
        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedHeight, actualHeight);
        Assert.assertEquals(expectedWeight, actualWeight);
        Assert.assertEquals(expextedBirthYear, actualBirthYear);




    }

    @Test
    public void testSetName() {
        // Given
        Person person = new Person();
        String expected = "Leon";

        // When
        person.setName(expected);
        String actual = person.getName();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetAge() {
        // Given
        Person person = new Person();
        Integer expected = 5;

        // When
        person.setAge(expected);

        // Then
        Integer actual = person.getAge();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetHeight() {
        // Given
        Person person = new Person();
        Double expected = 5.6;

        // When
        person.setHeight(expected);
        Double actual = person.getHeight();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetWeight() {
        // Given
        Person person = new Person();
        Double expected = 120.5;

        // When
        person.setWeight(expected);
        Double actual = person.getWeigh();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetBirthYear() {
        // Given
        Person person = new Person();
        Integer expected = 2000;

        // When
        person.setBirthYear(expected);
        Integer actual = person.getBirthYear();

        // Then
        Assert.assertEquals(expected, actual);
    }
}
