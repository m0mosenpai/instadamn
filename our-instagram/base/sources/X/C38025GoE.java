package X;

import com.instagram.user.model.User;
import instagram.features.feed.fragment.ContextualFeedFragment;

/* renamed from: X.GoE, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38025GoE implements InterfaceC42271xH {
    public final /* synthetic */ ContextualFeedFragment A00;

    @Override // X.InterfaceC42271xH
    public final /* bridge */ /* synthetic */ boolean A79(Object obj) {
        C14360o3.A0B(obj, 0);
        return true;
    }

    public C38025GoE(ContextualFeedFragment contextualFeedFragment) {
        this.A00 = contextualFeedFragment;
    }

    @Override // X.InterfaceC41501vz
    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int A03 = C0f9.A03(-31685250);
        C70063Cq c70063Cq = (C70063Cq) obj;
        int A0N = AbstractC167017dG.A0N(c70063Cq, 522192614);
        if (c70063Cq.A03) {
            User user = c70063Cq.A00;
            if (user.A1p() && c70063Cq.A02) {
                AbstractC37439GeJ abstractC37439GeJ = this.A00.A0B;
                if (abstractC37439GeJ == null) {
                    C14360o3.A0F("contextualFeedController");
                    throw C00O.createAndThrow();
                }
                abstractC37439GeJ.A0N(user);
            }
        }
        C0f9.A0A(-1671936097, A0N);
        C0f9.A0A(1654541274, A03);
    }
}
