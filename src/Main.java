import java.util.Date;
public class Main {

	public static void main(String[] args) {
		
		//You may test that your code works find here
		//Please check that your code works and has no 
		//compilation problems before to submit
            Student[] students = new Student[2];
            Student stu1 = new Student(1,"stu1",new Date(),25);
            Student stu2 = new Student(2,"stu2",new Date(),26);
            students[0] = stu1;
            students[1] = stu2;
            StudentGroup sg = new StudentGroup(2);
            sg.setStudents(students);
            Student[] getstudents = sg.getStudents();
            //printStudents(getstudents);
            //Student getstudent = sg.getStudent(0);
            //printStudent(getstudent);
            //getstudent = sg.getStudent(1);
            //printStudent(getstudent);
            //getstudent = sg.getStudent(2);
            //printStudent(getstudent);
            Student setstudent = new Student(11,"setstudent",new Date(),35);
            //sg.setStudent(setstudent, 1);
            //sg.addFirst(setstudent);
            sg.addLast(setstudent);
            sg.add(setstudent, 0);
            getstudents = sg.getStudents();
            printStudents(getstudents);
            //sg.remove(0);
            //sg.remove(setstudent);
            //sg.removeFromIndex(2);
            //sg.removeToIndex(2);
            sg.removeFromElement(stu2);
            //sg.removeToElement(stu2);
            getstudents = sg.getStudents();
            printStudents(getstudents);
            
            
	}
        public static void printStudents(Student[] students) {
            for (int i=0;i<students.length;i++) {
                Student stu = students[i];
                System.out.println("index: " + i + " id: " + stu.getId()+ " name: "+stu.getFullName()+" bdate: " + stu.getBirthDate()+" avgmark: "+stu.getAvgMark());
            }
            System.out.println();
         
        }
        public static void printStudent(Student stu) {
            System.out.println(" id: " + stu.getId()+ " name: "+stu.getFullName()+" bdate: " + stu.getBirthDate()+" avgmark: "+stu.getAvgMark());
            System.out.println();

        }

}
