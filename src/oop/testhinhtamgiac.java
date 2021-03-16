package oop;

public class testHTG {
    public static void main(String[] args) {
        hinhtamgiac h1 = new hinhtamgiac(1,1,-3,4);
        hinhtamgiac h2 = new hinhtamgiac(2,5,1,3);
        hinhtamgiac h3 = new hinhtamgiac(3,9,9,9);//deu
        hinhtamgiac h4 = new hinhtamgiac(4,4,4,6);//Can
        hinhtamgiac h5 = new hinhtamgiac(5,8,4,7);//thuong

        String fl = String.format("%-5s %-5s %-5s %-5s %-19s %-6s %-9s","Hinh:","ma:","mb:","mc:","KT-hinh:","Chuvi:","Dientich:");
        System.out.println(fl);
        System.out.println("=============================================================");
        System.out.println(h1.toString());
        System.out.println(h2.toString());
        System.out.println(h3.toString());
        System.out.println(h4.toString());
        System.out.println(h5.toString());



    }
}
