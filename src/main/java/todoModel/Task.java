package todoModel;

public class Task {
	String discription;

//	constructor
	Task(String discription) {
		this.discription = discription;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "( Task : " + this.discription + ")\n";
	}
}
