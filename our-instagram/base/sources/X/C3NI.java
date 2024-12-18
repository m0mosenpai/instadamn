package X;

import java.util.Locale;

/* renamed from: X.3NI, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C3NI {
    public static String A00(long j) {
        return String.format(Locale.getDefault(), "%s.%s", Long.valueOf(j / 1000), Long.valueOf(j % 1000));
    }
}
