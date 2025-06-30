package Learning;

public class StringExamples
{
    public static void main(String[] args)
    {
        // new object and new spot of memory
        String str = "Hello";
        str = str + " World \n"; // create a new string object
        System.out.print(str);

        // ADDS TO THE EXISTING MEMORY LOCATION. NOT THREAD SAFE
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World"); // create a new string object
        System.out.println(sb.toString()); // Outputs: Hello World       
        
        // ADDS TO THE EXISTING MEMORY LOCATION. THREAD SAFE. THE METHODS ARE IN SYNC.
        // SLIGHTLY MORE OVERHEAD THAN STRINGBUILDER DUE TO SAFETY.
        // ONLY REALLY NEEDED IF MULTIPLE USERS WILL BE ACCESSING THE STRINGS.
        StringBuffer sbf = new StringBuffer("Hello");
        sbf.append(" World");
        System.out.println(sbf);
    }
}