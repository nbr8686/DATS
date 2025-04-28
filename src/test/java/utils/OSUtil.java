package utils;

public class OSUtil {

    private static String OS = System.getProperty("os.name").toLowerCase();

    public static boolean isWindows() {
        return OS.contains("win");
    }

    public static boolean isMac() {
        return OS.contains("mac");
    }

    public static boolean isLinux() {
        return OS.contains("nix") || OS.contains("nux") || OS.contains("aix");
    }

    public static String getOSName() {
        if (isWindows()) {
            return "Windows";
        } else if (isMac()) {
            return "Mac";
        } else if (isLinux()) {
            return "Linux";
        } else {
            return "Other";
        }
    }
}
