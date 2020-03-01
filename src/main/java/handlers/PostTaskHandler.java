package handlers;

import configs.Constants;
import main.Main;
import spark.Request;
import spark.Response;
import spark.Route;

public class PostTaskHandler implements Route {

	@Override
	public Object handle(Request request, Response response) throws Exception {
		// add task for user x
		String username = request.headers(Constants.userName);
		String userid = request.headers(Constants.userId);
		String taskDescription = request.headers(Constants.taskDesc);

		Main.app.selectUser(username);
		Main.app.addTask(taskDescription);

		return "Added task for the user:" + username + "\n";
	}

}
