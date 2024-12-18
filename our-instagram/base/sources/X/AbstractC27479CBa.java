package X;

/* renamed from: X.CBa, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC27479CBa {
    public static final long A00(long j, long j2) {
        int A00;
        int A01 = C5C2.A01(j);
        int A002 = C5C2.A00(j);
        int A012 = C5C2.A01(j2);
        if (A012 < A002 && A01 < (A00 = C5C2.A00(j2))) {
            if (A012 <= A01 && A002 <= A00) {
                A01 = A012;
            } else {
                if (A01 > A012 || A00 > A002) {
                    if (A012 <= A01) {
                        A01 = A012;
                    }
                }
                A002 -= A00 - A012;
            }
            A002 = A012;
        } else if (A002 > A012) {
            A00 = C5C2.A00(j2);
            A01 -= A00 - A012;
            A002 -= A00 - A012;
        }
        return C60Z.A00(A01, A002);
    }
}
