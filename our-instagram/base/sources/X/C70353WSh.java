package X;

/* renamed from: X.WSh, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70353WSh implements XE2 {
    public static final float[] A0B = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};
    public long A00;
    public long A01;
    public XG2 A02;
    public C69715VuA A03;
    public String A04;
    public boolean A05;
    public final WFa A06;
    public final C69612VsF A07;
    public final C69768Vv5 A08;
    public final C69683VtT A09;
    public final boolean[] A0A;

    /* JADX WARN: Code restructure failed: missing block: B:59:0x0208, code lost:
    
        if (r8 != 181) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0224, code lost:
    
        if (r9 >= 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01be, code lost:
    
        if (r8 == 179) goto L65;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0125  */
    @Override // X.XE2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void AJY(X.WFa r24) {
        /*
            Method dump skipped, instructions count: 552
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70353WSh.AJY(X.WFa):void");
    }

    @Override // X.XE2
    public final void E3B(boolean z) {
        C69715VuA c69715VuA = this.A03;
        WDn.A00(c69715VuA);
        if (z) {
            c69715VuA.A00(this.A01, 0, this.A05);
            C69715VuA c69715VuA2 = this.A03;
            c69715VuA2.A04 = false;
            c69715VuA2.A03 = false;
            c69715VuA2.A05 = false;
            c69715VuA2.A00 = -1;
        }
    }

    @Override // X.XE2
    public final void EMb() {
        boolean[] zArr = this.A0A;
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
        C69612VsF c69612VsF = this.A07;
        c69612VsF.A03 = false;
        c69612VsF.A00 = 0;
        c69612VsF.A01 = 0;
        C69715VuA c69715VuA = this.A03;
        if (c69715VuA != null) {
            c69715VuA.A04 = false;
            c69715VuA.A03 = false;
            c69715VuA.A05 = false;
            c69715VuA.A00 = -1;
        }
        C69768Vv5 c69768Vv5 = this.A08;
        if (c69768Vv5 != null) {
            c69768Vv5.A02 = false;
            c69768Vv5.A01 = false;
        }
        this.A01 = 0L;
        this.A00 = -9223372036854775807L;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, X.VsF] */
    public C70353WSh(C69683VtT c69683VtT) {
        WFa wFa;
        this.A09 = c69683VtT;
        this.A0A = new boolean[4];
        ?? obj = new Object();
        obj.A04 = new byte[128];
        this.A07 = obj;
        this.A00 = -9223372036854775807L;
        if (c69683VtT != null) {
            this.A08 = new C69768Vv5(178);
            wFa = new WFa();
        } else {
            wFa = null;
            this.A08 = null;
        }
        this.A06 = wFa;
    }

    @Override // X.XE2
    public final void ANM(InterfaceC72026XFo interfaceC72026XFo, W4Q w4q) {
        w4q.A01();
        W4Q.A00(w4q);
        this.A04 = w4q.A01;
        W4Q.A00(w4q);
        XG2 F87 = interfaceC72026XFo.F87(w4q.A00, 2);
        this.A02 = F87;
        this.A03 = new C69715VuA(F87);
        C69683VtT c69683VtT = this.A09;
        if (c69683VtT != null) {
            c69683VtT.A01(interfaceC72026XFo, w4q);
        }
    }

    @Override // X.XE2
    public final void E3C(long j, int i) {
        this.A00 = j;
    }

    public C70353WSh() {
        this(null);
    }
}
