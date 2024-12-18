package X;

import com.google.android.exoplayer2.util.Util;
import java.io.IOException;

/* renamed from: X.4Xo, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C97034Xo implements C4TW, C4WA {
    public C4XY A00;
    public C4XX A01;
    public final Object A02;
    public final /* synthetic */ AbstractC96994Xj A03;

    @Override // X.C4TW
    public final /* synthetic */ void DPx(C98264b5 c98264b5, C98534bW c98534bW, C4WX c4wx, int i, int i2) {
    }

    public C97034Xo(AbstractC96994Xj abstractC96994Xj, Object obj) {
        this.A03 = abstractC96994Xj;
        this.A01 = abstractC96994Xj.A09(null);
        this.A00 = new C4XY(null, abstractC96994Xj.A03.A02, 0);
        this.A02 = obj;
    }

    private C98534bW A00(C98534bW c98534bW) {
        long j = c98534bW.A04;
        long j2 = c98534bW.A03;
        if (j == j && j2 == j2) {
            return c98534bW;
        }
        int i = c98534bW.A00;
        int i2 = c98534bW.A02;
        return new C98534bW(c98534bW.A05, c98534bW.A06, i, i2, c98534bW.A01, j, j2);
    }

    private boolean A01(C4WX c4wx, int i) {
        C4WX c4wx2;
        if (c4wx != null) {
            c4wx2 = this.A03.A0D(c4wx, this.A02);
            if (c4wx2 == null) {
                return false;
            }
        } else {
            c4wx2 = null;
        }
        AbstractC96994Xj abstractC96994Xj = this.A03;
        C4XX c4xx = this.A01;
        if (c4xx.A00 != i || !Util.A0I(c4xx.A01, c4wx2)) {
            this.A01 = new C4XX(c4wx2, abstractC96994Xj.A04.A02, i, 0L);
        }
        C4XY c4xy = this.A00;
        if (c4xy.A00 != i || !Util.A0I(c4xy.A01, c4wx2)) {
            this.A00 = new C4XY(c4wx2, abstractC96994Xj.A03.A02, i);
            return true;
        }
        return true;
    }

    @Override // X.C4TW
    public final void DBr(C98534bW c98534bW, C4WX c4wx, int i) {
        if (A01(c4wx, i)) {
            this.A01.A0B(A00(c98534bW));
        }
    }

    @Override // X.C4WA
    public final void DCU(C4WX c4wx, int i) {
        if (A01(c4wx, i)) {
            this.A00.A00();
        }
    }

    @Override // X.C4WA
    public final void DCV(C4WX c4wx, int i) {
        if (A01(c4wx, i)) {
            this.A00.A01();
        }
    }

    @Override // X.C4WA
    public final void DCW(C4WX c4wx, int i, int i2) {
        if (A01(c4wx, i)) {
            this.A00.A03(i2);
        }
    }

    @Override // X.C4WA
    public final void DCX(C4WX c4wx, Exception exc, int i) {
        if (A01(c4wx, i)) {
            this.A00.A04(exc);
        }
    }

    @Override // X.C4WA
    public final void DCY(C4WX c4wx, int i) {
        if (A01(c4wx, i)) {
            this.A00.A02();
        }
    }

    @Override // X.C4TW
    public final void DPa(C98264b5 c98264b5, C98534bW c98534bW, C4WX c4wx, int i) {
        if (A01(c4wx, i)) {
            this.A01.A07(c98264b5, A00(c98534bW));
        }
    }

    @Override // X.C4TW
    public final void DPe(C98264b5 c98264b5, C98534bW c98534bW, C4WX c4wx, Object obj, Object obj2, int i) {
        if (A01(c4wx, i)) {
            this.A01.A0A(c98264b5, A00(c98534bW), obj, obj2);
        }
    }

    @Override // X.C4TW
    public final void DPg(C98264b5 c98264b5, C98534bW c98534bW, C4WX c4wx, IOException iOException, int i, boolean z) {
        if (A01(c4wx, i)) {
            this.A01.A09(c98264b5, A00(c98534bW), iOException, z);
        }
    }

    @Override // X.C4TW
    public final void DPw(C98264b5 c98264b5, C98534bW c98534bW, C4WX c4wx, int i) {
        if (A01(c4wx, i)) {
            this.A01.A08(c98264b5, A00(c98534bW));
        }
    }

    @Override // X.C4TW
    public final void DxV(C98534bW c98534bW, C4WX c4wx, int i) {
        if (A01(c4wx, i)) {
            this.A01.A0C(A00(c98534bW));
        }
    }
}
