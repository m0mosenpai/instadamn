package X;

import androidx.transition.FragmentTransitionSupport;

/* loaded from: classes11.dex */
public final class WT9 implements XE3 {
    public final /* synthetic */ FragmentTransitionSupport A00;
    public final /* synthetic */ Runnable A01;

    @Override // X.XE3
    public final void DvN(AbstractC66024TyM abstractC66024TyM) {
    }

    @Override // X.XE3
    public final void DvP(AbstractC66024TyM abstractC66024TyM) {
    }

    @Override // X.XE3
    public final void DvR(AbstractC66024TyM abstractC66024TyM) {
    }

    public WT9(FragmentTransitionSupport fragmentTransitionSupport, Runnable runnable) {
        this.A00 = fragmentTransitionSupport;
        this.A01 = runnable;
    }

    @Override // X.XE3
    public final void DvO(AbstractC66024TyM abstractC66024TyM) {
        this.A01.run();
    }

    @Override // X.XE3
    public final /* synthetic */ void DvT(AbstractC66024TyM abstractC66024TyM, boolean z) {
    }
}
