import java.util.Scanner;

public class FaceMatchingModule {

    // Stored criminal images (usually file names or encoded face features)
    static String[] criminalImages = {
        "criminalA.jpg",
        "suspect123.png",
        "wanted_person.jpeg"
    };

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=== Face Matching Module ===");
        System.out.print("Enter detected face image file name: ");
        String detectedImage = sc.nextLine().toLowerCase();

        boolean matchFound = false;

        // Simple matching based on file name similarity
        for (String criminalImage : criminalImages) {
            if (detectedImage.equalsIgnoreCase(criminalImage)) {
                matchFound = true;
                break;
            }

            // Optional: Partial match (e.g., "criminalA" matches "criminalA.jpg")
            if (criminalImage.toLowerCase().contains(detectedImage.replace(".jpg", "").replace(".png",""))) {
                matchFound = true;
                break;
            }
        }

        if (matchFound) {
            System.out.println("🔴 Criminal Match Found!");
        } else {
            System.out.println("🟢 No Match Found.");
        }

        sc.close();
    }
}
