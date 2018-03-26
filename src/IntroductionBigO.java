
public class IntroductionBigO {

    private static String[] words = {"hello", "world", "monkey", "cat", "dog",
                                    "fish", "bicycle", "bread", "tiger", "analogue"};

    public static void main(String[] args) {
        printArray(words);
        System.out.printf("Is the first element equal to '%s'?: %b\n",
            "analogue", isFirstElementEqualTo("analogue"));
        bubbleSort(words);
        printArray(words);
        System.out.printf("Is the first element equal to '%s'?: %b\n",
                "analogue", isFirstElementEqualTo("analogue"));
        System.out.printf("List contains '%s'?: %b\n",
                "hello", containsValue("hello"));
        System.out.printf("List contains '%s'?: %b\n",
                "gorilla", containsValue("gorilla"));
        System.out.printf("List contains duplicates?: %b\n", containsDuplicates());

        System.out.println(fibonacci(24));
    }

    private static boolean containsDuplicates()
    {
        for(int i = 0; i < words.length; i++)
        {
            for(int j = 0; j < words.length; j++)
            {
                if(i == j) continue;
                if(words[i].equals(words[j]))
                {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean isFirstElementEqualTo(String test)
    {
        return words[0].equals(test);
    }

    private static boolean containsValue(String test)
    {
        for (String word : words) {
            if (test.equals(word)) {
                return true;
            }
        }
        return false;
    }

    private static void bubbleSort(String[] arrayOfWords)
    {
        String temp;
        for(int i = 0; i < arrayOfWords.length-1; i++)
        {
            for(int j = 0; j < arrayOfWords.length - i - 1; j++)
            {
                if(arrayOfWords[j+1].compareTo(arrayOfWords[j]) < 0)
                {
                    temp = arrayOfWords[j];
                    arrayOfWords[j] = arrayOfWords[j+1];
                    arrayOfWords[j+1] = temp;
                }
            }
        }
    }

    private static void printArray(String[] arrayOfWords)
    {
        for(int i = 0; i < arrayOfWords.length; i++)
        {
            System.out.print(arrayOfWords[i]);
            if(i < arrayOfWords.length-1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    private static int fibonacci(int number)
    {
        if(number <= 1) return number;

        return fibonacci(number - 2) + fibonacci(number - 1);
    }
}
