package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;

/* renamed from: X.F2x, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34095F2x {
    public static final boolean A00(UserSession userSession, E70 e70) {
        if (!(e70.A08() instanceof MsysThreadId) && e70.A0v && (!C18U.A06(C06090Tz.A06, userSession, 36313905538140475L)) && !(AbstractC1345466e.A05(e70.A0L) instanceof MsysThreadId) && !E70.A04(e70) && !e70.A0n && !e70.A0d && !C14360o3.A0K(e70.A0N, "SPAM") && FUD.A01(e70.A0X)) {
            if (AbstractC166987dD.A10(userSession).A2I() && !C18U.A06(C06090Tz.A05, userSession, 36313905538009402L)) {
                return false;
            }
            return true;
        }
        return false;
    }
}
