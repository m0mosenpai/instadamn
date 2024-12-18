package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;

/* renamed from: X.FOm, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C34653FOm {
    public final boolean A00(UserSession userSession, E70 e70, boolean z) {
        boolean A04;
        C06090Tz c06090Tz;
        if (e70.A0v && !(A04 = E70.A04(e70)) && !e70.A0n && e70.A09 != 1012 && !(e70.A08() instanceof MsysThreadId) && E70.A00(e70) == 1) {
            if (!C32107E9f.A00(e70).A2O() || C18U.A06(C06090Tz.A05, userSession, 36321688018822840L)) {
                if (!AbstractC31224Do7.A04(AbstractC31171DnF.A0n(e70.A0c), e70.A0C(), A04)) {
                    if (z) {
                        c06090Tz = C06090Tz.A05;
                    } else {
                        c06090Tz = C06090Tz.A06;
                    }
                    if (AbstractC31177DnL.A1U(c06090Tz, userSession, 36321688018757303L)) {
                        return true;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }
}
