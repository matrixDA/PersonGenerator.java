import java.time.Year;

/**
 * @author Dinesh Adhikari adhikaridinesh76@gmail.com
 *
 *
 */

public class Person {
    private String firstName;
    private String lastName;
    private String ID;
    private String title;
    private Integer YOB;

    public Person(String firstName, String lastName, String ID, String title, Integer YOB) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ID = ID;
        this.title = title;
        this.YOB = YOB;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getYOB() {
        return YOB;
    }

    public void setYOB(Integer YOB) {
        this.YOB = YOB;
    }

    @Override
    public String toString()
    {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", ID='" + ID + '\'' +
                ", title='" + title + '\'' +
                ", YOB=" + YOB +
                '}';
    }

    /**
     * Method to get the full name from the Person Object
     *
     * @return return the first nd last names as a full name String
     */
    public String getFullName()
    {
        return firstName + " " + lastName;
    }

    /**
     * Method to get the foraml name from the Person Object
     *
     * @return the title, first, and last arranged as a formal name String
     */
    public String getFormalName()
    {
        return title + " " + firstName + " " + lastName;
    }

    //

    /**
     * Get the age as an int assuming that it is for the current year
     *
     * @return the current age
     *
     */
    public int getAge()
    {
        return Integer.parseInt(Year.now().toString()) - YOB;
    }

    /**
     *
     * @param year the year that you want to sue to determine the age of that time
     * @return
     */
    public int getAge(int year)
    {
        return year - YOB;

    }

    /**
     * @return Retruns the object data in CSV format
     */
    public String toCSVRecord()
    {
        return ID + ", " + firstName + ", " + lastName + ", " + title + ", " + YOB;
    }



    /**
     * XML Data for Person
     * <Person>
     *     <firstName>firstName</firstName>
     *     <LastName>lastName</LastName>
     *     <title>title</title>
     *     <YOB>YOB</YOB>
     * </Person>
     *
     */
}



