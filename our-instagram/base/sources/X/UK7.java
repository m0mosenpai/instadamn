package X;

import com.facebook.common.draggableview.DraggableViewContainer;

/* loaded from: classes11.dex */
public final class UK7 extends AbstractC66027TyP {
    public final int A00;
    public final Object A01;

    public UK7(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.AbstractC66027TyP
    public final void A01(AbstractC66024TyM abstractC66024TyM) {
        if (1 - this.A00 == 0) {
            ((DraggableViewContainer) this.A01).A06++;
        }
    }

    @Override // X.AbstractC66027TyP, X.XE3
    public final void DvN(AbstractC66024TyM abstractC66024TyM) {
        if (this.A00 != 0) {
            r1.A06--;
            DraggableViewContainer.A07((DraggableViewContainer) this.A01, false);
            return;
        }
        UK2 uk2 = (UK2) this.A01;
        uk2.A02.remove(abstractC66024TyM);
        if (uk2.A0Z()) {
            return;
        }
        AbstractC66024TyM.A04(XFY.A00, uk2, uk2, false);
        uk2.A0K = true;
        AbstractC66024TyM.A04(XFY.A01, uk2, uk2, false);
    }

    @Override // X.AbstractC66027TyP, X.XE3
    public final void DvO(AbstractC66024TyM abstractC66024TyM) {
        if (1 - this.A00 == 0) {
            r1.A06--;
            DraggableViewContainer.A07((DraggableViewContainer) this.A01, false);
        }
    }
}
