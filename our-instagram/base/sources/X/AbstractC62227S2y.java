package X;

import java.io.File;

/* renamed from: X.S2y, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC62227S2y {
    public static String A00(File file) {
        if (file.getName().endsWith(".apk")) {
            String name = file.getName();
            String str = "";
            String replaceFirst = name.replaceFirst("(_\\d+)?\\.apk", "");
            if (replaceFirst.equals("base-master") || replaceFirst.equals("base-main")) {
                return "";
            }
            String str2 = "base-";
            if (replaceFirst.startsWith("base-")) {
                str = "config.";
            } else {
                replaceFirst = replaceFirst.replace("-", ".config.").replace(".config.master", "");
                str2 = ".config.main";
            }
            return replaceFirst.replace(str2, str);
        }
        throw AbstractC166987dD.A12("Non-apk found in splits directory.");
    }
}
