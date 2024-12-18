package X;

/* loaded from: classes11.dex */
public final class WRR implements XE1 {
    public int A00;
    public int A01;
    public InterfaceC72026XFo A02;
    public XG2 A03;
    public final int A04;
    public final int A05;
    public final String A06;

    @Override // X.XE1
    public final /* synthetic */ XE1 CCR() {
        return this;
    }

    @Override // X.XE1
    public final void EMc(long j, long j2) {
        if (j == 0 || this.A01 == 1) {
            this.A01 = 1;
            this.A00 = 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [X.X8l, java.lang.Object] */
    @Override // X.XE1
    public final void CNe(InterfaceC72026XFo interfaceC72026XFo) {
        this.A02 = interfaceC72026XFo;
        String str = this.A06;
        XG2 F87 = interfaceC72026XFo.F87(1024, 4);
        this.A03 = F87;
        C70116W4o c70116W4o = new C70116W4o();
        c70116W4o.A00(str);
        XG2.A00(c70116W4o, F87);
        this.A02.ASd();
        this.A02.EMe(new Object());
        this.A01 = 1;
    }

    @Override // X.XE1
    public final int E7l(XGj xGj, VZk vZk) {
        int i;
        int i2 = this.A01;
        if (i2 != 1) {
            if (i2 == 2) {
                return -1;
            }
            throw new IllegalStateException();
        }
        XG2 xg2 = this.A03;
        xg2.getClass();
        int ELK = xg2.ELK(xGj, 1024, true);
        if (ELK == -1) {
            this.A01 = 2;
            i = 0;
            this.A03.ELS(null, 1, this.A00, 0, 0L);
        } else {
            i = this.A00 + ELK;
        }
        this.A00 = i;
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000a, code lost:
    
        if (r6.A05 == (-1)) goto L6;
     */
    @Override // X.XE1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean EmK(X.XGj r7) {
        /*
            r6 = this;
            int r5 = r6.A04
            r4 = 1
            r2 = -1
            r3 = 0
            if (r5 == r2) goto Lc
            int r1 = r6.A05
            r0 = 1
            if (r1 != r2) goto Ld
        Lc:
            r0 = 0
        Ld:
            X.WDn.A02(r0)
            int r2 = r6.A05
            X.WFa r1 = new X.WFa
            r1.<init>(r2)
            byte[] r0 = r1.A02
            r7.E3s(r0, r3, r2)
            int r0 = r1.A08()
            if (r0 == r5) goto L23
            r4 = 0
        L23:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WRR.EmK(X.XGj):boolean");
    }

    public WRR(int i, int i2, String str) {
        this.A04 = i;
        this.A05 = i2;
        this.A06 = str;
    }
}
