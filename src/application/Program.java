package application;

import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import model.entities.Course;
import model.service.FormatFile;

public class Program {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		Set<Course> A = new TreeSet<>();
		Set<Course> B = new TreeSet<>();
		Set<Course> C = new TreeSet<>();
		
		String path = "C:\\temp\\exSet.txt";
		
		System.out.print("How many course A: ");
		int quantityStudentA = sc.nextInt();
		
		for (int i = 1; i<= quantityStudentA; i++) {
			
			sc.nextLine(); 
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Id: ");
			Integer id = sc.nextInt();
			
			A.add(new Course(name, id));
			
		}
		
		System.out.print("How many course B: ");
		int quantityStudentB = sc.nextInt();
		
		for (int i = 1; i<= quantityStudentB; i++) {
			
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Id: ");
			Integer id = sc.nextInt();
			
			B.add(new Course(name, id));	
			
		}
		
		System.out.print("How many course C: ");
		int quantityStudentC = sc.nextInt();
		
		for (int i = 1; i<= quantityStudentC; i++) {
			
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Id: ");
			Integer id = sc.nextInt();
			
			C.add(new Course(name, id));	
			
		}
		
		Set<Course> union = new TreeSet<>(A);
		union.addAll(B);
		union.addAll(C);
		
		FormatFile.write(path, union);
		
		List<Integer> ids = FormatFile.reader(path);
		
		System.out.println("Total students: " + ids.size() );
			
		sc.close();
	}

}
