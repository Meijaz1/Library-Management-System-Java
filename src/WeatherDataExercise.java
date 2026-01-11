import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class WeatherDataExercise {

    // Adjust this if you'd like to store the file elsewhere
    private static final String OUTPUT_FILENAME = "weather_data.json";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a 5-digit ZIP code: ");
        String zipCode = scanner.nextLine().trim();

        // 1) Build the request URL
        String apiKey = "04fadf29277f9c97be0cd33e46555486";  // <-- Replace with your actual API key
        String urlString = "https://api.openweathermap.org/data/2.5/weather?zip="
                + zipCode
                + ",us&appid="
                + apiKey;

        try {
            // 2) Fetch the JSON data from OpenWeatherMap
            String jsonResponse = fetchWeatherData(urlString);

            // 3) Write JSON data to a local file
            writeToFile(jsonResponse, OUTPUT_FILENAME);
            System.out.println("Weather data written to file successfully!");

            // 4) Read the JSON file back and display its content
            String fileContents = readFromFile(OUTPUT_FILENAME);
            System.out.println("\nReading back the JSON file...");
            System.out.println("Contents of " + OUTPUT_FILENAME + ":");
            System.out.println(fileContents);

        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    private static String fetchWeatherData(String urlString) throws IOException {
        StringBuilder result = new StringBuilder();

        URL url = new URL(urlString);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");

        // Read the response
        try (BufferedReader reader = new BufferedReader(
                new InputStreamReader(conn.getInputStream()))) {
            String line;
            while ((line = reader.readLine()) != null) {
                result.append(line);
            }
        }

        return result.toString();
    }

    private static void writeToFile(String text, String filename) throws IOException {
        try (PrintWriter out = new PrintWriter(new FileWriter(filename))) {
            out.print(text);
        }
    }

    private static String readFromFile(String filename) throws IOException {
        StringBuilder sb = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                sb.append(line).append("\n");
            }
        }
        return sb.toString();
    }
}
