package X;

import java.util.Random;

/* renamed from: X.4BC, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C4BC {
    public static final Random A00 = new Random();

    public static String A00(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(".");
        sb.append(str2);
        sb.append(".");
        sb.append(-1L);
        return sb.toString();
    }
}
