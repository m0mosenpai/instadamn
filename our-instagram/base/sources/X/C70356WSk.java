package X;

/* renamed from: X.WSk, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70356WSk implements InterfaceC71940XBp {
    public C70130W5r A00;
    public C69793VvZ A01;
    public XG2 A02;

    @Override // X.InterfaceC71940XBp
    public final void AJY(WFa wFa) {
        long A00;
        long j;
        C69793VvZ c69793VvZ = this.A01;
        WDn.A00(c69793VvZ);
        synchronized (c69793VvZ) {
            long j2 = c69793VvZ.A00;
            if (j2 != -9223372036854775807L) {
                A00 = j2 + c69793VvZ.A01;
            } else {
                A00 = c69793VvZ.A00();
            }
        }
        C69793VvZ c69793VvZ2 = this.A01;
        synchronized (c69793VvZ2) {
            j = c69793VvZ2.A01;
        }
        if (A00 != -9223372036854775807L && j != -9223372036854775807L) {
            C70130W5r c70130W5r = this.A00;
            if (j != c70130W5r.A0O) {
                C70116W4o c70116W4o = new C70116W4o(c70130W5r);
                c70116W4o.A0M = j;
                C70130W5r c70130W5r2 = new C70130W5r(c70116W4o);
                this.A00 = c70130W5r2;
                this.A02.AWZ(c70130W5r2);
            }
            int i = wFa.A00 - wFa.A01;
            this.A02.ELL(wFa, i);
            this.A02.ELS(null, 1, i, 0, A00);
        }
    }

    @Override // X.InterfaceC71940XBp
    public final void CNd(C69793VvZ c69793VvZ, InterfaceC72026XFo interfaceC72026XFo, W4Q w4q) {
        this.A01 = c69793VvZ;
        w4q.A01();
        W4Q.A00(w4q);
        XG2 F87 = interfaceC72026XFo.F87(w4q.A00, 5);
        this.A02 = F87;
        F87.AWZ(this.A00);
    }
}
