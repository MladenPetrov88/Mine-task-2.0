import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class MinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, Integer> resources = new LinkedHashMap<>();

        while (!"stop".equals(input)) {
            String resource = input;
            int count = Integer.parseInt(scanner.nextLine());

            if (!resources.containsKey(resource)) {
                resources.put(resource, count);
            } else {
                resources.put(resource, resources.get(resource) + count);
            }

            input = scanner.nextLine();
        }

        for (Map.Entry<String, Integer> entry : resources.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());

        }

    }
}
