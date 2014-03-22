
public class Matrix
{
    
    public Matrix()
    {
        int i;
        int ii;
        int[][] matrix = new int[3][3];
       for(i=0; i<3; i++)
       {
           int[] row= matrix[i];
           for(ii = 0; ii<3; ii++)
           {
               System.out.print(row[ii]);
           }
           System.out.println();
       }
        

    }
}
