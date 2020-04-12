package codeWithMe;

public class Car {
    private String name;
    private String engine;

    public static int numberOfCar;

    public Car(String name,String engine,int numberOfCar){
        this.name=name;
        this.engine=engine;

        numberOfCar++;            //bất kì khi nào khởi tạo đối tượng thì numberOfCar luôn luôn có giá trị là giá trị đầu tiên;
    }
    void diplay(){
        System.out.println(this.name+" .dong co "+this.engine+" thu tu "+numberOfCar );
    }
}
