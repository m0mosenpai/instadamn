package X;

import java.nio.ByteBuffer;

/* renamed from: X.SeU, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63169SeU {
    public static final ThreadLocal A03 = new ThreadLocal();
    public final int A00;
    public final C62894SWa A01;
    public volatile int A02 = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public static Q9i A00(C63169SeU c63169SeU) {
        ThreadLocal threadLocal = A03;
        Q9i q9i = (Q9i) threadLocal.get();
        Q9i q9i2 = q9i;
        if (q9i == null) {
            Object obj = new Object();
            threadLocal.set(obj);
            q9i2 = obj;
        }
        Q9j q9j = c63169SeU.A01.A02;
        int i = c63169SeU.A00;
        int A00 = q9j.A00(6);
        if (A00 != 0) {
            int i2 = A00 + q9j.A00;
            int i3 = i2 + q9j.A01.getInt(i2) + 4 + (i * 4);
            int i4 = i3 + q9j.A01.getInt(i3);
            ByteBuffer byteBuffer = q9j.A01;
            q9i2.A00 = i4;
            q9i2.A01 = byteBuffer;
        }
        return q9i2;
    }

    public C63169SeU(C62894SWa c62894SWa, int i) {
        this.A01 = c62894SWa;
        this.A00 = i;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append(super.toString());
        A1C.append(", id:");
        AbstractC58318PtA.A1T(A1C, AbstractC58323PtF.A07(A00(this)));
        A1C.append(", codepoints:");
        Q9i A00 = A00(this);
        int A002 = A00.A00(16);
        if (A002 != 0) {
            int A09 = AbstractC58323PtF.A09(A00, A002);
            for (int i = 0; i < A09; i++) {
                AbstractC58318PtA.A1T(A1C, AbstractC58323PtF.A08(A00(this), i));
                A1C.append(" ");
            }
        }
        return A1C.toString();
    }
}
