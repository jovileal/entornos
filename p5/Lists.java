package p5;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Jose Vicente
 */
public class Lists 
{
    List<Integer> list1; // ArrayList
    List<Integer> list2; // LinkedList   
    Lists ()
    {
        list1 = new ArrayList<>();
        list2 = new LinkedList<>();         
        for ( int i = 0 ; i < 1000 ; i++)
        {
           list1.add(i);   
           list2.add(i);   
        }
    }
    /**
     * Muestra la lista1
     */
    public void MostrarL1()
    {
       for ( int j = 0 ; j < list1.size() ; j++)
       {
            System.out.println(list1.get(j));
       }        
    }
    /**
     * Muestra la lista2
     */
    public void MostrarL2()
    {
       for ( int j = 0 ; j < list2.size() ; j++)
       {
            System.out.println(list2.get(j));
       }   
    } 
  
  // INSERT  ----------------------------------------------------- 
    public void AddElementFinal()
    {
        //List 1
        double time_start, time_end;
        double time = 0; 
        double time_min;
        
        time_start = System.nanoTime();
        list1.add(2000);
        time_end = System.nanoTime();        
        list1.remove(list1.size()-1);     
        time_min =  time_end - time_start;
        int count = 0;
        for ( int i = 0 ; i < 1000 ; i++)
        {
            time_start = System.nanoTime();
            list1.add(2000);
            time_end = System.nanoTime();        
            list1.remove(list1.size()-1); 
            if (( time_end - time_start ) < time_min && (time_end - time_start ) != 0)
                 time_min = time_end - time_start;  
            if ((time_end - time_start ) != 0)   // Algunas veces aparecen 0 en la diferencia de tiempos inicial y final
            {                
                count++; 
                time += (time_end - time_start); 
            }
        }
        time = time /count;       

        //List2
        double time_start2, time_end2;
        double time2 = 0; 
        double time_min2;
        
        time_start2 = System.nanoTime();
        list2.add(2000);
        time_end2 = System.nanoTime();  
        list2.remove(list2.size()-1);  
        time_min2 =  (double) (time_end2 - time_start2);
        
        for ( int i = 0 ; i < 1000 ; i++)
        {
            time_start2 = System.nanoTime();
            list2.add(2000);
            time_end2 = System.nanoTime();  
            list2.remove(list2.size()-1); 
            if (( time_end2 - time_start2 ) < time_min2 && (time_end2 - time_start2 ) != 0)
                 time_min2 = time_end2 - time_start2;  
            if ((time_end2 - time_start2 ) != 0)   // Algunas veces aparecen 0 en la diferencia de tiempos inicial y final
            {                
                count++; 
                time2 += (time_end2 - time_start2); 
            }
        }
        time2 = time2 /count;         

        System.out.printf("%-20s %-20s %-20s %-20s %-20s\n","Final: ",  time / 1000000 ,time_min /1000000 , time2/1000000 / 1000000 ,time_min2/1000000);       
    }    
    public void AddElementStart()
    {
        //List1
        double time_start, time_end; 
        double time = 0; 
        double time_min;
        
        time_start = System.nanoTime();
        list1.add(0,1500);
        time_end = System.nanoTime();        
        list1.remove(0); 
        time_min =  time_end - time_start;
        int count = 0;
        for ( int i = 0 ; i < 1000 ; i++)
        {       
            time_start = System.nanoTime();
            list1.add(0,1500);
            time_end = System.nanoTime();        
            list1.remove(0); 
            if (( time_end - time_start ) < time_min && (time_end - time_start ) != 0)
                 time_min = time_end - time_start;  
            if ((time_end - time_start ) != 0)   // Algunas veces aparecen 0 en la diferencia de tiempos inicial y final
            {                
                count++; 
                time += (time_end - time_start); 
            }
        }
        time = time /count;     
        
        //List2
        double time_start2, time_end2;
        double time2 = 0; 
        double time_min2;
        
        time_start2 = System.nanoTime();
        list2.add(0,1500);
        time_end2 = System.nanoTime();        
        list2.remove(0);
        time_min2 = time_end2 - time_start2 ; 
        
        count = 0;
        for ( int i = 0 ; i < 1000 ; i++)
        {  
            time_start2 = System.nanoTime();
            list2.add(0,1500);
            time_end2 = System.nanoTime();        
            list2.remove(0);
            if (( time_end2 - time_start2 ) < time_min2 && (time_end2 - time_start2 ) != 0)
                 time_min2 = time_end2 - time_start2;  
            if ((time_end2 - time_start2 ) != 0)   // Algunas veces aparecen 0 en la diferencia de tiempos inicial y final
            {                
                count++; 
                time2 += (time_end2 - time_start2); 
            }
        }
        time2 = time2 /count;     
        
        System.out.printf("%-20s %-20s %-20s  %-20s %-20s\n","Start: ",  time / 1000000, time_min /1000000, time2 / 1000000, time_min2/1000000 );       
    }     
    public void AddElementMiddle()
    {
        //List1
        double time_start, time_end;
        double time = 0; 
        double time_min;
        time_start = System.nanoTime();
        list1.add(500,1800);
        time_end = System.nanoTime();        
        list1.remove(list1.size()-1);  
        time_min =  time_end - time_start;  
        int count = 0;
        for ( int i = 0 ; i < 1000 ; i++)
        {   
            time_start = System.nanoTime();
            list1.add(500,1800);
            time_end = System.nanoTime();        
            list1.remove(list1.size()-1);  
            if (( time_end - time_start ) < time_min && (time_end - time_start ) != 0)
                 time_min = time_end - time_start;  
            if ((time_end - time_start ) != 0)   // Algunas veces aparecen 0 en la diferencia de tiempos inicial y final
            {                
                count++; 
                time += (time_end - time_start); 
            }
        }
        time = time /count;         
        
        //List2
        double time_start2, time_end2;
        double time2 = 0; 
        double time_min2;
        
        time_start2 = System.nanoTime();
        list2.add(500,1800);
        time_end2 = System.nanoTime(); 
        list2.remove(list2.size()-1);  
        time_min2 = time_end2 - time_start2;
        
        count = 0;
        for ( int i = 0 ; i < 1000 ; i++)
        {  
            time_start2 = System.nanoTime();
            list2.add(500,1800);
            time_end2 = System.nanoTime();        
            list2.remove(list2.size()-1);
            if (( time_end2 - time_start2 ) < time_min2 && (time_end2 - time_start2 ) != 0)
                 time_min2 = time_end2 - time_start2;  
            if ((time_end2 - time_start2 ) != 0)   // Algunas veces aparecen 0 en la diferencia de tiempos inicial y final
            {                
                count++; 
                time2 += (time_end2 - time_start2); 
            }        
        }
        System.out.printf("%-20s %-20s %-20s %-20s %-20s\n","Middle: ",  time / 1000000 ,time_min / 1000000 ,time2 / 1000000 , time_min2 / 1000000);       
    } 

