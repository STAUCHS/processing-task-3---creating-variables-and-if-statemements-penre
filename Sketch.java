import processing.core.PApplet;

public class Sketch extends PApplet {
	
	float score = (random(100));
  float randomNum;
  float sunX;
  float sunY;

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
  sunX = random(0, 400);
  sunY = random(0,150);

 //random if statements
  randomNum = random(0,100);
  if (score >= 50) {
    background(140,90,2);
    text("horse",200,100);
  }
  else {
    background(520,0,10);
    text("HORSE",200,100);
  }

  fill(random(150),random(75),random(0));

  }





  
  
  //random color horse
 


/**
 * Called repeatedly, anything drawn to the screen goes here
 */
public void draw() {
 
  
//ear

triangle(450,700,475,600,500,700);




// Horse head

ellipse(400,700,200,75); 
   


// horse body

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
ellipse(sunX,sunY,200,200);


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
