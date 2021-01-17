import java.util.ArrayList;

public class BuilderPattern {
    public static void main(String[] str) {
        Computer firstLaptop = new Computer.ComputerBuilder("8gb","2tb","i5").
                build();
        Computer secondLaptop = new Computer.ComputerBuilder("12gb","2tb","i7").
                setGraphicsCardEnable(true).
                setBluetoothEnable(false).
                build();

        ArrayList<Object> firstLaptopArray = new ArrayList<>();
        firstLaptopArray.add(firstLaptop.getCpu());
        firstLaptopArray.add(firstLaptop.getHdd());
        firstLaptopArray.add(firstLaptop.getRam());
        firstLaptopArray.add(firstLaptop.isGraphicsCardEnable());
        firstLaptopArray.add(firstLaptop.isBluetoothEnable());
        ArrayList<Object> secondLaptopArray = new ArrayList<>();
        secondLaptopArray.add(secondLaptop.getCpu());
        secondLaptopArray.add(secondLaptop.getHdd());
        secondLaptopArray.add(secondLaptop.getRam());
        secondLaptopArray.add(secondLaptop.isGraphicsCardEnable());
        secondLaptopArray.add(secondLaptop.isBluetoothEnable());
        System.out.println("My first laptop :" + firstLaptopArray);
        System.out.println("My second laptop :" + secondLaptopArray);
    }
}
