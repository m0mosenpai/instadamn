package X;

import java.io.EOFException;

/* renamed from: X.Vu7, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69712Vu7 {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public long A04;
    public final int[] A05 = new int[255];
    public final WFa A06 = new WFa(255);

    public final boolean A01(XGj xGj, boolean z) {
        this.A03 = 0;
        this.A04 = 0L;
        this.A02 = 0;
        this.A01 = 0;
        this.A00 = 0;
        WFa wFa = this.A06;
        wFa.A0M(27);
        try {
            if (!xGj.E3t(wFa.A02, 0, 27, z) || wFa.A0C() != 1332176723) {
                return false;
            }
            if (wFa.A05() != 0) {
                if (z) {
                    return false;
                }
                throw new VCM("unsupported bit stream revision", null, 1, false);
            }
            this.A03 = wFa.A05();
            this.A04 = wFa.A09();
            wFa.A0A();
            wFa.A0A();
            wFa.A0A();
            int A05 = wFa.A05();
            this.A02 = A05;
            this.A01 = A05 + 27;
            wFa.A0M(A05);
            if (!xGj.E3t(wFa.A02, 0, A05, z)) {
                return false;
            }
            for (int i = 0; i < this.A02; i++) {
                int[] iArr = this.A05;
                int A052 = wFa.A05();
                iArr[i] = A052;
                this.A00 += A052;
            }
            return true;
        } catch (EOFException e) {
            if (z) {
                return false;
            }
            throw e;
        }
    }

    public final boolean A00(XGj xGj, long j) {
        WDn.A01(AbstractC167007dF.A1N((xGj.BeZ() > xGj.Bc8() ? 1 : (xGj.BeZ() == xGj.Bc8() ? 0 : -1))));
        WFa wFa = this.A06;
        wFa.A0M(4);
        while (true) {
            if (j != -1 && xGj.BeZ() + 4 >= j) {
                break;
            }
            try {
                if (!xGj.E3t(wFa.A02, 0, 4, true)) {
                    break;
                }
                wFa.A0O(0);
                if (wFa.A0C() == 1332176723) {
                    xGj.EJn();
                    return true;
                }
                xGj.Em8(1);
            } catch (EOFException unused) {
            }
        }
        do {
            if (j != -1 && xGj.BeZ() >= j) {
                break;
            }
        } while (xGj.Em5(1) != -1);
        return false;
    }
}
