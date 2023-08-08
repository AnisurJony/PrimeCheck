using System;

namespace PrimeCheck
{
    class Program
    {
        static int IsPrime(int n)
        {
            if (n <= 1)
            {
                return 0;
            }

            for (int i = 2; i < n; i++)
            {
                if (n % i == 0)
                {
                    return 0;
                }
            }

            return 1;
        }

        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());
            Console.Write(IsPrime(n));
        }
    }
}
