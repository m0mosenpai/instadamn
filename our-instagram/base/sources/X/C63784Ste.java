package X;

/* renamed from: X.Ste, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63784Ste implements InterfaceC65536Tm8, InterfaceC65474Tkr {
    public final InterfaceC65536Tm8 A00;
    public final C62757SPo A01;
    public volatile int A02;
    public volatile C63760StG A03;
    public volatile C63727Ssh A04;
    public volatile SFV A05;
    public volatile Object A06;

    @Override // X.InterfaceC65536Tm8
    public final void D9E(InterfaceC65617To8 interfaceC65617To8, InterfaceC65570Tn3 interfaceC65570Tn3, Exception exc, Integer num) {
        this.A00.D9E(interfaceC65617To8, interfaceC65570Tn3, exc, this.A05.A01.Avo());
    }

    @Override // X.InterfaceC65536Tm8
    public final void D9F(InterfaceC65617To8 interfaceC65617To8, InterfaceC65617To8 interfaceC65617To82, InterfaceC65570Tn3 interfaceC65570Tn3, Integer num, Object obj) {
        this.A00.D9F(interfaceC65617To8, interfaceC65617To8, interfaceC65570Tn3, this.A05.A01.Avo(), obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0042, code lost:
    
        r1 = r1.A00;
     */
    /* JADX WARN: Removed duplicated region for block: B:66:0x012d A[EDGE_INSN: B:66:0x012d->B:67:0x012d BREAK  A[LOOP:1: B:55:0x00e5->B:70:0x00e5], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00e5 A[SYNTHETIC] */
    @Override // X.InterfaceC65474Tkr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean Ene() {
        /*
            Method dump skipped, instructions count: 332
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63784Ste.Ene():boolean");
    }

    @Override // X.InterfaceC65474Tkr
    public final void cancel() {
        SFV sfv = this.A05;
        if (sfv != null) {
            sfv.A01.cancel();
        }
    }

    public C63784Ste(InterfaceC65536Tm8 interfaceC65536Tm8, C62757SPo c62757SPo) {
        this.A01 = c62757SPo;
        this.A00 = interfaceC65536Tm8;
    }

    @Override // X.InterfaceC65536Tm8
    public final void EJU() {
        throw AbstractC43592JPx.A11();
    }
}
