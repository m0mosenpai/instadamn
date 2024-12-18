package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Nxl, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC54207Nxl {
    public static final boolean A00(UserSession userSession, C173637oF c173637oF, C51716Msl c51716Msl) {
        Integer num = c51716Msl.A03;
        if (num != null) {
            int intValue = num.intValue();
            if (intValue == 0) {
                return false;
            }
            if (intValue != 1) {
                if (intValue == 2 && (!c173637oF.A09 || !C18U.A06(C06090Tz.A05, userSession, 36321907062089607L))) {
                    return false;
                }
            } else {
                return c173637oF.A09;
            }
        }
        return true;
    }
}
