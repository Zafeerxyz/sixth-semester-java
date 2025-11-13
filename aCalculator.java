 class aCalculator
    {
        public static void main(String[] Args)
        {
            int num1 = Integer.parseInt(Args[0]);
            int num2 = Integer.parseInt(Args[1]);
            int sum = num1 + num2 ;
            int diff = num1 - num2 ;
            int prod = num1 * num2 ;
        System.out.println("sum:" +sum +"\n difference:" + diff+ "\n Product:"+prod);

        if (num2!=0)
            {
                int quot = num1/num2 ;
                int rem = num1%num2 ;
            System.out.println("Quotient:" + quot+ "\n reminder:" + rem );
                        }
                        else
                        System.out.println("Invalid Number");

        }
    }