package X;

import java.util.HashSet;

/* renamed from: X.0LE, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C0LE {
    public static int A01 = 1;
    public static final java.util.Set A02 = new HashSet();
    public final String A00;

    public C0LE(int i, String str, boolean z) {
        this.A00 = str;
        A01 = Math.max(A01, i + 1);
        if (!z) {
            A02.add(str);
        }
    }
}
