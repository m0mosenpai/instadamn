package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.7JJ, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C7JJ {
    public static final boolean A00(UserSession userSession, C2EC c2ec) {
        if ((!AbstractC23021Ah.A00(userSession).A01.getBoolean("bc_custom_themes_has_seen_creation_tooltip", false)) && c2ec.BI1() != 8 && c2ec.C7g() == 29 && c2ec.CfH(userSession.userId)) {
            return true;
        }
        return false;
    }
}
