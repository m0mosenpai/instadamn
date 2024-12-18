package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public final class LFM {
    public static final LFM A00 = new Object();

    public final C25621Ms A00(UserSession userSession, C55U c55u, String str) {
        String str2;
        C25621Ms A0M = AbstractC31177DnL.A0M(userSession);
        A0M.A0B("media/sticker_tray_section/");
        if (c55u instanceof C81V) {
            str2 = "CLIPS";
        } else {
            str2 = "STORIES";
        }
        A0M.A9s("surface", str2);
        A0M.A9s("section_name", "custom_stickers");
        A0M.A9s("cutout_sticker_media_type_filter", null);
        A0M.A0A = "media/sticker_tray_section/";
        A0M.A08(C05F.A01);
        A0M.A0R(K8L.class, LBQ.class);
        if (str != null) {
            A0M.A9s("item_cursor", str);
        }
        return A0M;
    }
}
