package cl.dany.example.models;

public class Credential {
    private String deparment,jobTitle,name;

    public Credential() {
    }

    public Credential(String deparment, String jobTitle, String name) {
        this.deparment = deparment;
        this.jobTitle = jobTitle;
        this.name = name;
    }

    public String getDeparment() {
        return deparment;
    }

    public void setDeparment(String deparment) {
        this.deparment = deparment;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
