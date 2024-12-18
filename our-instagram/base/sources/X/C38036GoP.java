package X;

import instagram.features.feed.fragment.ContextualFeedFragment;

/* renamed from: X.GoP, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38036GoP implements InterfaceC41501vz {
    public final /* synthetic */ ContextualFeedFragment A00;

    public C38036GoP(ContextualFeedFragment contextualFeedFragment) {
        this.A00 = contextualFeedFragment;
    }

    @Override // X.InterfaceC41501vz
    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int A03 = C0f9.A03(-532902339);
        C42254Ine c42254Ine = (C42254Ine) obj;
        int A0N = AbstractC167017dG.A0N(c42254Ine, 2100582906);
        AbstractC37439GeJ abstractC37439GeJ = this.A00.A0B;
        if (abstractC37439GeJ == null) {
            C14360o3.A0F("contextualFeedController");
            throw C00O.createAndThrow();
        }
        abstractC37439GeJ.A0J(c42254Ine);
        C0f9.A0A(-1708033452, A0N);
        C0f9.A0A(1005225048, A03);
    }
}
