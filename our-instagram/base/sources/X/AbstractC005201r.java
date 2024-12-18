package X;

/* renamed from: X.01r, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC005201r {
    public static final Object A00 = new Object();

    public static final Object A00(C005101q c005101q, int i) {
        Object obj;
        int A002 = AbstractC005301s.A00(c005101q.A02, c005101q.A00, i);
        if (A002 < 0 || (obj = c005101q.A03[A002]) == A00) {
            return null;
        }
        return obj;
    }

    public static final void A01(C005101q c005101q) {
        int i = c005101q.A00;
        int[] iArr = c005101q.A02;
        Object[] objArr = c005101q.A03;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != A00) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        c005101q.A01 = false;
        c005101q.A00 = i2;
    }
}
