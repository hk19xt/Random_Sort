package Lab_Exam_2;


import Media.*;                  // for Turtle, Picture, PictureDisplayer, etc.
import BasicIO.*;                // for ASCIIDataFile, etc. ReportWriter & BasicForm
import java.awt.*;               // for Color class
import static BasicIO.Formats.*; // for getCurrencyInstance, etc.
import static java.lang.Math.*;  // for math constants and functions & random
import static java.awt.Color.*;  // for Color constants (e.g. RED)


public class Question5 {
    
    // Instance variable declarations
    private BasicForm display;
    
    public Question5 () {
        int first = 0;
        int second = 0;
        int third = 0;
        int fourth = 0;
        int fifth = 0;
        int last = 0;
        int button = 0;
        
        display = new BasicForm("Generate","Enter","Quit");
        buildForm();
        
        for( ; ; ){
         
          sort(first,second,third,fourth,fifth);
          button = display.accept();
          last = 0;
          switch(button){
            case 0:{
              last = (int)(Math.random()*100)+1;
              display.writeInt("last",last);
              last = display.readInt("last");
              if (last>first&&last>second&&last>third&&last>fourth&&last>fifth){
                display.clearAll();
                continue;}
              else{
                last = (int)(Math.random()*100)+1;
                display.writeInt("last",last); 
                display.readInt("last");
                continue;}
            }
            case 1:{
              display.readInt("last");
               if (last>first&&last>second&&last>third&&last>fourth&&last>fifth){
                continue;}
               else{
                last = (int)(Math.random()*100)+1;
                display.writeInt("last",last); 
                display.readInt("last");
                continue;}
            }
            case 2:{
              break;
            }  
          }
        break;
        }
        display.close();
    };  // constructor
    
    // Method declarations
    private void buildForm(){
      display.addTextField("first","1st",5,10,10);
      display.setEditable("first",false);
      display.addTextField("second","2nd",5,80,10);
      display.setEditable("second",false);
      display.addTextField("third","3rd",5,160,10);
      display.setEditable("third",false);
      display.addTextField("fourth","4th",5,240,10);
      display.setEditable("fourth",false);
      display.addTextField("fifth","5th",5,320,10);
      display.setEditable("fifth",false);
      display.addTextField("last","Last",5,155,40);
    }
    
    private void sort(int first, int second, int third, int fourth, int fifth){
          first = (int)(Math.random()*999)+1;
          second = (int)(Math.random()*999)+1;
          third = (int)(Math.random()*999)+1;
          fourth = (int)(Math.random()*999)+1;
          fifth = (int)(Math.random()*999)+1;
          
    int temp;
    
    for(int count=0 ;count<4 ;count++ ){
      if(second < first){
      temp = first;
      first = second;
      second = temp;
      }
      display.writeInt("first",first);
      if(third<second){
      temp = second;
      second = third;
      third = temp;
      }
      display.writeInt("second",second);
      if(fourth<third){
      temp = third;
      third = fourth;
      fourth = temp;
      }
      display.writeInt("third",third);
      if(fifth <fourth){
      temp = fourth;
      fourth=fifth;
      fifth = temp;
      }
      display.writeInt("fourth",fourth);
      display.writeInt("fifth",fifth);
    }
    }
    public static void main ( String[] args ) { Question5 c = new Question5(); };
    
}
