package X;

/* renamed from: X.WSc, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70348WSc implements XE2 {
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public C70130W5r A04;
    public XG2 A05;
    public String A06;
    public boolean A07;
    public int A08;
    public final int A09;
    public final WFZ A0A;
    public final String A0B;
    public final WFa A0C;

    @Override // X.XE2
    public final void E3B(boolean z) {
    }

    @Override // X.XE2
    public final void EMb() {
        this.A08 = 0;
        this.A00 = 0;
        this.A07 = false;
        this.A03 = -9223372036854775807L;
    }

    /* JADX WARN: Removed duplicated region for block: B:150:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02cb  */
    @Override // X.XE2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void AJY(X.WFa r25) {
        /*
            Method dump skipped, instructions count: 764
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70348WSc.AJY(X.WFa):void");
    }

    public C70348WSc(String str, int i) {
        WFZ wfz = new WFZ(new byte[128]);
        this.A0A = wfz;
        this.A0C = new WFa(wfz.A03);
        this.A08 = 0;
        this.A03 = -9223372036854775807L;
        this.A0B = str;
        this.A09 = i;
    }

    @Override // X.XE2
    public final void ANM(InterfaceC72026XFo interfaceC72026XFo, W4Q w4q) {
        w4q.A01();
        W4Q.A00(w4q);
        this.A06 = w4q.A01;
        W4Q.A00(w4q);
        this.A05 = interfaceC72026XFo.F87(w4q.A00, 1);
    }

    @Override // X.XE2
    public final void E3C(long j, int i) {
        this.A03 = j;
    }

    public C70348WSc() {
        this(null, 0);
    }
}
