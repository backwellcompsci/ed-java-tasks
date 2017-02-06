/*
 * Pass by value: PoorDogTestDrive
 * Edward Callow
 * 170130
 */

// create new instance of class and print results of ‘getters’
public class PoorDogTestDrive {
    public static void main(String[] args) {
        PoorDog one = new PoorDog();
        System.out.println("Dog size is " + one.getSize());
        System.out.println("Dog name is " + one.getName());
    }
}

class PoorDog {
    // creates private variables, not accesible out of class
    private int size;
    private String name;

    // creates ‘getter’ methods to return variable to calling code (out of class)
    public int getSize() {
        return size;
    }
    public String getName() {
        return name;
    }
}