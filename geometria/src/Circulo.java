
public class Circulo extends FiguraGeometrica {
	private double radio;
	//Constante pi
	static final double PI = 3.1416;
	
	
	public Circulo(double r, String tipoFigura) {
		super(tipoFigura);
		//radio = r; Anulo radio y lo multiplico por -1. regla de signos=> - x - = +
		if (r<0) {
			radio = r*-1;
		}
		else
		{
			radio =r;
		}
	}

	@Override
	public double area() {
		return radio * radio * PI;

	}
	
	@Override
	public double perimetro() {
		return radio * 2 * PI;
	}

}
