package X;

import com.instagram.user.model.User;
import instagram.features.feed.fragment.ContextualFeedFragment;

/* renamed from: X.GoA, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38021GoA implements InterfaceC42271xH {
    public final /* synthetic */ ContextualFeedFragment A00;

    public C38021GoA(ContextualFeedFragment contextualFeedFragment) {
        this.A00 = contextualFeedFragment;
    }

    @Override // X.InterfaceC42271xH
    public final /* bridge */ /* synthetic */ boolean A79(Object obj) {
        C70073Cr c70073Cr = (C70073Cr) obj;
        C14360o3.A0B(c70073Cr, 0);
        if (!c70073Cr.A01 && !c70073Cr.A02) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC41501vz
    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        ContextualFeedFragment contextualFeedFragment;
        Object A01;
        C38321qM c38321qM;
        User A2E;
        String str;
        int A03 = C0f9.A03(779360230);
        C70073Cr c70073Cr = (C70073Cr) obj;
        int A0N = AbstractC167017dG.A0N(c70073Cr, 2049355948);
        if (c70073Cr.A01) {
            AbstractC37439GeJ abstractC37439GeJ = this.A00.A0B;
            if (abstractC37439GeJ == null) {
                str = "contextualFeedController";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            }
            abstractC37439GeJ.A0O(c70073Cr.A00);
        }
        if (c70073Cr.A02 && (A01 = ContextualFeedFragment.A01((contextualFeedFragment = this.A00))) != null && (A2E = (c38321qM = (C38321qM) A01).A2E(ContextualFeedFragment.A00(contextualFeedFragment))) != null) {
            C1ON A00 = AbstractC40595HzF.A00(ContextualFeedFragment.A00(contextualFeedFragment), A2E.getId());
            HY4 hy4 = contextualFeedFragment.A0N;
            if (hy4 == null) {
                str = "adapter";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            }
            A00.A00 = new HGR(3, A2E, hy4.BRZ(c38321qM), contextualFeedFragment, true);
            contextualFeedFragment.schedule(A00);
        }
        C0f9.A0A(1644844586, A0N);
        C0f9.A0A(2086974710, A03);
    }
}
