package X;

/* loaded from: classes4.dex */
public final class AiH implements InterfaceC25191BCo {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C187318Ry A01;

    @Override // X.InterfaceC25191BCo
    public final void DCf() {
    }

    public AiH(C187318Ry c187318Ry, int i) {
        this.A01 = c187318Ry;
        this.A00 = i;
    }

    @Override // X.InterfaceC25191BCo
    public final void Dvd() {
        C187318Ry c187318Ry = this.A01;
        c187318Ry.A06.CMI();
        int i = this.A00;
        InterfaceC159417Dc interfaceC159417Dc = c187318Ry.A0R;
        if (i == interfaceC159417Dc.Bsl()) {
            int i2 = i + 1;
            if (i == interfaceC159417Dc.getCount() - 1) {
                i2 = i - 1;
            }
            C187318Ry.A05(c187318Ry, i2);
        }
        interfaceC159417Dc.removeItem(i);
    }
}
