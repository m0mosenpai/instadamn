package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.model.thread.CreatorSubscriberThreadInfo;

/* renamed from: X.F2w, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34094F2w {
    public static final boolean A00(UserSession userSession, E70 e70) {
        AbstractC167007dF.A1K(userSession, e70);
        if (!E70.A04(e70) || e70.A0i || !e70.A0v) {
            return false;
        }
        boolean A0E = e70.A0E(userSession.userId);
        int i = e70.A09;
        String str = null;
        if (i != 28) {
            if (i != 29) {
                if (i != 32) {
                    if (i != 61) {
                        if (i != 62) {
                            return false;
                        }
                    }
                }
                return A0E;
            }
            C81543kP c81543kP = e70.A0E;
            if (c81543kP != null) {
                str = c81543kP.A07;
            }
            if (AbstractC31171DnF.A1W(userSession, str) && C18U.A06(C06090Tz.A05, userSession, 36315846865915518L)) {
                return true;
            }
            return false;
        }
        CreatorSubscriberThreadInfo creatorSubscriberThreadInfo = e70.A0G;
        if (creatorSubscriberThreadInfo != null) {
            str = creatorSubscriberThreadInfo.A02;
        }
        return AbstractC31171DnF.A1W(userSession, str);
    }
}
