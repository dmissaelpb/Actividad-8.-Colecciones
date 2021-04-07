import java.util.Random;

public class Deck{  

     private Card paquete[];
     private int cartaActual;
     private final int NUMERO_DE_CARTAS = 52;
     private Random numerosAleatorios;
     private int resto =0;
     private int error ;

     public Deck() {
          System.out.println("creando DECK");
          String caras [] = { " A", " 2", " 3", " 4", " 5", " 6", " 7"," 8", " 9", "10", " J", " Q", " R"};
          String palos [] = { "\u2665", "\u2666", "\u2663", "\u2664"};
          String colors[] = { "Rojo  |", "Negro |"};

          paquete = new Card[ NUMERO_DE_CARTAS ];
          cartaActual = 0;
          numerosAleatorios = new Random();

          for ( int i = 0; i < paquete.length; i++ ) 
          paquete[i] = new Card(caras[i % 13], palos[i/13] , colors[i/26]); 
     }        
     
     public void shuffle() {  
          cartaActual = 0;
 
          for ( int primera = 0; primera < paquete.length; primera++ ) { 
               int segunda = numerosAleatorios.nextInt(NUMERO_DE_CARTAS);
               Card temp = paquete[primera];

               paquete[primera] = paquete[segunda];
               paquete[segunda] = temp;
          }  
          System.out.println("Se mezclo el Deck");
     }   
     
     public Card repartirCarta() { 
          if (cartaActual < paquete.length ){
               resto++;
               error=NUMERO_DE_CARTAS- resto;
               return paquete[cartaActual++];
          }

          else System.out.println("no mas cartas "); 
          
          return null;
     }
     
     void head(){
          System.out.print(repartirCarta());
          System.out.println("Quedan "+ "["+error+"]"+"\n");
     }


     void pick(){
          System.out.print( repartirCarta() );
          System.out.println("Quedan "+ "["+error+"]"+"\n");
     }

     void hand (){
          for ( int i = 0; i < 1; i++ ){
               System.out.printf("%-20s%-20s%-20s%-20s%-20s%-10s \n", 
               repartirCarta(), repartirCarta(),
               repartirCarta(), repartirCarta(), 
               repartirCarta(), "Quedan: "+ "["+error+"]" );
          }
          
     }

} 