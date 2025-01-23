public class Cube {
    private int side;

    public Cube() {
        this.side = 1;
    }

    public Cube(int sideLength){
        if (sideLength < 1){
            throw new IllegalArgumentException();
        }
        this.side = sideLength;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        if (side < 1){
            throw new IllegalArgumentException("A cube’s side length cannot be less than 1!");
        }
        this.side = side;
    }

    public int calculateSurfaceArea (){
        return side*side*6;
    }

    public int calculateVolume(){
        return side*side*side;
    }

    public String toString(){
        return "Cube{side=" + Integer.toString(this.side) + "}";
    }

    public static void main(String[] args) {
        Cube cube1 = new Cube();
        System.out.println("The area of the cube is " + cube1.calculateSurfaceArea() + ".");

        Cube cube2 = new Cube(3);
        System.out.println("The volume of the cube is " + cube2.calculateVolume() + ".");
//        cube2.setSide(0);
//        System.out.println(cube2.getSide());

        cube2.setSide(5);
        System.out.println(cube2.calculateVolume());
        System.out.println(cube2.toString());
    }
}