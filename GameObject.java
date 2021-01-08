package org.world;

import org.graphics.Graphics;

public class GameObject {
	
	
	//position of the objects
		public float x = 0;
		public float y = 0;
		public float cr= 0.0015f;
		public float cyl= 0.0015f;
		public float cg= 0.0015f;
		public float c11=(float) -2.75;
		public float c22=(float) -2.82;
		public float c44=(float) -2.35;
		public float c55=(float) -2.3;
		public float c66=(float) -2.2;
		public static boolean redAlert = false;
		public static boolean greenAlert = false;
		
		public static boolean yellowAlert = false;
		public static boolean maskAlert = false;
		
		public static boolean offcoronaAlert = true;
		
		public float cy= 1f;
				//size of the objects
		public float height = 3f;
		public float width = 3f;
		
		//rotation
		public float rotation = 0;
		//public float cc = 0.0015f;
		public void update()
		{
		//implemet in sub class	
		
		}
		
		/*public void RedSignal()
		{
			Graphics.red(-2f, 1.6f, cc);
			cc += 0.009f;
			
			 if(cc> 0.3f)
			 {
				 cc = 0.0001f;
				 
			 }
		}*/
		public void render()
		{
			//System.out.println("render");
			//conductor
			Graphics.fillRect(4f + x, 0.65f, 0.2f, 0.2f,1f,0.6f,0.6f,0); //neck
			Graphics.Drawface(4f +x, 1f, 0.2999f); // head
			Graphics.DrawCircle(3.88f+x, 1.2f, .15f); // chul
			Graphics.DrawCircle(4.05f+x, 1.27f, .15f); // chul
			Graphics.DrawCircle(4.09f+x, 1.18f, .15f); // chul
			Graphics.DrawCircle(4.1f+x, 1.17f, .20f); // chul
			Graphics.DrawCircle(4.17f+x, 1.07f, .18f); // chul
			Graphics.eye(3.78f+x, 0.95f, .04f); // chokh
			Graphics.DrawCircle(3.78f+x, 0.95f, .02f); // chokh moni
			Graphics.fillRect(3.8f+x,1.02f, 0.1f, 0.02f,0.5f,0.25f,0f,0); // brow
			Graphics.fillRect(3.9f+x,0.75f, 0.09f, 0.028f,0.5f,0.25f,0f,0); // lip
			Graphics.fillRect(3.85f+x, 0.75f + y, 0.29f, 0.175f, 0f,0.8f,1f,0); //mask
			Graphics.fillRect(4.08f+x, 0.75f + y, 0.2f, 0.028f, 0f,0.8f,1f,0); //mask
			Graphics.fillRect(4f+x,0.2f, 0.47f, 0.7f,0f,0.6f,0f,0); // torso
			Graphics.fillRect(4f+x,-0.49f, 0.47f, 0.68f,0.4f,0.2f,0f,0); // kom
			Graphics.fillRect(3.88f+x,-1.2f, 0.2f, 0.98f,0.4f,0.2f,0f,0); // leg 
			Graphics.fillRect(4.1f+x,-1.2f, 0.18f, 0.96f,0.4f,0.2f,0f,1); // leg 
			Graphics.fillRect(4.07f+x, 0.1f, 0.2f, 0.5f,1f,0.6f,0.6f,0); // hat
			Graphics.fillRect(3.6f+x, -0.10f, 0.1f, 0.336f,1f,1f,1f,1); // TICKET
			Graphics.fillRect(3.89f+x, -0.1f, 0.57f, 0.2f,1f,0.6f,0.6f,0); // hat
			Graphics.fillRect(3.56f+x, -0.1f, 0.1f, 0.25f,1f,0.6f,0.6f,0); // hat
		//	Graphics.fillRect(3.49f+x, -0.13f, 0.1f, 0.25f,1f,1f,1f,1); // TICKET
			//Graphics.fillRect(1.3f+x, -1.3f, 0.2f, 0.6f,0.9f,0.6f,0f,0); //pant
			Graphics.fillRect(3.85f+x, -1.7f, 0.23f, 0.16f, 1f,0.6f,0.6f,0); //shoe
			Graphics.fillRect(3.83f+x, -1.8f, 0.274f, 0.06f, 0f, 1f,0f,0); //shoe
			Graphics.fillRect(3.81f+x, -1.72f, 0.07f, 0.18f, 0f, 1f,0f,0); //shoe
		
			
			

			Graphics.fillRect(4.1f+x, -1.7f, 0.22f, 0.16f, 1f,0.6f,0.6f,0); //shoe
			Graphics.fillRect(4.1f+x, -1.8f, 0.264f, 0.05f, 0f,1f,0f,0); //shoe
			//Graphics.fillRect(4f+x, -1.72f, 0.07f, 0.18f, 0f, 1f,0f,0); //shoe
			//Graphics.red(1.1f, -1.7f, 0.12f); // shoefront 
			
			if(redAlert == true)
			{
			//red signal
			Graphics.red(-1.8f, 1.6f, cr);
			cr += 0.009f;
			
			 if(cr> 0.3f)
			 {
				 cr = 0.0001f;
				 
			 }
			}
			 
			 if(greenAlert == true)
				{
				//grn signal
				Graphics.green(-1.8f, 1.6f, cg);
				cg += 0.009f;
				
				 if(cg> 0.3f)
				 {
					 cg = 0.0001f;
					 
				 }
			
			
			}
			 
			 
			 if(yellowAlert == true)
				{
				//red signal
				Graphics.yellow(-1.8f, 1.6f, cyl);
				cyl += 0.009f;
				
				 if(cyl> 0.3f)
				 {
					 cyl = 0.0001f;
					 
				 }
		}
			 
			 
			//patient mask
				//patient mask
			 if(maskAlert == true)
			 {
				Graphics.fillRect(-2.50f ,0.76f, 0.28f, 0.17f,1f,1f,1f,0); // lip
				Graphics.fillRect(-2.37f ,0.76f, 0.2f, 0.017f,1f,1f,1f,0); // lip
				Graphics.fillRect(-2.64f ,0.76f, 0.2f, 0.017f,1f,1f,1f,0); // lip		
			 }
			 
			 
			 //masking .. offcorona
			 
			 if(offcoronaAlert == true)
			 {
			 Graphics.red(c44 , 0.7f, .06f); // corona
				c44 += 0.008f;
				 if(c44> -1.5f)
				 {
					 c44 += -0.8f;
				 }
				Graphics.pink(c44 , 0.7f, .038f); // chokh moni
				c44 += 0.008f;
				 if(c44> -1.5f)
				 {
					 c44 += -0.8f;
				 }
				Graphics.red(c55 , 0.6f, .06f); // corona
				c55 += 0.008f;
				 if(c55> -1.5f)
				 {
					 c55 += -0.8f;
				 }
				Graphics.pink(c55 , 0.62f, .038f); // chokh moni
				c55 += 0.008f;
				 if(c55> -1.5f)
				 {
					 c55 += -0.8f;
				 }
				Graphics.red(c66 , 0.7f, .06f); // corona
				c66 += 0.008f;
				 if(c66> -1.5f)
				 {
					 c66 += -0.8f;
				 }
				Graphics.pink(c66 , 0.7f, .038f); // chokh moni
				c66 += 0.008f;
				 if(c66> -1.5f)
				 {
					 c66 += -0.8f;
				 }
				
				
				Graphics.red(c22 , 0.8f, .06f); // corona
				 c22 -= 0.0086f;
				 if(c22< -3.8f)
				 {
					 c22 -= -1.1f;
				 }
				Graphics.pink(c22 , 0.8f, .038f); // chokh moni
				 c22 -= 0.0086f;
				 if(c22< -3.8f)
				 {
					 c22 -= -1.1f;
				 }
				Graphics.red(c22 , 0.6f, .06f); // corona
				 c22 -= 0.00008f;
				 if(c22< -3.8f)
				 {
					 c22 -= -1.1f;
				 }
				Graphics.pink(c22 , 0.6f, .038f); // chokh moni
				 c22 -= 0.00008f;
				 if(c22< -3.8f)
				 {
					 c22 -= -1.1f;
				 }
				Graphics.red(c11 , 0.7f, .06f); // corona
				 c11 -= 0.008f;
				 if(c11< -3.8f)
				 {
					 c11 -= -1.1f;
				 }
				
				Graphics.pink(c11 , 0.7f, .038f); // chokh moni
				 c11 -= 0.001f;
				 if(c11< -3.8f)
				 {
					 c11 -= -1.1f;
				 }
			 }
			 
			 
			 

			}	}
