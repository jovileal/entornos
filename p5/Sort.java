package p5;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Jose Vicente
 */
public class Sort 
{
    //Lista Inversa
    List<Integer> list1;
    List<Integer> list1copia;
    
    //Lista con todos los elementos iguales
    List<Integer> listIguales; 

     //Lista ordenada
    List<Integer> listOrdenada; 
 
    //Lista aleatoria
    List<Integer> listAleatoria;  
    List<Integer> listAleatoriacopia; 
    
    //Variables para QuickSort
    List<Integer> numbers;
    int number;
    
    // Variables para MergeSort
    List<Integer> tempMergArr ;
    List<Integer>  array;
    int lengthSM;

    Sort ()
    {
        //Lista Inversa
        list1 = new ArrayList<>(); 
        list1copia = new ArrayList<>();        
        for ( int i = 1000 ; i >= 1 ; i--)
        {
           list1.add(i);  
           list1copia.add(i);
        }

        //Lista con todos los elementos iguales
        listIguales = new ArrayList<>();         
        for ( int i = 1 ; i <= 1000 ; i++)
           listIguales.add(5);     
        
         //Lista Ordenada
        listOrdenada = new ArrayList<>();         
        for ( int i = 1 ; i <= 1000 ; i++)
           listOrdenada.add(i);   

        
        //Lista Aleatoria
        listAleatoria = new ArrayList<>();  
        listAleatoriacopia = new ArrayList<>(); 
        Random rnd = new Random();
        for ( int i = 1 ; i <= 1000 ; i++)
        {  
            int rand = (int)(rnd.nextDouble() * 1000 + 1);
            listAleatoria.add(rand);   
            listAleatoriacopia.add(rand);  
        }         
    }
    /**
     * Fuciona auxliar para mostrar la lista
     * @param inputArr 
     */
    public void Show(List<Integer> inputArr)
    {
        for ( int i = 0; i < inputArr.size() ; i++)
        {
           System.out.print(inputArr.get(i)+ " ");
        }
        System.out.println(" ");
    } 
    
    //Algoritos de Ordenacion
        /**
         * Algoritmos BubbleSort
         * @param inputArr Es el parametro de entrada , una lista.
         */
        public void BubbleSort(List<Integer> inputArr)
        {
            boolean exit;
            do
            {
                exit = true;
                for (int i = 1 ;  i < inputArr.size(); i++)
                {
                    if ( inputArr.get(i) <  inputArr.get(i-1))
                    {
                        int temp = inputArr.get(i-1);
                        inputArr.set(i-1,inputArr.get(i));                   
                        inputArr.set(i,temp );
                        exit = false;
                    }
                }
            }
            while(exit == false);
        }
        /**
         * Algoritmo Selection Sort 
         * @param inputArr Es el parametro de entrada , una lista.
         */ 
        public void SelectionSort(List<Integer> inputArr)
        {
            int position;
            int temp=0;
            int size = inputArr.size();
            for (int i = 0 ;  i < size - 1 ; i++)
            {
                position = i;
                for (int j = i + 1 ;  j < size; j++)
                {
                    if (inputArr.get(j) < inputArr.get(position))
                        position= j;
                }
                if ( position != i)
                {
                    temp = inputArr.get(i);
                    inputArr.set(i , inputArr.get(position));

                    inputArr.set(position, temp);
                }    
            }
        }  
        /**
         * Algoritmo InsertionSort
         * @param inputArr Es el parametro de entrada , una lista.
         */    
        public void InsertionSort(List<Integer> inputArr)
        {
             int temp;
             for ( int i = 1; i < inputArr.size(); i++) 
             {
                 for ( int j = i ; j > 0 ; j--)
                 {
                     if(inputArr.get(j) < inputArr.get(j-1))
                     {
                         temp = inputArr.get(j);                    
                         inputArr.set(j , inputArr.get(j-1));               
                         inputArr.set(j-1, temp);
                     }
                 }
             }
        }
        /**
         * Algoritmo QuickSort
         * @param inputArr Es el parametro de entrada , una lista.
         */
        public void QuickSort(List<Integer> inputArr) 
        {
            if (inputArr == null || inputArr.isEmpty()) {
                return;
            }
            this.numbers = inputArr;

            number = inputArr.size();
            QSort(0, number - 1);
        } 
        /**
         * Funcion auxiliar de algoritmo QuickSort
         * @param lowerIndex
         * @param higherIndex 
         */
        public void QSort(int lowerIndex, int higherIndex)
        {
            int i = lowerIndex;
            int j = higherIndex;
            int pivot = numbers.get(lowerIndex+(higherIndex-lowerIndex)/2);

            while (i <= j) 
            {
                while (numbers.get(i) < pivot) {
                    i++;
                }
                while (numbers.get(j)  > pivot ) {
                    j--;
                }
                if (i <= j) {
                    exchangeNumbers(i, j);
                    i++;
                    j--;
                }
            }
            if (lowerIndex < j)
                QSort(lowerIndex, j);
            if (i < higherIndex)
                QSort(i, higherIndex);
        }
        /**
         * Funcion auxiliar de algoritmo QuickSort
         * @param i
         * @param j 
         */
        public void exchangeNumbers(int i, int j) 
        {
            int temp = numbers.get(i) ;
            numbers.set(i , numbers.get(j));
            numbers.set(j , temp);
        } 


