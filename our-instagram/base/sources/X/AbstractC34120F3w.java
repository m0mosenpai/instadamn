package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.F3w, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34120F3w {
    public static final int A00(UserSession userSession, C7TT c7tt) {
        C1118752z c1118752z = c7tt.A0N;
        Integer num = c1118752z.A00;
        Integer num2 = c1118752z.A01;
        boolean CPf = AbstractC160497Hj.A01(userSession, c7tt, true).CPf(userSession, c7tt);
        if (num != null) {
            if (!CPf || num2 != null) {
                C35224FgH c35224FgH = C35224FgH.A00;
                C81613kW c81613kW = c7tt.A0G;
                int intValue = num.intValue();
                Integer num3 = null;
                if (CPf) {
                    num3 = num2;
                }
                if (c35224FgH.A03(userSession, c81613kW, num3, intValue)) {
                    if (CPf && num2 != null) {
                        return num2.intValue();
                    }
                    return intValue;
                }
            } else {
                return 86400;
            }
        }
        if (!CPf) {
            return C6X6.A00(userSession, c7tt.A0G);
        }
        return 86400;
    }
}
