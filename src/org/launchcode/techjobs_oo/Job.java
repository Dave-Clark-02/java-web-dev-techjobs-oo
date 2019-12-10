package org.launchcode.techjobs_oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.
//    public Job(String product_tester, Employer acme, Location desert, PositionType quality_control, CoreCompetency persistence) {
    public Job() {
        id = nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.
    @Override
    public String toString() {
        String run = "\n" + "ID: " + id + "\n";

        if (name.equals("")) {
            run += "Name: Data not avaliable" + "\n";
        } else {
            run += "Name: " + name + "\n";
        }
        if (employer.getValue().equals("")) {
            run += "Employer: Data not available" + "\n";
        } else {
            run += "Employer: " + employer.getValue() + "\n";
        }
        if (location.getValue().equals("")) {
            run += "Location: Data not avaliable" + "\n";
        } else{
            run += "Location: " + location.getValue() + "\n";
        }
        if (positionType.getValue().equals("")) {
            run += "PositionType: Data not avaliable" + "\n";
        } else{
            run += "PositionType: " + positionType.getValue() + "\n";
        }
        if (coreCompetency.getValue().equals("")) {
            run += "CoreCompetency: Data not available" + "\n";
        } else{
            run += "CoreCompetency: " + coreCompetency.getValue() + "\n";
        }
        return run;
//                "ID: " + id + "\n" +
//                "Name: " + name + "\n" +
//                "Employer: " + employer.getValue() + "\n" +
//                "Location: " + location.getValue() + "\n" +
//                "Position Type: " + positionType.getValue() + "\n" +
//                "Core Competency: " + coreCompetency.getValue() + "\n";

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return id == job.id &&
                Objects.equals(name, job.name) &&
                Objects.equals(employer, job.employer) &&
                Objects.equals(location, job.location) &&
                Objects.equals(positionType, job.positionType) &&
                Objects.equals(coreCompetency, job.coreCompetency);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, employer, location, positionType, coreCompetency);
    }

    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public Employer getEmployer() {
        return employer;
    }

    public Location getLocation() {
        return location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }
}


