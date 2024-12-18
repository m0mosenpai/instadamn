package X;

/* loaded from: classes11.dex */
public final class UK4 extends AbstractC66027TyP {
    public UK2 A00;

    @Override // X.AbstractC66027TyP
    public final void A01(AbstractC66024TyM abstractC66024TyM) {
        UK2 uk2 = this.A00;
        if (!uk2.A04) {
            uk2.A0K();
            uk2.A04 = true;
        }
    }

    @Override // X.AbstractC66027TyP, X.XE3
    public final void DvO(AbstractC66024TyM abstractC66024TyM) {
        UK2 uk2 = this.A00;
        int i = uk2.A01 - 1;
        uk2.A01 = i;
        if (i == 0) {
            uk2.A04 = false;
            uk2.A0J();
        }
        abstractC66024TyM.A0B(this);
    }
}
