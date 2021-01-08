package org.test;

import org.engine.GameLoop;
import org.graphics.Graphics;
import org.input.KeyInput;
import org.world.GameObject;

import com.jogamp.newt.event.KeyEvent;

public class TestPlayer extends GameObject {
	public float cc= 0.0015f;
	
	public TestPlayer()
	{
		//
	}
	
	public void update()
	{
		float xInput = 0;
		float yInput = 0;
		
		if(KeyInput.getKey(KeyEvent.VK_LEFT))
		{
			xInput--;
		}
		if(KeyInput.getKey(KeyEvent.VK_RIGHT))
		{
			xInput++;
			
		}
		if(KeyInput.getKey(KeyEvent.VK_UP))
		{
			yInput++;
		}
		if(KeyInput.getKey(KeyEvent.VK_DOWN))
		{
			yInput--;
		}
		
		if(KeyInput.getKey(KeyEvent.VK_R))
		{
			GameObject.redAlert = true;
			GameObject.greenAlert = false;
			GameObject.yellowAlert = false;
			
		}
		if(KeyInput.getKey(KeyEvent.VK_G))
		{   
			GameObject.redAlert = false;
			GameObject.yellowAlert = false;
			GameObject.greenAlert = true;
		}

		if(KeyInput.getKey(KeyEvent.VK_Y))
		{
			GameObject.redAlert = false;
			GameObject.yellowAlert = true;
			GameObject.greenAlert = false;
		}
		if(KeyInput.getKey(KeyEvent.VK_M))
		{
			GameObject.maskAlert = true;
			GameObject.offcoronaAlert = false;
			//GameObject.greenAlert = true;
		}
		
		
		/*if(KeyInput.getKey(KeyEvent.VK_O))
		{
			//GameObject.offcoronaAlert = true;
		}*/
		
		
		x += xInput * GameLoop.updateDelta();
		y += yInput *  GameLoop.updateDelta(); //o
		
	}

}
