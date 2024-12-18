package X;

/* loaded from: classes11.dex */
public final class Uw6 extends AbstractC69677VtM {
    public final Uw1 A00;

    public Uw6(Uw1 uw1) {
        super(uw1);
        this.A00 = uw1;
    }

    @Override // X.AbstractC69677VtM
    public final boolean A03(AbstractC69677VtM abstractC69677VtM) {
        boolean A03 = super.A03(abstractC69677VtM);
        if (!(abstractC69677VtM instanceof Uw6) || !A03) {
            return false;
        }
        Uw1 uw1 = this.A00;
        C69753Vuo c69753Vuo = uw1.A01;
        Uw1 uw12 = ((Uw6) abstractC69677VtM).A00;
        if (!C14360o3.A0K(c69753Vuo, uw12.A01)) {
            return false;
        }
        return AbstractC25231BEo.A1Z(uw1.A00, uw12.A00, false);
    }
}
