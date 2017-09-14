import java.util.Date;
import java.lang.*;

/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

	private Student[] students;
	
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
	}

	@Override
	public Student[] getStudents() {
		// Add your implementation here
		return students;
	}

	@Override
	public void setStudents(Student[] students) {
		if(students == null)
                    throw new IllegalArgumentException();
                else 
                    this.students=students;
	}

	@Override
	public Student getStudent(int index) {
		// Add your implementation here
		if (index < 0 || index >= students.length) {
                    throw new IllegalArgumentException();
                }
                else {
                    return students[index];
                }
	}

	@Override
	public void setStudent(Student student, int index) {
		// Add your implementation here
            if (student == null) {
                throw new IllegalArgumentException();
            }
            else if (index <  0 || index >= students.length) {
                throw new IllegalArgumentException();
            }
            else {
                students[index]=student;
            }
	}

	@Override
	public void addFirst(Student student) {
		// Add your implementation here
            if (student == null) {
                throw new IllegalArgumentException();
            }
            else {
                Student[] temp = new Student[students.length+1];
                temp[0] = student;
                for(int i=0;i<students.length;i++) {
                    temp[i+1] = students[i];                    
                }
                students = temp;
            }
	}

	@Override
	public void addLast(Student student) {
		// Add your implementation here
            if (student == null) {
                throw new IllegalArgumentException();
            }
            else {
                Student[] temp = new Student[students.length+1];
                
                for(int i=0;i<students.length;i++) {
                    temp[i] = students[i];                    
                }
                temp[students.length] = student;
                students = temp;
            }

	}

	@Override
	public void add(Student student, int index) {
		// Add your implementation here
            if (student == null) {
                throw new IllegalArgumentException();
            }
            else if(index < 0 || index >= students.length){
                throw new IllegalArgumentException();
            }
            else {
                Student[] temp = new Student[students.length+1];
                
                for(int i=0;i<=index;i++) {
                    temp[i] = students[i];                    
                }
                temp[index+1] = student;
                for(int i=index+1;i<students.length;i++) {
                    temp[i+1] = students[i];                    
                }
                students = temp;
            }
	}

	@Override
	public void remove(int index) {
		// Add your implementation here
            if(index < 0 || index >= students.length){
                throw new IllegalArgumentException();
            }
            else {
                Student[] temp = new Student[students.length-1];
                
                for(int i=0;i<index;i++) {
                    temp[i] = students[i];                    
                }
                for(int i=index+1;i<students.length;i++) {
                    temp[i-1] = students[i];                    
                }
                students = temp;
            }
	}

	@Override
	public void remove(Student student) {
		// Add your implementation here
            if (student == null) {
                throw new IllegalArgumentException();
            }
            else {
                int index = -1;
                for(int i=0;i<students.length;i++) {
                    Student stu = students[i]; 
                    if (stu.compareTo(student) == 0) {
                        index = i;
                        break;
                    }
                }
                if (index == -1) {
                    throw new IllegalArgumentException("Student not exist");
                }
                else {
                    remove(index);
                }
            }
	}

	@Override
	public void removeFromIndex(int index) {
		// Add your implementation here
            if(index < 0 || index >= students.length){
                throw new IllegalArgumentException();
            }
            else {
                Student[] temp = new Student[index+1];
                
                for(int i=0;i<=index;i++) {
                    temp[i] = students[i];                    
                }
                students = temp;
            }
	}

	@Override
	public void removeFromElement(Student student) {
		// Add your implementation here
            if (student == null) {
                throw new IllegalArgumentException();
            }
            else {
                int index = -1;
                for(int i=0;i<students.length;i++) {
                    Student stu = students[i]; 
                    if (stu.compareTo(student) == 0) {
                        index = i;
                        break;
                    }
                }
                if (index >= 0) {
                    removeFromIndex(index);
                }
            }
	}

	@Override
	public void removeToIndex(int index) {
		// Add your implementation here
            if(index < 0 || index >= students.length){
                throw new IllegalArgumentException();
            }
            else {
                Student[] temp = new Student[students.length-index];
                
                for(int i=index;i<students.length;i++) {
                    temp[i-index] = students[i];                    
                }
                students = temp;
            }
	}

	@Override
	public void removeToElement(Student student) {
		// Add your implementation here
            if (student == null) {
                throw new IllegalArgumentException();
            }
            else {
                int index = -1;
                for(int i=0;i<students.length;i++) {
                    Student stu = students[i]; 
                    if (stu.compareTo(student) == 0) {
                        index = i;
                        break;
                    }
                }
                if (index >= 0) {
                    removeToIndex(index);
                }
            }
	}

	@Override
	public void bubbleSort() {
		// Add your implementation here
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here
		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here
		return null;
	}

	@Override
	public Student getNextStudent(Student student) {
		// Add your implementation here
		return null;
	}
}
