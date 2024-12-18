package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.model.thread.CreatorBroadcastThreadInfo;
import com.instagram.direct.model.thread.CreatorSubscriberThreadInfo;
import com.instagram.model.direct.DirectShareTarget;

/* renamed from: X.DoE, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC31231DoE {
    public static final boolean A00(UserSession userSession, DirectShareTarget directShareTarget) {
        C14360o3.A0B(userSession, 0);
        if (directShareTarget.A05 == null && !C4GR.A02(directShareTarget.A01)) {
            CreatorBroadcastThreadInfo creatorBroadcastThreadInfo = directShareTarget.A04;
            if (creatorBroadcastThreadInfo != null && creatorBroadcastThreadInfo.A00 == 2) {
                return true;
            }
            return false;
        }
        return true;
    }

    public static final boolean A03(C81543kP c81543kP, int i) {
        return i == 29 && c81543kP != null && c81543kP.A00 == 2;
    }

    public static final boolean A01(UserSession userSession, DirectShareTarget directShareTarget) {
        C81663kb C76;
        AbstractC167017dG.A1N(userSession, directShareTarget);
        String A08 = directShareTarget.A08();
        if (A08 == null || (C76 = AbstractC28761aE.A00(userSession).C76(A08)) == null || C76.BI1() != 8) {
            return false;
        }
        return true;
    }

    public static final boolean A02(UserSession userSession, DirectShareTarget directShareTarget) {
        C81663kb B3T;
        CreatorSubscriberThreadInfo At4;
        Long l;
        AbstractC167017dG.A1N(userSession, directShareTarget);
        CreatorSubscriberThreadInfo creatorSubscriberThreadInfo = directShareTarget.A05;
        if (((creatorSubscriberThreadInfo != null && (l = creatorSubscriberThreadInfo.A01) != null) || ((B3T = AbstractC28761aE.A00(userSession).B3T(directShareTarget)) != null && (At4 = B3T.At4()) != null && (l = At4.A01) != null)) && l.longValue() < AbstractC31177DnL.A06()) {
            return true;
        }
        return false;
    }

    public static final boolean A04(C2EC c2ec) {
        if (!A03(((C81663kb) c2ec).A01.A0t, c2ec.C7g()) && !C4GR.A02(c2ec.C7g()) && !c2ec.CUM()) {
            return false;
        }
        return true;
    }
}
