package X;

/* renamed from: X.CWq, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC28018CWq {
    public static final C5C8 A00(C5C3 c5c3, int i) {
        C5C8 c5c8 = c5c3.A01;
        int A00 = C5C2.A00(c5c3.A00);
        return c5c8.subSequence(A00, Math.min(A00 + i, c5c8.A00.length()));
    }

    public static final C5C8 A01(C5C3 c5c3, int i) {
        C5C8 c5c8 = c5c3.A01;
        int A01 = C5C2.A01(c5c3.A00);
        return c5c8.subSequence(Math.max(0, A01 - i), A01);
    }
}
