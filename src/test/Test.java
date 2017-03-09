package test;

/**
 * Created by Vika on 11.02.2017.
 */
public class Test {

    public int count = 0;     //объявили переменную класса

    public void run()
    {
        count = 15;           //обращение к переменной класса
        int count = 10;       //объявили локальную переменную метода
        count ++;             //обращение к переменной метода
        System.out.println(count);
    }

    public static void main(String[] args){
        new Test();

    }

}

