package automation_test;
/**
 * 5.1 Create the class with the name "ArrayList_Q5"
 * 5.2	Create the main method
 * 5.3 Declare the string type ArrayList and add the values "Scrum", "Java", "Jira", "Selenium", "Cucumber", "Postman", “Rest Assured”
 * 5.4 Print the list using a forEach loop.
 */

import java.util.ArrayList;

//5.1 Create the class with the name "ArrayList_Q5"
public class ArrayList_Q5 {
    // 5.2	Create the main method
    public static void main(String[] args) {

        //5.3 Declare the string type ArrayList and add the values "Scrum", "Java", "Jira", "Selenium", "Cucumber", "Postman", “Rest Assured”
        ArrayList<String> ProgrammingLang = new ArrayList();
        ProgrammingLang.add("Scrum");
        ProgrammingLang.add("Java");
        ProgrammingLang.add("Jira");
        ProgrammingLang.add("Selenium");
        ProgrammingLang.add("Cucumber");
        ProgrammingLang.add("Postman");
        ProgrammingLang.add("Rest Assured");

        //5.4 Print the list using a forEach loop.

        for(String programme : ProgrammingLang){
            System.out.println(programme);
        }
    }
}
