public class incremental{
    public static boolean check(int[] arr,int low, int high)
    {
        for(int i=0;i<low-1;i++)
        {
            if(arr[i]>=arr[i+1])
            {
                return false;
            }
        }
        if(low>0 && high<arr.length-1 && arr[low-1]>=arr[high+1])
        {
            return false;
        }
        for(int i=high+1;i<arr.length-1;i++)
        {
            if(arr[i]>=arr[i+1])
            {
                return false;
            }
        }
        return true;
    }
    public static int checkinc(int[] arr)
    {
        int max=0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i;j<arr.length;j++)
            {
                if(check(arr,i,j))
                {
                    max++;
                }
            }
        }
        return max;
    }
    public static void main(String args[])
    {
        int[] arr={1,2,3,4};
        System.out.println(checkinc(arr));
    }
}