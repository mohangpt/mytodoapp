package todoModel;

import java.util.ArrayList;

public class User {
	private int userId;
	private String userName;
	private ArrayList<Task> list;
	private int index;

//	constructor
	public User(int userId, String userName) {
		this.userId = userId;
		this.userName = userName;
		list = new ArrayList<Task>();
	}

	public User(int userId) {
		this.userId = userId;
		this.userName = "New User";
		list = new ArrayList<Task>();
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "User (Name: " + this.userName + ", ID:" + this.userId + ")\n";
	}
	public void addTask(String s) {
		Task t = new Task(s);
		list.add(t);
	}

	public ArrayList<Task> getList() {
		return list;
	}

	public void delTask(int i) {
		if (i >= 0 && i < list.size())
			list.remove(i);
		else
			System.out.println("Task does not exist!!");
	}

	public void selectTask(int i) {
		if (i >= 0 && i < list.size())
			index = i;
		else
			System.out.println("Task does not exist!!");
	}

//getters
	public int getUserId() {
		return userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getIndex() {
		return index;
	}
}
