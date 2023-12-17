import java.util.HashMap;
import java.util.Set;
import java.util.Map;
import java.util.Iterator;
import java.util.Collection;

class SetHashMap<E> implements Set<E> {
    private final Map<E, Object> map;

    public SetHashMap() {
        map = new HashMap<>();
    }

    @Override
    public int size() {
        return map.size();
    }

    @Override
    public boolean isEmpty() {
        return map.isEmpty();
    }

    @Override

    public boolean contains(Object o) {
        return map.containsKey(o);
    }

    @Override
    public Iterator<E> iterator() {
        return map.keySet().iterator();
    }

    @Override
    public Object[] toArray() {
        return null;
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean add(E e) {
        return map.put(e, this) == null;
    }

    @Override
    public boolean remove(Object o) {
        return map.remove(o) != null;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        for (Object C : c) {
            if (!map.containsKey(C)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        boolean check = false;

        for (E C : c) {
            if (map.put(C, this) == null) {
                check = true;
            }
        }

        return check;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        boolean check = false;

        Iterator<E> iterator = map.keySet().iterator();
        while (iterator.hasNext()) {
            E C = iterator.next();
            if (!c.contains(C)) {
                iterator.remove();
                check = true;
            }
        }
        return check;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        for (Object C : c ) {
            map.remove(C);
            if(map.isEmpty()) return true;
        }
        if(map.isEmpty()) return true;
        else return false;
    }

    @Override
    public void clear() {
        map.clear();
        System.out.println("Cleared set.");
    }
}
