package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.6Yv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC140936Yv {
    public static final String[] A00 = {"😍", "😢", "🔥"};

    public static final boolean A00(UserSession userSession) {
        Boolean CZQ;
        InterfaceC19630xq interfaceC19630xq = AbstractC23021Ah.A00(userSession).A01;
        return interfaceC19630xq.getInt("composer_reaction_animation_seen_count", 0) == 0 && interfaceC19630xq.getInt("story_reaction_sent_count", 0) == 0 && (interfaceC19630xq.getInt("session_count", 0) + 1) % 2 == 0 && (CZQ = C17060sy.A01.A01(userSession).A03.CZQ()) != null && CZQ.booleanValue() && C18U.A06(C06090Tz.A05, userSession, 36327726742846269L);
    }
}