        /**
         * Algoritmo MergeSort
         * @param inputArr 
         */
        public void MergeSort(List<Integer> inputArr) 
        {
            this.array = inputArr;
            this.lengthSM = inputArr.size();
            this.tempMergArr = new ArrayList<>();
            MSort(0, lengthSM - 1);
        } 
        /**
         * Funcion auxiliar de MergeSort
         * @param lowerIndex
         * @param higherIndex 
         */
        public void MSort(int lowerIndex, int higherIndex) 
         {
            if (lowerIndex < higherIndex) 
            {
                int middle = lowerIndex + (higherIndex - lowerIndex) / 2;
                MSort(lowerIndex, middle);
                MSort(middle + 1, higherIndex);
                // Merge parts
                MergeParts(lowerIndex, middle, higherIndex);
            }
        }
        /**
         * Funciona auxiliar de Algoritmo MergeSort. Une los arrays
         * @param lowerIndex
         * @param middle
         * @param higherIndex 
         */
        public void MergeParts(int lowerIndex, int middle, int higherIndex) 
        {
            for (int i = lowerIndex; i <= higherIndex; i++) 
                tempMergArr.add(i , array.get(i));

            int i = lowerIndex;
            int j = middle + 1;
            int k = lowerIndex;
            while (i <= middle && j <= higherIndex)
            {
                if (tempMergArr.get(i) <= tempMergArr.get(j)) 
                {
                    array.set(k , tempMergArr.get(i));
                    i++;
                } 
                else 
                {
                    array.set(k , tempMergArr.get(j));
                    j++;
                }
                k++;
            }
            while (i <= middle) 
            {
                array.set(k , tempMergArr.get(i));
                k++;
                i++;
            }
        } 
    
