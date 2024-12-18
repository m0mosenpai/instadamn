package X;

import com.instagram.common.session.UserSession;
import java.util.Locale;

/* renamed from: X.9NO, reason: invalid class name */
/* loaded from: classes4.dex */
public abstract class C9NO {
    public static final C1ON A00(UserSession userSession, String str, String str2) {
        String format = String.format(Locale.US, "music/track/%s/lyrics/", AbstractC166997dE.A1b(str, 1));
        C14360o3.A07(format);
        C25621Ms c25621Ms = new C25621Ms(userSession, -2);
        c25621Ms.A06();
        c25621Ms.A0E = format;
        c25621Ms.A9s("audio_asset_id", str);
        c25621Ms.A9s("audio_cluster_id", str2);
        c25621Ms.A0R(C214409ee.class, C209269Ni.class);
        c25621Ms.A04();
        c25621Ms.A0A = format;
        ((AbstractC23721Ec) c25621Ms).A00 = 0L;
        return c25621Ms.A0N();
    }
}
