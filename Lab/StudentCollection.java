package Lab;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
//class declaration
public class StudentCollection {
//main method
	public static void main(String[] args) {
		//creating list objects
		List<Student>list=new ArrayList<Student>();
		//printing a statement
		System.out.println("Student Lists:");
		//adding elements to the list
		list.add(new Student(101,"srija","BSC"));
		list.add(new Student(102,"sathwika","Bcom"));
		list.add(new Student(102,"Sandhya","Btech"));
		list.add(new Student(104,"pallavi","BE"));
		//creating student object
		Student s=new Student(105,"vishwasini","BCA");
		//adding student object to the list
		list.add(s);
		for(Student s1 : list) {
			//printing student list
			System.out.println(s1);
		}
		//arranging the list elements i alphabetical order
		Collections.sort(list);
		System.out.println("After Sorting:");
		for(Student s1 : list) {
			//printing the sorted elements
			System.out.println(s1);
		}
	}
}

//class declaration
class Student implements Comparable<Student> {
	//declaring variables
		int studentId;
		String studentName;
		String qualification;
		//creating a constructor
		public Student(int studentId,String studentName,String qualification) {
			super();
			this.studentId=studentId;
			this.studentName=studentName;
			this.qualification=qualification;
		}
			@Override
			public String toString() {
				return "Student [studentId=" + studentId + ", studentName=" + studentName + ", qualification="
						+ qualification + "]";
			}
			@Override
			//comparing string name
			public int compareTo(Student o) {
				if(this.studentName.compareTo(o.studentName)>0)
					return 1;
				else if(this.studentName.compareTo(o.studentName)<0)
					return -1;
				else
				return 0;
			}
}
