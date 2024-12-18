package X;

import java.util.Map;

/* renamed from: X.L6e, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C47740L6e {
    public final C006802i A00;
    public final Map A01;

    public C47740L6e(C006802i c006802i) {
        C14360o3.A0B(c006802i, 2);
        this.A00 = c006802i;
        this.A01 = AbstractC166987dD.A1I();
    }

    public final void A00(Integer num, String str) {
        int i;
        C14360o3.A0B(str, 1);
        if (num.intValue() != 0) {
            i = 541928195;
        } else {
            i = 541931976;
        }
        if (AbstractC166997dE.A1Z(AbstractC166997dE.A0m(this.A01, i), true)) {
            this.A00.markerPoint(i, str);
        }
    }
}
