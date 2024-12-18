package X;

/* renamed from: X.1Kk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC25061Kk {
    /* JADX WARN: Type inference failed for: r0v4, types: [X.1KH, java.lang.Object] */
    public static final C1KH A00() {
        C1KH c1kh;
        synchronized (C1KH.A01) {
            C1KH c1kh2 = C1KH.A00;
            c1kh = c1kh2;
            if (c1kh2 == null) {
                C0w9.A03("MemoryManager", "Attempt to get instance before init");
                ?? obj = new Object();
                C1KH.A00 = obj;
                c1kh = obj;
            }
        }
        return c1kh;
    }
}
