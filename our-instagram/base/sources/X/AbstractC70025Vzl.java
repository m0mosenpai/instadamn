package X;

import java.util.regex.Pattern;

/* renamed from: X.Vzl, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC70025Vzl {
    public static final Pattern A00 = Pattern.compile("^NOTE([ \t].*)?$");

    public static float A00(String str) {
        if (str.endsWith("%")) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException("Percentages must end with %");
    }
}
