package liczbaLancuchow;

import java.util.Arrays;

public class Main {
    public static void main(String[] args)
    {
        String zdanie = "Gdyby kózka nie skakała, to by nogi nie złamała";

        System.out.println(zdanie);

        String[] zdanie1 = zdanie.split(" ");

        long ile = Arrays.stream(zdanie1)
                .map(String::length)
                .count();

        System.out.println("zawiera " + ile + " łańcuchów.");
    }
}
