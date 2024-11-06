public class Teacher extends Person {
    private String school;
    private String subject;
    private int years;

    public Teacher(String name, String school, String subject, int years) {
        super(name);
        this.school = school;
        this.subject = subject;
        this.years = years;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getYears() {
        return years;
    }

    public void incYears() {
        years++;
    }

    @Override
    void describeRole() {
        System.out.println("Teacher " + getName() + " teaches " + getSubject() + " at " + getSchool() + " for " + getYears() + " years.");
    }
}
