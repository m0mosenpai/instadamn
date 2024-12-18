package X;

/* renamed from: X.Oyt, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56282Oyt implements InterfaceC58114Ppd {
    public final /* synthetic */ C56050OuP A00;

    public C56282Oyt(C56050OuP c56050OuP) {
        this.A00 = c56050OuP;
    }

    @Override // X.InterfaceC58114Ppd
    public final void Cpx(int i, int i2) {
        AbstractC51134Mid abstractC51134Mid = this.A00.A0M;
        abstractC51134Mid.A05(i, i2);
        abstractC51134Mid.A04(i2);
        abstractC51134Mid.notifyItemMoved(i, i2);
    }

    @Override // X.InterfaceC58114Ppd
    public final void DTw(int i, int i2) {
        if (i >= 0 && i2 >= 0 && i != i2) {
            int i3 = i2 / 2;
            int i4 = i / 2;
            C56050OuP c56050OuP = this.A00;
            c56050OuP.A0N.A0S(i4, i3);
            c56050OuP.A0H.A07.A06(c56050OuP.A03().A01(i3));
            AnonymousClass229.A01(c56050OuP.A0F).A0q(i4, i3);
        }
        MSX.A1M(this.A00.A0Q, false);
    }

    @Override // X.InterfaceC58114Ppd
    public final void DTx(int i) {
        C56050OuP c56050OuP = this.A00;
        c56050OuP.A0H.A04();
        MSX.A1M(c56050OuP.A0Q, true);
        c56050OuP.A0M.A04(i);
    }
}
