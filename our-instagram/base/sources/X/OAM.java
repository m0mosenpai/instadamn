package X;

/* loaded from: classes9.dex */
public final class OAM {
    public final C189478aR A00;
    public final C54687ODn A01;
    public final N50 A02;

    public OAM(final C54687ODn c54687ODn, N50 n50) {
        C189448aO A0y = AbstractC25225BEi.A0y(c54687ODn.A03);
        A0y.A0T = c54687ODn.A01;
        int i = c54687ODn.A00;
        if (i != 0) {
            AbstractC25225BEi.A1Q(A0y, true);
            A0y.A08 = i;
        }
        this.A00 = A0y.A00();
        this.A02 = n50;
        n50.A07.A00 = new InterfaceC57953Pmz() { // from class: X.P40
            @Override // X.InterfaceC57953Pmz
            public final void Dhr(Object obj) {
                OAM oam = this;
                oam.A00.A0L(new C56771PHo(1, oam, c54687ODn, obj));
            }
        };
        n50.A02 = new InterfaceC57954Pn0() { // from class: X.P41
            @Override // X.InterfaceC57954Pn0
            public final void DhH() {
                PHU phu = C54687ODn.this.A01;
                phu.getClass();
                phu.DhH();
            }
        };
        this.A01 = c54687ODn;
    }
}
