package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.Locale;

/* renamed from: X.Fd6, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC35095Fd6 {
    public static void A00(Context context, C1P1 c1p1, UserSession userSession, User user, String str, String str2, boolean z, boolean z2, boolean z3) {
        String id = user.getId();
        AbstractC167007dF.A1H(userSession, 0, str2);
        String str3 = null;
        C25621Ms A0c = AbstractC167017dG.A0c(userSession);
        A0c.A0B("friendships/mute_posts_or_story_from_follow/");
        A0c.A9s("container_module", str2);
        if (z) {
            A0c.A9s("target_posts_author_id", id);
        }
        if (z2) {
            A0c.A9s("target_reel_author_id", id);
        }
        if (str != null && str.length() != 0) {
            A0c.A9s("media_id", str);
            C38321qM A02 = C1DX.A03.A02(userSession, "MuteUserApi", str);
            if (A02 != null) {
                str3 = AbstractC25226BEj.A1G(A02);
            }
            A0c.A0H("ranking_info_token", str3);
        }
        A0c.A0P(null, EDR.class, C34858FXs.class, false);
        C1ON A0P = AbstractC31176DnK.A0P(A0c);
        A0P.A00 = new EU4(context, c1p1, AbstractC25651Mw.A00(userSession), userSession, user, z, z2, z3);
        C1GJ.A03(A0P);
    }

    public static void A02(C1P1 c1p1, UserSession userSession, User user, String str) {
        String id = user.getId();
        AbstractC167007dF.A1F(userSession, 0, str);
        C25621Ms A0c = AbstractC167017dG.A0c(userSession);
        A0c.A0B("friendships/unmute_posts_or_story_from_follow/");
        A0c.A9s("container_module", str);
        A0c.A9s("target_reel_author_id", id);
        C1ON A0D = AbstractC31175DnJ.A0D(A0c, EDR.class, C34858FXs.class, true);
        A0D.A00 = new EU2(c1p1, AbstractC25651Mw.A00(userSession), userSession, user, false, true);
        C1GJ.A03(A0D);
    }

    public static void A01(Context context, C1P1 c1p1, UserSession userSession, User user, String str, boolean z) {
        String str2;
        String id = user.getId();
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(str, 3);
        if (z) {
            str2 = "mute_note";
        } else {
            str2 = "unmute_note";
        }
        C25621Ms A0c = AbstractC167017dG.A0c(userSession);
        String format = String.format(Locale.getDefault(), "friendships/%s/", AbstractC166997dE.A1b(str2, 1));
        C14360o3.A07(format);
        A0c.A0E = format;
        A0c.A9s("container_module", str);
        AbstractC31171DnF.A1J(A0c, id);
        C1ON A0D = AbstractC31175DnJ.A0D(A0c, EDR.class, C34858FXs.class, true);
        A0D.A00 = new EU0(3, AbstractC25651Mw.A00(userSession), c1p1, context, user, z);
        C1GJ.A03(A0D);
    }
}
