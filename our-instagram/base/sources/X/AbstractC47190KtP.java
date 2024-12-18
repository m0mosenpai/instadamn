package X;

import java.util.regex.Pattern;

/* renamed from: X.KtP, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC47190KtP {
    public static final Pattern A01 = Pattern.compile("[A-Z]{2}|[0-9]{3}");
    public static final Pattern A00 = Pattern.compile("[a-z]{2,3}");

    static {
        int i = 0;
        do {
            i++;
        } while (i < 10);
    }
}
