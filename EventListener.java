package org.graphics;

import java.util.Random;

import org.world.World;

import com.jogamp.opengl.GL2;
import com.jogamp.opengl.GLAutoDrawable;

import com.jogamp.opengl.GLEventListener;

public class EventListener implements GLEventListener {

	public static GL2 gl = null;
	public float x;
	public float xx= 1;
	public float xxx= 3;
	public float x2= (float) -0.2;
	public float x3= 0.1f;
	public float x4= 0.5f;
	public float xf;
	public float m1=(float) 1.5;
	public float m2=(float) 1.2;
	public float m3=(float) 1.8;
	public float m4=(float) 1.5;
	public float c1=(float) -2.75;
	public float c2=(float) -2.82;
	public float c4=(float) -2.35;
	public float c5=(float) -2.3;
	public float c6=(float) -2.2;
	
	
//	public static ImageResouce image = null;
	public void display(GLAutoDrawable drawable) {
		//System.out.println("Hello");
		 gl = drawable.getGL().getGL2();
		 
		
		gl.glClear(GL2.GL_COLOR_BUFFER_BIT);
		//Graphics.drawImage(image, 0, 0, 100, 100);
		//boxes
		
		//whole backgrnd
		 Graphics.setColor(0, 0, 1, 1);
		 Graphics.fillRect(xf, 0, 10f, 10f, 0.2f, 0.3f, 0.5f, 0);
		
		
		 //janala
		 Graphics.setColor(0, 0, 1, 1);
		 Graphics.fillRect(1.9f, 1.5f, 5f, 1.6f, 0.2f, 0.8f, 1f, 0);
		 
		 //janala mati
		 Graphics.setColor(0, 0, 1, 1);
		 Graphics.fillRect(1.9f, 0.2f, 5f, 1.5f, 0.5f, 0.5f, 0.5f, 0);
		 
		
		//paste ok
		 Graphics.setColor(0, 0, 1, 1);
		 Graphics.fillRect(x3, 0.5f, 1f, 1.2f, 0.5f, 1f, 0.5f, 0);
		
		 x3 += 0.015f;
		 if(x3 > 3f)
		 {
			 x3 -= 3f;
		 }
		
		 
		//megh
		// Graphics.cloud(4f, 2f, 0.25f);
		
		 Graphics.cloud(m1, 1.7f, 0.2f);
		 
		 if(m1 < 4f)
		 {
			 m1 += 0.015f;
			 //m2 -= 0f;
		 }
		 else
		 {
			 m1 = 7879;
		 }
		// m1 += 0.015f;
		 //if(m1 > 4.2f)
		 //{
			// m1 = 0f;
	//	 }
		
		 
		 Graphics.cloud(m2, 1.55f, 0.2f);
		// m2 += 0.015f;
		 
		 if(m2 < 3.68f)
		 {
			 m2 += 0.015f;
			 //m2 -= 0f;
		 }
		 else
		 {
			 m2 = 7879;
		 }
	
		 Graphics.cloud(m3, 1.55f, 0.2f);
		 if(m3 < 4.25f)
		 {
			 m3 += 0.015f;
			 //m2 -= 0f;
		 }
		 else 
		 {
			 m3 = 7879;
		 }
		 Graphics.cloud(m4, 1.5f, 0.2f);
		 if(m4 < 4f)
		 {
			 m4 += 0.015f;
			 //m2 -= 0f;
		 }
		 else 
		 {
			 m4 = 7879;
		 }
		 

		
		//prpl ok
		 Graphics.setColor(0, 0, 1, 1);
		 Graphics.fillRect(x2, 0.5f, 1, 0.6f, 0.7f, 0.33f, 1, 0);
		
		 x2 += 0.015f;
		 if(x2 > 3.8f)
		 {
			 x2 -= 4f;
		 }
		
		//blue ok
		 Graphics.setColor(0, 0, 1, 1);
		 Graphics.fillRect(x, 0.5f, 1, 2.2f, 0, 0, 1, 0);
		 
		 //test cube
		
		
		 x += 0.015f;
		 if(x > 3.8f)
		 {
			 x -= 4f;
		 }
		
		 
		 Graphics.setColor(0, 1, 0, 1);
		 Graphics.fillRect(xx, 0.5f, 0.7f, 2, 0, 0, 0, 0);
		 
		 
		 xx += 0.015f;
		 if(xx >3.8f)
		 {
			 xx -= 4f;
		 }		
		 
		 Graphics.setColor(0, 0, 0, 1);
		 Graphics.fillRect(xxx, 0.5f, 1, 2, 1, 0, 1, 0);
		 
		 
		 xxx += 0.015f;
		 if(xxx >3.8f)
		 {
			 xxx -= 4f;
		 }		
		
		
		 
		//janalar grill
		 Graphics.setColor(0, 0, 1, 1);
		 Graphics.fillRect(1.9f, 2.3f, 5f, 0.1f, 1f, 1f, 1f, 0);
		 Graphics.setColor(0, 0, 1, 1);
		 Graphics.fillRect(1.9f, -0.6f, 5f, 0.1f, 1f, 1f, 1f, 0);
		 Graphics.setColor(0, 0, 1, 1);
		 Graphics.fillRect(1.9f, 0.8f, 0.1f, 3f, 1f, 1f, 1f, 0);
		 Graphics.setColor(0, 0, 1, 1);
		 Graphics.fillRect(-0.57f, 0.85f, 0.1f, 2.99f, 1f, 1f, 1f, 0);
		 Graphics.setColor(0, 0, 1, 1);
		 Graphics.fillRect(4.45f, 0.85f, 0.1f, 2.99f, 1f, 1f, 1f, 0);
		 Graphics.setColor(0, 0, 1, 1);
		 Graphics.fillRect(1.9f, 0.7f, 5f, 0.1f, 1f, 1f, 1f, 0);
		 
		 //bus
		 
		 Graphics.setColor(0, 0, 1, 1);
		 Graphics.fillRect(-4.5f, 2f, 20f, 0.2f, 1f, 1f, 0.5f, 0);
		 
		 Graphics.setColor(0, 0, 1, 1);
		 Graphics.fillRect(3f, 1f, 0.2f, 6f, 1f, 1f, 0.5f, 0);
		
		// Graphics.setColor(0, 0, 1, 1);
		 //Graphics.fillRect(1f, 1f, 0.2f, 6f, 1f, 1f, 0.5f, 0);
		
		 Graphics.setColor(0, 0, 1, 1);
		 Graphics.fillRect(-1f, 1f, 0.2f, 6f, 1f, 1f, 0.5f, 0);
		 
		 
			//character drawing2
				Graphics.fillRect(2f, 0.09999f, 0.2f, 0.2f,1f,0.6f,0.6f,0); //neck
				Graphics.Drawface(2f, 0.4f, 0.2999f); // head
				Graphics.DrawCircle(2.2f, 0.4f, .15f); // chul
				Graphics.DrawCircle(2f, 0.5f, .15f); // chul
				Graphics.DrawCircle(1.8f, 0.6f, .15f); // chul
				Graphics.DrawCircle(2f, 0.6f, .25f); // chul
				Graphics.DrawCircle(2.2f, 0.4f, .18f); // chul
				Graphics.eye(1.8f, 0.31f, .04f); // chokh
				Graphics.DrawCircle(1.8f, 0.31f, .02f); // chokh moni
				Graphics.fillRect(1.8f,0.4f, 0.1f, 0.02f,0.5f,0.25f,0f,0); // brow
				Graphics.fillRect(1.9f,0.17f, 0.09f, 0.028f,0.5f,0.25f,0f,0); // lip
				Graphics.fillRect(2f,-0.3f, 0.4f, 0.6f,0.6f,1f,0.6f,0); // torso
				Graphics.fillRect(2f,-0.7f, 0.4f, 0.2f,0.9f,0.6f,0f,0); // kom
				Graphics.fillRect(1.7f,-0.9f, 1f, 0.3f,0.9f,0.6f,0f,0); // leg uppr
				Graphics.fillRect(2.1f, -0.5f, 0.2f, 0.5f,1f,0.6f,0.6f,0); // hat
				Graphics.fillRect(1.3f, -1.3f, 0.2f, 0.6f,0.9f,0.6f,0f,0); //pant
				Graphics.fillRect(1.3f, -1.7f, 0.25f, 0.19999f, 1f,0.2f,0f,0); //shoe
				Graphics.red(1.17f, -1.69f, 0.115f); // shoefront
				
				//character drawing3
				Graphics.fillRect(0.08f, 0.09999f, 0.2f, 0.2f,1f,0.6f,0.6f,0); //neck
				Graphics.Drawface(0.07f, 0.4f, 0.32f); // head
				Graphics.DrawCircle(0.07f, 0.57f, .16f); // chul
				Graphics.DrawCircle(-0.09f, 0.6f, .15f); // chul
				Graphics.DrawCircle(0.099f, 0.5f, .16f); // chul
				Graphics.DrawCircle(0.1999f, 0.5f, .16f); // chul
				Graphics.DrawCircle(0.22f, 0.4f, .16f); // chul
				Graphics.DrawCircle(0.26f, 0.35f, .16f); // chul
				Graphics.DrawCircle(0.25f, 0.55f, .16f); // chul
				Graphics.eye(-0.18f, 0.34f, .04f); // chokh
				Graphics.DrawCircle(-0.18f, 0.34f, .02f); // chokh moni
				Graphics.fillRect(-0.18f,0.4f, 0.1f, 0.02f,0.5f,0.25f,0f,0); // brow
				Graphics.fillRect(-0.0999f, 0.199f, 0.25f, 0.16f, 1f,1f,1f,0); //mask
				Graphics.fillRect(0.06f, 0.199f, 0.2f, 0.028f, 1f,1f,1f,0); //mask
				//Graphics.fillRect(1.9f,0.17f, 0.09f, 0.028f,0.5f,0.25f,0f,0); // lip
				Graphics.fillRect(0.06f,-0.3f, 0.4f, 0.6f,0.5f,0f,0.3f,0); // torso
				Graphics.fillRect(0.06f,-0.7f, 0.4f, 0.2f,1f,0.2f,0f,0); // kom
				Graphics.fillRect(-0.27f,-0.9f, 1f, 0.3f,1f,0.2f,0f,0); // leg uppr
				Graphics.fillRect(0.058f, -0.5f, 0.2f, 0.5f,1f,0.6f,0.6f,0); // hat
				Graphics.fillRect(-0.678f, -1.3f, 0.2f, 0.6f,1f,0.2f,0f,0); //pant
				Graphics.fillRect(-0.678f, -1.7f, 0.3f, 0.2f, 0f,0f,0f,0); //shoe
				
				
				
		
			//seat
			 Graphics.setColor(0, 0, 1, 1);
			 Graphics.fillRect(2f, -1.5f, 0.3f, 0.6f, 0.3f, 0.3f, 0.1f, 0);
			
			 Graphics.setColor(0, 0, 1, 1);
			 Graphics.fillRect(4f, -1.5f, 0.3f, 0.6f, 0.3f, 0.3f, 0.1f, 0);
			 Graphics.setColor(0, 0, 1, 1);
			 Graphics.fillRect(0f, -1.5f, 0.3f, 0.6f, 0.3f, 0.3f, 0.1f, 0);
		 
		//foam
		 Graphics.setColor(0, 0, 1, 1);
		 Graphics.fillRect(0f, -1.1f, 1.4f, 0.4f, 0.7f, 0.5f, 0.5f, 0);
		 Graphics.setColor(0, 0, 1, 1);
		 Graphics.fillRect(0.2f, -0.8f, 1f, 0.1f, 0.7f, 0.5f, 0.5f, 0);
		 Graphics.setColor(0, 0, 1, 1);
		 Graphics.fillRect(0.5f, -0.5f, 0.4f, 1f, 0.7f, 0.5f, 0.5f, 0);
		 
		 
		 //foam2
		 Graphics.setColor(0, 0, 1, 1);
		 Graphics.fillRect(2f, -1.1f, 1.4f, 0.4f, 0.7f, 0.5f, 0.5f, 0);
		 Graphics.setColor(0, 0, 1, 1);
		 Graphics.fillRect(2.2f, -0.8f, 1f, 0.1f, 0.7f, 0.5f, 0.5f, 0);
		 Graphics.setColor(0, 0, 1, 1);
		 Graphics.fillRect(2.5f, -0.5f, 0.4f, 1f, 0.7f, 0.5f, 0.5f, 0);
		 
		 //foam3
		 Graphics.setColor(0, 0, 1, 1);
		 Graphics.fillRect(4f, -1.1f, 1.4f, 0.4f, 0.7f, 0.5f, 0.5f, 0);
		 Graphics.setColor(0, 0, 1, 1);
		 Graphics.fillRect(4.2f, -0.8f, 1f, 0.1f, 0.7f, 0.5f, 0.5f, 0);
		 Graphics.setColor(0, 0, 1, 1);
		 Graphics.fillRect(4.5f, -0.5f, 0.4f, 1f, 0.7f, 0.5f, 0.5f, 0);
		 
		 
		//conductor
			/*Graphics.fillRect(4f, 0.65f, 0.2f, 0.2f,1f,0.6f,0.6f,0); //neck
			Graphics.Drawface(4f, 1f, 0.2999f); // head
			Graphics.DrawCircle(3.88f, 1.2f, .15f); // chul
			Graphics.DrawCircle(4.05f, 1.27f, .15f); // chul
			Graphics.DrawCircle(4.09f, 1.18f, .15f); // chul
			Graphics.DrawCircle(4.1f, 1.17f, .20f); // chul
			Graphics.DrawCircle(4.17f, 1.07f, .18f); // chul
			Graphics.eye(3.78f, 0.95f, .04f); // chokh
			Graphics.DrawCircle(3.78f, 0.95f, .02f); // chokh moni
			Graphics.fillRect(3.8f,1.02f, 0.1f, 0.02f,0.5f,0.25f,0f,0); // brow
			Graphics.fillRect(3.9f,0.75f, 0.09f, 0.028f,0.5f,0.25f,0f,0); // lip
			Graphics.fillRect(4f,0.2f, 0.47f, 0.7f,0f,0.6f,0f,0); // torso
			Graphics.fillRect(4f,-0.49f, 0.47f, 0.68f,0.4f,0.2f,0f,0); // kom
			Graphics.fillRect(3.99f,-1.2f, 0.25f, 0.98f,0.4f,0.2f,0f,0); // leg 
			//Graphics.fillRect(4.2f,-0.9f, 0.25f, 0.7f,0.9f,0.6f,0f,0); // leg 
			Graphics.fillRect(4.07f, 0.1f, 0.2f, 0.5f,1f,0.6f,0.6f,0); // hat
			Graphics.fillRect(3.89f, -0.1f, 0.57f, 0.2f,1f,0.6f,0.6f,0); // hat
			Graphics.fillRect(3.56f, -0.1f, 0.1f, 0.25f,1f,0.6f,0.6f,0); // hat
			Graphics.fillRect(1.3f, -1.3f, 0.2f, 0.6f,0.9f,0.6f,0f,0); //pant
			Graphics.fillRect(3.99f, -1.7f, 0.25f, 0.19999f, 0.3f,0.3f,0.2f,0); //shoe
			//Graphics.red(1.1f, -1.7f, 0.12f); // shoefront */
	 
			
		 
		//jhulonto stand1
		 Graphics.setColor(0, 0, 1, 1);
		 Graphics.fillRect(-3.03f, 1.9f, 0.1f, 0.4f, 1f, 1f, 0.5f, 0);
		 
		 Graphics.setColor(0, 0, 1, 1);
		 Graphics.fillRect(-3.2f, 1.5f, 0.1f, 0.4f, 1f, 1f, 0.5f, 0);
		 Graphics.setColor(0, 0, 1, 1);
		 Graphics.fillRect(-3.05f, 1.3f, 0.4f, 0.1f, 1f, 1f, 0.5f, 0);
		 Graphics.setColor(0, 0, 1, 1);
		 Graphics.fillRect(-3.05f, 1.7f, 0.4f, 0.1f, 1f, 1f, 0.5f, 0);
		 Graphics.setColor(0, 0, 1, 1);
		 Graphics.fillRect(-2.9f, 1.5f, 0.1f, 0.4f, 1f, 1f, 0.5f, 0);
		 
		 //stand 2
		 Graphics.setColor(0, 0, 1, 1);
		 Graphics.fillRect(1.97f, 1.9f, 0.1f, 0.4f, 1f, 1f, 0.5f, 0);
		 Graphics.setColor(0, 0, 1, 1);
		 Graphics.fillRect(1.8f, 1.5f, 0.1f, 0.4f, 1f, 1f, 0.5f, 0);
		 Graphics.setColor(0, 0, 1, 1);
		 Graphics.fillRect(1.95f, 1.3f, 0.4f, 0.1f, 1f, 1f, 0.5f, 0);
		 Graphics.setColor(0, 0, 1, 1);
		 Graphics.fillRect(1.95f, 1.7f, 0.4f, 0.1f, 1f, 1f, 0.5f, 0);
		 Graphics.setColor(0, 0, 1, 1);
		 Graphics.fillRect(2.11f, 1.5f, 0.1f, 0.4f, 1f, 1f, 0.5f, 0);
		 
		 
		//character drawing1
			Graphics.fillRect(-2.49f , 0.6f, 0.2f, 0.2f,1f,0.6f,0.6f,0); //neck
			Graphics.Drawface(-2.5f , 1f, 0.32f); // head
			Graphics.DrawCircle(-2.5f , 1.3f, .16f); // chul
			Graphics.DrawCircle(-2.2f , 1.1f, .15f); // chul
			Graphics.DrawCircle(-2.28f , 1.3f, .17f); // chul
			Graphics.DrawCircle(-2.78f , 1.1f, .15f); // chul
			Graphics.DrawCircle(-2.6f , 1.3f, .17f); // chul
			Graphics.eye(-2.65f , 0.9f, .04f); // chokh
			Graphics.DrawCircle(-2.65f , 0.86f, .02f); // chokh moni
			Graphics.eye(-2.39f , 0.9f, .04f); // chokh
			Graphics.DrawCircle(-2.4f , 0.86f, .02f); // chokh moni
			Graphics.fillRect(-2.62f,1f, 0.1f, 0.02f,0.5f,0.25f,0f,0); // brow
			Graphics.fillRect(-2.38f ,1f, 0.1f, 0.02f,0.5f,0.25f,0f,0); // brow
			Graphics.fillRect(-2.48f ,0.78f, 0.09f, 0.028f,0.5f,0.25f,0f,0); // lip
			/*Graphics.red(c4 , 0.7f, .06f); // corona
			c4 += 0.008f;
			 if(c4> -1.5f)
			 {
				 c4 += -0.8f;
			 }
			Graphics.pink(c4 , 0.7f, .038f); // chokh moni
			c4 += 0.008f;
			 if(c4> -1.5f)
			 {
				 c4 += -0.8f;
			 }
			Graphics.red(c5 , 0.6f, .06f); // corona
			c5 += 0.008f;
			 if(c5> -1.5f)
			 {
				 c5 += -0.8f;
			 }
			Graphics.pink(c5 , 0.62f, .038f); // chokh moni
			c5 += 0.008f;
			 if(c5> -1.5f)
			 {
				 c5 += -0.8f;
			 }
			Graphics.red(c6 , 0.7f, .06f); // corona
			c6 += 0.008f;
			 if(c6> -1.5f)
			 {
				 c6 += -0.8f;
			 }
			Graphics.pink(c6 , 0.7f, .038f); // chokh moni
			c6 += 0.008f;
			 if(c6> -1.5f)
			 {
				 c6 += -0.8f;
			 }
			
			
			Graphics.red(c2 , 0.8f, .06f); // corona
			 c2 -= 0.0086f;
			 if(c2< -3.8f)
			 {
				 c2 -= -1.1f;
			 }
			Graphics.pink(c2 , 0.8f, .038f); // chokh moni
			 c2 -= 0.0086f;
			 if(c2< -3.8f)
			 {
				 c2 -= -1.1f;
			 }
			Graphics.red(c2 , 0.6f, .06f); // corona
			 c2 -= 0.00008f;
			 if(c2< -3.8f)
			 {
				 c2 -= -1.1f;
			 }
			Graphics.pink(c2 , 0.6f, .038f); // chokh moni
			 c2 -= 0.00008f;
			 if(c2< -3.8f)
			 {
				 c2 -= -1.1f;
			 }
			Graphics.red(c1 , 0.7f, .06f); // corona
			 c1 -= 0.008f;
			 if(c1< -3.8f)
			 {
				 c1 -= -1.1f;
			 }
			
			Graphics.pink(c1 , 0.7f, .038f); // chokh moni
			 c1 -= 0.001f;
			 if(c1< -3.8f)
			 {
				 c1 -= -1.1f;
			 }
			*/
			
			
			Graphics.fillRect(-2.5f ,-0.08f, 0.7f, 1.2f,1f,0.2f,0f,0); // torso
			Graphics.fillRect(-2.49f , 0.48f, 0.37f, 0.2f,1f,0.6f,0.6f,0); //neck
			Graphics.fillRect(-3f , 0.45f, 0.37f, 0.2f,1f,0.2f,0f,0); //hatuuper
			Graphics.fillRect(-2.1f , 0.45f, 0.3f, 0.2f,1f,0.2f,0f,0); //hatuuper
			 // hat
			Graphics.fillRect(-2.05f, 0.005f, 0.2f, 0.8f,1f,0.6f,0.6f,0); // hat
			Graphics.fillRect(-2.05f , 0.3f, 0.2f, 0.25f,1f,0.2f,0f,0); // hat
			Graphics.fillRect(-2.05f , -0.4f, 0.27f, 0.1f,1f,0.6f,0.6f,0); // hat
			Graphics.fillRect(-3.09f , 0.96f, 0.2f, 0.8f,1f,0.6f,0.6f,0); //hat
			
			Graphics.fillRect(-2.5f , -0.6f, 0.7f, 0.7f,0f,0f,0.4f,0); //pant
			Graphics.fillRect(-2.68f , -1f, 0.2f, 1f,0f,0f,0.4f,0); //pant
			Graphics.fillRect(-2.33f , -1f, 0.2f, 1f,0f,0f,0.4f,0); //pant
			Graphics.fillRect(-2.05f , -0.4f, 0.27f, 0.1f,1f,0.6f,0.6f,0); // hat
			Graphics.fillRect(-2.68f , -1.61f, 0.3f, 0.2f,0f,0f,0f,0); //shoe
			Graphics.fillRect(-2.33f, -1.61f, 0.3f, 0.2f,0f,0f,0f,0); //shoe
			
			
			
			//RedSignal
			
			
			 
		//pichoner deyal movement 
		//for(int i = 0; i< 20000; i++) {
			// Random random = new Random();
			 
			//// float x = random.nextInt(10);
			// float y = random.nextInt(10);
			//float width = random.nextFloat();
			// float height = random.nextFloat();
		
			// float x = 0;
			// float y =0;
			 
		//eituku porjnto
		
		// normally Graphics.fillRect(0, 0, 1, 1);
		
		// //wall
	//	Graphics.fillRect(x, y,3 , 3,0.3019607843137255f,0.3019607843137255f,0.2f,1);// r g b rotation
		//x++;
		//}
		
		//character drawing1
	
		 // hat
	/*	Graphics.fillRect(-2.05f, 0.005f, 0.2f, 0.8f,1f,0.6f,0.6f,0); // hat
		Graphics.fillRect(-2.05f, 0.3f, 0.2f, 0.25f,1f,0.2f,0f,0); // hat
		Graphics.fillRect(-2.05f, -0.4f, 0.27f, 0.1f,1f,0.6f,0.6f,0); // hat  */
		//Graphics.fillRect(-2.5f, -0.21f, 0.2f, 0.8f,1f,0.2f,0f,45); //hand
		//Graphics.fillRect(-3.2f, -0.3f, 0.2f, 0.8f,1f,0.2f,0f,-45); //hand
		//Graphics.fillRect(-0.1f, -0.31f, 0.7f, 0.5f,1f,0.2f,0f,0); //torso
		
		//bag
		Graphics.fillRect(-3.7f, -1.61f, 0.5f, 0.65f,1f,1f,1f,0); 
		Graphics.fillRect(-3.88f, -1.14f, 0.028f, 0.3f,0f,0f,0f,0);
		Graphics.fillRect(-3.52f, -1.14f, 0.028f, 0.3f,0f,0f,0f,0);
		Graphics.fillRect(-3.7f, -0.98f, 0.37f, 0.028f,0f,0f,0f,0); 
		Graphics.fillRect(-3.7f, -1.48f, 0.5f, 0.15f,0f,0f,0f,0);
		Graphics.fillRect(-3.7f, -1.78f, 0.5f, 0.15f,0f,0f,0f,0);
		
		
		World.render();
		
	}
	//}
	
	public void init(GLAutoDrawable drawable) {
		GL2 gl= drawable.getGL().getGL2();
		gl.glClearColor(1, 1, 1, 1);
	//	gl.glEnable(GL2.GL_TEXTURE_2D);
		//image = new ImageResouce("/re/2d.PNG");
	}
	
	public void reshape(GLAutoDrawable drawable, int x, int y, int width, int height) {
		//System.out.println("Hello");
		GL2 gl= drawable.getGL().getGL2();
		gl.glMatrixMode(GL2.GL_PROJECTION);
		gl.glLoadIdentity();
		float unitsTall = Renderer.getWindowHeight() / (Renderer.getWindowWidth() / Renderer.unitsWide);
		gl.glOrtho(-Renderer.unitsWide / 2, Renderer.unitsWide / 2, -unitsTall / 2, unitsTall / 2, -1, 1);
		gl.glMatrixMode(GL2.GL_MODELVIEW);
	}

	public void dispose(GLAutoDrawable arg0) {
		// TODO Auto-generated method stub
		
	}
}
