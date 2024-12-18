package X;

import kotlinx.serialization.encoding.Encoder;

/* renamed from: X.VzG, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC69996VzG {
    public static final C3RA A01(Object obj, Encoder encoder, C3TB c3tb) {
        C14360o3.A0B(c3tb, 0);
        C3RA A02 = c3tb.A02(obj, encoder);
        if (A02 != null) {
            return A02;
        }
        C0YZ A0r = AbstractC25229BEm.A0r(obj);
        InterfaceC16510rw A00 = c3tb.A00();
        C14360o3.A0B(A00, 1);
        String A01 = AbstractC13230m9.A01(A0r.A00);
        if (A01 == null) {
            A01 = String.valueOf(A0r);
        }
        AbstractC68611VXm.A00(A01, A00);
        throw C00O.createAndThrow();
    }

    public static final C3RB A00(String str, C3T8 c3t8, C3TB c3tb) {
        C3RB A01 = c3tb.A01(str, c3t8);
        if (A01 != null) {
            return A01;
        }
        AbstractC68611VXm.A00(str, c3tb.A00());
        throw C00O.createAndThrow();
    }
}
