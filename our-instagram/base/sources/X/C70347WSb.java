package X;

/* renamed from: X.WSb, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70347WSb implements XE2 {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public long A05;
    public long A06;
    public long A07;
    public C70130W5r A08;
    public XG2 A09;
    public String A0A;
    public String A0B;
    public boolean A0C;
    public boolean A0D;
    public int A0E;
    public int A0F;
    public int A0G;
    public int A0H;
    public final int A0I;
    public final WFZ A0J;
    public final WFa A0K;
    public final String A0L;

    @Override // X.XE2
    public final void E3B(boolean z) {
    }

    @Override // X.XE2
    public final void EMb() {
        this.A0H = 0;
        this.A07 = -9223372036854775807L;
        this.A0D = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:119:0x022b, code lost:
    
        throw new X.VCM(null, null, 1, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x013f, code lost:
    
        if (r15.A0D == false) goto L87;
     */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0193  */
    @Override // X.XE2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void AJY(X.WFa r16) {
        /*
            Method dump skipped, instructions count: 563
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70347WSb.AJY(X.WFa):void");
    }

    public C70347WSb(String str, int i) {
        this.A0L = str;
        this.A0I = i;
        WFa wFa = new WFa(1024);
        this.A0K = wFa;
        this.A0J = new WFZ(wFa.A02);
        this.A07 = -9223372036854775807L;
    }

    @Override // X.XE2
    public final void ANM(InterfaceC72026XFo interfaceC72026XFo, W4Q w4q) {
        w4q.A01();
        W4Q.A00(w4q);
        this.A09 = interfaceC72026XFo.F87(w4q.A00, 1);
        W4Q.A00(w4q);
        this.A0B = w4q.A01;
    }

    @Override // X.XE2
    public final void E3C(long j, int i) {
        this.A07 = j;
    }
}
