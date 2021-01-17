public class Computer {
    //required parameters
    private String ram;
    private String hdd;
    private String cpu;

    //optional parameters
    private boolean isGraphicsCardEnable;
    private boolean isBluetoothEnable;

    private Computer(ComputerBuilder builder) {
        this.ram = builder.ram;
        this.cpu = builder.cpu;
        this.hdd = builder.hdd;
        this.isGraphicsCardEnable = builder.isGraphicsCardEnable;
        this.isBluetoothEnable = builder.isBluetoothEnable; 
    }

    public String getRam() {
        return ram;
    }

    public String getHdd() {
        return hdd;
    }

    public String getCpu() {
        return cpu;
    }

    public boolean isGraphicsCardEnable() {
        return isGraphicsCardEnable;
    }

    public boolean isBluetoothEnable() {
        return isBluetoothEnable;
    }

    public static class ComputerBuilder{
        //required parameters
        private String ram;
        private String hdd;
        private String cpu;

        //optional parameters
        private boolean isGraphicsCardEnable;
        private boolean isBluetoothEnable;

        public ComputerBuilder(String ram, String hdd, String cpu) {
            this.ram = ram;
            this.hdd = hdd;
            this.cpu = cpu;
        }

        public ComputerBuilder setGraphicsCardEnable(boolean graphicsCardEnable) {
            this.isGraphicsCardEnable = graphicsCardEnable;
            return this;
        }

        public ComputerBuilder setBluetoothEnable(boolean bluetoothEnable) {
            this.isBluetoothEnable = bluetoothEnable;
            return this;
        }
        public Computer build(){
            return new Computer(this);
        }
    }
}
