package X;

import instagram.features.stories.dashboard.fragment.ReelDashboardFragment;

/* loaded from: classes9.dex */
public final class PG0 implements InterfaceC191388dp {
    public final /* synthetic */ OAD A00;
    public final /* synthetic */ ReelDashboardFragment A01;

    public PG0(OAD oad, ReelDashboardFragment reelDashboardFragment) {
        this.A00 = oad;
        this.A01 = reelDashboardFragment;
    }

    @Override // X.InterfaceC191388dp
    public final void Dlg() {
        this.A00.A00 = true;
        C38262Gs5 c38262Gs5 = this.A01.mListAdapter;
        if (c38262Gs5 != null) {
            c38262Gs5.A08();
        }
    }
}
