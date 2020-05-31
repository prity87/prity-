package objectjava;

public class Student {
	private String name;
	private int marks;
	private char grade;
	
	public void setName(String name) {
	 this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setMarks(int marks) {
		this.marks=marks;
	}
	public int getMarks() {
		return marks;
	}
	
	
	
	public char getGrade() {
		if(marks>=93 && marks<=100) {
			System.out.print("Grade:A" +grade);
		}
		else if(marks>=90 && marks<=92) {
			System.out.print("Grade:A-" +grade);
		}
		else if(marks>=87 && marks<=89) {
			System.out.print("Grade:B+" +grade);
		}
		else if(marks>=83 && marks<=86) {
			System.out.print("Grade:B" +grade);
		}
		else if(marks>=80 && marks<=82){
			System.out.print("Grade:B-"+grade);
		
		
	}
		else if(marks>=77 && marks<=79){
			System.out.print("Grade:C+"+grade);
		
		
	}
		else if(marks>=73 && marks<=76){
			System.out.print("Grade:C"+grade);
		
		
	}
		else if(marks>=70 && marks<=72){
			System.out.print("Grade:C-"+grade);
		
		
	}
		else if(marks>=67 && marks<=69){
			System.out.print("Grade:D+"+grade);
		
		
	}

		else if(marks>=60 && marks<=66){
			System.out.print("Grade:D+"+grade);
		
		
	}
		
		else if(marks<60){
			System.out.print("F"+grade);
		
		
	}
		
		return grade;
	}
	
	}
	
	

