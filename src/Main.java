/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner input = new Scanner(System.in);
        //numarul de teste
        int n = input.nextInt();
        input.nextLine();
        // string urile de verificat
        String[] tests = new String[n];
        for(int i=0;i<n;i++)
            tests[i]=input.nextLine();


        for(String s:tests){
            String s1=s;
            int count=0;
            //verificam cate caractere apar in numar impar
            while(!s1.isEmpty()){
                int length = s1.length();
                s1=s1.replaceAll(s1.charAt(0)+"","");
                if((length-s1.length())%2==1) count++;
            }
            // daca lungime para si macar un caracter apare in nr impar
            // sau daca lungime impara si mai mult de 2 caractere apar in nr impar
            // atunci nu poate fi palindrom
            if((s.length()%2==0 && count>0)
                    || (s.length()%2==1 && count>1) ){
                System.out.println(0);
            } else {
                System.out.println(1);
            }
        }
    }
}