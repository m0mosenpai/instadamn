package X;

/* loaded from: classes4.dex */
public final class AiG implements InterfaceC25191BCo {
    public final /* synthetic */ C187318Ry A00;
    public final /* synthetic */ boolean A01;

    public AiG(C187318Ry c187318Ry, boolean z) {
        this.A00 = c187318Ry;
        this.A01 = z;
    }

    @Override // X.InterfaceC25191BCo
    public final void DCf() {
        InterfaceC159417Dc interfaceC159417Dc;
        int Bsl;
        C187318Ry c187318Ry = this.A00;
        int i = c187318Ry.A01;
        if (i != -1 && i != (Bsl = (interfaceC159417Dc = c187318Ry.A0R).Bsl())) {
            interfaceC159417Dc.Cpv(Bsl, i);
        }
        c187318Ry.A01 = -1;
        c187318Ry.A02 = -1;
        c187318Ry.A0T.DCd(c187318Ry.A0R.Bsl());
        C187318Ry.A01(c187318Ry);
    }

    @Override // X.InterfaceC25191BCo
    public final void Dvd() {
        int i;
        C187318Ry c187318Ry = this.A00;
        InterfaceC159417Dc interfaceC159417Dc = c187318Ry.A0R;
        int Bsl = interfaceC159417Dc.Bsl();
        if (Bsl == interfaceC159417Dc.getCount() - 1) {
            i = Math.max(0, Bsl - 1);
        } else {
            i = Bsl + 1;
        }
        C187318Ry.A05(c187318Ry, i);
        if (interfaceC159417Dc.getCount() > 1 || this.A01) {
            interfaceC159417Dc.removeItem(Bsl);
        }
        if (interfaceC159417Dc.getCount() == 1) {
            c187318Ry.A06.CMI();
        }
        c187318Ry.A01 = -1;
        c187318Ry.A02 = -1;
        C187318Ry.A01(c187318Ry);
    }
}
