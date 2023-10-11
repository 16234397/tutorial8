package testingTutorial;

import org.junit.Assume;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.*;
public class TestEqualsAndHashcode {

	private static Lecturer sample1 = null;
	private static Lecturer sample2 = null;
	private static Lecturer sample3 = null;
	private static Lecturer sample4 = null;

	@Test
	public void LecturerHashEquals() {
		sample1 = new Lecturer(1, "Joe", "Blogs");
		sample2 = new Lecturer(1, "Joe", "Bingo");
		assumeTrue(sample1.equals(sample2), "Test Skipped - Condition not met");
		assertEquals(sample1.hashCode(),sample2.hashCode());
	}

	@Test
	public void StudentHashEquals() {
		sample3 = new Lecturer(1, "Joe", "Blogs");
		sample4 = new Lecturer(1, "Jo", "Blogs");
//		Boolean result = sample3.equals(sample4);

		assumeTrue(sample3.equals(sample4), "Test Skipped - Condition not met");

		assertEquals(sample3.hashCode(), sample4.hashCode());
	}

	
}
