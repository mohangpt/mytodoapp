package handlers;

import spark.Request;
import spark.Response;
import spark.Route;

public class PingHandler implements Route{

	@Override
	public Object handle(Request request, Response response) throws Exception {
		// TODO Auto-generated method stub
		
		return "Returning from Route";
	}

}
