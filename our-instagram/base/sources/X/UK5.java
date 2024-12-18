package X;

import android.view.ViewGroup;

/* loaded from: classes11.dex */
public final class UK5 extends AbstractC66027TyP {
    public boolean A00 = false;
    public final ViewGroup A01;

    @Override // X.AbstractC66027TyP, X.XE3
    public final void DvN(AbstractC66024TyM abstractC66024TyM) {
        AbstractC68621VXx.A00(this.A01, false);
        this.A00 = true;
    }

    @Override // X.AbstractC66027TyP, X.XE3
    public final void DvO(AbstractC66024TyM abstractC66024TyM) {
        if (!this.A00) {
            AbstractC68621VXx.A00(this.A01, false);
        }
        abstractC66024TyM.A0B(this);
    }

    public UK5(ViewGroup viewGroup) {
        this.A01 = viewGroup;
    }
}
