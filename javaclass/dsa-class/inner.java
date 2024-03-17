package javaclass.Collections;

 class Outer {
  

    void classInsidemethod() {
        int a=10;
                              class Inner{
                                          public void show() 
                                                        {
                                                        System.out.println("inner class method"+a);

                                                        }

                                            Inner obj1=new Inner();
                                            obj1.
        }
    }



    public static void main(String[] args) {
        Outer objouter=new Outer();
        objouter.classInsidemethod();

    }
}
