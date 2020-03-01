package todoModel;

import java.util.ArrayList;

public class Application {
//	will use hashmap here
	private ArrayList<User> users;
	private int index;

//methods
	public Application() {
		users = new ArrayList<User>();
		index = -1;
	}

	public void addUser(String N, int U) {
		N = N.strip();
		N = N.toLowerCase();
		User user = new User(U , N);
		users.add(user);
	}
	
	// BUG -3 same name for class member and input
	// bug -4 have not handled the case when the deleted user is also selected user
	public void deleteUser(int index) {
		//BUG -2
		if (index >= 0 && index > users.size()) {
			users.remove(index);
			System.out.println("User deleted please select another user!");
			index = -1;
		}
		else
			System.out.println("User does not exist!!");
	}
	
	// Bug -3 list user should return a list
	public void listUsers() {
		if (users.size() == 0) {
			System.out.println("No user found!!");
		}
		for (int i = 0; i < users.size(); i++)
			System.out.println(i + " -" + users.get(i).getUserName());
	}

	public void selectUser(String s) {
		int i = 0;
		s = s.strip();
		s = s.toLowerCase();
		for (User u : users) {
			if (u.getUserName().equals(s)) {
				index = i;
				return;
			}
			i++;
		}
		System.out.println("no user found!!");
	}

// getters 
	public ArrayList<User> getUsers() {
		return users;
	}

	public int getIndex() {
		return index;
	}

//wrapper
	public void addTask(String Arg) {
		users.get(index).addTask(Arg);
	}
	public ArrayList<Task> listTask() {
		return users.get(index).getList();
	}
	public void selectTask(int index) {
		users.get(index).selectTask(index);
	}
}
