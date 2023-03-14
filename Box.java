import java.util.ArrayList;
import java.util.List;

public class Box<F extends Fruit> {

    private final List<F> fruitBox = new ArrayList<>();

    // Нужно реализовать хранение фруктов в коробке Box

    public void add(F fruit) {
        fruitBox.add(fruit);
    }

    public double getBoxWeight() {
        double fruitsWeight = 0;
        for (F fruit : fruitBox) {
            fruitsWeight += fruit.getWeight();
        }
        return fruitsWeight;
    }

    public void moveTo(Box<? super F> anotherBox) {
        for (int i = 0; i < fruitBox.size(); i++) {
            anotherBox.add(fruitBox.get(i));
        }
        fruitBox.clear(); 
    }
}
