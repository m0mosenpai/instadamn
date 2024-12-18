package X;

import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;
import instagram.features.feed.fragment.ContextualFeedFragment;

/* renamed from: X.GoC, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38023GoC implements InterfaceC114745Gf {
    public final /* synthetic */ ContextualFeedFragment A00;

    @Override // X.InterfaceC114745Gf
    public final void D3N(C38321qM c38321qM, C75113Zb c75113Zb) {
        ContextualFeedFragment contextualFeedFragment = this.A00;
        User A2E = c38321qM.A2E(ContextualFeedFragment.A00(contextualFeedFragment));
        if (A2E != null && A2E.A0F() == FollowStatus.A06) {
            C1ON A00 = AbstractC40595HzF.A00(ContextualFeedFragment.A00(contextualFeedFragment), A2E.getId());
            A00.A00 = new HGR(3, A2E, c75113Zb, contextualFeedFragment, false);
            contextualFeedFragment.schedule(A00);
        }
    }

    public C38023GoC(ContextualFeedFragment contextualFeedFragment) {
        this.A00 = contextualFeedFragment;
    }
}
