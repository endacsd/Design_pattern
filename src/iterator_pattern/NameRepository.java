package iterator_pattern;

public class NameRepository implements Container {

    public String[] names ={"zs","ys","jj","ks"};
    @Override
    public Iterator getIterator() {
        return new Iterator() {
            int index;
            @Override
            public boolean hasNext() {
                return index<names.length;
            }

            @Override
            public Object next() {
                if(hasNext()){
                    return names[index++];
                }
                return null;
            }
        };
    }



}
