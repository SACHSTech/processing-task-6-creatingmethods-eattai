import processing.core.PApplet;

public class Sketch extends PApplet {

  public void settings() {
    size(1300, 1300);
  }

  public void setup() {
    background(74,103,65); // Change background color
  }

  public void draw() {
    // Checks to see if the users mouse button has been pressed
    if (turnBlue(mousePressed)) {
      for (int intY = 100; intY < 750; intY += 300) {
        for (int intX = 50; intX < 1000; intX += 300) {
          drawHouse(intX, intY, 0, 0, 255); // Use white color
          drawPerson(intX, intY, 20, 255, 255, 255); // Increase head size
        }
      }
    } else {
      for (int intY = 100; intY < 750; intY += 300) {
        for (int intX = 50; intX < 1000; intX += 300) {
          drawHouse(intX, intY, intX / 6 + intY / 8, intX / 2 + intY / 4, intX / 4 + intY / 2);
          drawPerson(intX, intY, 20, intX / 6 + intY / 8, intX / 2 + intY / 4, intX / 4 + intY / 2);
        }
      }
    }
  }

  public void drawHouse(int intHouseX, int intHouseY, int intRed, int intGreen, int intBlue) {
    // Main building of the house
    stroke(0);
    fill(intRed, intGreen, intBlue);
    rect(intHouseX, intHouseY, 200, 190);

    // Roof of the house
    stroke(0);
    fill(165,42,42); // Change roof color
    triangle(intHouseX, intHouseY, intHouseX + 100, intHouseY - 100, intHouseX + 200, intHouseY);

    // Window
    fill(102, 204, 255); // Change window color
    ellipse(intHouseX + 100, intHouseY - 45, 50, 50);
    line(intHouseX + 125, intHouseY - 45, intHouseX + 75, intHouseY - 45);
    stroke(0);
    line(intHouseX + 100, intHouseY - 20, intHouseX + 100, intHouseY - 70);
    stroke(0);

    // Door and door handle
    fill(255,0,0); // Change door color
    rect(intHouseX + 55, intHouseY + 65, 85, 125);
    fill(196,180,84);
    ellipse(intHouseX + 130, intHouseY + 125, 10, 10);
  }

    //Stick Figure
  public void drawPerson(int intPersonX, int intPersonY, int intHead, int intRed, int intGreen, int intBlue) {
    // Head of the stick figure
    noFill();
    stroke(intRed, intGreen, intBlue);
    ellipse(intPersonX + 275, intPersonY + 80, intHead, intHead); // Adjust head size

    // Draw the stick figure's body, legs, and arms
    stroke(intRed, intGreen, intBlue);
    line(intPersonX + 275, intPersonY + 140, intPersonX + 275, intPersonY + 90);
    line(intPersonX + 275, intPersonY + 140, intPersonX + 290, intPersonY + 175);
    line(intPersonX + 275, intPersonY + 140, intPersonX + 260, intPersonY + 175);
    line(intPersonX + 275, intPersonY + 100, intPersonX + 250, intPersonY + 130);
    line(intPersonX + 275, intPersonY + 100, intPersonX + 300, intPersonY + 130);
  }

  public boolean turnBlue(boolean mousePressed) {
    return mousePressed;
  }

  // New method for Level 4
  public float calculateCenterX(float objectWidth) {
    return (width - objectWidth) / 2;
  }

  public static void main(String[] args) {
    PApplet.main("Sketch");
  }
}