import rsk.*;

public class App {

    // Calling a Kotlin function from Java, using the `@file: JVMName` annotation:
    public static void main(String[] args) {
        DisplayFunctions.display("Hello, World from Java");
        DisplayFunctions.log("Hello, World from Java"); // Use the Kotlin default; works only if the Kotlin fun is marked `@JvmOverloads
        DisplayFunctions.log("Hello, World from Java", 3);
    }
}
