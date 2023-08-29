package com.aurionpro.test;

import com.aurionpro.model.DogDoor;
import com.aurionpro.model.Remote;

public class DogDoorTest {
	public static void main(String[] args) {
		DogDoor door = new DogDoor();

		Remote remote = new Remote(door);

		System.out.println();
		remote.pressButton();

		System.out.println("\nFido has gone outside...");

		System.out.println("\nFido's all done...");

		try {
			Thread.currentThread().sleep(10000);
		} catch (InterruptedException e) {
		}

		System.out.println("...but he's stuck outside!");

		System.out.println("\nFido starts barking...");

		System.out.println("...so Gina grabs the remote control.");
		remote.pressButton();

		System.out.println("\nfido's back inside...");

	}

}
