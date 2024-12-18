package X;

import android.view.View;
import androidx.transition.FragmentTransitionSupport;
import java.util.ArrayList;

/* loaded from: classes11.dex */
public final class WTA implements XE3 {
    public final /* synthetic */ View A00;
    public final /* synthetic */ FragmentTransitionSupport A01;
    public final /* synthetic */ ArrayList A02;

    @Override // X.XE3
    public final void DvN(AbstractC66024TyM abstractC66024TyM) {
    }

    @Override // X.XE3
    public final void DvP(AbstractC66024TyM abstractC66024TyM) {
    }

    @Override // X.XE3
    public final void DvR(AbstractC66024TyM abstractC66024TyM) {
    }

    public WTA(View view, FragmentTransitionSupport fragmentTransitionSupport, ArrayList arrayList) {
        this.A01 = fragmentTransitionSupport;
        this.A00 = view;
        this.A02 = arrayList;
    }

    @Override // X.XE3
    public final void DvO(AbstractC66024TyM abstractC66024TyM) {
        abstractC66024TyM.A0B(this);
        this.A00.setVisibility(8);
        ArrayList arrayList = this.A02;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((View) arrayList.get(i)).setVisibility(0);
        }
    }

    @Override // X.XE3
    public final /* synthetic */ void DvT(AbstractC66024TyM abstractC66024TyM, boolean z) {
        abstractC66024TyM.A0B(this);
        abstractC66024TyM.A0A(this);
    }
}
