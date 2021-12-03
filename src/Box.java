import java.util.ArrayList;

public class Box <T extends Fruit> {
    private ArrayList<T> boxStuff = new ArrayList<>();
    private String boxName;

    public String getBoxName() {
        return boxName;
    }

    public Box(String boxName) {
        this.boxName = boxName;
    }

    public void put (T fruit){
        boxStuff.add(fruit);
    }

    public void whatInBox(){
        if(boxStuff.isEmpty()){
            System.out.println("Коробка " + this.getBoxName() + " пуста!");
        }else{
            System.out.println("В коробке " + this.getBoxName() + " фруктов : " + boxStuff.size() + " шт.");
        }
    }

    public float getWeight(){
        float weight = 0;
        for(T fruit : boxStuff){
            weight += fruit.getWeight();
        }
        return weight;
    }

    public boolean compare(Box another){
        return Math.abs(this.getWeight() - another.getWeight()) < 0.0001;
    }

    private ArrayList<T> getBoxStuff() {
        return boxStuff;
    }

    private void clearBox(){
        boxStuff.clear();
    }

    public void shiftFruit(Box <T> another){
        ArrayList<T> tempBox = this.getBoxStuff();
        for(T fruit : tempBox){
            another.put(fruit);
        }
        this.clearBox();
    }
}
