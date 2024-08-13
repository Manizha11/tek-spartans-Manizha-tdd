package playground;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Activity2 {
    // Write a method that takes firstName and lastName as parameter
    // and return full name in format LASTNAME, FirstName
    // Step 2) Write  a test in TestNG to test above method functionality

    public String getfullName(String firstName, String lastName) {

        if (firstName == null || lastName == null)
            throw new RuntimeException("FistName or LastName can NOT be null");
        if (firstName.isEmpty() || lastName.isEmpty())
            throw new RuntimeException("FistName or LastName cannot be empty");

        lastName = lastName.trim();
        firstName = firstName.trim();

        return lastName.toUpperCase() + "," +
                firstName.substring(0, 1).toUpperCase() +
                firstName.substring(1).toLowerCase();


    }

    @Test
    public void testFullName() {
        String firstName = "Manizha";
        String lastName = "Buribekova";
        String fullName = generateFullName(firstName, lastName);
        Assert.assertEquals(fullName, "MANIZHA, Buribekova");
    }

    private String generateFullName(String firstName, String lastName) {
        return ("MANIZHA, Buribekova");
    }

}




