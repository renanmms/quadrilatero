package quadmain;

public class Quadrilatero 
{
    private Ponto pontoA, pontoB, pontoC, pontoD; 
    
    public Quadrilatero(Ponto pontoA, Ponto pontoB, Ponto pontoC, Ponto pontoD)
    {
        this.pontoA = pontoA;
        this.pontoB = pontoB;
        this.pontoC = pontoC;
        this.pontoD = pontoD;
        
        System.out.println("Quadrilátero");
    }

    public void setPontoA(Ponto pontoA) 
    {
        this.pontoA = pontoA;
    }

    public void setPontoB(Ponto pontoB) 
    {
        this.pontoB = pontoB;
    }

    public void setPontoC(Ponto pontoC) 
    {
        this.pontoC = pontoC;
    }

    public void setPontoD(Ponto pontoD) 
    {
        this.pontoD = pontoD;
    }

    public Ponto getPontoA() 
    {
        return pontoA;
    }

    public Ponto getPontoB() 
    {
        return pontoB;
    }

    public Ponto getPontoC() 
    {
        return pontoC;
    }

    public Ponto getPontoD() 
    {
        return pontoD;
    }  
}
