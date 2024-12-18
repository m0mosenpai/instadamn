package X;

import instagram.features.feed.fragment.ContextualFeedFragment;

/* renamed from: X.GoR, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38038GoR implements InterfaceC42271xH {
    public final /* synthetic */ ContextualFeedFragment A00;

    public C38038GoR(ContextualFeedFragment contextualFeedFragment) {
        this.A00 = contextualFeedFragment;
    }

    @Override // X.InterfaceC42271xH
    public final /* bridge */ /* synthetic */ boolean A79(Object obj) {
        C42239InP c42239InP = (C42239InP) obj;
        C14360o3.A0B(c42239InP, 0);
        HY4 hy4 = this.A00.A0N;
        if (hy4 == null) {
            AbstractC31171DnF.A0t();
            throw C00O.createAndThrow();
        }
        return hy4.A0E(c42239InP.A00);
    }

    @Override // X.InterfaceC41501vz
    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int A03 = C0f9.A03(356425135);
        C42239InP c42239InP = (C42239InP) obj;
        int A0N = AbstractC167017dG.A0N(c42239InP, -1539565521);
        ContextualFeedFragment contextualFeedFragment = this.A00;
        HY4 hy4 = contextualFeedFragment.A0N;
        if (hy4 != null) {
            hy4.CtR(c42239InP.A00);
            HY4 hy42 = contextualFeedFragment.A0N;
            if (hy42 != null) {
                hy42.AVK();
                C0f9.A0A(768002969, A0N);
                C0f9.A0A(-1595416584, A03);
                return;
            }
        }
        C14360o3.A0F("adapter");
        throw C00O.createAndThrow();
    }
}
