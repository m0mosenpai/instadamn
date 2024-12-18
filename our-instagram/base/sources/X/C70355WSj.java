package X;

/* renamed from: X.WSj, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70355WSj implements XE2 {
    public static final double[] A0G = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};
    public long A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public XG2 A05;
    public String A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public final WFa A0B;
    public final C69597Vs0 A0C;
    public final C69768Vv5 A0D;
    public final C69683VtT A0E;
    public final boolean[] A0F;

    /* JADX WARN: Code restructure failed: missing block: B:40:0x01e3, code lost:
    
        if (r5 >= 0) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x017e  */
    @Override // X.XE2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void AJY(X.WFa r25) {
        /*
            Method dump skipped, instructions count: 487
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70355WSj.AJY(X.WFa):void");
    }

    @Override // X.XE2
    public final void E3B(boolean z) {
        XG2 xg2 = this.A05;
        WDn.A00(xg2);
        if (z) {
            boolean z2 = this.A09;
            xg2.ELS(null, z2 ? 1 : 0, (int) (this.A04 - this.A02), 0, this.A03);
        }
    }

    @Override // X.XE2
    public final void EMb() {
        boolean[] zArr = this.A0F;
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
        C69597Vs0 c69597Vs0 = this.A0C;
        c69597Vs0.A02 = false;
        c69597Vs0.A00 = 0;
        c69597Vs0.A01 = 0;
        C69768Vv5 c69768Vv5 = this.A0D;
        if (c69768Vv5 != null) {
            c69768Vv5.A02 = false;
            c69768Vv5.A01 = false;
        }
        this.A04 = 0L;
        this.A0A = false;
        this.A01 = -9223372036854775807L;
        this.A03 = -9223372036854775807L;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.Vs0, java.lang.Object] */
    public C70355WSj(C69683VtT c69683VtT) {
        WFa wFa;
        this.A0E = c69683VtT;
        this.A0F = new boolean[4];
        ?? obj = new Object();
        obj.A03 = new byte[128];
        this.A0C = obj;
        if (c69683VtT != null) {
            this.A0D = new C69768Vv5(178);
            wFa = new WFa();
        } else {
            wFa = null;
            this.A0D = null;
        }
        this.A0B = wFa;
        this.A01 = -9223372036854775807L;
        this.A03 = -9223372036854775807L;
    }

    @Override // X.XE2
    public final void ANM(InterfaceC72026XFo interfaceC72026XFo, W4Q w4q) {
        w4q.A01();
        W4Q.A00(w4q);
        this.A06 = w4q.A01;
        W4Q.A00(w4q);
        this.A05 = interfaceC72026XFo.F87(w4q.A00, 2);
        C69683VtT c69683VtT = this.A0E;
        if (c69683VtT != null) {
            c69683VtT.A01(interfaceC72026XFo, w4q);
        }
    }

    @Override // X.XE2
    public final void E3C(long j, int i) {
        this.A01 = j;
    }

    public C70355WSj() {
        this(null);
    }
}
