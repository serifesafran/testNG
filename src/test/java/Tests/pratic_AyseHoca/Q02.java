package Tests.pratic_AyseHoca;

import org.testng.annotations.Test;

public class Q02 {
    /*
    - Birbirine bagimli testler olusturun.
    - Conficreder ile birbirine bagımlı testler olusturarak.
    - Birbirine bagimli testler olusturarak ;
        =>ilk once wisequarter'a gidin
        =>sonra wisequarter'a bagimli olarak youtube'a gidin
        =>daha sonra youtube'a bagimli olarak amazon'a gidin
    - driver'i kapatin.
     */
    @Test(priority = 10)
    public void b(){
        System.out.println("b");
    }
    @Test (enabled = false)
    public void d(){
        System.out.println("d");
    }
    @Test (priority = -10)
    public void c(){
        System.out.println("c");
    }
    @Test (dependsOnMethods = "b")
    public void e(){
        System.out.println("e");
    }
    @Test (dependsOnMethods = "b")
    public void a(){
        System.out.println("a");
    }
    @Test (dependsOnMethods = "c")
    public void f(){
        System.out.println("f");
    }
    @Test
    public void g(){
        System.out.println("g");
    }
}
