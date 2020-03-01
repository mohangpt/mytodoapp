package handlers;

import configs.Constants;
import main.Main;
import spark.Request;
import spark.Response;
import spark.Route;

public class TaskHandler implements Route {

	@Override
	public Object handle(Request request, Response response) throws Exception {
		// TODO Auto-generated method stub
		String username = request.headers(Constants.userName);
		String userid = request.headers(Constants.userId);
		
		Main.app.selectUser(username);
		return Main.app.listTask().toString() + "\n" ;
//		return ("i will return tasks of user " + username+ "\n");
	}

}
