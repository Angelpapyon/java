/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen;

/**
 *
 * @author usuario
 */
public class Examen {

    /**
     * @param args the command line arguments
     */
    /*
    costos en unidades por cada concepto son los siguientes:
    (Costos)	Sedán	 Camioneta	Económico
Material	  7	    8	           5
Personal	  10	    9	           7
Impuestos	  5	    3	           2
Transporte	  2	    3	           1
    
    
    Semanalmente, se producen 60 sedanes, 40 camionetas y 90 económicos.
    
Los costos de una unidad de 
    material 5,
    personal 15,
    impuestos 7,
    transporte 2,
    


    */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        //ventas semanales de autos
       final int sem_sedan=60;
       int sem_camioneta=40;
       int sem_economico=90;
       
       
       
               int suma_sedan=0;
              int suma_camion=0;
              int suma_economico=0;
       
        /*costos por unidad de:*/
        int costos[]={
            /*material*/5,
            /*personal*/15,
            /*impuestos*/7,
            /*transporte*/2
        };
        
        int matriz [][]={{7,8,5},{10,9,7},{5,3,2},{2,3,1}};
        System.out.println("costos en unidaes para cada concepto son los siguientes:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j]+"  -  ");
            }System.out.println("");
        }
        
        
        
        
         System.out.println(" considerando que Semanalmente, se producen 60 sedanes, 40 camionetas y 90 económicos, las unidades semanales necesarias de material, personal, impuestos y transporte son");
         System.out.println("");
         
         
         System.out.println("considerando que se contruyen "+sem_sedan+" autos Sedan se requiere la siguiente cantidad de:");
        for (int i = 0; i < 4; i++) {
           
            switch(i){
                case 1: System.out.println(matriz[i][0]+"de material por unidad, se requiere "+sem_sedan*matriz[i][0]+" unidades");
                break;
                case 2: System.out.println(matriz[i][0]+"de personal por unidad, se requiere "+sem_sedan*matriz[i][0]+" unidades");
                break;
                case 3: System.out.println(matriz[i][0]+"de impuestos por unidad, se requiere "+sem_sedan*matriz[i][0]+" unidades");
                break;
                default: System.out.println(matriz[i][0]+"de transporte por unidad, se requiere "+sem_sedan*matriz[i][0]+" unidades");
                break;
        }System.out.println("");
        
        }
        
        System.out.println("considerando que se contruyen "+sem_camioneta+" camionetas se requiere la siguiente cantidad de:");
        for (int i = 0; i < 4; i++) {
           
            switch(i){
                case 1: System.out.println(matriz[i][1] +" de material por unidad, se requiere "+sem_camioneta*matriz[i][1]+" unidades");
                break;
                case 2: System.out.println(matriz[i][1] +" de personal por unidad, se requiere "+sem_camioneta*matriz[i][1]+" unidades");
                break;
                case 3: System.out.println(matriz[i][1] +" de impuestos por unidad, se requiere "+sem_camioneta*matriz[i][1]+" unidades");
                break;
                default: System.out.println(matriz[i][1] +" de transporte por unidad, se requiere"+sem_camioneta*matriz[i][1]+" unidades");
                break;
        }System.out.println("");
        }
        
        
        
         System.out.println("considerando que se contruyen "+sem_economico+" autos economicos se requiere la siguiente cantidad de:");
        for (int i = 0; i < 4; i++) {
           
            switch(i){
                case 1: System.out.println(matriz[i][2] +" material por unidad, se requiere "+sem_economico*matriz[i][2]);
                break;
                case 2: System.out.println(matriz[i][2] +" personal por unidad, se requiere "+sem_economico*matriz[i][2]);
                break;
                case 3: System.out.println(matriz[i][2] +" impuestos por unidad, se requiere "+sem_economico*matriz[i][2]);
                break;
                default: System.out.println(matriz[i][2] +" transporte por unidad, se requiere"+sem_economico*matriz[i][2]);
                break;
        }System.out.println("");
        }
        
       
        
        
        
        
        
        
        
        
        
        
        System.out.println("costos por unidad de material,personal,impuestos y transporte son");
         System.out.println("");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j]*=costos[i];
                System.out.print(matriz[i][j]+"  -  ");
            
        }System.out.println("");
        
            System.out.println("");
    }
        /*todobien hasta ahi*/
         System.out.println("el costo de producion de cada modelo es:"); 
         
          for (int j = 0; j < 3; j++) {
            int sumascolumnas=0;
            for (int i = 0; i <4; i++) {
                sumascolumnas+=matriz[i][j];
                
             
                      
                      
                      
                
            }  switch(j){
                    case 1:
                        suma_sedan=sumascolumnas;
                        System.out.println("el costo de produccion de un Sedan es "+suma_sedan+" $");
                    break;
                    case 2:
                        suma_camion=sumascolumnas;
                        System.out.println("el costo de produccion de una camioneta es "+suma_camion+" $");     
                    break;
                    default:
                        suma_economico=sumascolumnas;
                        System.out.println("el costo de produccion de un auto economico es "+suma_economico+" $");     
                    break;
                        }
              System.out.println("");
        }System.out.println("la suma total de los gatos semnanales es:");
        System.out.println(suma_sedan*sem_sedan+suma_camion*sem_camioneta+suma_economico*sem_economico+" $");
}
}