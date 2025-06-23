package com.Documents;

public class packages {
    public static void main(String[] args) {
        System.out.println("Hello from Main1 in com.Documents package!");
    }
}   
/*In Java, a **package** is like a folder that helps organize your code. It groups related classes, interfaces, and sub-packages together, making your programs easier to manage and avoiding name conflicts between classes.

There are two main types:
1. **Built-in packages** – These come with Java, like `java.util` (which includes tools like `Scanner` and `ArrayList`) and `java.io` (for input/output operations).
2. **User-defined packages** – You can create your own to group your custom classes. For example:
   ```java
   package myutilities;

   public class Helper {
       public static void greet() {
           System.out.println("Hello from the package!");
       }
   }
   ```

To use a class from a package, you import it:
```java
import myutilities.Helper;

public class Main {
    public static void main(String[] args) {
        Helper.greet();
    }
}
```

Packages also help with **access control**—you can restrict which classes or methods are visible outside the package.
 */
