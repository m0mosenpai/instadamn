package X;

import java.util.List;

/* renamed from: X.Blk, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26401Blk extends AbstractC51572Yf {
    public final int A00;
    public final C51722Yv A01;
    public final C29462Cyc A02;
    public final List A03;

    public C26401Blk(C51722Yv c51722Yv, C29462Cyc c29462Cyc, List list) {
        AbstractC167007dF.A1F(list, 1, c51722Yv);
        this.A03 = list;
        this.A00 = 2;
        this.A02 = c29462Cyc;
        this.A01 = c51722Yv;
    }

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        int i = 0;
        C14360o3.A0B(c76223bS, 0);
        C28001CVy c28001CVy = (C28001CVy) AbstractC28337CeP.A02(c76223bS, this.A02);
        int i2 = c28001CVy.A01;
        int i3 = c28001CVy.A00;
        int i4 = c28001CVy.A02;
        int i5 = this.A00;
        List list = this.A03;
        int min = Math.min(i5, list.size());
        int i6 = min - 1;
        long A0A = AbstractC25225BEi.A0A((i3 * i6) + i2);
        long A0A2 = AbstractC25225BEi.A0A(i2 + (i4 * i6));
        C51722Yv c51722Yv = this.A01;
        C9CU A0n = AbstractC25225BEi.A0n(C05F.A00, 0, A0A);
        if (c51722Yv == C51722Yv.A02) {
            c51722Yv = null;
        }
        C51722Yv A00 = C9CU.A00(AbstractC25225BEi.A0h(c51722Yv, A0n), C05F.A01, 0, A0A2);
        C2Z0 A12 = AbstractC25232BEp.A12(c76223bS);
        int i7 = 0;
        for (int i8 = 0; i8 < min; i8++) {
            i += i4 * i8;
            i7 += i3 * i8;
            long doubleToRawLongBits = Double.doubleToRawLongBits(i8 == 0 ? i - 2 : i);
            long doubleToRawLongBits2 = Double.doubleToRawLongBits(i8 == 0 ? i7 - 2 : i7);
            android.net.Uri uri = (android.net.Uri) list.get(i8);
            C29466Cyg c29466Cyg = c28001CVy.A03;
            EnumC77933eL enumC77933eL = EnumC77933eL.ABSOLUTE;
            Integer num = C05F.A0Y;
            A12.A00(new C26357Bl2(uri, C9CU.A00(C9CU.A00(AbstractC25232BEp.A15(null, num, enumC77933eL), C05F.A0N, 1, doubleToRawLongBits), num, 1, doubleToRawLongBits2), c29466Cyg));
        }
        return AbstractC76963ci.A0I(A12, c76223bS, A00);
    }
}
