import java.util.*;

public class Sort {

        public  int[] InsertionSort(int []ar,int i)

        {

            int i1,cur1;

            for(i1=1;i1<i;i1++)

            {

                 cur1 = ar[i1];

                int j1 = i1 - 1;

                while (j1 >= 0 && ar[j1] > cur1) {

                    ar[j1 + 1] = ar[j1];

                    j1 = j1 - 1;

                }

                ar[j1 + 1] = cur1;

            }

            return ar;

        }

        public static void main(String [] args) {

            Sort s = new Sort();

            int i,j,li[],sli[];

            Scanner sc = new Scanner(System.in);

            System.out.print("Enter the number of element");

            i = sc.nextInt();

            li = new int[i];

            sli = new int[i];

            for (j=0;j<i;j++)

            {

                System.out.println("Enter the "+j+"th value");
                

                li[j]=sc.nextInt();

            }

            System.out.println("Before sorting");
            
        

            for (j=0;j<i;j++)

            {
            	

                System.out.println("Element of the "+li[j]+"");
                
                

            }

            sli=s.InsertionSort(li,i);

            System.out.println("After sorting");
            

            for (j=0;j<i;j++)

            {

                System.out.println("Element of the "+sli[j]+"");

            }

        }

}