    //Algoritmos de busqueda
    /**
     * Busqueda binaria
     * @param n Valor a buscar
     * @return Devuelve verdadero si lo encuentra y falso si no.
     */    
    public boolean BinariSearch(int n)
    {
        int centro,inf=0,sup=listOrdenada.size()-1;        
        while(inf<=sup)
        {
            centro=((sup-inf)/2)+inf;           
            if( listOrdenada.get(centro)== n)
            {   
                return true;
            }           
            else if( listOrdenada.get(centro) > n ) 
            {
                sup=centro-1;
            }       
            else  
            {
                inf=centro+1;
            } 
        }
        return false;
     }   
    /**
     * 
     * @param n Valor a buscar
     * @return Devuelve verdadero si lo encuentra y falso si no.
     */
    public boolean SecuencialSearch( int n)
    {
        for ( int j = 0 ; j < listOrdenada.size() ; j++)
        {
            if ( listOrdenada.get(j) == n)
            {
                return true;
            }
        } 
        return false;
    }
    /**
     * Funcion para testear listas decrecientes usando todos los algoritmos
     * @param name Es el nombre de lafuncion de ordenación
     */
    public void TesteoListaDecreciente(String name )
    {
        double time_start = 0, time_end =0;
        double time = 0;
        double time_min = 0;
        double tiempo = 0;
        int count = 0;
        do
        {
            //Show(list1);
            switch (name)
            {
                case "BubbleSort":                 
                    time_start = System.nanoTime();
                    BubbleSort(list1);
                    time_end = System.nanoTime();   
                    break;
                 case "SelectionSort":
                     time_start = System.nanoTime();
                     SelectionSort(list1);
                     time_end = System.nanoTime(); 
                     break;
                 case "InsertionSort":
                     time_start = System.nanoTime();
                     InsertionSort(list1);
                     time_end = System.nanoTime(); 
                     break;
                 case "QuickSort":
                     time_start = System.nanoTime();
                     QuickSort(list1);
                     time_end = System.nanoTime(); 
                     break;
                 case "MergeSort":
                     time_start = System.nanoTime();
                     MergeSort(list1);
                     time_end = System.nanoTime();  
                     break;
            }   
            time += time_end - time_start;
            tiempo = time_end - time_start;
            if (time_min == 0 )
                time_min = tiempo;
            
            if ( time_end - time_start < time_min)
                time_min = time_end - time_start;

            count++;
            //Show(list1);
            list1 = new ArrayList<>(list1copia);                      
        }while(count < 1000);
        System.out.printf("%-40s %-40s %-40s\n","LISTA DESCENDIENTE: " + name, "Tiempo medio: " + (time / count) / 1000000 +" ms" , "Tiempo minimo: " + time_min / 1000000);  

    }
    /**
     * Funcion para testear listas con elementos iguales usando todos los algoritmos
     * @param name Es el nombre de lafuncion de ordenación
     */
    public void TesteoListaElementosIguales(String name )
      {
          double time_start = 0, time_end =0;
          double time = 0;
          double time_min = 0;
          double tiempo = 0;          
          int count = 0;
          do
          {
              switch (name)
              {
                  case "BubbleSort":
                            time_start = System.nanoTime();
                            BubbleSort(listIguales);
                            time_end = System.nanoTime(); 
                            break;
                         case "SelectionSort":
                             time_start = System.nanoTime();
                             SelectionSort(listIguales);
                             time_end = System.nanoTime(); 
                             break;
                         case "InsertionSort":
                             time_start = System.nanoTime();
                             InsertionSort(listIguales);
                             time_end = System.nanoTime();
                             break;
                         case "QuickSort":
                             time_start = System.nanoTime();
                             QuickSort(listIguales);
                             time_end = System.nanoTime(); 
                             break;
                         case "MergeSort":
                             time_start = System.nanoTime();
                             MergeSort(listIguales);
                             time_end = System.nanoTime();  
                             break;
              }   
                time += time_end - time_start;
                tiempo = time_end - time_start;
                if (time_min == 0 )
                    time_min = tiempo;

                if ( time_end - time_start < time_min)
                    time_min = time_end - time_start;              
              count++;                     
          }while(count < 1000);
          System.out.printf("%-40s %-40s %-40s\n","LISTA ELEMENTOS IGUALES: " + name, "Tiempo medio: " + (time / count) / 1000000 +" ms" ,"Tiempo minimo: " + time_min / 1000000);  

      }
    /**
     * Funcion para testear listas con elementos decrecientes usando todos los algoritmos
     * @param name Es el nombre de lafuncion de ordenación
     */
    public void TesteoListaCreciente(String name )
      {
          double time_start = 0, time_end =0;
          double time = 0;
          double time_min = 0;
          double tiempo = 0; 
          int count = 0;
          do
          {
              switch (name)
              {
                  case "BubbleSort":
                      time_start = System.nanoTime();
                      BubbleSort(listOrdenada);
                      time_end = System.nanoTime(); 
                      break;
                   case "SelectionSort":
                       time_start = System.nanoTime();
                       SelectionSort(listOrdenada);
                       time_end = System.nanoTime(); 
                       break;
                   case "InsertionSort":
                       time_start = System.nanoTime();
                       InsertionSort(listOrdenada);
                       time_end = System.nanoTime(); 
                       break;
                   case "QuickSort":
                       time_start = System.nanoTime();
                       QuickSort(listOrdenada);
                       time_end = System.nanoTime();
                       break;
                   case "MergeSort":
                       time_start = System.nanoTime();
                       MergeSort(listOrdenada);
                       time_end = System.nanoTime();
                       break;
              }   
              time += time_end - time_start;
                tiempo = time_end - time_start;
                if (time_min == 0 )
                    time_min = tiempo;

                if ( time_end - time_start < time_min)
                    time_min = time_end - time_start;                
              count++;  
          }while(count < 1000);
          System.out.printf("%-40s %-40s %-40s\n","LISTA ASCENDENTE: " + name, "Tiempo medio: " + (time / count) / 1000000 +" ms" ,"Tiempo minimo: " + time_min / 1000000);  

      } 
    /**
     * Funcion para testear listas aleatorias usando todos los algoritmos
     * @param name Es el nombre de lafuncion de ordenación
     */
    public void TesteoListaAleatoria(String name )
    {
        double time_start = 0, time_end =0;
        double time = 0;
        double time_min = 0;
        double tiempo = 0;         
        int count = 0;
        do
        {
            //Show(listAleatoria);
            switch (name)
            {
                case "BubbleSort":
                    time_start = System.nanoTime();
                    BubbleSort(listAleatoria);
                    time_end = System.nanoTime(); 
                    break;
                 case "SelectionSort":
                     time_start = System.nanoTime();
                     SelectionSort(listAleatoria);
                     time_end = System.nanoTime();
                     break;
                 case "InsertionSort":
                     time_start = System.nanoTime();
                     InsertionSort(listAleatoria);
                     time_end = System.nanoTime(); 
                     break;
                 case "QuickSort":
                     time_start = System.nanoTime();
                     QuickSort(listAleatoria);
                     time_end = System.nanoTime();
                     break;
                 case "MergeSort":
                     time_start = System.nanoTime();
                     MergeSort(listAleatoria);
                     time_end = System.nanoTime();
                     break;
            }   
            time += time_end - time_start;
            tiempo = time_end - time_start;
            if (time_min == 0 )
                time_min = tiempo;

            if ( time_end - time_start < time_min)
                time_min = time_end - time_start;             
            count++;
            //Show(listAleatoria);
            listAleatoria = new ArrayList<>(listAleatoriacopia); 
        }while(count < 1000);
        System.out.printf("%-40s %-40s %-40s\n","LISTA ALEATORIA: " + name, "Tiempo medio: " + (time / count) / 1000000 +" ms","Tiempo minimo: " + time_min / 1000000);  

      }   
    /**
     * Ejecuta todos los Algoritmos con la misma lista que le pasamos como entrada de datos.
     * Comprueba si los algoritmos dan como resultado una ordenacion correcta
     * @param input Se le pasa una lista
     */
    public void RunTest(List<Integer> input)
    {
        ArrayList<Integer> in = new ArrayList<>(input); 
        
        boolean  alert ;
                
        alert  = true;
        BubbleSort(input);
        for ( int i = 1 ; i < input.size() ; i++)
           if (input.get(i)<input.get(i-1))  
               alert = false;      
        if (alert)
           System.out.printf("%-20s\n","Test BubbleSort OK");
        else
           System.out.printf("%-20s\n","Test BubbleSort No OK");
        
        input = new ArrayList<>(in); 
        
        alert  = true;
        SelectionSort(input);
        for ( int i = 1 ; i < input.size() ; i++)
           if (input.get(i)<input.get(i-1))  
               alert = false;      
        if (alert)
           System.out.printf("%-20s\n","Test SelectionSort OK");
        else
           System.out.printf("%-20s\n","Test SelectionSort NO OK");
        
        input = new ArrayList<>(in);        
 
        alert  = true;
        InsertionSort(input);
        for ( int i = 1 ; i < input.size() ; i++)
           if (input.get(i)<input.get(i-1))  
               alert = false;      
        if (alert)
           System.out.printf("%-20s\n","Test InsertionSort OK");
        else
           System.out.printf("%-20s\n","Test InsertionSort NO OK");
        
        input = new ArrayList<>(in);          

        alert  = true;
        QuickSort(input);
        for ( int i = 1 ; i < input.size() ; i++)
           if (input.get(i)<input.get(i-1))  
               alert = false;      
        if (alert)
           System.out.printf("%-20s\n","Test QuickSort OK");
        else
           System.out.printf("%-20s\n","Test QuickSort NO OK");
        
        input = new ArrayList<>(in); 

        alert  = true;
        MergeSort(input);
        for ( int i = 1 ; i < input.size() ; i++)
           if (input.get(i)<input.get(i-1))  
               alert = false;      
        if (alert)
           System.out.printf("%-20s\n","Test MergeSort OK");
        else
           System.out.printf("%-20s\n","Test MergeSort NO OK");
    }
    /**
     * Calcula los tiempos de 1000 iteraciones de todas las listas y 
     * con todos los algoritmos de ordenacion
     */
    public void RunTimes()
    {
        
        TesteoListaDecreciente("BubbleSort");
        TesteoListaDecreciente("SelectionSort");
        TesteoListaDecreciente("InsertionSort");
        TesteoListaDecreciente("QuickSort");
        TesteoListaDecreciente("MergeSort");
        
        TesteoListaElementosIguales("BubbleSort");
        TesteoListaElementosIguales("SelectionSort");
        TesteoListaElementosIguales("InsertionSort");
        TesteoListaElementosIguales("QuickSort");
        TesteoListaElementosIguales("MergeSort");       
        
        TesteoListaCreciente("BubbleSort");
        TesteoListaCreciente("SelectionSort");
        TesteoListaCreciente("InsertionSort");
        TesteoListaCreciente("QuickSort");
        TesteoListaCreciente("MergeSort");     
        
        TesteoListaAleatoria("BubbleSort");        
        TesteoListaAleatoria("SelectionSort");        
        TesteoListaAleatoria("InsertionSort");
        TesteoListaAleatoria("QuickSort"); 
        TesteoListaAleatoria("MergeSort"); 

        System.out.println("BUSQUEDAS");
        double time_start, time_end;
        time_start = System.nanoTime();
        BinariSearch(1);
        time_end = System.nanoTime();
        System.out.printf("%-30s %-20s\n","Busqueda binaria Inicio",
                ( time_end - time_start ) / 1000000 +" ms");

        time_start = System.nanoTime();
        SecuencialSearch(1);
        time_end = System.nanoTime();
        System.out.printf("%-30s %-20s\n","Busqueda secuencial Inicio",
                ( time_end - time_start ) / 1000000 +" ms");        
        
        time_start = System.nanoTime();
        BinariSearch(500);
        time_end = System.nanoTime();
        System.out.printf("%-30s %-20s\n","Busqueda binaria Medio",
                ( time_end - time_start ) / 1000000 +" ms");        

        time_start = System.nanoTime();
        SecuencialSearch(500);
        time_end = System.nanoTime();
        System.out.printf("%-30s %-20s\n","Busqueda secuencial Medio",
                ( time_end - time_start ) / 1000000 +" ms");  
        
        System.out.printf("%-20s\n","RUNTEST");  
        RunTest(list1); // Lista descendente
        RunTest(listIguales); // Lista elementos iguales
        RunTest(listOrdenada); // Lista Ordenada
        RunTest(listAleatoria); //Lista Aleatoria

    } 
}
