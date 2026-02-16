class Cpu {
    int price = 0;
    Cpu(int price) {
        this.price = price;

    }

    class Processor {
        int cores;
        String company;

        public Processor(int cores, String company) {
            this.cores = cores;
            this.company = company;
        }

        void display() {
            System.out.println("Processor cores: " + cores + " Company: " + company);

        }

    }
    static class Ram {
        int memory;
        String company;

        public Ram(int memory, String company) {
            this.memory = memory;
            this.company = company;
        }

        void display() {
            System.out.println("Ram Memory: " + memory + " Company: " + company);

        }

    }

}

public class Q5 {
    public static void main(String[] args) {
        Cpu cpu = new Cpu(50000);
        Cpu.Processor processor = cpu.new Processor(8, "Intel");
        Cpu.Ram ram = new Cpu.Ram(16, "Corsair");

        System.out.println("CPU Price: " + cpu.price);
        processor.display();
        ram.display();
    }

}
