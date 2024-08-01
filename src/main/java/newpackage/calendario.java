/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package newpackage;

/**
 *
 * @author soria
 */
public class calendario {
         
        private String[] dias = {"Domingo","Lunes","Martes","Miercoles","Jueves","Viernes","Sabado"};

         int[][] mes={
             {1,2,3,4,5,6,7},
             {8,9,10,11,12,13,14},
             {15,16,17,18,19,20,21},
             {22,23,24,25,26,27,28},
         };
                 
         int[][] clima = new int[4][7];
         
         
         
         public void temperaturas(){

             for(int x=0; x<4; x++){
                 for(int y=0; y<7; y++){
                     
                     int temperatura=(int)(Math.random()* ((18))+7);
                     clima[x][y] = temperatura;
                     
                     
                 }
             }
         }
         
         
         public void imprimir(){
             
             System.out.println();
             System.out.println("CALENDARIO");
             System.out.println();
             System.out.println("D" + "\t" + "L" + "\t" + "M"+ "\t" + "M" + "\t" + "J" + "\t" + "V" + "\t" + "S");
             for(int f=0; f<4; f++){
                 System.out.println();
                
                 for(int c=0; c<7; c++){
                     System.out.print(mes[f][c] + "\t");
                 }
             }
             
             System.out.println(" ");
             
             System.out.println();
             System.out.println("TEMPERATURAS");
             System.out.println();
             System.out.println("D" + "\t" + "L" + "\t" + "M"+ "\t" + "M" + "\t" + "J" + "\t" + "V" + "\t" + "S");
             for(int f=0; f<4; f++){
                 System.out.println();
                
                 for(int c=0; c<7; c++){
                     System.out.print(clima[f][c] + "\t");
                 }
             }
            System.out.println(" ");
         }
         
         //temperatura mas alta del mes
          public void mayorTemperatura(){
             int mayor = clima[0][0];
             int dia = mes[0][0];
             int posicionFila = 0;
             int posicionColumna =0;
             
             
             for(int x=0; x<4; x++){
                 for(int y=0; y<7; y++){
                     if(clima[x][y] > mayor){
                         mayor = clima[x][y];
                         dia = mes[x][y];
                         posicionFila = x;
                         posicionColumna = y;
                         
                     }
                 }
             }
             
             System.out.println(" ");
             System.out.println("-------- DATOS --------");
             System.out.println(" ");
             System.out.println("- La temperatura más alta del mes fue de: "+ mayor+ " Grados, en la semana " +(posicionFila + 1)+" el dia " + dias[posicionColumna] + " " + dia);
             System.out.println(" ");
         }
          
          
          
          //temperatura baja y alta de las semana 
          public void semanaUno(){
              int mayor = clima[0][0];
              int dia = mes[0][0];
              int posicionFila = 0;
              int posicionColumna = 0;
              
              //semana 1
              for(int x=0; x<7; x++){
                  if(clima[0][x] > mayor){
                      mayor = clima[0][x];
                      dia = mes[0][x];
                      posicionFila = 0;
                      posicionColumna = x;
                  }
              }
              System.out.println(" ");
              System.out.println("--------------- PRIMER SEMANA ------------");
              System.out.println("");
              System.out.println("- La temperatura más alta fue de: "+ mayor + " Grados, el dia "+ (dias[posicionColumna])+" "+dia);
              
               //temperatura baja
               
              int menor = clima[0][0];
              
              int fila = 0;
              int columna =0;
              for(int y=0; y<7; y++){
                  if(menor > clima[0][y]){
                      menor = clima[0][y];
                      dia=mes[0][y];
                      fila = 0;
                      columna = y;
                  }
              }
              System.out.println("");
              System.out.println("- La temperatura más baja fue de: "+ menor + " Grados, el dia "+ (dias[columna])+" "+dia);
              System.out.println(" ");
              
              
              int promedio;
              int suma = 0;
              
              for(int i=0; i<7; i++){
                  suma = suma + clima[0][i];
              }
              
              promedio = (suma / 7);
              
              System.out.println("El promedio de las temperaturas fue de "+promedio);
              System.out.println(" ");
             
          }
          
          
          
