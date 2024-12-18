package X;

/* renamed from: X.WSe, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70350WSe implements XE2 {
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public long A04;
    public XG2 A05;
    public String A06;
    public boolean A07;
    public boolean A08;
    public final int A09;
    public final WFa A0A;
    public final C69623VsQ A0B;
    public final String A0C;

    @Override // X.XE2
    public final void E3B(boolean z) {
    }

    @Override // X.XE2
    public final void EMb() {
        this.A02 = 0;
        this.A00 = 0;
        this.A08 = false;
        this.A04 = -9223372036854775807L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x00e2, code lost:
    
        if ((r2 & 224) != 224) goto L28;
     */
    @Override // X.XE2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void AJY(X.WFa r16) {
        /*
            Method dump skipped, instructions count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70350WSe.AJY(X.WFa):void");
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.VsQ, java.lang.Object] */
    public C70350WSe(String str, int i) {
        this.A02 = 0;
        WFa wFa = new WFa(4);
        this.A0A = wFa;
        wFa.A02[0] = -1;
        this.A0B = new Object();
        this.A04 = -9223372036854775807L;
        this.A0C = str;
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
        this.A04 = j;
    }

    public C70350WSe() {
        this(null, 0);
    }
}
