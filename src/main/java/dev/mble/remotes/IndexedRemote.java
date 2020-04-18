public class IndexedRemote<T> implements RemoteSpliterator<T> {
    private final Long min;
    private final Long max;
    private final Function<Long, T> get;

    public IndexedRemote(Long min, Long max, Function<Long, T> get) {
        this.min = min;
        this.max = max;
        this.get = get;
    }

    public IndexedRemote(Long max, Function<Long, T> get) {
        this(min, max, get);
    }

}