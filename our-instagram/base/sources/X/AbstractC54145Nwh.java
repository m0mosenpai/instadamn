package X;

import com.facebook.common.callercontext.CallerContext;
import com.instagram.common.session.UserSession;
import com.instagram.model.sharelater.ShareLaterMedia;
import com.instagram.realtimeclient.RealtimeSubscription;

/* renamed from: X.Nwh, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC54145Nwh {
    public static C1ON A00(UserSession userSession, ShareLaterMedia shareLaterMedia, String str, String str2) {
        String str3;
        C25621Ms c25621Ms = new C25621Ms(userSession);
        String str4 = shareLaterMedia.A05;
        c25621Ms.A0L("media/%s/share/", str4);
        c25621Ms.A05();
        c25621Ms.A0S(C40781ul.class, C55702hA.class);
        c25621Ms.A9s("media_id", str4);
        c25621Ms.A9s("caption", shareLaterMedia.A04);
        if (shareLaterMedia.A07) {
            C131995xZ A00 = C196068lw.A00(userSession).A00(CallerContext.A01("ShareLaterApi"));
            String str5 = A00.A03;
            if (C196068lw.A02(A00)) {
                str3 = "PAGE";
            } else {
                str3 = "USER";
            }
            c25621Ms.A9s("waterfall_id", str);
            c25621Ms.A9s("share_to_facebook", RealtimeSubscription.GRAPHQL_MQTT_VERSION);
            c25621Ms.A9s("share_to_fb_destination_type", str3);
            c25621Ms.A9s("share_to_fb_destination_id", str5);
            c25621Ms.A9s("no_token_crosspost", RealtimeSubscription.GRAPHQL_MQTT_VERSION);
            if (str5.isEmpty()) {
                AbstractC35784FrM.A01(userSession, str2);
            }
        }
        return c25621Ms.A0N();
    }
}
