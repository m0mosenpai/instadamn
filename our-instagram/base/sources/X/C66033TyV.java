package X;

import java.util.AbstractCollection;

/* renamed from: X.TyV, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66033TyV extends AbstractC66027TyP {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C66033TyV(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    @Override // X.AbstractC66027TyP, X.XE3
    public final void DvO(AbstractC66024TyM abstractC66024TyM) {
        if (this.A00 != 0) {
            ((AbstractC66024TyM) this.A02).A0H();
        } else {
            ((AbstractCollection) ((C005001p) this.A02).get(((ViewOnAttachStateChangeListenerC66026TyO) this.A01).A00)).remove(abstractC66024TyM);
        }
        abstractC66024TyM.A0B(this);
    }
}
