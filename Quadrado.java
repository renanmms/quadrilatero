package quadmain;

public class Quadrado extends Paralelogramo
{
    public Quadrado(Ponto pontoA, Ponto pontoB, Ponto pontoC, Ponto pontoD)
    {
        super(pontoA, pontoB, pontoC, pontoD);
                
        System.out.println("Quadrado");
    }
 
    public double AreaQuadrado()
    {
        return Math.pow(BaseMaior(), 2);
    }
}
