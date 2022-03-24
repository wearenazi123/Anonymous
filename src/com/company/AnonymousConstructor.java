package com.company;

public class AnonymousConstructor {
    public static Base getBase(int i){
        return  new Base(i) {
            {System.out.println("inside instance");}
            @Override
            public void f() {
                System.out.println("In anonymous f()");
            }
        };
    }
}
