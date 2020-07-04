package kmk;

import org.junit.Test;

import java.util.Arrays;
import java.util.Random;

public class myListTest {


    @Test
    public void shouldCreate() {
        Product door = new Product("Wooden door", 35);
        Product floorPanel = new Product("Floor Panel", 25);
        Product[] products = {door, floorPanel};
        System.out.println(Arrays.toString(products));

        products = add(products, door);
        System.out.println(Arrays.toString(products));
    }

    private Product[] add(Product[] products, Product door) {
        int length = products.length;
        Product[] newProduct = Arrays.copyOf(products,length+1);
        newProduct[length] = door;
        return  newProduct;
    }

    @Test
    public void generate(){
        int[] numbers = new int[4];

        Random random=new Random();

        for (int i = 0; i <numbers.length ; i++) {
            numbers[i]=random.nextInt(9);

        }

        System.out.println(Arrays.toString(numbers));


    }

}
