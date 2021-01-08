package org.graphics;

import com.jogamp.opengl.GL2;
import com.jogamp.opengl.util.texture.Texture;

public class Graphics {
	
	//color values

	private static float red = 1;
	private static float green = 1;
	private static float blue = 1;
	private static float alpha = 1;

	public static void fillRect (float x, float y, float width, float height,float r, float g,float b,float rotation) {
		
		
		 GL2 gl = EventListener.gl;
		
		
		 gl.glColor4f(red, green, blue, alpha);
		 
		 gl.glTranslatef(x, y, 0);
		gl.glRotatef(-rotation, 0, 0,1);
		gl.glColor3f(r, g, b);
		
		// gl.glColor4f(red, green, blue, alpha);
		 
		gl.glBegin(GL2.GL_QUADS);
		
		//gl.glTexCoord2f(0, 0);
		   gl.glVertex2f(-width / 2, -height / 2);
		  // gl.glTexCoord2f(1,  0);
		   gl.glVertex2f(width / 2, -height / 2);
		   //gl.glTexCoord2f(1, 1);
		   gl.glVertex2f(width / 2, height / 2);
		   //gl.glTexCoord2f(0,  1);
		   gl.glVertex2f(-width / 2, height / 2);
		   
		   
		 //  gl.glVertex2f(x + width, y);
		   //gl.glVertex2f(x + width, y + height);
		   //gl.glVertex2f(x, y+ height);
		   
		   gl.glEnd();
		  // gl.glFlush();
		   
		//   gl.glBindTexture(GL2.GL_TEXTURE_2D, 0);
		   
		   gl.glRotatef(rotation, 0, 0,1);
		   gl.glTranslatef(-x, -y, 0);
	}
	
	public static void setColor(float r, float g, float b, float a)
	{
		red = Math.max(0, Math.min(1, r));
		green = Math.max(0, Math.min(1, g));
		blue = Math.max(0, Math.min(1, b));
		alpha = Math.max(0, Math.min(1, a));
	}
	 
	//circle
	public static void DrawCircle(float x, float y, float radius) { 
		
		GL2 gl = EventListener.gl;
	    gl.glMatrixMode(GL2.GL_MODELVIEW);
	    gl.glPushMatrix();
	    gl.glLoadIdentity();
	    gl.glTranslatef(x, y, 0.0f);
	    int circle_points = 100;
	    float angle = 2.0f * 3.1416f / circle_points;

	    
	    gl.glBegin(GL2.GL_POLYGON);
	    double angle1=0.0;
	    gl.glColor3f(0, 0, 0);
	    gl.glVertex2d(radius * Math.cos(0.0) , radius * Math.sin(0.0));
	    int i;
	    for (i=0; i<circle_points; i++)
	    {       
	        gl.glVertex2d(radius * Math.cos(angle1), radius *Math.sin(angle1));
	        angle1 += angle;
	    }
	    gl.glEnd();
	    gl.glPopMatrix();
	}

	
	//circle
	public static void pink(float x, float y, float radius) { 
		
		GL2 gl = EventListener.gl;
	    gl.glMatrixMode(GL2.GL_MODELVIEW);
	    gl.glPushMatrix();
	    gl.glLoadIdentity();
	    gl.glTranslatef(x, y, 0.0f);
	    int circle_points = 100;
	    float angle = 2.0f * 3.1416f / circle_points;

	    
	    gl.glBegin(GL2.GL_POLYGON);
	    double angle1=0.0;
	    gl.glColor3f(1, 0.6f, 0.6f);
	    gl.glVertex2d(radius * Math.cos(0.0) , radius * Math.sin(0.0));
	    int i;
	    for (i=0; i<circle_points; i++)
	    {       
	        gl.glVertex2d(radius * Math.cos(angle1), radius *Math.sin(angle1));
	        angle1 += angle;
	    }
	    gl.glEnd();
	    gl.glPopMatrix();
	}
public static void Drawface(float x, float y, float radius) { 
		
		GL2 gl = EventListener.gl;
	    gl.glMatrixMode(GL2.GL_MODELVIEW);
	    gl.glPushMatrix();
	    gl.glLoadIdentity();
	    gl.glTranslatef(x, y, 0.0f);
	    int circle_points = 100;
	    float angle = 2.0f * 3.1416f / circle_points;

	    
	    gl.glBegin(GL2.GL_POLYGON);
	    double angle1=0.0;
	    gl.glColor3f(1, 0.6f, 0.6f);
	    gl.glVertex2d(radius * Math.cos(0.0) , radius * Math.sin(0.0));
	    int i;
	    for (i=0; i<circle_points; i++)
	    {       
	        gl.glVertex2d(radius * Math.cos(angle1), radius *Math.sin(angle1));
	        angle1 += angle;
	    }
	    gl.glEnd();
	    gl.glPopMatrix();
	}
	
	
	
