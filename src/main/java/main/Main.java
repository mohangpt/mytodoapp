package main;

import static spark.Spark.*;

import handlers.PingHandler;
import handlers.PostTaskHandler;
import handlers.TaskHandler;
import handlers.UserHandler;
import handlers.UserPostHandler;
import todoModel.Application;

public class Main {
	public static Application app = new Application();
	
	public static void main(String[] args) {
        
		get("/alive", new PingHandler());
		
		get("/user", new UserHandler());
		post("/user", new UserPostHandler());
		
		get("/task", new TaskHandler());
		post("/task", new PostTaskHandler());
    }
}
