package chp07_0905.ex10;

public class Bicycle {
    String name;
    double weight;
    int price;

    public static void main(String[] args) {
        Bicycle b1 = new Bicycle();
        //인스턴스변수를 초기화할 것;
        b1.name = "로드형 자전거";
        b1.weight = 7.25;
        b1.price = 326000;
        System.out.printf("b1=>{%s, %.2f, %d}\n", b1.name, b1.weight, b1.price);
    }
}
