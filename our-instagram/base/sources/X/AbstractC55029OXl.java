package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.OXl, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC55029OXl {
    public static final void A01(UserSession userSession, C84923qg c84923qg, C38321qM c38321qM) {
        c84923qg.A0O = true;
        c84923qg.A02++;
        AbstractC166987dD.A10(userSession).equals(AbstractC25226BEj.A14(c38321qM));
    }

    public static final void A02(UserSession userSession, C84923qg c84923qg, C38321qM c38321qM) {
        c84923qg.A0O = false;
        c84923qg.A02 = Math.max(0, c84923qg.A02 - 1);
        AbstractC166987dD.A10(userSession).equals(AbstractC25226BEj.A14(c38321qM));
    }

    public static final C84923qg A00(C84923qg c84923qg, C38321qM c38321qM) {
        String str = c84923qg.A0F;
        C40041tV c40041tV = c38321qM.A0d;
        if (str != null) {
            C84923qg A00 = c40041tV.A05.A00(str);
            if (A00 != null) {
                for (C84923qg c84923qg2 : A00.A0L) {
                    if (C14360o3.A0K(c84923qg2, c84923qg)) {
                        return c84923qg2;
                    }
                }
                return null;
            }
            return null;
        }
        return c40041tV.A05.A00(c84923qg.A0G);
    }
}
