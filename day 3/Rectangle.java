class Rectangle {
void drawRectangle() {
// Code to draw a rectangle
}
}
class Circle {
void drawCircle() {
// Code to draw a circle
}
}interface Document {
void print();
void scan();
void fax();
}
class SimplePrinter implements Document {
@Override
public void print() {
// Print the document
}
@Override
public void scan() {
// Not applicable for
SimplePrinter
}
@Override
public void fax() {
// Not applicable for
SimplePrinter
}
}
class Photocopier implements Document {
@Override
public void print() {
// Print the document
}
@Override
public void scan() {
// Scan the documente
}
@Override
public void fax() {
// Fax the document
}
}