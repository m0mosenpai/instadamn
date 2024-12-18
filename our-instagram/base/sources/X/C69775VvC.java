package X;

/* renamed from: X.VvC, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69775VvC {
    public int A00;
    public boolean A01;
    public int A02;
    public int A03;
    public int A04;
    public long A05;
    public final byte[] A06 = new byte[10];

    public final void A00(XGj xGj) {
        if (!this.A01) {
            byte[] bArr = this.A06;
            xGj.E3s(bArr, 0, 10);
            xGj.EJn();
            boolean z = false;
            if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111) {
                byte b = bArr[7];
                if ((b & 254) == 186) {
                    if ((b & 255) == 187) {
                        z = true;
                    }
                    char c = '\b';
                    if (z) {
                        c = '\t';
                    }
                    if ((40 << ((bArr[c] >> 4) & 7)) != 0) {
                        this.A01 = true;
                    }
                }
            }
        }
    }

    public final void A01(C69702Vtx c69702Vtx, XG2 xg2) {
        if (this.A00 > 0) {
            xg2.ELS(c69702Vtx, this.A02, this.A04, this.A03, this.A05);
            this.A00 = 0;
        }
    }

    public final void A02(C69702Vtx c69702Vtx, XG2 xg2, int i, int i2, int i3, long j) {
        if (AbstractC58319PtB.A1P(this.A03, i2 + i3)) {
            if (this.A01) {
                int i4 = this.A00;
                int i5 = i4 + 1;
                this.A00 = i5;
                if (i4 == 0) {
                    this.A05 = j;
                    this.A02 = i;
                    this.A04 = 0;
                }
                this.A04 += i2;
                this.A03 = i3;
                if (i5 >= 16) {
                    A01(c69702Vtx, xg2);
                    return;
                }
                return;
            }
            return;
        }
        throw new IllegalStateException(String.valueOf("TrueHD chunk samples must be contiguous in the sample queue."));
    }
}
