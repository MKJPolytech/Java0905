package chp07_0905.lab1;

public class Square {
   private int length; //한 변의 길이

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    //직사갓형의 넓이를 반환하는 메소드
    public int area() {
        int result = (int)Math.pow(length, 2);
        return result;
    }
    
    
}
