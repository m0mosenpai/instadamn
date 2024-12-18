package X;

/* loaded from: classes11.dex */
public final class Uw9 extends AbstractC69677VtM {
    public final Uw2 A00;

    public Uw9(Uw2 uw2) {
        super(uw2);
        this.A00 = uw2;
    }

    @Override // X.AbstractC69677VtM
    public final boolean A03(AbstractC69677VtM abstractC69677VtM) {
        boolean A03 = super.A03(abstractC69677VtM);
        if (!(abstractC69677VtM instanceof Uw9) || !A03) {
            return false;
        }
        Uw2 uw2 = this.A00;
        InterfaceC72024XFm interfaceC72024XFm = uw2.A00;
        Uw2 uw22 = ((Uw9) abstractC69677VtM).A00;
        if (!C14360o3.A0K(interfaceC72024XFm, uw22.A00)) {
            return false;
        }
        return AbstractC25231BEo.A1Z(uw2.A01, uw22.A01, false);
    }
}
