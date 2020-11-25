/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BangundDatar;

/**
 *
 * @author fadil
 */
public class Lingkaran implements BangunDatar{
    public static void main(String[] args){
        
    }
    private double pi = 3.1415;
    
    Lingkaran(){
        
    }

    @Override
    public double luas(int s1, int s2) {
        return 0;
    }

    @Override
    public double keliling(int s1, int s2) {
    return 0;    
    
    }
    
    public double luas(int e){  double r = 0;
//Metode Overload
        return (pi * r * r);
    }
    
    public double keliling(int r){  int p1 = 0;
//Methode Overload
        return (2 * p1 * r);
    }    
}