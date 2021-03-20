public final class Box<T> {
    private T element;

    public void setElement(final T element) {
        this.element = element;
    }

    public T get() {
        return element;
    }
}
