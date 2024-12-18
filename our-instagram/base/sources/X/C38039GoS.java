package X;

import instagram.features.feed.fragment.ContextualFeedFragment;

/* renamed from: X.GoS, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38039GoS implements InterfaceC42271xH {
    public final /* synthetic */ ContextualFeedFragment A00;

    public C38039GoS(ContextualFeedFragment contextualFeedFragment) {
        this.A00 = contextualFeedFragment;
    }

    @Override // X.InterfaceC42271xH
    public final /* bridge */ /* synthetic */ boolean A79(Object obj) {
        C42251Inb c42251Inb = (C42251Inb) obj;
        C14360o3.A0B(c42251Inb, 0);
        HY4 hy4 = this.A00.A0N;
        if (hy4 == null) {
            AbstractC31171DnF.A0t();
            throw C00O.createAndThrow();
        }
        return hy4.A0E(c42251Inb.A00);
    }

    @Override // X.InterfaceC41501vz
    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int A03 = C0f9.A03(909479876);
        C42251Inb c42251Inb = (C42251Inb) obj;
        int A0N = AbstractC167017dG.A0N(c42251Inb, -2036541997);
        HY4 hy4 = this.A00.A0N;
        if (hy4 == null) {
            AbstractC31171DnF.A0t();
            throw C00O.createAndThrow();
        }
        hy4.CtR(c42251Inb.A00);
        C0f9.A0A(1689138367, A0N);
        C0f9.A0A(837764033, A03);
    }
}
