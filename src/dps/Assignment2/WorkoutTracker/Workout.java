package dps.Assignment2.WorkoutTracker;

import java.util.ArrayList;
import java.util.Calendar;

import android.R.string;

public class Workout {
	private int id;
	
	private int year;
	private int month;
	private int day;
	
	private int hour;
	private int minute;
	
	private int weight_body;
	
	private ArrayList<Exercise> exercises;
	
	// This is called when a workout is created through "Start Workout" activity
	public Workout(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
		hour = Calendar.HOUR_OF_DAY;
		minute = Calendar.MINUTE;
		exercises = new ArrayList<Exercise>();
	}
	
	// This is called when a workout is created through "Workout Alarm" activity
	public Workout(int year, int month, int day, int hour, int minute) {
		this.year = year;
		this.month = month;
		this.day = day;
		this.hour = hour;
		this.minute = minute;
	}
	
	// This is called when retrieving a workout from the database
	public Workout(int year, int month, int day, int hour, int minute, int id) {
		this.year = year;
		this.month = month;
		this.day = day;
		this.hour = hour;
		this.minute = minute;
		this.id = id;
	}
	
	public void addExercise(String name, String category, int weight, int reps) {
		Exercise newExercise = new Exercise(name, category, weight, reps, this.id);
		exercises.add(newExercise);
	}
	
	public ArrayList<Exercise> getAllExerciseRecords() {
		return exercises;
	}
	
	public ArrayList<Exercise> getExercisesByCategory(string category) {
		ArrayList<Exercise> tempList = new ArrayList<Exercise>();
		for (int i = 0; i < exercises.size(); i++) {
			if (exercises.get(i).getCategory().equals(category)) {
				tempList.add(exercises.get(i));
			}
		}
		return tempList;
	}
	
	public void setBodyWeight(int bodyWeight) {
		this.weight_body = bodyWeight;
	}
	
	public int getYear() {
		return year;
	}
	
	public int getMonth() {
		return month;
	}
	
	public int getDay() {
		return day;
	}
	
	public int getHour() {
		return hour;
	}
	
	public int getMinute() {
		return minute;
	}
	
	public int getBodyWeight() {
		return weight_body;
	}
	
	public int getID() {
		return id;
	}
}
