package me.creepinson.mcremade.main;

import org.lwjgl.opengl.Display;

import me.creepinson.mcremade.render.DisplayManager;

public class MinecraftRemade {
     
	public static void main(String[] args){
		
		DisplayManager.createDisplay();
		
		while(!Display.isCloseRequested()){
			
			//game logic
			
			
			
			//render
		
			DisplayManager.updateDisplay();
			
		}
		
		DisplayManager.closeDisplay();
		
	}
	
	
}
