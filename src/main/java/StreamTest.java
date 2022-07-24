import java.util.*;


public class StreamTest {
    public static void main(String[] args) {
//        List<Author> authors = getAuthor();
//        //打印所有年龄小于18的作家的名字，而且要去重
//        authors.stream()
//                .distinct()
//                .filter(author -> author.getAge() < 18)
//                .forEach(author -> System.out.println(author.getName()));
//        Map<String, Integer> map = new HashMap<>();
//        map.put("aa", 11);
//        map.put("aaaa", 22);
//
//        Set<Entry<String, Integer>> entries = map.entrySet();
//        entries.stream().filter(entry -> entry.getValue() > 12)
//                .forEach(entry -> System.out.println(entry.getKey()));
       test01();
    }

    private static void test01() {
    }

    private static List<Author> getAuthor() {
        Author author = new Author(1L, "aaa", 33, "qq", null);
        Author author1 = new Author(2L, "bbb", 11, "qq", null);
        Author author2 = new Author(3L, "ccc", 19, "qq", null);
        Author author3 = new Author(4L, "ddddada", 32, "qq", null);

        List<Book> books1 = new ArrayList<>();
        List<Book> books2 = new ArrayList<>();
        List<Book> books3 = new ArrayList<>();

        books2.add(new Book(1L, "aa1", "bb1", 11, "cc"));
        books1.add(new Book(11L, "aa11", "bb11", 11, "cc"));
        books2.add(new Book(2L, "aa2", "bb2", 11, "cc"));
        books2.add(new Book(22L, "aa22", "bb22", 11, "cc"));
        books3.add(new Book(3L, "aa3", "bb3", 11, "cc"));
        books3.add(new Book(33L, "aa33", "bb33", 11, "cc"));

        author.setBook(books1);
        author1.setBook(books2);
        author2.setBook(books3);
        author3.setBook(books3);

        List<Author> authorsList = new ArrayList<>(Arrays.asList(author, author1, author2, author3));
        return authorsList;
    }
}
