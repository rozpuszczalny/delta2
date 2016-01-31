package delta;

public class Quadratic {
    private double a,b,c;
    private double x1,x2;
    private double delta;
    
    public Quadratic(double a, double b, double c) {
	this.a = a;
	this.b = b;
	this.c = c;
	
	this.delta = (b*b) - (4*a*c);
	
	if(this.delta > 0) {
	    this.x1 = ((-b)-(Math.sqrt(this.delta)))/(2*a);
	    this.x2 = ((-b)+Math.sqrt(this.delta))/(2*a);
	} else if (this.delta == 0) {
	    this.x1 = (-b)/(2*a);
	    this.x2 = this.x1;
	} else {
	    this.x1 = Double.NaN;
	    this.x2 = Double.NaN;
	}
    }
    
    public double getX1() {
	return this.x1;
    }
    
    public double getX2() {
	return this.x2;
    }
    
    public double getDelta() {
	return this.delta;
    }
    
    public boolean hasAnswer() {
	return (this.delta >= 0);
    }
    
    @Override
    public String toString() {
	return this.a + "x^2" + ((this.b > 0) ? "+" : "") + this.b + "x" + ((this.c > 0) ? "+" : "") + this.c;
    }
}
