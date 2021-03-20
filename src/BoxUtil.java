public class BoxUtil {
    // скопировать содержимое из одной коробки в другую
    //Box(dest) в которую будем копировать может быть типизирована любым родителем объекта содержащимся в Box(src)
    public static <T extends S, S> void copyFromBoxToBox(final Box<T> src, final Box<S> dest) {
        dest.setElement(src.get());
    }

    // скопировать содержимое из Box(src) которая может быть типизирована только классом Fruit и его наследниками,
    // при условии, что содержащийся фрукт свежий (fresh == true).
    //Box(dest) в которую будем копировать может быть типизирована любым родителем объекта содержащимся в Box(src)
    public static <T extends Fruit> void copyFreshFruitFromBoxToBox(final Box<T> src, final Box<? super T> dest) {
        if (src.get().isFresh()) {
            dest.setElement(src.get());
        }
    }

    //вывести в консоль (toString()) объект второй коробки
    public static void printElementFromTwoBoxes(final Box<? extends Box> box) {
        System.out.println(box.get().get());
    }

    /*
     * вывести в консоль (toString()) объект последней коробки
     * <p>
     * box Box, которая содержит в себе любое кол-во вложенных Box, в последней из которых может быть любой объект.
     */

    public static void printElementFromBoxes(final Box<?> box) {
        Box<?> tempBox = box;
        while (tempBox.get() instanceof Box) {
            tempBox = (Box) tempBox.get();
        }
        System.out.println(tempBox.get().toString());
    }
}
