package X;

import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.7JI, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C7JI {
    public static final boolean A00(UserSession userSession, C2EC c2ec) {
        boolean z;
        Integer CIW;
        List CIX;
        C23031Ai A00 = AbstractC23021Ah.A00(userSession);
        if (C14360o3.A0K(c2ec.CTd(), true) && (CIW = c2ec.CIW()) != null && CIW.intValue() > 0 && ((CIX = c2ec.CIX()) == null || CIX.isEmpty())) {
            z = true;
        } else {
            z = false;
        }
        if ((!A00.A01.getBoolean("broadcast_channel_crossposting_nux_tooltip_shown", false)) && ((Boolean) A00.A2R.CES(A00, C23031Ai.A8c[452])).booleanValue() && c2ec.C7g() == 29 && C14360o3.A0K(c2ec.Asv(), userSession.userId) && z && C7HD.A04(userSession, false)) {
            return true;
        }
        return false;
    }
}
