package org.world;

import java.util.ArrayList;

public class World {
	
	private static ArrayList<GameObject> gameObjects = new ArrayList<GameObject>();
	
	public static void update()
	{
		//go through all objects and update them
		for(GameObject go : gameObjects)
		{
			go.update();
		}
		
		
	}
	
	public static void render()
	{
		//Graphics.fillRect(-0.5f, -0.5f, 1, 1);
		
		//render all the objects
		for(GameObject go : gameObjects)
		{
			go.render();
		}
		
	}
	
	public static void addObject(GameObject go)
	{
		gameObjects.add(go);
	}
	
	

}
