package X;

import com.google.android.exoplayer2.util.Util;

/* renamed from: X.Txv, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66000Txv implements XDB {
    public final int A00;
    public final int A01;
    public final C97974ac A02;

    @Override // X.XDB
    public final int B6w() {
        return this.A00;
    }

    @Override // X.XDB
    public final int Bq5() {
        return this.A01;
    }

    @Override // X.XDB
    public final int E8G() {
        int i = this.A00;
        if (i == -1) {
            return this.A02.A04();
        }
        return i;
    }

    public C66000Txv(C4B6 c4b6, C98314bA c98314bA) {
        C97974ac c97974ac = c98314bA.A00;
        this.A02 = c97974ac;
        c97974ac.A0G(12);
        int A04 = c97974ac.A04();
        if ("audio/raw".equals(c4b6.A0W)) {
            int A03 = Util.A03(c4b6.A0C, c4b6.A06);
            if (A04 == 0 || A04 % A03 != 0) {
                AbstractC46512Bo.A04("AtomParsers", AnonymousClass001.A02(A03, A04, "Audio sample size mismatch. stsd sample size: ", ", stsz sample size: "));
                A04 = A03;
            }
            this.A00 = A04;
            this.A01 = c97974ac.A04();
        }
        if (A04 == 0) {
            A04 = -1;
        }
        this.A00 = A04;
        this.A01 = c97974ac.A04();
    }
}
