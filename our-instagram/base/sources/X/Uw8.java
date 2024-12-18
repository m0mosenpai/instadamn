package X;

/* loaded from: classes11.dex */
public final class Uw8 extends AbstractC69677VtM {
    public final Uw0 A00;

    public Uw8(Uw0 uw0) {
        super(uw0);
        this.A00 = uw0;
    }

    @Override // X.AbstractC69677VtM
    public final boolean A03(AbstractC69677VtM abstractC69677VtM) {
        boolean A03 = super.A03(abstractC69677VtM);
        if (!(abstractC69677VtM instanceof Uw8) || !A03) {
            return false;
        }
        return AbstractC25231BEo.A1Z(this.A00.A00, ((Uw8) abstractC69677VtM).A00.A00, false);
    }
}
