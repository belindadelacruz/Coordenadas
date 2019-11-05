import java.util.*;
import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.ArrayList;
import maps.Coordenada; 

class Main {
public static void maps() {
}

  public static void main(String[] args) {
      ArrayList<Coordenada> lista = new ArrayList<Coordenada>();
      Scanner escaner = new Scanner(System.in);

    boolean x = true;
    while(x){
      Coordenada o = new Coordenada();
      System.out.println("\nCoordenadas ");

      System.out.print("Ingrese latitud: ");
      o.latitud = escaner.nextLine();

      System.out.print("Ingrese longitud: ");
      o.longitud = escaner.nextLine();
      lista.add(o);

      System.out.println("¿Desea poner otra coordenada? 1(si) 2(no) ");
        int seguir = escaner.nextInt();
        escaner.nextLine();
        if(seguir == 2){
        x = false;
        escaner.close();
      }
    }

    String url = "https://www.keene.edu/campus/maps/tool/?coordinates=";
    String medio = "%2C%20";
    String coordNueva = "%0A";

      for(int y = 0; lista.size() > y; y++){
        if(y==0){
        url = url + lista.get(y).latitud + medio + lista.get(y).longitud;
        }

        if(y>0){
        url = url + coordNueva + lista.get(y).latitud + medio + lista.get(y).longitud;
        }

      }
      System.out.println("\nAhi tiene su URL... ver!!!!\n");
      System.out.println(url);
  }
}