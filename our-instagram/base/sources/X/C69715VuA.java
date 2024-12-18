package X;

/* renamed from: X.VuA, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69715VuA {
    public int A00;
    public int A01;
    public long A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public long A06;
    public final XG2 A07;

    public final void A00(long j, int i, boolean z) {
        long j2 = this.A02;
        WDn.A02(AbstractC167007dF.A1M((j2 > (-9223372036854775807L) ? 1 : (j2 == (-9223372036854775807L) ? 0 : -1))));
        if (this.A00 == 182 && z && this.A04) {
            this.A07.ELS(null, this.A05 ? 1 : 0, (int) (j - this.A06), i, j2);
        }
        if (this.A00 != 179) {
            this.A06 = j;
        }
    }

    public final void A01(byte[] bArr, int i, int i2) {
        if (this.A03) {
            int i3 = this.A01;
            int i4 = (i + 1) - i3;
            if (i4 < i2) {
                this.A05 = AbstractC167007dF.A1N((bArr[i4] & 192) >> 6);
                this.A03 = false;
            } else {
                this.A01 = i3 + (i2 - i);
            }
        }
    }

    public C69715VuA(XG2 xg2) {
        this.A07 = xg2;
    }
}
