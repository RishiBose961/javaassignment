import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        double pie = 3.14;
        //Area Of Circle Java Program
//        Scanner inputRadius  = new Scanner(System.in);
//        int Radius = inputRadius.nextInt();
//        double pie = 3.14;
//        double Area = pie*Radius*Radius;
//        System.out.println(Area);

        //Area Of Triangle 1/2*b*h


//        int breadth = inp.nextInt();
//        int height = inp.nextInt();
//
//        int AreaTraingle = (breadth*height)/2;
//
//        System.out.println(AreaTraingle);

        //Area Of Rectangle Program

//        int width = inp.nextInt();
//        int height = inp.nextInt();
//
//        int AreaRec = width*height;
//        System.out.println(AreaRec);

        //Area Of Isosceles Triangle
//        int a = inp.nextInt();
//        int b = inp.nextInt();
//
//        double height = Math.sqrt(a*a - (b*b/4));
//
//        double areaiso = b/2*height;
//
//        System.out.println(areaiso);

        //Area Of Parallelogram
//
//        int b = inp.nextInt();
//        int h = inp.nextInt();
//
//        int Area = b*h;
//        System.out.println(Area);

    //    Area Of Rhombus    A=pq/2

//        int p = inp.nextInt();
//        int q = inp.nextInt();
//
//        int Area = (p*q)/2;
//        System.out.println(Area);

        //Area Of Equilateral Triangle

//        int side = inp.nextInt();
//        double Area = Math.sqrt(3)/4*side*side;
//
//        System.out.println(Area);


        //Perimeter Of Circle C=2πr

//        int radius = inp.nextInt();
//
//        double pie = 3.14;
//
//        double perometercircle = 2*pie*radius;
//
//        System.out.println(perometercircle);

        //Perimeter Of Equilateral Triangle P=3a

//        int a = inp.nextInt();
//        int Perimeter = 3*a;
//        System.out.println(Perimeter);

        //Perimeter Of Parallelogram P=2(a+b)

//        int a = inp.nextInt();
//        int b = inp.nextInt();
//
//        int Perimeter = 2*(a*b);
//        System.out.println(Perimeter);

        //Perimeter Of Rectangle P=2(l+w)
//
//        int l = inp.nextInt();
//        int w = inp.nextInt();
//
//        int Per = 2*(l+w);
//        System.out.println(Per);

        //Perimeter Of Square P=4a

//        int a = inp.nextInt();
////        int per = 4*a;
////        System.out.println(per);


        //Perimeter Of Rhombus P=4a

//        int a = inp.nextInt();
//
//        int peri = 4*a;
//        System.out.println(peri);

        //Volume Of Cone Java Program

//        double radius = inp.nextDouble();
//        double height = inp.nextDouble();
//

//
//        double volu = pie*radius*radius*(height/3);
//
//        System.out.println(volu);

        //Volume Of Prism (V) = B × h,
//
//        double base = inp.nextDouble();
//        double height = inp.nextDouble();
//
//        double vol = base*height;
//        System.out.println(vol);

        //Volume Of Cylinder V=πr2h

//        double radius = inp.nextDouble();
//
//        double height = inp.nextDouble();
//
//        double vol = pie*radius*radius*height;
//        System.out.println(vol);

        //Volume Of Sphere

//        double radius = inp.nextDouble();
//
//        double vol = (4/3)*pie*radius*radius*radius;
//
//        System.out.println(vol);

        //Volume Of Pyramid

//        double l = inp.nextDouble(); //	Base length
//        double w = inp.nextDouble(); //Base width
//        double h = inp.nextDouble();  //Pyramid height
//
//        double vol = (l*w*h)/3;
//        System.out.println(vol);

        //Curved Surface Area Of Cylinder  2πrh

//        double radius = inp.nextDouble();
//        double height = inp.nextDouble();
//
//        double CSA = 2*pie*radius*height;
//
//        System.out.println(CSA);

        // Total Surface Area Of Cube 6a2

//        int a = inp.nextInt();
//        int TSA = 6*a*a;
//        System.out.println(TSA);

        //Fibonacci Series In Java Programs

        //0,1,1,2,3...

        int num = inp.nextInt();
        int a = 0;
        int b = 1;
        int count = 2;

        while (count <= num ){
            int temp = b;
            b = b+a;
            a = temp;
            count++;
        }
        System.out.println(b);
    }
}