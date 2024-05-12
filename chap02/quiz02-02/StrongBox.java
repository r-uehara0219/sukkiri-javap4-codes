public class StrongBox<E> {
    private E element;
    private KeyType keyType;
    private long count;

    public StrongBox(KeyType keyType) {
        this.keyType = keyType;
    }

    public void put(E element) {
        this.element = element;
    }

    public E get() {
        this.count++;

        switch (this.keyType) {
            case PADLOCK:
                if (count < 1024) {
                    return null;
                }
                break;
            case BUTTON:
                if (count < 10000) {
                    return null;
                }
                break;
            case DIAL:
                if (count < 30000) {
                    return null;
                }
                break;
            case FINGER:
                if (count < 1000000) {
                    return null;
                }
                break;
        }

        this.count = 0;
        return this.element;
    }

    public long getCount() {
        return this.count;
    }
}
