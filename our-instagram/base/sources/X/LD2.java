package X;

import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.RealtimeConstants;

/* loaded from: classes8.dex */
public abstract class LD2 {
    public static final String A00(C6Z6 c6z6) {
        int ordinal = c6z6.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    return "other";
                }
                throw B4Z.A00();
            }
            return "stories";
        }
        return RealtimeConstants.GRAPHQL_SUBSCRIPTION_MESSAGE_TOPIC_FOR_DIRECT_TYPING;
    }

    public static final void A01(UserSession userSession, Long l, String str, String str2, String str3) {
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A02(userSession), "ig_immersive_media");
        if (A0f.isSampled()) {
            A0f.AAP("event_type", str);
            A0f.AAP("surface", str2);
            A0f.A9K("time_ms", l);
            A0f.AAP(DialogModule.KEY_MESSAGE, str3);
            A0f.Cht();
        }
    }
}
