package X;

/* loaded from: classes11.dex */
public final class Uw7 extends AbstractC69677VtM {
    public final Uw3 A00;

    public Uw7(Uw3 uw3) {
        super(uw3);
        this.A00 = uw3;
    }

    @Override // X.AbstractC69677VtM
    public final boolean A03(AbstractC69677VtM abstractC69677VtM) {
        boolean A03 = super.A03(abstractC69677VtM);
        if (!(abstractC69677VtM instanceof Uw7) || !A03) {
            return false;
        }
        Uw3 uw3 = this.A00;
        InterfaceC72024XFm interfaceC72024XFm = uw3.A02;
        Uw3 uw32 = ((Uw7) abstractC69677VtM).A00;
        if (!C14360o3.A0K(interfaceC72024XFm, uw32.A02) || !C14360o3.A0K(uw3.A00, uw32.A00)) {
            return false;
        }
        return AbstractC25231BEo.A1Z(uw3.A01, uw32.A01, false);
    }
}
