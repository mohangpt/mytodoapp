package handlers;

import spark.Request;
import spark.Response;
import spark.Route;
import main.Main;

public class UserHandler implements Route {

	@Override
	public Object handle(Request request, Response response) throws Exception {
		System.out.print("Autheticate user");
		StringBuffer sb = new StringBuffer();
		
		return Main.app.getUsers().toString() + "\n";
//		return "I should return all the users";
	}

}
