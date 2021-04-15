import java.util.Scanner;


public class Main{     
 public static void main(String args[]) throws InterruptedException { 
    
    Scanner input = new Scanner(System.in);
    boolean mainLoop = true;

    System.out.print("      inicio: ");
    for (int i = 0; i < 50; i++) {
        System.out.print("░");
        Thread.sleep(50);
    }
    System.out.println(" 100%  ");

    int choice;
    Thread.sleep(250);

    Deck deck1 = new Deck();for (int i = 0; i < 50; i++) {
      System.out.print("░");
      Thread.sleep(50);
  }
  System.out.println(" Deck listo \n ");
  System.out.println("\nBienvenido a Poker! ♦ ♤ ♥ ♧ \n");

    while(true){
        System.out.println("Selecciona una opción: ");
        Thread.sleep(250);
        System.out.print("1.) Mezclar deck. \n");
        Thread.sleep(250);
        System.out.print("2.) Sacar una carta.\n");
        Thread.sleep(250);
        System.out.print("3.) Carta al azar.\n");
        Thread.sleep(250);
        System.out.print("4.) Generar una mano de 5 cartas.\n");
        Thread.sleep(250);
        System.out.print("0.) Exit\n");
        Thread.sleep(250);
        System.out.print("\ningresa tu opcion: ");
        Thread.sleep(250);

        choice = input.nextInt();




    switch(choice){

    case 1:
    System.out.println("Mezclando:");
    for (int i = 0; i < 50; i++) {
        System.out.print("░");
        Thread.sleep(50);
    }
    System.out.println("100% \n ");

        deck1.shuffle();
        Thread.sleep(50);
        break;

    case 2: 
    System.out.println("            _____");
    Thread.sleep(250);
    System.out.println("           |\\ ~ /|");
    Thread.sleep(250);
    System.out.println("           |}}:{{|");
    Thread.sleep(250);
    System.out.println("           |}}:{{|");    
    Thread.sleep(250);
    System.out.println("           |}}:{{|");    
    Thread.sleep(250);
    System.out.println("           |/_~_\\|\n" );    
    Thread.sleep(250);    
    deck1.pick();       
         Thread.sleep(50);
         break;

    case 3:
    System.out.println("          _________");
    Thread.sleep(250);
    System.out.println("         |?        |");
    Thread.sleep(250);
    System.out.println("         |         |");
    Thread.sleep(250);
    System.out.println("         |         |");
    Thread.sleep(250);
    System.out.println("         |         |");
    Thread.sleep(250);
    System.out.println("         |         |");    
    Thread.sleep(250);
    System.out.println("         |        ¿|");    
    Thread.sleep(250);
    System.out.println("          ~~~~~~~~~\n" );    
    Thread.sleep(250); 
         deck1.head();
         Thread.sleep(50);
         break;

    case 4: 
    System.out.println(" _ ___ _ _ _________");
    Thread.sleep(250);
    System.out.println("|9|7  |A|K|2        |");
    Thread.sleep(250);
    System.out.println("|♦|♧♧ |♦|♦|♦        |");
    Thread.sleep(250);
    System.out.println("| |   | | |    ♦    |");
    Thread.sleep(250);
    System.out.println("| | ♧ | | |         |");
    Thread.sleep(250);
    System.out.println("| |   | | |    ♦    |");    
    Thread.sleep(250);
    System.out.println("| | ♧ | | |        ♦|");    
    Thread.sleep(250);
    System.out.println("| |   | | |        Z|");    
    Thread.sleep(250);
    System.out.println("~ ~ ~~~ ~ ~ ~~~~~~~~~\n" );    
    Thread.sleep(250); 


         deck1.hand();
         Thread.sleep(50);
         break;

    case 0: 
    Thread.sleep(50);
        System.out.println("exit program...");
        System.exit(0);
         break;
    default :
             System.out.println("“Opción no válida” reintentar");
             break;

      }

     }
    }     
 }    