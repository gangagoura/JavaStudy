import java.io.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class CorridaTartarugas {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
           //continue a solucao de acordo com o solicitado

		
		do {
			Integer.parseInt(br.readLine());
            String str = br.readLine();

            List<Integer> ints = Arrays.stream(str.split(" "))
                    .map(Integer::parseInt)
                    .collect(Collectors.toList());

           int n = Collections.max(ints);

            if (n > 10) {
                if (n >=20) {
                    System.out.println(3);

                }else
                System.out.println(2);

            }else
            System.out.println(1);
        }
        while (br.ready());
    }
}
