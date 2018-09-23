
public class Complex {
	double realPart,imaginaryPart;
	
	public Complex(){
		realPart=0;
		imaginaryPart=0;
	}
	public Complex(double realPart, double imaginaryPart){
		this.realPart=realPart;
		this.imaginaryPart=imaginaryPart;
	}
	public Complex(Double ...c){
		realPart=c[0];
		if(c.length==1) imaginaryPart=0;
		else imaginaryPart=c[1];
	}
	
	public Complex add(Complex otherNumber){
		return new Complex(realPart+otherNumber.realPart, imaginaryPart+otherNumber.imaginaryPart);
	}
	public Complex subtract(Complex otherNumber){
		return new Complex(realPart-otherNumber.realPart, imaginaryPart-otherNumber.imaginaryPart);
	}
	public Complex multiply(Complex otherNumber){
		double a=otherNumber.realPart;
		double b=otherNumber.imaginaryPart;
		return new Complex(realPart*a-imaginaryPart*b, realPart*b+imaginaryPart*a);
	}
	public Complex divide(Complex otherNumber){
		double a=otherNumber.realPart;
		double b=otherNumber.imaginaryPart;
		double den=a*a+b*b;
		return new Complex((realPart*a+imaginaryPart*b)/den, (imaginaryPart*a-realPart*b)/den);
	}
	
	public void setRealPart (double realPart){
		this.realPart = realPart;
	}
	public double getImaginaryPart() {
		return imaginaryPart;
	}
	public void setImaginaryPart(double imaginaryPart) {
		this.imaginaryPart = imaginaryPart;
	}
	public double getRealPart() {
		return realPart;
	}
}
