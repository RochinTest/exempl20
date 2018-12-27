//Выведите на экран все двузначные члены последовательности
// 2an-1+200, где a1= –166.
public class Main {
    public static void main(String[] args){
        for(int a=-166;a<99;a=2*a+200){
            if(a>-99&&a<-10)   System.out.print(a+" ");
            else if(a>10) System.out.print(a+" ");
        }

    }
}