import java.util.Scanner;

	public class JavaHwPart2 {
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner scan = new Scanner (System.in);
			System.out.println("Please enter a number grade to see its corresponding letter grade.");
			int grade = scan.nextInt();
			
			switch (grade) {
			case 90: case 91: case 92: case 93: case 94: case 95: case 96: case 97: case 98: case 99: case 100:
				System.out.println ("Grade is an A.");
			break;
			case 80: case 81: case 82: case 83: case 84: case 85: case 86: case  87: case 88: case 89:
				System.out.println ("Grade is a B.");
				break; 
			case 70: case 71: case 72: case 73: case 74: case 75: case 76: case 77: case 78:  case 79:
				System.out.println ("Grade is a C.");
				break; 	
			case 60: case 61: case 62: case 63: case 64: case 65: case 66: case 67: case 68: case  69:
				System.out.println ("Failing Grade");
				break;
			default: 
				System.out.println ("Please enter a grade between 60-100.");
				break;
			}

	}

}