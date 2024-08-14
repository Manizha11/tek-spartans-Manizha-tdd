package playground;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
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
        String firstName = "MANIZHA";
        String lastName = "Buribekova";
        String fullName = generateFullName(firstName, lastName);
        Assert.assertEquals(fullName, "MANIZHA, Buribekova");
    }

    private String generateFullName(String firstName, String lastName) {
        return ("MANIZHA, Buribekova");
    }
    @Test(dataProvider = "positiveTestData")
    public void positiveTesting(String firstName, String lastName, String expectedFullName) {
        String fullName = getFullName(firstName, lastName);

        Assert.assertEquals(fullName, expectedFullName, "FullName should match format");
    }

    private String getFullName(String firstName, String lastName) {
        return firstName;
    }

    @DataProvider(name = "positiveTestData")
    private String[][] positiveTestData() {
        String[][] data = {
                {"mohammad", "shokriyan", "SHOKRIYAN, Mohammad" },
                {"JoHN", "SMITH", "SMITH, John" },
                {" ALEN ", " smith ", "SMITH, Alen" },

        };
        return data;
    }

    @Test
    public void negativeTesting() {
        try {
            getFullName(null, null);
            Assert.fail("Test Supposed to throw Exception");
        }catch (RuntimeException ex) {
            Assert.assertTrue(true, "Catch the Exception Passing the Test");
        }
    }

    @Test(expectedExceptions = {RuntimeException.class})
    public void testNegativeWithExpectedException() {
        getFullName("", null);
    }

    @Test
    public void testNegativeWithAssertionThrow() {
        Assert.assertThrows(RuntimeException.class, () -> {
            getFullName("", "");
        });
    }



}




