void setup() {

PImage face = loadImage("Googly Eyes.jpg");
size(800,600);
face.resize(800,600);
background(face);
}
void draw(){
  ellipse (380,80, 100, 90);
  fill(0,0,0);
  ellipse (mouseX, mouseY, 30,30);
  fill(255,255,255);
 // if(mouseX<50){
  //  mouseX-50
 // }
 //if(mousePressed){
  //println(mouseX+" "+mouseY);
 }
  //ellipse(mouseX, mouseY, 90, 90);
  ellipse (480,80, 100, 90);
  fill(0,0,0);
  ellipse (480, 80, 30, 30);
  fill(255,255,255);
}