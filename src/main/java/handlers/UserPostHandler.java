package handlers;

import configs.Constants;
import main.Main;
import spark.Request;
import spark.Response;
import spark.Route;

public class UserPostHandler implements Route {

	@Override
	public Object handle(Request request, Response response) throws Exception {
		System.out.println("I am supposed to create the user");
		
		String username = request.headers(Constants.userName);
		String userId = request.headers(Constants.userId);
		
		Main.app.addUser(username, Integer.parseInt(userId));
		return "user created\n";
	}

}
