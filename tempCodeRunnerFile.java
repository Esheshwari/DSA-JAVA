public class tempCodeRunnerFile {
    public static void main(String[] args) {
        System.out.println(args[0]); // This will print the first command line argument passed to the program
    }
}

/*In Java development—especially when using **Visual Studio Code** with the **Code Runner extension**—you might come across a file named `tempCodeRunnerFile.java`. This isn’t part of your project; it’s a temporary file automatically created when you run a selected snippet of code rather than the whole file.

Here’s what’s happening:
- When you highlight a portion of your Java code and run it using Code Runner, it wraps that snippet into a temporary file called `tempCodeRunnerFile.java`.
- This can cause issues if your code includes a `public class`, because Java requires the filename to match the public class name. So if your class is `Main`, but the file is `tempCodeRunnerFile.java`, you’ll get a compilation error.

To avoid this:
- Either run the **entire file** instead of selecting a snippet.
- Or tweak your VS Code settings by adding this to your `.vscode/settings.json`:
  ```json
  "code-runner.ignoreSelection": true
  ```
  This tells Code Runner to always run the full file, even if something is selected.
 */
