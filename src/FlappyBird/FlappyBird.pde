int x = 500;
int y = 500;
int gravity = 1; 
int birdYVelocity = 3;
int pipeX = 900;
int upperPipeHeight = 200;


void setup () {
  size(1000, 1000);
}
void draw() {
  background(20, 32, 234);
fill(100, 0, 0);
stroke(10, 20, 30);
ellipse(x, y, 20, 20);
birdYVelocity= birdYVelocity+gravity;
y=y+birdYVelocity;
fill(0, 100, 0);
rect(pipeX, 0, 150, upperPipeHeight);
pipeX = pipeX-3;
if (pipeX == 0) {
  teleportPipes();
}
}
void mousePressed() {
  birdYVelocity=-17;
}
void teleportPipes() {
  pipeX = 900;
  upperPipeHeight = (int) random(100, 400);
  
}
