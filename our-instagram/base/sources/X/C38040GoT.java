package X;

import instagram.features.feed.fragment.ContextualFeedFragment;

/* renamed from: X.GoT, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38040GoT implements InterfaceC42271xH {
    public final /* synthetic */ ContextualFeedFragment A00;

    public C38040GoT(ContextualFeedFragment contextualFeedFragment) {
        this.A00 = contextualFeedFragment;
    }

    @Override // X.InterfaceC42271xH
    public final /* bridge */ /* synthetic */ boolean A79(Object obj) {
        C36095FwV c36095FwV = (C36095FwV) obj;
        C14360o3.A0B(c36095FwV, 0);
        HY4 hy4 = this.A00.A0N;
        if (hy4 == null) {
            AbstractC31171DnF.A0t();
            throw C00O.createAndThrow();
        }
        return hy4.A0E(c36095FwV.A00);
    }

    @Override // X.InterfaceC41501vz
    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int A03 = C0f9.A03(-486729371);
        C36095FwV c36095FwV = (C36095FwV) obj;
        int A0N = AbstractC167017dG.A0N(c36095FwV, -1171131515);
        HY4 hy4 = this.A00.A0N;
        if (hy4 == null) {
            AbstractC31171DnF.A0t();
            throw C00O.createAndThrow();
        }
        hy4.notifyItemChanged(c36095FwV.A00);
        C0f9.A0A(-849504462, A0N);
        C0f9.A0A(-1083560314, A03);
    }
}
