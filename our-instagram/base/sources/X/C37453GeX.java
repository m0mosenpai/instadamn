package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import instagram.features.feed.fragment.ContextualFeedFragment;

/* renamed from: X.GeX, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37453GeX extends C155376yQ {
    public final /* synthetic */ ContextualFeedFragment A00;

    @Override // X.C155376yQ
    /* renamed from: A00 */
    public final boolean EjD(C38321qM c38321qM) {
        String str;
        C14360o3.A0B(c38321qM, 0);
        ContextualFeedFragment contextualFeedFragment = this.A00;
        AbstractC37439GeJ abstractC37439GeJ = contextualFeedFragment.A0B;
        if (abstractC37439GeJ != null) {
            if (abstractC37439GeJ instanceof C37434GeE) {
                C37434GeE c37434GeE = (C37434GeE) abstractC37439GeJ;
                UserSession userSession = c37434GeE.A05;
                User user = c37434GeE.A01;
                if (user != null) {
                    str = user.getId();
                } else {
                    str = null;
                }
                if (C2TN.A05(userSession, str) && AbstractC37452GeW.A00(c37434GeE.A07.A00) == EnumC125775mS.A0A) {
                    if (c38321qM.A0C.Bns() == null) {
                        return false;
                    }
                    return true;
                }
            }
            if (super.EjD(c38321qM) && c38321qM.A1y() == C3YU.A05) {
                AbstractC37439GeJ abstractC37439GeJ2 = contextualFeedFragment.A0B;
                if (abstractC37439GeJ2 != null) {
                    if (abstractC37439GeJ2.A0g(c38321qM)) {
                        return true;
                    }
                    return false;
                }
            } else {
                return false;
            }
        }
        C14360o3.A0F("contextualFeedController");
        throw C00O.createAndThrow();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C37453GeX(UserSession userSession, ContextualFeedFragment contextualFeedFragment) {
        super(userSession);
        this.A00 = contextualFeedFragment;
    }
}
