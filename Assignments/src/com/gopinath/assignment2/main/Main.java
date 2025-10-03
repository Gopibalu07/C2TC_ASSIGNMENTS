package com.gopinath.assignment2.main;
import com.gopinath.assignment2.employees.*;
import com.gopinath.assignment2.students.*;

public class Main {

	public static void main(String[] args) {
		// Student object
        Student s = new Student();

        // Commission object
        Commission c = new Commission();
        c.acceptDetails();
        c.calculateCommission();

	}

}
