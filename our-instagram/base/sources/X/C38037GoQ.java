package X;

import instagram.features.feed.fragment.ContextualFeedFragment;

/* renamed from: X.GoQ, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38037GoQ implements InterfaceC41501vz {
    public final /* synthetic */ ContextualFeedFragment A00;

    public C38037GoQ(ContextualFeedFragment contextualFeedFragment) {
        this.A00 = contextualFeedFragment;
    }

    @Override // X.InterfaceC41501vz
    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int A03 = C0f9.A03(-234074807);
        C42258Ini c42258Ini = (C42258Ini) obj;
        int A0N = AbstractC167017dG.A0N(c42258Ini, 1468468287);
        AbstractC37439GeJ abstractC37439GeJ = this.A00.A0B;
        if (abstractC37439GeJ == null) {
            C14360o3.A0F("contextualFeedController");
            throw C00O.createAndThrow();
        }
        abstractC37439GeJ.A0I(c42258Ini);
        C0f9.A0A(-570768996, A0N);
        C0f9.A0A(779466126, A03);
    }
}
