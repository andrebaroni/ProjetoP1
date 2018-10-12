package projetop1_poo;

import java.util.Random;

public class Veiculo {

    /**
     * 
     * @param x
     * @param y
     * @param velocidade
     * @param cor 
     */
    
  public Veiculo(int x, int y, int velocidade, String cor){ /** Contrutor*/
    this.x = x;
    this.y = y;
    this.cor = cor;
    this.velocidade = velocidade;
    
  }
  /**
   * 
   * @param c 
   */
  public Veiculo(Carro c){
      this.x = c.getX();
      this.y = c.getY();
      this.cor = c.getCor();
      this.velocidade = c.getVelocidade();
  }
  
  

/**
 * 
 * @return x
 */
  public int getX() {
        return x;
    }
/**
 * 
 * @param x 
 */
    public void setX(int x) {
        this.x = x;
    }
/**
 * 
 * @return y
 */
    public int getY() {
        return y;
    }
/**
 * 
 * @param y 
 */
    public void setY(int y) {
        this.y = y;
    }
/**
 * 
 * @return velocidade
 */
    public int getVelocidade() {
        return velocidade;
    }
/**
 * 
 * @param velocidade 
 */
    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }
    /**
     * 
     * @return 
     */
    public String getCor() {
        return cor;
    }
/**
 * 
 * @param cor 
 */
    public void setCor(String cor) {
        this.cor = cor;
    }

    public void movimento(){ /** Funcao de movimento*/
        Random ran = new Random();
        int random = ran.nextInt(3);
        
      switch (random) {
          case 0:
              //ir para a esquerda
              if(this.x - this.velocidade <= 0){
                  this.x = 58;
              }else{
                  this.x -= this.velocidade;
              } break;
          case 1:
              //ir para baixo
              if(this.y + this.velocidade >= 28){
                  this.y = 1;
              }else{
                  this.y += this.velocidade;
              } break;
          case 2:
              //ir para cima
              if(this.y - this.velocidade <=0){
                  this.y = 28;
              }else{
                  this.y -= this.velocidade;
              } break;
          case 3:
              //ir para a direita
              if(this.x + this.velocidade >= 58){
                  this.x  = 1;
              }else{
                  this.x  += this.velocidade;
              } break;
          default:
              break;
      }
      
    }
    /**
     * 
     * @return fabrica
     */
    public boolean isFabrica() {
        return fabrica;
    }
/**
 * 
 * @param fabrica 
 */
    public void setFabrica(boolean fabrica) {
        this.fabrica = fabrica;
    }

  private int velocidade;
  private boolean fabrica;
  private String cor;
  private int x;
  private int y;

}