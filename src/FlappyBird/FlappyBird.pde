int x = 500;
int y = 500;
int gravity = 1; 
int birdYVelocity = 3;
int pipeX = 900;
int upperPipeHeight = 200;
int pipeGap = 400;
int pipeX2 = 900;
int lowerY = upperPipeHeight +pipeGap;
int bottom = 900;
int score = 0;
void setup () {
  size(1000, 1000);
}
void draw() {
  background(20, 32, 234);
 fill(0, 0, 100);

 text(score, 0, 25);

  fill(100, 0, 0);
  rect(0, bottom, 1000, 100);
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
  fill(0, 100, 0);
  rect(pipeX2, lowerY, 150, lowerY);
  pipeX2 = pipeX2-3;
  if (pipeX2 == 0) {
    
  }
  Boolean x = intersectsPipes();
  if (x.equals(true)) {
    exit();
}
if (y > bottom) {
  exit();
}
}

void mousePressed() {
  birdYVelocity=-17;
}
void teleportPipes() {
  pipeX = 900;
  pipeX2 = 900;
  upperPipeHeight = (int) random(100, 400);
  lowerY = (int) random(500, 1000);
  score = score+1;
}
boolean intersectsPipes() { 
         if (y < upperPipeHeight && x > pipeX && x < (pipeX+150)){
            return true; }
        else if (y>lowerY && x > pipeX && x < (pipeX+150)) {
            return true; }
        else { return false; }
}
