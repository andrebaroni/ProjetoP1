package projetop1_poo;
/**
 * 
 * @author André Luiz Baroni
 */
public class Moto extends Veiculo{
    /**
     * 
     * @param x
     * @param y
     * @param velocidade
     * @param cor 
     */
    public Moto(int x, int y, int velocidade, String cor) {/** Contrutor*/
        super(x, y, 3, cor);
    }
    
    private String tipo = "Kawasaki";
}
