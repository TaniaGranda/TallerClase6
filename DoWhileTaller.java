
package clase6;

import java.util.Scanner;

public class DoWhileTaller {

    public static void main(String[] args) {
        //Creo una variable para pedir por consola los datos
        Scanner s = new Scanner (System.in);
        //Declaracion y asignacion de variables
        int a, b, c, d , e, f, g, h, i, j, suma, max, cond=0;
        double num, res;
        int a1=0, c1, e1, g1, i1;
        //Estructura de control do-while
        do {  
            //Solicitud al usuario para pedir variables
            System.out.println("Ingrese su cedula: ");
            a=s.nextInt();
            b=s.nextInt();
            c=s.nextInt();
            d=s.nextInt();
            e=s.nextInt();
            f=s.nextInt();
            g=s.nextInt();
            h=s.nextInt();
            i=s.nextInt();
            j=s.nextInt();
            //Operaciones
            a=a*2;
            b=b*1;
            c=c*2;
            d=d*1;
            e=e*2;
            f=f*1;
            g=g*2;
            h=h*1;
            i=i*2;
            
            a1=(a/10)+(a%10);
            c1=(c/10)+(c%10);
            e1=(e/10)+(e%10);
            g1=(g/10)+(g%10);
            i1=(i/10)+(i%10);
            //Suma de los resutados multiplicados
            suma=a1+b+c1+d+e1+f+g1+h+i1;
            System.out.println("Suma: "+suma);
            //Numero maximo
            num=(Math.ceil(suma/10)*10);
            if(num==10){
                max=10;
            }else{
                 max=(int)(num+10);
            }
            System.out.println("Numero max:"+max);
            //Comprobacion de que el ultimo digito de la cedula sea igual a la resta del numero maximo
            // y de la suma 
            res=max-suma;
            //Estructura Condicional
            if(res==j){
                System.out.println("Cedula valida");
            }else{
                System.out.println("Cedula no valida");
            }
            //Pedir al usuario si quiere volver a repetir la estructura de control do-while
            System.out.println("Desea ingresar otro numero de cedula: si=1 no=0");
            cond=s.nextInt();
        } while (cond==1);
    }
    
}
