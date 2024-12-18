package X;

import com.instagram.common.session.UserSession;
import java.util.Map;

/* renamed from: X.7Uo, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7Uo {
    public final UserSession A00;
    public final InterfaceC19630xq A01;
    public final InterfaceC19390xP A02;

    public C7Uo(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = C1AT.A01(userSession).A04(C1AV.A0z, getClass());
        this.A02 = AbstractC011604e.A00(C05F.A00, C0JE.A00(new C9DH(this, null, 41)), Integer.MAX_VALUE);
    }

    public static final Map A00(C7Uo c7Uo) {
        String string = c7Uo.A01.getString("map_of_story_sparkle_seen_timestamps", null);
        if (string != null && string.length() != 0) {
            return (Map) AbstractC73763Sg.A03.A00(string, new C3RL(C3RD.A01, C3RJ.A00));
        }
        return AbstractC06930Yk.A0E();
    }

    public static final Map A01(C7Uo c7Uo) {
        String string = c7Uo.A01.getString("map_of_seen_story_reply_sparkles", null);
        if (string != null && string.length() != 0) {
            return (Map) AbstractC73763Sg.A03.A00(string, new C3RL(C3RD.A01, C192398fh.A00));
        }
        return AbstractC06930Yk.A0E();
    }

    public static final void A02(C7Uo c7Uo, Map map) {
        InterfaceC19610xo ARD = c7Uo.A01.ARD();
        ARD.E7K("map_of_story_sparkle_seen_timestamps", AbstractC73763Sg.A03.A02(map, new C3RL(C3RD.A01, C3RJ.A00)));
        ARD.apply();
    }

    public static final void A03(C7Uo c7Uo, Map map) {
        InterfaceC19610xo ARD = c7Uo.A01.ARD();
        ARD.E7K("map_of_seen_story_reply_sparkles", AbstractC73763Sg.A03.A02(map, new C3RL(C3RD.A01, C192398fh.A00)));
        ARD.apply();
    }

    public final void A04() {
        InterfaceC19630xq interfaceC19630xq = this.A01;
        for (String str : interfaceC19630xq.getAll().keySet()) {
            if (str != null) {
                C14360o3.A0B("last_time_ms_seen_creator_ai_nux", 1);
                if (str.startsWith("last_time_ms_seen_creator_ai_nux")) {
                    InterfaceC19610xo ARD = interfaceC19630xq.ARD();
                    ARD.EEj(str);
                    ARD.apply();
                }
            }
        }
    }
}
