package delta;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class QuadraticTest {
private Quadratic instance;
public QuadraticTest() {
this.instance = new Quadratic(4, -16, 2);
}
/**
* Test of getX1 method, of class Quadratic.
*/
@Test
public void testGetX1() {
double expResult = 2-(Math.sqrt(7.0/2.0));
double result = this.instance.getX1();
assertEquals(expResult, result, 0.0);
}
/**
* Test of getX2 method, of class Quadratic.
*/
@Test
public void testGetX2() {
double expResult = 2+(Math.sqrt(7.0/2.0));
double result = this.instance.getX2();
assertEquals(expResult, result, 0.0);
}
/**
* Test of getDelta method, of class Quadratic.
*/
@Test
public void testGetDelta() {
double expResult = 224;
double result = this.instance.getDelta();
assertEquals(expResult, result, 0.0);
}
/**
* Test of hasAnswer method, of class Quadratic.
*/
@Test
public void testHasAnswer() {
boolean expResult = true;
boolean result = this.instance.hasAnswer();
assertEquals(expResult, result);
}
/**
* Test of toString method, of class Quadratic.
*/
@Test
public void testToString() {
String expResult = "4.0x^2-16.0x+2.0";
String result = this.instance.toString();
assertEquals(expResult, result);
}
}
