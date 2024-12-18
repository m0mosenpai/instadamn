package X;

import instagram.features.feed.fragment.ContextualFeedFragment;

/* renamed from: X.Ged, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37459Ged implements C3CQ {
    public final /* synthetic */ ContextualFeedFragment A00;

    @Override // X.C3CQ
    public final boolean AJk(C38321qM c38321qM) {
        C14360o3.A0B(c38321qM, 0);
        HY4 hy4 = this.A00.A0N;
        if (hy4 == null) {
            AbstractC31171DnF.A0t();
            throw C00O.createAndThrow();
        }
        return hy4.A0E(c38321qM);
    }

    @Override // X.C3CQ
    public final void DSP(C38321qM c38321qM) {
        C14360o3.A0B(c38321qM, 0);
        ContextualFeedFragment contextualFeedFragment = this.A00;
        HY4 hy4 = contextualFeedFragment.A0N;
        if (hy4 != null) {
            hy4.CtR(c38321qM);
            HY4 hy42 = contextualFeedFragment.A0N;
            if (hy42 != null) {
                hy42.AVK();
                return;
            }
        }
        C14360o3.A0F("adapter");
        throw C00O.createAndThrow();
    }

    public C37459Ged(ContextualFeedFragment contextualFeedFragment) {
        this.A00 = contextualFeedFragment;
    }
}
