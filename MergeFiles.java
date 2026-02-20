public class MergeFiles {
    public static void main(String[] args) {

        String file1 = "sample.txt";
        String file2 = "sample2.txt";
        String outputFile = "merged.txt";

        try (
            BufferedReader reader1 = new BufferedReader(new FileReader(file1));
            BufferedReader reader2 = new BufferedReader(new FileReader(file2));
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))
        ) {
            String line;

            // Copy content of first file
            while ((line = reader1.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }

            // Copy content of second file
            while ((line = reader2.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }

            System.out.println("Files merged successfully.");

        } catch (IOException e) {
            System.err.println("Error merging files: " + e.getMessage());
        }
    }
}
