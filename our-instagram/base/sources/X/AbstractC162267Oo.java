package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.7Oo, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC162267Oo {
    public static final void A00(UserSession userSession, boolean z) {
        C14360o3.A0B(userSession, 0);
        AbstractC23021Ah.A00(userSession).A13("ai_agent_assistant_disclaimer_accepted", z);
    }

    public static final void A01(UserSession userSession, boolean z) {
        C14360o3.A0B(userSession, 0);
        AbstractC23021Ah.A00(userSession).A13("ai_agent_character_disclaimer_accepted", z);
    }

    public static final boolean A02(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        C23031Ai A00 = AbstractC23021Ah.A00(userSession);
        C14360o3.A0B("ai_agent_assistant_disclaimer_accepted", 0);
        return A00.A01.getBoolean("ai_agent_assistant_disclaimer_accepted", false);
    }

    public static final boolean A03(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        C23031Ai A00 = AbstractC23021Ah.A00(userSession);
        C14360o3.A0B("ai_agent_character_disclaimer_accepted", 0);
        return A00.A01.getBoolean("ai_agent_character_disclaimer_accepted", false);
    }
}
