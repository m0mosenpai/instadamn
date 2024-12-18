package X;

import java.io.EOFException;

/* renamed from: X.Vrk, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69581Vrk {
    public int A00;
    public boolean A01;
    public final WFa A02;
    public final C69712Vu7 A03 = new C69712Vu7();

    public final boolean A00(XGj xGj) {
        C69712Vu7 c69712Vu7;
        int i;
        int i2;
        WDn.A02(AbstractC167007dF.A1W(xGj));
        if (this.A01) {
            this.A01 = false;
            this.A02.A0M(0);
        }
        while (!this.A01) {
            int i3 = this.A00;
            if (i3 < 0) {
                C69712Vu7 c69712Vu72 = this.A03;
                if (c69712Vu72.A00(xGj, -1L) && c69712Vu72.A01(xGj, true)) {
                    int i4 = c69712Vu72.A01;
                    if ((c69712Vu72.A03 & 1) == 1 && this.A02.A00 == 0) {
                        int i5 = 0;
                        i3 = 0;
                        do {
                            int i6 = i3;
                            if (i3 >= c69712Vu72.A02) {
                                break;
                            }
                            i3++;
                            i2 = c69712Vu72.A05[i6];
                            i5 += i2;
                        } while (i2 == 255);
                        i4 += i5;
                    } else {
                        i3 = 0;
                    }
                    try {
                        xGj.Em8(i4);
                        this.A00 = i3;
                    } catch (EOFException unused) {
                    }
                }
                return false;
            }
            int i7 = 0;
            int i8 = 0;
            do {
                int i9 = i8 + i3;
                c69712Vu7 = this.A03;
                if (i9 >= c69712Vu7.A02) {
                    break;
                }
                int i10 = i8;
                i8++;
                i = c69712Vu7.A05[i10 + i3];
                i7 += i;
            } while (i == 255);
            int i11 = i3 + i8;
            if (i7 > 0) {
                WFa wFa = this.A02;
                wFa.A0L(wFa.A00 + i7);
                xGj.readFully(wFa.A02, wFa.A00, i7);
                wFa.A0N(wFa.A00 + i7);
                this.A01 = MSY.A1S(c69712Vu7.A05[i11 - 1], 255);
            }
            if (i11 == c69712Vu7.A02) {
                i11 = -1;
            }
            this.A00 = i11;
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.WFa, java.lang.Object] */
    public C69581Vrk() {
        ?? obj = new Object();
        obj.A02 = new byte[65025];
        obj.A00 = 0;
        this.A02 = obj;
        this.A00 = -1;
    }
}
