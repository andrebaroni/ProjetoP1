package projetop1_poo;
/**
 * 
 * @author André Luiz Baroni
 */
public class Caminhao extends Veiculo{
    /**
     * 
     * @param x
     * @param y
     * @param velocidade
     * @param cor 
     */
    public Caminhao(int x, int y, int velocidade, String cor){/** Contrutor*/
        super(x, y, 1, cor);
        
    }
    
    private int capacidadeCarga = 2000;
}
