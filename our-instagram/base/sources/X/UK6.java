package X;

import androidx.transition.FragmentTransitionSupport;
import java.util.ArrayList;

/* loaded from: classes11.dex */
public final class UK6 extends AbstractC66027TyP {
    public final /* synthetic */ FragmentTransitionSupport A00;
    public final /* synthetic */ Object A01;
    public final /* synthetic */ Object A02;
    public final /* synthetic */ ArrayList A03;
    public final /* synthetic */ ArrayList A04;

    public UK6(FragmentTransitionSupport fragmentTransitionSupport, Object obj, Object obj2, ArrayList arrayList, ArrayList arrayList2) {
        this.A00 = fragmentTransitionSupport;
        this.A01 = obj;
        this.A03 = arrayList;
        this.A02 = obj2;
        this.A04 = arrayList2;
    }

    @Override // X.AbstractC66027TyP
    public final void A01(AbstractC66024TyM abstractC66024TyM) {
        Object obj = this.A01;
        if (obj != null) {
            this.A00.A0O(obj, this.A03, null);
        }
        Object obj2 = this.A02;
        if (obj2 != null) {
            this.A00.A0O(obj2, this.A04, null);
        }
    }

    @Override // X.AbstractC66027TyP, X.XE3
    public final void DvO(AbstractC66024TyM abstractC66024TyM) {
        abstractC66024TyM.A0B(this);
    }
}
