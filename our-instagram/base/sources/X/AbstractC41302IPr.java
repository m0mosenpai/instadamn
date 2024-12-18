package X;

import com.facebook.react.views.webview.ReactWebViewManager;
import com.instagram.common.session.UserSession;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: X.IPr, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC41302IPr {
    public static final C1ON A00(UserSession userSession, Integer num, String str, String str2, boolean z, boolean z2, boolean z3, boolean z4) {
        C25621Ms A0c = AbstractC167017dG.A0c(userSession);
        A0c.A0B("clips/effect/");
        A0c.A0H("effect_id", str);
        AbstractC37304Gc5.A1A(A0c, C38953HDf.class, C41649Ibh.class, str2);
        A0c.A0I("should_show_friends_media_at_top", z4);
        if (num != null && !z && z2) {
            A0c.A0A = AnonymousClass001.A0R("effect_page_cache_", str);
            if (!z3) {
                ((AbstractC23721Ec) A0c).A01 = 900000L;
            }
            A0c.A07 = num;
        }
        return A0c.A0N();
    }

    public static final C1ON A01(UserSession userSession, String str) {
        String str2;
        String str3;
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            Charset forName = Charset.forName(ReactWebViewManager.HTML_ENCODING);
            C14360o3.A07(forName);
            byte[] bytes = "STELLA".getBytes(forName);
            C14360o3.A07(bytes);
            str2 = AbstractC167007dF.A0h(SUX.A00(messageDigest.digest(bytes)));
        } catch (NoSuchAlgorithmException e) {
            C0w9.A07("ray_ban_stories_pivot_page_sha_256", e);
            str2 = "2c432622994e30bbfd56e291ae9f9619c621ca92148c81450ee8f90b9659c6b8";
        }
        try {
            MessageDigest messageDigest2 = MessageDigest.getInstance("SHA-256");
            Charset forName2 = Charset.forName(ReactWebViewManager.HTML_ENCODING);
            C14360o3.A07(forName2);
            byte[] bytes2 = "HAMMERHEAD".getBytes(forName2);
            C14360o3.A07(bytes2);
            str3 = AbstractC167007dF.A0h(SUX.A00(messageDigest2.digest(bytes2)));
        } catch (NoSuchAlgorithmException e2) {
            C0w9.A07("ray_ban_stories_pivot_page_sha_256", e2);
            str3 = "2c432622994e30bbfd56e291ae9f9619c621ca92148c81450ee8f90b9659c6b8&6b5be410af4f029362a280f0d63fb1aceb8d6667c46d3a6201d882e0c1b116be";
        }
        String A0T = AnonymousClass001.A0T(str2, str3, '&');
        C25621Ms A0M = AbstractC31177DnL.A0M(userSession);
        A0M.A0B("metaverse_bridges/attribution_pivot_page/");
        A0M.A0R(EPD.class, FTY.class);
        AbstractC37304Gc5.A1B(A0M, "capture_source_hash", A0T, str);
        A0M.A9s("expanded_media", "true");
        return A0M.A0N();
    }
}
