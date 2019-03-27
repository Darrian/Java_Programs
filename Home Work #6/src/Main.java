import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		final int MAX = 25;

	
		WeatherStation[] list = new WeatherStation[MAX];
		String[] WeatherStations = new String [MAX];
		String[] StationSect = new String [MAX];
		
		final String FILE = "input.txt";
		
		try{
			Scanner keyboard = new Scanner(new File("input.txt"));
			

		
			// Array of objects is filled 
			for(int i = 0;i<MAX;i++){
				String line = keyboard.nextLine();
				StationSect = line.split(",");
				list[i] = new WeatherStation(StationSect[0],StationSect[1],StationSect[2],StationSect[3],StationSect[4],Integer.parseInt(StationSect[5]),StationSect[6]);
				
			}
			
			// Unsorted array of objects 
			
		System.out.println("Unsorted Array");
		System.out.println();
			for(int j = 0;j<MAX;j++){
				System.out.println(list[j]);
			}
			
			System.out.println("---------------------");	
	
			Arrays.sort(list);	 
			
			// Sorted array of objects
			System.out.println("Sorted Array");
			System.out.println();
			for(int j = 0;j<MAX;j++){
				System.out.println(list[j]);
			}
			System.out.println("---------------------");
			for(int j = 0;j<MAX;j++){
				System.out.println(StationSect[j]);
			}

			
			
		}catch(FileNotFoundException e){
			System.err.printf("");
		}
		
		
		
		
		
		
		
		
	}
	
	public static void fillArray(String[] list, Scanner keyboard, int n){
		for(int i = 0; i < n; i++){
			list[i] = keyboard.nextLine();
		}	
	}
	
	// Could use to make the program more condensed and simpler (mess with later)
	public static void fillObjectArray(Object list[], Scanner keyboard, int n){
		
		
		
	}

}
