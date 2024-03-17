

public class EmployeUnbounded<T extends Number> {

        public void calculator(T n1,T n2)
        {
            System.out.println(n1+n2);
            System.out.println(n1*n2);
            System.out.println(n1-n2);
            System.out.println(n1/n2);
        }


    public static void main(String[] args) {
        EmployeUnbounded<Integer> s=new EmployeUnbounded<>();

    }

    }
