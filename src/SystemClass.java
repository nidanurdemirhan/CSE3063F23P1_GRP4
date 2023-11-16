// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.


import org.json.JSONException;

import java.io.IOException;
import java.util.ArrayList;

public class SystemClass {
    private SystemDomain domain;
    private Person currentUser;

    public SystemClass() throws JSONException, IOException {
        domain = new SystemDomain();
        UserInfo me = new UserInfo("o150120042","nida123");
        login(me);
    }

    public void login(UserInfo userInfo) {
        boolean userFound = false;
        if (userInfo.getUsername().charAt(0) == 'o') {
            ArrayList<Student> students = domain.getStudents();
            for (Student student : students) {
                if (("o" + student.getStudentId().getId()).equals(userInfo.getUsername()) &&
                        student.getPassword().getPassword().equals(userInfo.getPassword())) {
                    setCurrentUser(student);
                    userFound = true;
                    // this.getUserInterface().setCurrentPage(PageType.MAIN_MENU_PAGE_STUDENT);
                }
            }
        } else if (userInfo.getUsername().charAt(0) == 'a') {
            ArrayList<Advisor> advisors = domain.getAdvisors();
            for (Advisor advisor : advisors) {
                if (("o" + advisor.getId().getId()).equals(userInfo.getUsername()) &&
                        advisor.getPassword().getPassword().equals(userInfo.getPassword())) {
                    setCurrentUser(advisor);
                    userFound = true;
                    // this.getUserInterface().setCurrentPage(PageType.MAIN_MENU_PAGE_ADVISOR);
                }
            }
        } if (!userFound) {
            System.out.println("Username/Password incorrect.");
        }
    }

    public SystemDomain getDomain() {
        return domain;
    }

    public Person getCurrentUser() {
        return currentUser;
    }

    public void setCurrentUser(Person currentUser) {
        this.currentUser = currentUser;
    }
}

