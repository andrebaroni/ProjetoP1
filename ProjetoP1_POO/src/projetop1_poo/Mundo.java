/**
 * 
 * @author André Luiz Baroni
 */
package projetop1_poo;

import java.util.ArrayList;
import java.util.Random;

public class Mundo{

  public static final String GREEN_BACKGROUND = "\u001B[42m"; 
  public static final String RED_BACKGROUND = "\033[41m";
  public static final String PURPLE_BACKGROUND = "\u001B[45m";
  public static final String BLACK_BACKGROUND = "\033[40m";
  public static final String LIGHTBLUE_BACKGROUND = "\u001B[46m";
  public static final String YELLOW_BACKGROUND = "\033[43m";
  public static final String BLUE_BACKGROUND = "\u001B[44m";

  private int mapa[][] = //30x60 ***************
    {
        {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,70,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,70,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,70,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,70,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,70,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,70,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,70,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,70,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,70,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,70,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
    };
    

    ArrayList<Carro> carro = new ArrayList<>();
    ArrayList<Caminhao> caminhao = new ArrayList<>();
    ArrayList<Moto> moto = new ArrayList<>();
    ArrayList<Bicicleta> bicicleta = new ArrayList<>();
    
    
   public int cont = 0;

  void desenhaMundo(){
      
        /**
         * desenha o mundo
         **/
    for(int i = 0; i<30; i++){
            for(int j = 0; j < 60; j++){
                
                if(mapa[i][j] == 0){
                    System.out.print(GREEN_BACKGROUND + " "); 
                    
                }
                if(mapa[i][j] == 1){
                    System.out.print(RED_BACKGROUND + " "); 
                }
                if(mapa[i][j] == 9){
                    System.out.print(PURPLE_BACKGROUND + " "); 
                }
                if(mapa[i][j] == 3){
                    //c.get(j).setX(j);
                    //c.get(i).setY(i);
                    System.out.print(BLUE_BACKGROUND + " ");
                }
            }
            System.out.println(" ");
    }

  }

/** Funcao que movimenta os veiculos dentro do mapa*/
  public void moviment(){
      
      carro.forEach((c) -> {
          c.movimento();
      });
      caminhao.forEach((ca) -> {
          ca.movimento();
      });
      moto.forEach((m) -> {
          m.movimento();
      });
      if(cont % 2 ==0 ){
          bicicleta.forEach((b) -> {
              b.movimento();
          }); 
      }
      cont = cont + 1;
  }
  
  /** Funcão que detecta colisão entre os veiculos e entre veiculo e fabrica*/
  public void colisao(){
      
            for (int i = 0;i < caminhao.size();i++) {
                mapa[caminhao.get(i).getY()][caminhao.get(i).getX()] += 12;
            }
            for (int i = 0;i < carro.size();i++) {
                mapa[carro.get(i).getY()][carro.get(i).getX()] += 8;
            }
            for (int i = 0;i < moto.size();i++) {
                mapa[moto.get(i).getY()][moto.get(i).getX()] += 3;
            }
            for (int i = 0;i < bicicleta.size();i++) {
                mapa[bicicleta.get(i).getY()][bicicleta.get(i).getX()] += 2;
            }

            /** Verificações de colisão */
            for (int i = 0;i < 30; i++) {
                for (int j = 0; j < 60; j++) {
                    /** Colisão de caminhão com carro*/
                    if (mapa[i][j] == 20) {
                        mapa[i][j] = 12;
                        for (int k = 0; k < carro.size(); k++) {
                            if (carro.get(k).getY() == i && carro.get(k).getX() == j) {
                                carro.remove(k);
                            }
                        }
                    }
                    /**Colisão de caminhao com moto*/
                    if (mapa[i][j] == 15) {
                        mapa[i][j] = 12;
                        for (int k = 0; k < moto.size(); k++) {
                            if (moto.get(k).getY() == i && moto.get(k).getX() == j) {
                                moto.remove(k);
                            }
                        }
                    }
                    /**Colisão de caminhão com bike*/
                    if (mapa[i][j] == 14) {
                        mapa[i][j] = 12;
                        for (int k = 0; k < bicicleta.size(); k++) {
                            if (bicicleta.get(k).getY() == i && bicicleta.get(k).getX() == j) {
                                bicicleta.remove(k);
                            }
                        }
                    }
                    //Colisão de carro com moto
                    if (mapa[i][j] == 11) {
                        mapa[i][j] = 8;
                        for (int k = 0; k < moto.size(); k++) {
                            if (moto.get(k).getY() == i && moto.get(k).getX() == j) {
                                moto.remove(k);
                            }
                        }
                    }
                    /**Colisão de carro com bike*/
                    if (mapa[i][j] == 10) {
                        mapa[i][j] = 8;
                        for (int k = 0; k < bicicleta.size(); k++) {
                            if (bicicleta.get(k).getY() == i && bicicleta.get(k).getX() == j) {
                                bicicleta.remove(k);
                            }
                        }
                    }
                    /**Colisão de moto com Bike*/
                    if (mapa[i][j] == 5) {
                        mapa[i][j] = 3;
                        for (int k = 0; k < bicicleta.size(); k++) {
                            if (bicicleta.get(k).getY() == i && bicicleta.get(k).getX() == j) {
                                bicicleta.remove(k);
                            }
                        }
                    }
                    /**Colisao de caminhao com caminhao*/
                    if (mapa[i][j] == 24) {
                        mapa[i][j] = 0;
                        for (int k = 0; k < caminhao.size(); k++) {
                            if (caminhao.get(k).getY() == i && caminhao.get(k).getX() == j) {
                                caminhao.remove(k);
                            }
                        }
                    }
                    /**Colisao de carro com carro*/
                    if (mapa[i][j] == 16) {
                        mapa[i][j] = 0;
                        for (int k = 0; k < carro.size(); k++) {
                            if (carro.get(k).getY() == i && carro.get(k).getX() == j) {
                                carro.remove(k);
                            }
                        }
                    }
                    /**Colisao de moto com moto*/
                    if (mapa[i][j] == 6) {
                        mapa[i][j] = 0;
                        for (int k = 0; k < moto.size(); k++) {
                            if (moto.get(k).getY() == i && moto.get(k).getX() == j) {
                                moto.remove(k);
                            }
                        }
                    }
                    /**Colisão de bike com bike*/
                    if (mapa[i][j] == 4) {
                        mapa[i][j] = 0;
                        for (int k = 0; k < bicicleta.size(); k++) {
                            if (bicicleta.get(k).getY() == i && bicicleta.get(k).getX() == j) {
                                bicicleta.remove(k);
                            }
                        }
                    }
                    
                    
                    Random ran = new Random();
                    /**Colisão de caminhao com fabrica*/
                    
                    if (mapa[i][j] == 82) {
                        mapa[i][j] = 12; /**70 + 12 = 82*/
                        caminhao.add(new Caminhao((ran.nextInt(58) + 1), (ran.nextInt(28) + 1), 3, YELLOW_BACKGROUND));
                    }
                    
                    /**Colisão de carro com fabrica*/
                    if (mapa[i][j] == 78) { 
                        mapa[i][j] = 8; /**70 + 8 = 78*/
                        carro.add(new Carro((ran.nextInt(58) + 1), (ran.nextInt(28) + 1), 3, BLUE_BACKGROUND));
                    }
                    
                    /**Colisão de moto com fabrica*/
                    if (mapa[i][j] == 73) { 
                        mapa[i][j] = 3; /**70 + 3 = 73*/
                        moto.add(new Moto((ran.nextInt(58) + 1), (ran.nextInt(28) + 1), 3, LIGHTBLUE_BACKGROUND));
                    }
                    
                    /**Colisão de bike com fabrica*/
                    if (mapa[i][j] == 72) {
                        mapa[i][j] = 2; /**70 + 2 = 72*/
                        bicicleta.add(new Bicicleta((ran.nextInt(58) + 1), (ran.nextInt(28) + 1), 3, RED_BACKGROUND));
                    }
                    
                } 
            }
      
            
            for (int i = 0;i < caminhao.size();i++) {
                mapa[caminhao.get(i).getY()][caminhao.get(i).getX()] -= 12;
            }
            for (int i = 0;i < carro.size();i++) {
                mapa[carro.get(i).getY()][carro.get(i).getX()] -= 8;
            }
            for (int i = 0;i < moto.size();i++) {
                mapa[moto.get(i).getY()][moto.get(i).getX()] -= 3;
            }
            for (int i = 0;i < bicicleta.size();i++) {
                mapa[bicicleta.get(i).getY()][bicicleta.get(i).getX()] -= 2;
            }      
            
 }
  /**Funcao que faz as fabricas voltarem ao normal, pois os veiculos passam por cima e "apagam" */
  public void arrumarFabricas(){
      
    mapa[3][6] = 70;
    mapa[14][5] = 70;
    mapa[8][20] = 70;
    mapa[19][22] = 70;
    mapa[21][50] = 70;
    mapa[6][46] = 70;
    mapa[8][3] = 70;
    mapa[25][32] = 70;
    mapa[12][43] = 70;
    mapa[12][24] = 70;
  }
   
  /**Função que faz o jogo rodar infinitamente */
  public void gameLoop(){
      
        
        boolean running = true;
        int i = 0;
        
        try {
            Thread.sleep(500);
        } catch (InterruptedException ex) {
        }
        for (i = 0; i < 100; i++) {
            System.out.println();
        }
        
        /**Respawn de veiculos no mapa */
        Random ran = new Random();
        int ger, ger2;
        for(i = 0; i < 10; i++){
            
            /**carro*/
            ger = ran.nextInt(29);
            ger2 = ran.nextInt(59);
            if(ger == 0){
                ger = 1;
            }
            if(ger2 == 0){
                ger2 = 1;
            }
            if(mapa[ger][ger2] == 0){
                mapa[ger][ger2] = 3;
                carro.add(new Carro(ger2, ger, 2, BLUE_BACKGROUND)); 
                
            }
            
            /**caminhao*/
            ger = ran.nextInt(29);
            ger2 = ran.nextInt(59);
            if(ger == 0){
                ger = 1;
            }
            if(ger2 == 0){
                ger2 = 1;
            }
            if(mapa[ger][ger2] == 0){
                mapa[ger][ger2] = 4;
                caminhao.add(new Caminhao(ger2, ger, 1, YELLOW_BACKGROUND)); 
                
            }
            
            /**moto*/
            ger = ran.nextInt(29);
            ger2 = ran.nextInt(59);
            if(ger == 0){
                ger = 1;
            }
            if(ger2 == 0){
                ger2 = 1;
            }
            if(mapa[ger][ger2] == 0){
                mapa[ger][ger2] = 5;
                moto.add(new Moto(ger2, ger, 3, LIGHTBLUE_BACKGROUND)); 
                
            }
            
            /**bicicleta*/
            ger = ran.nextInt(29);
            ger2 = ran.nextInt(59);
            if(ger == 0){
                ger = 1;
            }
            if(ger2 == 0){
                ger2 = 1;
            }
            if(mapa[ger][ger2] == 0){
                mapa[ger][ger2] = 6;
                bicicleta.add(new Bicicleta(ger2, ger, 3, RED_BACKGROUND)); 
                
            }
        }
        
        
        
        Boolean print = false;
        int bv = 0;
        
        
        
        while(running){
            
            System.out.println("Carros: " + carro.size() + " Caminhoes: " + caminhao.size() + " Motos: " + moto.size() + " Bicicletas: " + bicicleta.size());
            
            /**Desenha o mundo */
            for (i = 0; i < 30; i++) {
                for (int j = 0; j < 60; j++) {
                    print = false;
                    for (Carro c : carro) {
                        if (j == c.getX() && i == c.getY()) {
                            System.out.print(c.getCor() + " ");
                            print = true;
                            break;
                        }
                    }
                    for (Caminhao ca : caminhao) {
                        if (j == ca.getX() && i == ca.getY()) {
                            System.out.print(ca.getCor() + " ");
                            print = true;
                            break;
                        }
                    }
                    for (Moto m : moto) {
                        if (j == m.getX() && i == m.getY()) {
                            System.out.print(m.getCor() + " ");
                            print = true;
                            break;
                        }
                    }
                    for (Bicicleta b : bicicleta) {
                        if (j == b.getX() && i == b.getY()) {
                            System.out.print(b.getCor() + " ");
                            print = true;
                            break;
                        }
                    }
                    if (print) {
                        continue;
                    }else{
                        switch (mapa[i][j]) {
                            case 0:
                                System.out.print(GREEN_BACKGROUND + " ");
                                break;
                            case 1:
                                System.out.print(RED_BACKGROUND + " ");
                                break;
                            case 70:
                                System.out.print(PURPLE_BACKGROUND + " ");
                                break;
                            default:
                                System.out.print(GREEN_BACKGROUND + " ");
                                break;
                        }
                        
                    }
                    bv++;
                }
                System.out.println();
            }
            /**Chama as funcoes de movimento e colisao */
            moviment();
            colisao();
            
            
            //printar fabricas denovo
            arrumarFabricas();
            
            try {
                Thread.sleep(250);
            } catch (InterruptedException ex) {
            }
            for (i = 0; i < 100; i++) {
                System.out.println();
            }
        }
        
    }






}