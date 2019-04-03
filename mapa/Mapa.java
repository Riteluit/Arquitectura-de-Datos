package mapa;
import java.util.LinkedList;
import java.util.Scanner; 
public class Mapa {

 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  //Ciudades ruta A o Verde
  LinkedList <String> A = new LinkedList <String>();
  A.add("Santa Marta");
  A.add("La Paz");
  A.add("Monteria");
  A.add("Sincelejo");
  A.add("Cartagena");
  A.add("Barranquilla");
  //Ciudades Ruta B 
  LinkedList <String> B = new LinkedList <String>();
  B.add("Cartagena");
  B.add("Riohacha");
  B.add("Valledupar");
  B.add("La paz");
  B.add("San Benito");
  
  //Ciudades Rute C
  LinkedList <String> C = new LinkedList <String>();
  C.add("Valledupar");
  C.add("Plato");
  C.add("San Benito");
  C.add("Monteria");
  C.add("Santa Marta");
  
 //Pedir Hora
 int h=0,m=0;
 int dH=0,dM=0;
 System.out.println("Digite la Hora: ");
 h = sc.nextInt();
 System.out.println("Digite la los minutos: \n1.:00 \n2.:30");
 dM=sc.nextInt();
 if(dM==2){
  m=30;
 }
 System.out.println("1.AM \n2.PM");
 dH=sc.nextInt();
 if(dH==2){
  h = h*2;
 }
 System.out.print(h+":"+m);//Mostrar Hora
  
  
 }
 
 
}
