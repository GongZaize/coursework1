public double sphere(double d) {
    double radius = d / 2;
    return (4.0 / 3) * Math.PI * Math.pow(radius, 3);
}

double result = sphere(20.24);
System.out.println(result);
