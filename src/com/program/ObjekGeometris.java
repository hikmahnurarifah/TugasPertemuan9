/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.program;

/**
 *
 * @author Hikmah
 */
public class ObjekGeometris {
    
    private String color;
    private boolean filled;
    
    public ObjekGeometris(){
        this.color = "white";
        this.filled = false;
    }
    
    public ObjekGeometris(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }
    
    public String getColor(){
        return color;
    }
    
    public void setColor(String color) {
        this.color = color;
    }
    
    public boolean isFilled(){
        return filled;
    }
    
    public void setFilled(boolean filled){
        this.filled = filled;
    }
    
    @Override
    public String toString(){
        return "ObjekGeometris{color='" + color + "', filled=" + filled + "}";
    }
    
}
