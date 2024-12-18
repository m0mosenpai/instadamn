package X;

import com.facebook.common.callercontext.CallerContext;
import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.RealtimeSubscription;

/* renamed from: X.Nxi, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC54204Nxi {
    public static final C25621Ms A00(UserSession userSession, Integer num, String str, String str2, String str3, String str4) {
        String str5;
        C14360o3.A0B(num, 5);
        C131995xZ A00 = C196068lw.A00(userSession).A00(CallerContext.A01("FacebookMediaShareApi"));
        String str6 = A00.A03;
        if (C196068lw.A02(A00)) {
            str5 = "PAGE";
        } else {
            str5 = "USER";
        }
        C25621Ms A0q = AbstractC25228BEl.A0q(userSession);
        A0q.A0L("media/%s/share/", str);
        A0q.A05();
        AbstractC31173DnH.A1N(A0q);
        A0q.A9s("media_id", str);
        A0q.A9s("caption", str2);
        A0q.A9s("xpost_surface", AbstractC54206Nxk.A00(num));
        A0q.A9s("share_to_fb_destination_type", str5);
        A0q.A9s("share_to_fb_destination_id", str6);
        A0q.A9s("share_to_facebook", RealtimeSubscription.GRAPHQL_MQTT_VERSION);
        A0q.A9s("no_token_crosspost", RealtimeSubscription.GRAPHQL_MQTT_VERSION);
        if (str6.length() == 0) {
            AbstractC35784FrM.A01(userSession, str4);
        }
        A0q.A9s("use_fb_post_time", RealtimeSubscription.GRAPHQL_MQTT_VERSION);
        if (str3 != null) {
            A0q.A9s("waterfall_id", str3);
        }
        return A0q;
    }
}
