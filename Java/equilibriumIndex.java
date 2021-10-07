class Main{
  
  static int equilibrium(int a[], int n)
  { 
      if (n == 1)
          return (0);

      int[] front = new int[n];
      int[] back = new int[n];
        for (int i = 0; i < n; i++)
      {
          if (i != 0)
          {
              front[i] = front[i - 1] + a[i];
          }
          else 
          {
              front[i] = a[i];
          }
      }
          for (int i = n - 1; i > 0; i--) 
      {
          if (i <= n - 2) 
          {
              back[i] = back[i + 1] + a[i];
          }
          else 
          {
              back[i] = a[i];
          }
      }

      for(int i = 0; i < n; i++) 
      {
          if (front[i] == back[i])
          {
              return i;
          }
      }

      return -1;
  }

  public static void main(String[] args)
  {
      int arr[] = { -7, 1, 5, 2, -4, 3, 0 };
      int arr_size = arr.length;

      System.out.println("First Point of equilibrium " +
                         "is at index " + 
                         equilibrium(arr, arr_size));
  }
}
