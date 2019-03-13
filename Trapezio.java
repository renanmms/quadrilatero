package quadmain;

public class Trapezio extends Quadrilatero 
{
    public Trapezio(Ponto pontoA, Ponto pontoB, Ponto pontoC, Ponto pontoD)
    {
        super(pontoA, pontoB, pontoC, pontoD);
        
        System.out.println("Trapézio");
    }
    
    public double BaseMaior()
    {
        // distancia entre os pontos A e B da base maior
        return Math.sqrt(Math.pow(getPontoB().getX() - getPontoA().getX(), 2) + Math.pow(getPontoB().getY() - getPontoA().getY(), 2));
    }
    
    public double BaseMenor()
    {
        // distancia entre os pontos C e D da base menor
        return Math.sqrt(Math.pow(getPontoD().getX() - getPontoC().getX(), 2) + Math.pow(getPontoD().getY() - getPontoC().getY(), 2));
    }
    
    public double Altura()
    {
        // altura entre as bases maior e menor
        return getPontoC().getY() - getPontoA().getY();
    }
 
    public double AreaTrapezio()
    {
        return ((BaseMaior() + BaseMenor()) * Altura())/2;
    }
}
