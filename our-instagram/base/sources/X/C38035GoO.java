package X;

import instagram.features.feed.fragment.ContextualFeedFragment;

/* renamed from: X.GoO, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38035GoO implements InterfaceC161877Mx {
    public final /* synthetic */ ContextualFeedFragment A00;

    @Override // X.InterfaceC161877Mx
    public final boolean AJn(String str) {
        C14360o3.A0B(str, 0);
        HY4 hy4 = this.A00.A0N;
        if (hy4 == null) {
            AbstractC31171DnF.A0t();
            throw C00O.createAndThrow();
        }
        return hy4.AJn(str);
    }

    public C38035GoO(ContextualFeedFragment contextualFeedFragment) {
        this.A00 = contextualFeedFragment;
    }

    @Override // X.InterfaceC161877Mx
    public final void FAg() {
        HY4 hy4 = this.A00.A0N;
        if (hy4 == null) {
            AbstractC31171DnF.A0t();
            throw C00O.createAndThrow();
        }
        hy4.AVK();
    }
}
