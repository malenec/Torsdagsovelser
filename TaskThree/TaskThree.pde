color red = color (255, 0, 0);
color yellow = color (255, 255, 0);
color green = color (0, 255, 0);
color grey = color (100, 100, 100);

void setup () {
  size (400, 400);
  background(255);
  frameRate(5);
}

void draw () {

  if (frameCount > 0 && frameCount < 10 || frameCount > 30 && frameCount < 40) {
    fill (green) ;
  } else {
    fill (grey);
  }
  circle (200, 80, 100);

  if (frameCount >10 && frameCount < 20 || frameCount > 40 && frameCount < 50) {
    fill (yellow) ;
  } else {
    fill (grey);
  }
  circle (200, 200, 100);
  
   if (frameCount > 20 && frameCount < 30 || frameCount > 50 && frameCount < 60) {
    fill (red) ;
  } else {
    fill (grey);
  }
  circle (200, 320, 100);
 
}
