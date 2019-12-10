package org.launchcode.techjobs_oo.Tests;

import org.junit.Before;
import org.junit.Test;


import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.*;

public class JobTest {
    Job testjob;
    Job testjob2;
    Job testjob3;
    Job testjob4;
    Job testjob5;
    Job testjob6;

    @Before
    public void JobTest() {
        testjob = new Job();
        testjob2 = new Job();
        testjob3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        testjob4 = new Job("IT", new Employer("UPS"), new Location("Downtown"), new PositionType("Full Stack"), new CoreCompetency("stuff"));
        testjob5 = new Job("", new Employer("BigBox"), new Location("Metro"), new PositionType("IT"), new CoreCompetency("endurance"));
        testjob6 = new Job("", new Employer("ACME"), new Location("City"), new PositionType("Developer"), new CoreCompetency("Persistence"));
    }




    @Test
    public void testSettingJobId() {
        assertEquals(testjob.getId(), testjob2.getId(), 1);
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        assertTrue(testjob3 instanceof Job);

        assertTrue(testjob3.getEmployer() instanceof Employer);

        assertTrue(testjob3.getLocation() instanceof Location);

        assertTrue(testjob3.getPositionType() instanceof PositionType);

        assertTrue(testjob3.getCoreCompetency() instanceof CoreCompetency);

        assertEquals("Product tester", testjob3.getName());

        assertEquals("ACME", testjob3.getEmployer().getValue());

        assertEquals("Desert", testjob3.getLocation().getValue());

        assertEquals("Quality control", testjob3.getPositionType().getValue());

        assertEquals("Persistence", testjob3.getCoreCompetency().getValue());

    }

    @Test

    public void testJobsForEquality() {

//        int jobA = testjob3.getId();

//        int jobB = testjob4.getId();

        assertFalse(testjob3.equals(testjob4));

    }


    @Test

    public void testToString() {

        assertEquals("\n" +
                "ID: " + testjob3.getId() + "\n" +
                "Name: " + "Product tester" + "\n" +
                "Employer: " + "ACME" + "\n" +
                "Location: " + "Desert" + "\n" +
                "Position Type: " + "Quality control" + "\n" +
                "Core Competency: " + "Persistence" +
                "\n", testjob3.toString());

        System.out.println("test_job6: " + testjob6);

        assertEquals("\n" +
                "ID: " + testjob6.getId() + "\n" +
                "Name: " + "Data not avaliable" + "\n" +
                "Employer: " + "ACME" + "\n" +
                "Location: " + "City" + "\n" +
                "Position Type: " + "Developer" + "\n" +
                "Core Competency: " + "Persistence" +
                "\n", testjob6.toString());

    }
}




