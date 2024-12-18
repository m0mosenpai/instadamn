package X;

import instagram.features.feed.fragment.ContextualFeedFragment;

/* renamed from: X.GoG, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38027GoG implements InterfaceC64542wD {
    public final /* synthetic */ ContextualFeedFragment A00;

    @Override // X.InterfaceC64542wD
    public final void Ds9() {
    }

    public C38027GoG(ContextualFeedFragment contextualFeedFragment) {
        this.A00 = contextualFeedFragment;
    }

    @Override // X.InterfaceC64542wD
    public final void DsA() {
        ContextualFeedFragment contextualFeedFragment = this.A00;
        if (!contextualFeedFragment.A0V && !contextualFeedFragment.A0W) {
            C37445GeP c37445GeP = contextualFeedFragment.A0G;
            if (c37445GeP == null) {
                C14360o3.A0F("feedMediaLoadingTracker");
                throw C00O.createAndThrow();
            }
            c37445GeP.A08(null, false);
        }
    }
}
