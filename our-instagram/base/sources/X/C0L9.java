package X;

import java.util.Map;

/* renamed from: X.0L9, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0L9 {
    public static C0L9 A03;
    public C024009o A00;
    public C19340xJ A01;
    public Map A02;

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, X.0L9] */
    public static synchronized C0L9 A00() {
        C0L9 c0l9;
        synchronized (C0L9.class) {
            C0L9 c0l92 = A03;
            c0l9 = c0l92;
            if (c0l92 == null) {
                ?? obj = new Object();
                A03 = obj;
                c0l9 = obj;
            }
        }
        return c0l9;
    }
}
