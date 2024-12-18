package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectShareTarget;

/* renamed from: X.Fek, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35143Fek {
    public static final C35143Fek A00 = new Object();

    public static final C2EC A00(UserSession userSession, DirectShareTarget directShareTarget) {
        InterfaceC83713oG A0O = AbstractC31171DnF.A0O(directShareTarget);
        if (AbstractC140946Yw.A08(A0O)) {
            C81663kb A0W = AbstractC31176DnK.A0W((C2DU) AbstractC28761aE.A00(userSession), JRE.A01(AbstractC140946Yw.A06(A0O)));
            if (A0W instanceof C2EC) {
                return A0W;
            }
        }
        return null;
    }

    public final boolean A01(UserSession userSession, DirectShareTarget directShareTarget) {
        boolean A1a = AbstractC167017dG.A1a(userSession, directShareTarget);
        C2EC A002 = A00(userSession, directShareTarget);
        if (A002 != null && A002.CWO() == A1a) {
            return true;
        }
        return false;
    }
}
