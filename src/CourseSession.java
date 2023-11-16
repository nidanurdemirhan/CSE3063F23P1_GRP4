import java.util.ArrayList;

public class CourseSession extends Course{
	
	private Id sessionID;


	public CourseSession(Id courseID, String courseName, int quota, int year, String day_hour,ArrayList<Student> studentList
			Lecturer lecturer, Id sessionID) {
		super(courseID, courseName, quota, year, day_hour,studentList, lecturer);
		this.sessionID = sessionID;
	}
	
	public Id getSessionID() {
		return sessionID;
	}
	public void setSessionID(Id sessionID) {
		this.sessionID = sessionID;
	}

	
}