 // DELETE  ----------------------------------------------------- 
    public void DeleteFinalElement()
    {
        double time_start, time_end;
        time_start = System.nanoTime();
        list1.remove(list1.size()-1);
        time_end = System.nanoTime();        
        list1.add(5000);
        
        double time_start2, time_end2;
        time_start2 = System.nanoTime();
        list2.remove(list2.size()-1);
        time_end2 = System.nanoTime();        
        list2.add(5000);    
        
        System.out.printf("%-20s %-20s %-20s\n", "Final: ", ( time_end - time_start ) / 1000000 +" ms",( time_end2 - time_start2 ) / 1000000 +" ms");       
    }    
    public void DeleteStartElement()
    {
        double time_start, time_end;
        time_start = System.nanoTime();
        list1.remove(0);
        time_end = System.nanoTime();        
        list1.add(5000);    
        
        double time_start2, time_end2;
        time_start2 = System.nanoTime();
        list2.remove(0);
        time_end2 = System.nanoTime();   
        list2.add(5000);    
        
        System.out.printf("%-20s %-20s %-20s\n","Start: ", ( time_end - time_start ) / 1000000 +" ms",( time_end2 - time_start2 ) / 1000000 +" ms");       
    } 
    public void DeleteMiddleElement()
    {
        double time_start, time_end;
        time_start = System.nanoTime();
        list1.remove(list1.size()/2);
        time_end = System.nanoTime();        
        list1.add(5000);
        
        double time_start2, time_end2;
        time_start2 = System.nanoTime();
        list2.remove(list2.size()/2);
        time_end2 = System.nanoTime();     
        list2.add(5000);
        
        System.out.printf("%-20s %-20s %-20s\n","Middle: ", ( time_end - time_start ) / 1000000 +" ms",( time_end2 - time_start2 ) / 1000000 +" ms");       
    }  
    
    public void DeleteElementValue(int x)
    {
        double time_start, time_end;
        time_start = System.nanoTime();
        for ( int j = 0 ; j < list1.size() ; j++)
        {
            if ( list1.get(j) == x)
                list1.remove(j);
        } 
        time_end = System.nanoTime();
        
        double time_start2, time_end2;
        time_start2 = System.nanoTime();
        for ( int j = 0 ; j < list1.size() ; j++)
        {
            if ( list2.get(j) == x)
                list2.remove(j);
        } 
        time_end2 = System.nanoTime(); 
        
        System.out.printf("%-20s %-20s %-20s\n","Delete "+ x +": ", ( time_end - time_start ) / 1000000 +" ms",( time_end2 - time_start2 ) / 1000000 +" ms");       
    }   
    
