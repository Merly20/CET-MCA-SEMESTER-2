
    public class q8{

    public static void main(String[] args) {

        String str1 = "Hello";
        String str2 = "World";
        String str3 = "  Java Programming  ";

        System.out.println("str1: " + str1);
        System.out.println("str2: " + str2);
        System.out.println("str3: '" + str3 + "'");

        System.out.println("Length of str1: " + str1.length());

        String concat = str1 + " " + str2;
        System.out.println("Concatenation: " + concat);

        System.out.println("Equals: " + str1.equals(str2));
        System.out.println("Equals Ignore Case: " + str1.equalsIgnoreCase("hello"));
        System.out.println("CompareTo: " + str1.compareTo(str2));

        System.out.println("Uppercase: " + str1.toUpperCase());
        System.out.println("Lowercase: " + str1.toLowerCase());

        System.out.println("Trimmed str3: '" + str3.trim() + "'");

        System.out.println("Substring of str1 (0,4): " + str1.substring(0, 4));

        System.out.println("Replace l with x in str1: " + str1.replace("l", "x"));

        System.out.println("IndexOf 'e' in str1: " + str1.indexOf("e"));
        System.out.println("Contains 'Hel': " + str1.contains("Hel"));

        String sentence = "Java is very powerful";
        String[] words = sentence.split(" ");
        for (String word : words) {
            System.out.println(word);
        }

        char[] chars = str1.toCharArray();
        for (char c : chars) {
            System.out.print(c + " ");
        }

        System.out.println();

        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");
        sb.insert(5, ",");
        sb.replace(0, 5, "Hi");
        sb.delete(0, 2);
        sb.reverse();
        System.out.println("StringBuilder Result: " + sb);

        StringBuffer sbf = new StringBuffer("Java");
        sbf.append(" Programming");
        System.out.println("StringBuffer Result: " + sbf);
    }
}

    

