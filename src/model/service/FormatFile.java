package model.service;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import model.entities.Course;

public class FormatFile {

	public static void write(String path, Set<Course> value) {
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
			
			for (Course line: value) {
				bw.write(line.toString());
				bw.newLine();
			}
			
		}
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
	}
	
	public static List<Integer> reader(String path) {
		
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			
			List<Integer> ids = new ArrayList<>();
			
			String line = br.readLine();
			while (line != null) {
				
				String[] fields = line.split(",");
				Integer id = Integer.parseInt(fields[1]);
				
				ids.add(id);
				
				line = br.readLine();
			}
			return ids;
			
		}
		
		catch (IOException e) {
			System.out.println("Error" + e.getMessage());
		}
		
		return null;
	}
}
