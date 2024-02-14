package Inheritance2;

import Inheritance.Shape;

import java.util.Scanner;

public class Square  extends Shape

{
        private int s;


    public Square(int s,String name) {
           // super("sq");
         //  super.setName("sq");
            this.s=s;


    }
        public int perimeter() {
            return 4*s;
        }

//    public void shapeofRect(){
//        System.out.println("Rect have 4 side");
//    }


//    public static void main(String[] args)
//    {
//        Scanner sc = new Scanner(System.in);
//
//            Square sq = new Square();
//            Shape sh= new Shape();
//            Shape sh1 = new Square();
//            sq.shapeofRect();
//            sq.formulaOfRect();


    }



