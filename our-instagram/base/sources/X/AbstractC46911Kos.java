package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Kos, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46911Kos {
    public static C1ON A00(UserSession userSession, String str, String str2, String str3, String str4, boolean z, boolean z2) {
        String str5;
        C25621Ms c25621Ms = new C25621Ms(userSession);
        c25621Ms.A0R = true;
        c25621Ms.A05();
        c25621Ms.A0S(EBS.class, C34787FUp.class);
        c25621Ms.A0L("direct_v2/visual_threads/%s/item_seen/", str2);
        c25621Ms.A9s("item_ids", AnonymousClass001.A0g("[", str3, "]"));
        c25621Ms.A0H("original_message_client_context", str4);
        if (!str.equals("voice_item_seen")) {
            if (str.equals("visual_item_seen")) {
                str5 = "raven_media";
            } else {
                throw AbstractC167007dF.A0c(AbstractC111324zv.A00(1675), str);
            }
        } else {
            str5 = "voice_media";
        }
        c25621Ms.A9s("target_item_type", str5);
        c25621Ms.A0J("is_shh_mode", z2);
        if (z) {
            c25621Ms.A9s("sampled", "true");
        }
        return c25621Ms.A0N();
    }
}
