package X;

import android.graphics.Typeface;

/* renamed from: X.SWa, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C62894SWa {
    public final Typeface A00;
    public final SYF A01;
    public final Q9j A02;
    public final char[] A03;

    public C62894SWa(Typeface typeface, Q9j q9j) {
        int i;
        int i2;
        int i3;
        this.A00 = typeface;
        this.A02 = q9j;
        this.A01 = new SYF(1024);
        int A00 = q9j.A00(6);
        if (A00 != 0) {
            i = AbstractC58323PtF.A09(q9j, A00);
        } else {
            i = 0;
        }
        this.A03 = new char[i * 2];
        int A002 = q9j.A00(6);
        if (A002 != 0) {
            int A09 = AbstractC58323PtF.A09(q9j, A002);
            for (int i4 = 0; i4 < A09; i4++) {
                C63169SeU c63169SeU = new C63169SeU(this, i4);
                Character.toChars(AbstractC58323PtF.A07(C63169SeU.A00(c63169SeU)), this.A03, i4 * 2);
                Q9i A003 = C63169SeU.A00(c63169SeU);
                int A004 = A003.A00(16);
                if (A004 != 0) {
                    i2 = AbstractC58323PtF.A09(A003, A004);
                } else {
                    i2 = 0;
                }
                C02R.A06(AbstractC167007dF.A1O(i2), "invalid metadata codepoint length");
                SYF syf = this.A01;
                Q9i A005 = C63169SeU.A00(c63169SeU);
                int A006 = A005.A00(16);
                if (A006 != 0) {
                    i3 = AbstractC58323PtF.A09(A005, A006);
                } else {
                    i3 = 0;
                }
                syf.A00(c63169SeU, 0, i3 - 1);
            }
        }
    }

    public C62894SWa() {
        this.A00 = null;
        this.A02 = null;
        this.A01 = new SYF(1024);
        this.A03 = new char[0];
    }
}
