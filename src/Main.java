public class Main {

    public static void main(final String[] args) {
        // write your code here
        Apple apple = new Apple();
        //apple.setFresh(false);

        Box<Apple> boxApple = new Box<>(); // коробка для яблока
        Box<Fruit> boxFruit = new Box<>(); // коробка для фрукта
        Box<Object> boxObject = new Box<>(); // коробка для объектов
        Box<Box> boxBox = new Box<>(); // коробка для коробок
        Box<Object> boxBox2 = new Box<>(); // вторая коробка для коробок

        boxApple.setElement(apple); // положили яблоко

        System.out.println("В коробке для фруктов " + boxFruit.get());
        System.out.println("Из коробки для яблок перекладываем в коробку для фруктов");
        BoxUtil.copyFromBoxToBox(boxApple, boxFruit);
        System.out.println("В коробке для фруктов теперь " + boxFruit.get());

        System.out.println("В самой обычной коробке " + boxObject.get());
        System.out.println("Из коробки для фруктов перекладываем в самую обычную коробку");

        BoxUtil.copyFreshFruitFromBoxToBox(boxFruit, boxObject);
        System.out.println("В обычной коробке теперь " + boxObject.get());

        System.out.println("В коробку положили коробку с яблоком");
        boxBox.setElement(boxApple);
        System.out.print("Во второй коробке ");
        BoxUtil.printElementFromTwoBoxes(boxBox);

        boxBox2.setElement(boxBox);

        System.out.print("В коробке лежит коробка, в которой лежит еще одна коробка, в которой лежит ");
        BoxUtil.printElementFromBoxes(boxBox2);
    }
}
