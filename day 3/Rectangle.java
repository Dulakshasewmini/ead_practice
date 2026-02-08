class Rectangle {
void drawRectangle() {
// Code to draw a rectangle
}
}
class Circle {
void drawCircle() {
// Code to draw a circle
}
interface Shape {
void draw();
}
class Rectangle implements Shape {
@Override
public void draw() {
// change comment 
}
}
class Square implements Shape {
@Override
public void draw() {
// Code to draw a square
}
}
}