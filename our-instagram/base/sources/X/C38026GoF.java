package X;

import instagram.features.feed.fragment.ContextualFeedFragment;

/* renamed from: X.GoF, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38026GoF implements InterfaceC42271xH {
    public final /* synthetic */ ContextualFeedFragment A00;

    public C38026GoF(ContextualFeedFragment contextualFeedFragment) {
        this.A00 = contextualFeedFragment;
    }

    @Override // X.InterfaceC42271xH
    public final /* bridge */ /* synthetic */ boolean A79(Object obj) {
        C70033Cn c70033Cn = (C70033Cn) obj;
        C14360o3.A0B(c70033Cn, 0);
        return c70033Cn.A01;
    }

    @Override // X.InterfaceC41501vz
    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        String id;
        int A03 = C0f9.A03(-758962237);
        C70033Cn c70033Cn = (C70033Cn) obj;
        int A0N = AbstractC167017dG.A0N(c70033Cn, 215323294);
        if (c70033Cn.A01 && (id = c70033Cn.A00.getId()) != null) {
            AbstractC37439GeJ abstractC37439GeJ = this.A00.A0B;
            if (abstractC37439GeJ == null) {
                C14360o3.A0F("contextualFeedController");
                throw C00O.createAndThrow();
            }
            abstractC37439GeJ.A0P(id);
        }
        C0f9.A0A(-442918710, A0N);
        C0f9.A0A(-395912909, A03);
    }
}
