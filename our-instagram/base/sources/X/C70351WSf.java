package X;

/* renamed from: X.WSf, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70351WSf implements XE2 {
    public XG2 A00;
    public W3G A01;
    public String A02;
    public boolean A03;
    public long A05;
    public final C69539Vr3 A0C;
    public final boolean[] A0D = new boolean[3];
    public final C69768Vv5 A0B = new C69768Vv5(32);
    public final C69768Vv5 A09 = new C69768Vv5(33);
    public final C69768Vv5 A07 = new C69768Vv5(34);
    public final C69768Vv5 A08 = new C69768Vv5(39);
    public final C69768Vv5 A0A = new C69768Vv5(40);
    public long A04 = -9223372036854775807L;
    public final WFa A06 = new WFa();

    private void A00(byte[] bArr, int i, int i2) {
        W3G w3g = this.A01;
        if (w3g.A07) {
            int i3 = w3g.A00;
            int i4 = (i + 2) - i3;
            if (i4 < i2) {
                w3g.A06 = AbstractC167007dF.A1M(bArr[i4] & 128);
                w3g.A07 = false;
            } else {
                w3g.A00 = i3 + (i2 - i);
            }
        }
        if (!this.A03) {
            this.A0B.A01(bArr, i, i2);
            this.A09.A01(bArr, i, i2);
            this.A07.A01(bArr, i, i2);
        }
        this.A08.A01(bArr, i, i2);
        this.A0A.A01(bArr, i, i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x01d3, code lost:
    
        if (r4 > 21) goto L53;
     */
    @Override // X.XE2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void AJY(X.WFa r28) {
        /*
            Method dump skipped, instructions count: 511
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70351WSf.AJY(X.WFa):void");
    }

    @Override // X.XE2
    public final void E3B(boolean z) {
        WDn.A00(this.A00);
        if (z) {
            W3G w3g = this.A01;
            long j = this.A05;
            w3g.A0B = w3g.A08;
            W3G.A00(w3g, (int) (j - w3g.A01));
            w3g.A03 = w3g.A01;
            w3g.A01 = j;
            W3G.A00(w3g, 0);
            w3g.A0A = false;
        }
    }

    @Override // X.XE2
    public final void EMb() {
        this.A05 = 0L;
        this.A04 = -9223372036854775807L;
        boolean[] zArr = this.A0D;
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
        C69768Vv5 c69768Vv5 = this.A0B;
        c69768Vv5.A02 = false;
        c69768Vv5.A01 = false;
        C69768Vv5 c69768Vv52 = this.A09;
        c69768Vv52.A02 = false;
        c69768Vv52.A01 = false;
        C69768Vv5 c69768Vv53 = this.A07;
        c69768Vv53.A02 = false;
        c69768Vv53.A01 = false;
        C69768Vv5 c69768Vv54 = this.A08;
        c69768Vv54.A02 = false;
        c69768Vv54.A01 = false;
        C69768Vv5 c69768Vv55 = this.A0A;
        c69768Vv55.A02 = false;
        c69768Vv55.A01 = false;
        W3G w3g = this.A01;
        if (w3g != null) {
            w3g.A07 = false;
            w3g.A06 = false;
            w3g.A05 = false;
            w3g.A0A = false;
            w3g.A09 = false;
        }
    }

    public C70351WSf(C69539Vr3 c69539Vr3) {
        this.A0C = c69539Vr3;
    }

    @Override // X.XE2
    public final void ANM(InterfaceC72026XFo interfaceC72026XFo, W4Q w4q) {
        w4q.A01();
        W4Q.A00(w4q);
        this.A02 = w4q.A01;
        W4Q.A00(w4q);
        XG2 F87 = interfaceC72026XFo.F87(w4q.A00, 2);
        this.A00 = F87;
        this.A01 = new W3G(F87);
        this.A0C.A00(interfaceC72026XFo, w4q);
    }

    @Override // X.XE2
    public final void E3C(long j, int i) {
        this.A04 = j;
    }
}
