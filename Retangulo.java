package quadmain;

public class Retangulo extends Paralelogramo
{
    public Retangulo(Ponto pontoA, Ponto pontoB, Ponto pontoC, Ponto pontoD)
    {
        super(pontoA, pontoB, pontoC, pontoD);
        
        System.out.println("Retângulo");
    }
 
    public double AreaRetangulo()
    { 
        return BaseMaior() * Altura();
    }
    
}
