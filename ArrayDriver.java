public class ArrayDriver {
    public static void main(String[] args) {
        MyArrayList<String> test = new MyArrayList<String>();

        test.add("Michael");
        test.add("Remove");
        test.add("Kingdom");
        System.out.println(test.contains("Hello"));
        System.out.println(test.capacity());
        System.out.println(test.clear());
        System.out.println(test.indexOf("Remove"));
        System.out.println(test.indexOf("Michael"));
        System.out.println(test.isEmpty());
        System.out.println(test.remove("Michael"));
        System.out.println(test.size());
        System.out.println(test.remove(2));
        System.out.println(test.get(0));



    }

}