          public void semanaDos(){
              //semana 2
              int mayor = clima[1][0];
              int dia = mes[0][0];
              int posicionFila = 0;
              int posicionColumna = 0;
              
              for(int y=0; y<7; y++){
                  if(clima[1][y] > mayor){
                      mayor = clima[1][y];
                      dia = mes[1][y];
                      posicionFila = 1;
                      posicionColumna = y;
                  }
              }
              System.out.println("");
              System.out.println("--------------- SEGUNDA SEMANA ------------");
              System.out.println("");
              System.out.println("- La temperatura más alta fue de: "+ mayor + " Grados, el dia "+ (dias[posicionColumna])+" "+dia);
              
              //temperatura baja
              
              int menor = clima[1][0];
              int fila = 0;
              int columna =0;
              for(int x=0; x<7; x++){
                  if(menor > clima[1][x]){
                      menor = clima[1][x];
                      dia= mes[1][x];
                      fila = 1;
                      columna = x;
                  }
              }
              System.out.println("");
              System.out.println("La temperatura más baja fue de: "+ menor + " Grados, el dia "+ (dias[columna]) + " "+dia);
              System.out.println(" ");
              
              
              int promedio;
              int suma = 0;
              
              for(int i=0; i<7; i++){
                  suma = suma + clima[1][i];
              }
              
              promedio = (suma / 7);
              
              System.out.println("El promedio de las temperaturas fue de "+promedio);
              System.out.println(" ");
             
          }
          
          
          
          public void semanaTres(){
              //semana 3
              
               int mayor = clima[0][0];
               int dia = mes[0][0];
              int posicionFila = 0;
              int posicionColumna = 0;
              
              for(int i=0; i<7; i++){
                  if(clima[2][i] > mayor){
                      mayor = clima[2][i];
                      dia = mes[2][i];
                      posicionFila = 2;
                      posicionColumna = i;
                  }
              }
              System.out.println(" ");
              System.out.println("--------------- TERCERA SEMANA ------------");
              System.out.println("");
              System.out.println("- La temperatura más alta fue de: "+ mayor+ " Grados, el dia "+ (dias[posicionColumna])+" "+dia);
              
               //temperatura baja
               
              int menor = clima[0][0];
              int fila = 0;
              int columna =0;
              for(int j=0; j<7; j++){
                  if(menor > clima[2][j]){
                      menor = clima[2][j];
                      dia = mes[2][j];
                      fila = 2;
                      columna = j;
                  }
              }
              
              System.out.println("");
              System.out.println("- La temperatura más baja fue de: "+ menor + " Grados,el dia "+ (dias[columna])+" "+dia);
              System.out.println(" ");
              
              
              int promedio;
              int suma = 0;
              
              for(int x=0; x<7; x++){
                  suma = suma + clima[2][x];
              }
              
              promedio = (suma / 7);
              
              System.out.println("El promedio de las temperaturas fue de "+promedio);
              System.out.println(" ");
             
          }
          
          public void semanaCuatro(){
               int mayor = clima[0][0];
               int dia = mes[0][0];
              int posicionFila = 0;
              int posicionColumna = 0;
              
               //semana 4
              for(int j=0; j<7; j++){
                  if(clima[3][j] > mayor){
                      mayor = clima[3][j];
                      dia = mes[3][j];
                      posicionFila = 3;
                      posicionColumna = j;
                  }
              }
              System.out.println(" ");
              System.out.println("--------------- CUARTA SEMANA ------------");
              System.out.println("");
              System.out.println("- La temperatura más alta fue de: "+ mayor + " Grados. el dia "+ (dias[posicionColumna]) + " "+dia);
              
              
               //temperatura baja
               
              int menor = clima[0][0];
              int fila = 0;
              int columna =0;
              for(int i=0; i<7; i++){
                  if(menor > clima[3][i]){
                      dia = mes[3][i];
                      menor = clima[3][i];
                      fila = 3;
                      columna = i;
                  }
              }
              System.out.println("");
              System.out.println("- La temperatura más baja fue de: "+ menor + " Grados, el dia "+ (dias[columna])+" "+dia);
              System.out.println(" ");
              
              int promedio;
              int suma = 0;
              
              for(int x=0; x<7; x++){
                  suma = suma + clima[3][x];
              }
              
              promedio = (suma / 7);
              
              System.out.println("El promedio de las temperaturas fue de "+promedio);
              System.out.println(" ");
             
          }
          
    public static void main(String[] args) {
         calendario prueba = new calendario();
          prueba.temperaturas();
          prueba.imprimir();
          prueba.mayorTemperatura();
          prueba.semanaUno();
          prueba.semanaDos();
          prueba.semanaTres();
          prueba.semanaCuatro();
    }
    
}
