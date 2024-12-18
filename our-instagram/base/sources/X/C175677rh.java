package X;

/* renamed from: X.7rh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C175677rh implements InterfaceC175687ri {
    public final C175617rb A03;
    public final C175697rj A01 = new Object();
    public final C175707rk A02 = new Object();
    public final C175727rm A00 = AbstractC175717rl.A00;

    @Override // X.InterfaceC175687ri
    public final void DIH(C72670Xkl c72670Xkl) {
        C175697rj c175697rj = this.A01;
        c175697rj.A00 = c72670Xkl;
        C175707rk c175707rk = this.A02;
        c175707rk.A00 = c72670Xkl;
        C175617rb c175617rb = this.A03;
        C179557y5 c179557y5 = c175617rb.A02;
        InterfaceC179497xz interfaceC179497xz = c179557y5.A0C;
        if (interfaceC179497xz != null) {
            C175627rc c175627rc = c175617rb.A00;
            c175627rc.A00 = c175697rj;
            interfaceC179497xz.DfO(c175627rc);
        }
        InterfaceC179497xz interfaceC179497xz2 = c179557y5.A0C;
        if (interfaceC179497xz2 != null) {
            C175637rd c175637rd = c175617rb.A01;
            c175637rd.A00 = c175707rk;
            interfaceC179497xz2.DfO(c175637rd);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.7rj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v1, types: [X.7rk, java.lang.Object] */
    public C175677rh(C175617rb c175617rb) {
        this.A03 = c175617rb;
    }
}
