import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
  size(1000, 1000);
}

/** 
 * Called once at the beginning of execution.  Add initial set up
 * values here i.e background, stroke, fill etc.
 */
public void setup() {
  background(135, 206, 235);
}

/**
 * Called repeatedly, anything drawn to the screen goes here
 */
public void draw() {
 
  
//ear
fill(150,75,0);
triangle(450,700,475,600,500,700);




// Horse head
fill(150,75,0);
ellipse(400,700,200,75); 
   


// horse body
fill(150,75,0);
rect(470,730,400,75); 

// horse legs

rect(470,800,60,100);
rect(570,800,60,100);
rect(730,800,60,100);
rect(811,800,60,100);



//grass
fill(0,255,0);
rect(0,900,1000,100);

//eyes
fill(255);
ellipse(450, 680, 30, 20);
fill(0);
ellipse(450, 680, 10, 10);

//mouth
line(300,700,350,700);

//tail
line(870,770,900,820);
line(870,770,900,830);
line(870,770,900,840);
line(870,770,900,850);
line(870,770,900,860);

//sun
fill(255,255,0);
ellipse(75,75,200,200);


//time variable
int hours = hour();
int minutes = minute();


//time on screen
fill(255,165,0);
textSize(100);
text(hours, 100, 150);
text(minutes, 250, 150);

}
}
