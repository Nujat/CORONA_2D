package org.graphics;

import org.input.KeyInput;
import org.input.MouseInput;

import com.jogamp.newt.opengl.GLWindow;
import com.jogamp.opengl.GLCapabilities;
import com.jogamp.opengl.GLProfile;
import com.jogamp.opengl.util.FPSAnimator;

public class Renderer {
    private static GLProfile profile = null;
	public static GLWindow window = null;
	
	public static int screenWidth = 640;
	public static int screenHeight = 360;
	public static int unitsWide = 10;
	
	public static void init()
	{
		GLProfile.initSingleton();
		GLProfile profile = GLProfile.get(GLProfile.GL2);
		GLCapabilities caps= new GLCapabilities(profile);
		
		window=GLWindow.create(caps);
		window.setSize(screenWidth,screenHeight);
		//window.setResizable(false);
		window.addGLEventListener(new EventListener());
		
		window.addMouseListener(new MouseInput());
		window.addKeyListener(new KeyInput());
		//window.requestFocus();
		
		FPSAnimator animator = new FPSAnimator(window, 60);
		animator.start();
		//window.setFullscreen(true);
		window.setVisible(true);
		
		
	}
	
	public static void render()
	{
		if(window == null)
		{
			return;
		}
		
		window.display();
	}
	
	
	public static int getWindowWidth()
	{
		return window.getWidth();
	}
	public static int getWindowHeight()
	{
		return window.getHeight();
	}
	
	public static void main (String[] args)
	{
		init();
	}
	public static GLProfile getProfile() {
		return profile;
	}
}