	//megh
	public static void cloud(float x, float y, float radius) { 
		
		GL2 gl = EventListener.gl;
	    gl.glMatrixMode(GL2.GL_MODELVIEW);
	    gl.glPushMatrix();
	    gl.glLoadIdentity();
	    gl.glTranslatef(x, y, 0.0f);
	    int circle_points = 100;
	    float angle = 2.0f * 3.1416f / circle_points;

	    
	    gl.glBegin(GL2.GL_POLYGON);
	    double angle1=0.0;
	   
	    gl.glColor3f(0.8f, 0.9f, 1);
	    gl.glVertex2d(radius * Math.cos(0.0) , radius * Math.sin(0.0));
	    int i;
	    for (i=0; i<circle_points; i++)
	    {       
	        gl.glVertex2d(radius * Math.cos(angle1), radius *Math.sin(angle1));
	        
	        angle1 += angle;
	        
	    }
	    gl.glEnd();
	    gl.glPopMatrix();
	    
	    
	    
	 
	    
	    
	}

	
public static void eye(float x, float y, float radius) { 
		
		GL2 gl = EventListener.gl;
	    gl.glMatrixMode(GL2.GL_MODELVIEW);
	    gl.glPushMatrix();
	    gl.glLoadIdentity();
	    gl.glTranslatef(x, y, 0.0f);
	    int circle_points = 100;
	    float angle = 2.0f * 3.1416f / circle_points;

	    
	    gl.glBegin(GL2.GL_POLYGON);
	    double angle1=0.0;
	   
	    gl.glColor3f(1f, 1f, 1);
	    gl.glVertex2d(radius * Math.cos(0.0) , radius * Math.sin(0.0));
	    int i;
	    for (i=0; i<circle_points; i++)
	    {       
	        gl.glVertex2d(radius * Math.cos(angle1), radius *Math.sin(angle1));
	        
	        angle1 += angle;
	        
	    }
	    gl.glEnd();
	    gl.glPopMatrix();
	    
	    
	    
	 
	    
	    
	}


public static void red(float x, float y, float radius) { 
	
	GL2 gl = EventListener.gl;
    gl.glMatrixMode(GL2.GL_MODELVIEW);
    gl.glPushMatrix();
    gl.glLoadIdentity();
    gl.glTranslatef(x, y, 0.0f);
    int circle_points = 100;
    float angle = 2.0f * 3.1416f / circle_points;

    
    gl.glBegin(GL2.GL_POLYGON);
    double angle1=0.0;
   
    gl.glColor3f(1f, 0.2f, 0);
    gl.glVertex2d(radius * Math.cos(0.0) , radius * Math.sin(0.0));
    int i;
    for (i=0; i<circle_points; i++)
    {       
        gl.glVertex2d(radius * Math.cos(angle1), radius *Math.sin(angle1));
        
        angle1 += angle;
        
    }
    gl.glEnd();
    gl.glPopMatrix();
    
    
    
 
    
    
}


public static void green(float x, float y, float radius) { 
	
	GL2 gl = EventListener.gl;
    gl.glMatrixMode(GL2.GL_MODELVIEW);
    gl.glPushMatrix();
    gl.glLoadIdentity();
    gl.glTranslatef(x, y, 0.0f);
    int circle_points = 100;
    float angle = 2.0f * 3.1416f / circle_points;

    
    gl.glBegin(GL2.GL_POLYGON);
    double angle1=0.0;
   
    gl.glColor3f(0f, 0.7f, 0);
    gl.glVertex2d(radius * Math.cos(0.0) , radius * Math.sin(0.0));
    int i;
    for (i=0; i<circle_points; i++)
    {       
        gl.glVertex2d(radius * Math.cos(angle1), radius *Math.sin(angle1));
        
        angle1 += angle;
        
    }
    gl.glEnd();
    gl.glPopMatrix();
    
  
    
}


public static void blue(float x, float y, float radius) { 
	
	GL2 gl = EventListener.gl;
    gl.glMatrixMode(GL2.GL_MODELVIEW);
    gl.glPushMatrix();
    gl.glLoadIdentity();
    gl.glTranslatef(x, y, 0.0f);
    int circle_points = 100;
    float angle = 2.0f * 3.1416f / circle_points;

    
    gl.glBegin(GL2.GL_POLYGON);
    double angle1=0.0;
   
    gl.glColor3f(0.2f, 0.3f, 0.5f);
    gl.glVertex2d(radius * Math.cos(0.0) , radius * Math.sin(0.0));
    int i;
    for (i=0; i<circle_points; i++)
    {       
        gl.glVertex2d(radius * Math.cos(angle1), radius *Math.sin(angle1));
        
        angle1 += angle;
        
    }
    gl.glEnd();
    gl.glPopMatrix();
    
  
    
}

public static void yellow(float x, float y, float radius) { 
	
	GL2 gl = EventListener.gl;
    gl.glMatrixMode(GL2.GL_MODELVIEW);
    gl.glPushMatrix();
    gl.glLoadIdentity();
    gl.glTranslatef(x, y, 0.0f);
    int circle_points = 100;
    float angle = 2.0f * 3.1416f / circle_points;

    
    gl.glBegin(GL2.GL_POLYGON);
    double angle1=0.0;
   
    gl.glColor3f(1, 1, 0);
    gl.glVertex2d(radius * Math.cos(0.0) , radius * Math.sin(0.0));
    int i;
    for (i=0; i<circle_points; i++)
    {       
        gl.glVertex2d(radius * Math.cos(angle1), radius *Math.sin(angle1));
        
        angle1 += angle;
        
    }
    gl.glEnd();
    gl.glPopMatrix();
    
    
    
 
    
    
}
	
	
}
