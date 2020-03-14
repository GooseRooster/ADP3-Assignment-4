package org.example;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

import java.util.*;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test :-)
     */

    public String mapMethod() {
        String output = "Student Records are as follows, unsorted: " + "\n";
        Map<Integer, String> mapTest = new HashMap<Integer, String>();
        mapTest.put(218006098, "Cameron Mostert");
        mapTest.put(218060033, "Sean Trainor");
        mapTest.put(265784565, "Angus Young");
        mapTest.put(234567894, "Malcolm Young");

        Set<Map.Entry<Integer, String>> st = mapTest.entrySet();
        for (Map.Entry<Integer, String> me : st) {
            output += me.getKey() + " : " +  me.getValue() + "\n";
        }

        output += "\n" + "Student records are as follows, sorted: " + "\n";
        Map<Integer, String> mapTestSorted = new TreeMap<Integer, String>(mapTest);
        Set<Map.Entry<Integer, String>> ss = mapTestSorted.entrySet();
        for (Map.Entry<Integer, String> me : ss) {
            output += me.getKey() + " : " +  me.getValue() + "\n";
        }
        return output;
    }
    public String setMethod() {
        String output = "Grocery list as follows, unsorted: " + "\n";
        Set<String> setTest = new HashSet<String>();
        setTest.add("Bread");
        setTest.add("Milk");
        setTest.add("Jam");
        setTest.add("Butter");
        setTest.add("Tomatoes");
        setTest.add("Chicken");
        setTest.add("Apples");
        setTest.add("Oranges");

        for (String stuff : setTest) {
            output += stuff + "\n";
        }

        output += "\n" + "Grocery list as follows, sorted: " + "\n";
        Set<String> setTree = new TreeSet<String>(setTest);
        for (String sortedStuff : setTree) {
            output += sortedStuff + "\n";
        }
        return output;
    }

    public String listMethod() {
        String output = "Student names as follows, unsorted: " + "\n";

        List listTest = new Stack();
        listTest.add("Sean Trainor");
        listTest.add("Cameron Mostert");
        listTest.add("Yusrah Soeker");
        listTest.add("Amir Karbelkar");
        listTest.add("Amy Johnston");
        listTest.add("Chris Mbuyi");

        listTest.set(5, "Chris Kitenge");
        listTest.add("Placeholder");
        listTest.remove(6);

        for (int i = 0; i < listTest.size() ; i++) {
            output += listTest.get(i) + "\n";
        }
        Collections.sort(listTest);
        output += "\n" + "Student names as follows, sorted: " + "\n";
        for (int i = 0; i < listTest.size() ; i++) {
            output += listTest.get(i) + "\n";
        }
        return output;
    }


    @Test
    public void mapMethodTest() {
        String output = "Student Records are as follows, unsorted: \n" +
                "265784565 : Angus Young\n" +
                "218006098 : Cameron Mostert\n" +
                "234567894 : Malcolm Young\n" +
                "218060033 : Sean Trainor\n" +
                "\n" +
                "Student records are as follows, sorted: \n" +
                "218006098 : Cameron Mostert\n" +
                "218060033 : Sean Trainor\n" +
                "234567894 : Malcolm Young\n" +
                "265784565 : Angus Young\n";
        Assert.assertEquals(output, mapMethod());
    }

    @Test
    public void setMethodTest() {
        String output = "Grocery list as follows, unsorted: \n" +
                "Apples\n" +
                "Jam\n" +
                "Butter\n" +
                "Chicken\n" +
                "Oranges\n" +
                "Tomatoes\n" +
                "Bread\n" +
                "Milk\n" +
                "\n" +
                "Grocery list as follows, sorted: \n" +
                "Apples\n" +
                "Bread\n" +
                "Butter\n" +
                "Chicken\n" +
                "Jam\n" +
                "Milk\n" +
                "Oranges\n" +
                "Tomatoes\n";
        Assert.assertEquals(output, setMethod());
    }

    @Test
    public void listMethodTest() {
        String output = "Student names as follows, unsorted: \n" +
                "Sean Trainor\n" +
                "Cameron Mostert\n" +
                "Yusrah Soeker\n" +
                "Amir Karbelkar\n" +
                "Amy Johnston\n" +
                "Chris Kitenge\n" +
                "\n" +
                "Student names as follows, sorted: \n" +
                "Amir Karbelkar\n" +
                "Amy Johnston\n" +
                "Cameron Mostert\n" +
                "Chris Kitenge\n" +
                "Sean Trainor\n" +
                "Yusrah Soeker\n";
        Assert.assertEquals(output, listMethod());
    }



}
