package X;

/* loaded from: classes11.dex */
public final class WSY implements XE2 {
    public int A00;
    public int A01;
    public XG2 A03;
    public boolean A04;
    public final WFa A05 = new WFa(10);
    public long A02 = -9223372036854775807L;

    @Override // X.XE2
    public final void EMb() {
        this.A04 = false;
        this.A02 = -9223372036854775807L;
    }

    @Override // X.XE2
    public final void AJY(WFa wFa) {
        WDn.A00(this.A03);
        if (this.A04) {
            int i = wFa.A00;
            int i2 = wFa.A01;
            int i3 = i - i2;
            int i4 = this.A00;
            if (i4 < 10) {
                int min = Math.min(i3, 10 - i4);
                byte[] bArr = wFa.A02;
                WFa wFa2 = this.A05;
                System.arraycopy(bArr, i2, wFa2.A02, i4, min);
                if (this.A00 + min == 10) {
                    wFa2.A0O(0);
                    if (73 == wFa2.A05() && 68 == wFa2.A05() && 51 == wFa2.A05()) {
                        wFa2.A0P(3);
                        this.A01 = wFa2.A04() + 10;
                    } else {
                        AbstractC63374Sil.A04("Id3Reader", "Discarding invalid ID3 tag");
                        this.A04 = false;
                        return;
                    }
                }
            }
            int min2 = Math.min(i3, this.A01 - this.A00);
            this.A03.ELL(wFa, min2);
            this.A00 += min2;
        }
    }

    @Override // X.XE2
    public final void E3B(boolean z) {
        int i;
        XG2 xg2 = this.A03;
        WDn.A00(xg2);
        if (this.A04 && (i = this.A01) != 0 && this.A00 == i) {
            long j = this.A02;
            WDn.A02(AbstractC167007dF.A1M((j > (-9223372036854775807L) ? 1 : (j == (-9223372036854775807L) ? 0 : -1))));
            xg2.ELS(null, 1, i, 0, j);
            this.A04 = false;
        }
    }

    @Override // X.XE2
    public final void E3C(long j, int i) {
        if ((i & 4) != 0) {
            this.A04 = true;
            this.A02 = j;
            this.A01 = 0;
            this.A00 = 0;
        }
    }

    @Override // X.XE2
    public final void ANM(InterfaceC72026XFo interfaceC72026XFo, W4Q w4q) {
        w4q.A01();
        W4Q.A00(w4q);
        XG2 F87 = interfaceC72026XFo.F87(w4q.A00, 5);
        this.A03 = F87;
        C70116W4o c70116W4o = new C70116W4o();
        W4Q.A00(w4q);
        c70116W4o.A0T = w4q.A01;
        c70116W4o.A00("application/id3");
        XG2.A00(c70116W4o, F87);
    }
}
