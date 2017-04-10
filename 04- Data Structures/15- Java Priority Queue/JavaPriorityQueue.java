package dataStructures;

import java.util.*;

class OtherStudent {
	private int token;
	private String fname;
	private double cgpa;

	public OtherStudent(int id, String fname, double cgpa) {
		super();
		this.token = id;
		this.fname = fname;
		this.cgpa = cgpa;
	}

	public int getToken() {
		return token;
	}

	public String getFname() {
		return fname;
	}

	public double getCgpa() {
		return cgpa;
	}

	static final Comparator<OtherStudent> COMP = Comparator
			.comparing(OtherStudent::getCgpa, Comparator.reverseOrder())
			.thenComparing(OtherStudent::getFname, Comparator.naturalOrder())
			.thenComparing(OtherStudent::getToken);

	@Override
	public String toString() {
		return fname;
	}

}

public class JavaPriorityQueue {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int totalEvents = Integer.parseInt(in.nextLine());
		PriorityQueue<OtherStudent> pq = new PriorityQueue<>(totalEvents,
				OtherStudent.COMP);
		while (totalEvents > 0) {
			String event = in.next();
			if (event.equals("SERVED")) {
				pq.poll();
			} else {
				final String name;
				final int token;
				final double gpa;
				name = in.next();

				gpa = in.nextDouble();
				token = in.nextInt();
				pq.add(new OtherStudent(token, name, gpa));
			}

			totalEvents--;
		}

		if (pq.isEmpty())
			System.out.println("EMPTY");
		else {
			while (!pq.isEmpty())
				System.out.println(pq.poll());

		}
		in.close();
	}
}