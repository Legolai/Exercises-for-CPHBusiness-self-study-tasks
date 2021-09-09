// Task 3.a
color green = color(0, 255, 0);
color yellow = color(255, 255, 0);
color red = color(255, 0, 0);
color bgColor = color(0);

int diametre = 180;
int radius = diametre/2;

void setup () {
  size(200, 600);
  background(bgColor);
  fill(red);
  circle(width/2, height/3-radius, diametre);
  fill(yellow);
  circle(width/2, height/3*2-radius, diametre);
  fill(green);
  circle(width/2, height-radius, diametre);
}


// Task 3.b
color grey = color(100);

// Task 3.c
void draw() {
  if (frameCount % 30 == 0) {
    fill(grey);
    circle(width/2, height/3-radius, diametre);
  } else if (frameCount % 15 == 0) {
    fill(red);
    circle(width/2, height/3-radius, diametre);
  }
}