    public void ClearList()
    {   
        double time_start, time_end;
        time_start = System.nanoTime();
        list1.clear();
        time_end = System.nanoTime();
        
        double time_start2, time_end2;
        time_start2 = System.nanoTime();
        list2.clear();
        time_end2 = System.nanoTime();    
        System.out.printf("%-30s %-20s %-20s\n","Clear: ", ( time_end - time_start ) / 1000000 +" ms",( time_end2 - time_start2 ) / 1000000 +" ms"); 
    }
 
    public void Search1(int n)
    {
        double time_start, time_end;
        time_start = System.nanoTime();

        if (list1.contains(n))
        {
            time_end = System.nanoTime();
        }
        else 
             time_end = System.nanoTime();   
         
        double time_start2, time_end2;
        time_start2 = System.nanoTime(); 
        if (list2.contains(n))
        {
            time_end2 = System.nanoTime();
        }
        else
            time_end2 = System.nanoTime();         
        System.out.printf("%-30s %-20s %-20s\n","Search by Position (" +n + ") " , ( time_end - time_start ) / 1000000 +" ms",( time_end2 - time_start2 ) / 1000000 +" ms");    
        
    }
    public void Search2(int n)
    {
        double time_start, time_end;
        time_start = System.nanoTime();
        
        for ( int j = 0 ; j < list1.size() ; j++)
        {
            if ( list1.get(j) == n)
            {
                time_end = System.nanoTime();
                break;
            }
        } 
        time_end = System.nanoTime();
        
        double time_start2, time_end2;
        time_start2 = System.nanoTime();
        for ( int j = 0 ; j < list2.size() ; j++)
        {
            if ( list2.get(j) == n)
            {
                time_end2 = System.nanoTime();
                break;
            }  
        } 
        time_end2 = System.nanoTime();        
        System.out.printf("%-30s %-20s %-20s\n","Search by Value (" +n + ") ", ( time_end - time_start ) / 1000000 +" ms",( time_end2 - time_start2 ) / 1000000 +" ms");    
    }  
    public void SearchBinaria(int n)
    {
        double time_start, time_end;
        int centro,inf=0,sup=list1.size()-1;
        
        time_start = System.nanoTime();
        while(inf<=sup)
        {
            centro=((sup-inf)/2)+inf;           
            if( list1.get(centro)== n)
            {
                 time_end = System.nanoTime();
                 break;
            }           
            else if( list1.get(centro) > n ) 
            {
                sup=centro-1;
            }       
            else  
            {
                inf=centro+1;
            } 
        }
        time_end = System.nanoTime();
        
        double time_start2, time_end2;
        int centro2,inf2=0,sup2=list2.size()-1;
        
        time_start2 = System.nanoTime();
        while(inf2 <= sup2)
        {
            centro2=((sup2-inf2)/2)+ inf2;            
            if( list2.get(centro2)== n)
            {
                 time_end2 = System.nanoTime();
                 break;
            }           
            else if( list2.get(centro2) > n ) 
            {
                sup2=centro2-1;
            }       
            else  
            {
                inf2=centro2+1;
            } 
        }
        time_end2 = System.nanoTime();      
        System.out.printf("%-30s %-20s %-20s\n","Binaria (" +n + ") ", ( time_end - time_start ) / 1000000 +" ms",( time_end2 - time_start2 ) / 1000000 +" ms");  
    }

    public void RunTimes()
    {

        System.out.printf("%-20s %-20s %-20s %-20s %-20s\n","ADD ELEMENT:", "ArrayList", "ArrayList (min) " ,"LinkedList", "LinkedList (min)");        
        AddElementStart();
        AddElementFinal();
        AddElementMiddle();  
        
        System.out.println("");
        System.out.printf("%-20s %-20s %-20s\n","DELETE ELEMENT:", "ArrayList", "LinkedList"); 
        DeleteStartElement();
        DeleteMiddleElement();
        DeleteFinalElement(); 
        
        DeleteElementValue(2);
        DeleteElementValue(499);
        DeleteElementValue(999);
        
        System.out.println("");
        System.out.printf("%-30s %-20s %-20s\n","SEARCH:", "ArrayList", "LinkedList"); 
        Search1(2);
        Search1(499);
        Search1(999);
        Search1(1250);
        Search2(2);
        Search2(499);
        Search2(999);
        Search2(1250);
        SearchBinaria(2);
        SearchBinaria(499);
        SearchBinaria(999);
        SearchBinaria(1250);
        System.out.println("");
        System.out.printf("%-30s %-20s %-20s\n","CLEAR LIST:", "ArrayList", "LinkedList"); 
        
        ClearList(); 
        
        
    } 
 }

