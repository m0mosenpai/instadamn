package X;

import android.location.Location;
import com.instagram.common.session.UserSession;

/* renamed from: X.ObW, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC55112ObW {
    public static final Location A00(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        C1VW c1vw = C1VW.A00;
        if (c1vw != null) {
            return c1vw.getLastLocation(userSession, 10800000L, 50000.0f, true, "UserSearchApi");
        }
        return null;
    }

    public static final C1ON A02(UserSession userSession, C51642MrZ c51642MrZ) {
        C14360o3.A0B(userSession, 0);
        return AbstractC25227BEk.A0e(A01(userSession, c51642MrZ), C168027ex.class, C168037ey.class);
    }

    public static final C1ON A03(UserSession userSession, C51642MrZ c51642MrZ) {
        C222015v c222015v;
        C14360o3.A0B(userSession, 0);
        C25621Ms A01 = A01(userSession, c51642MrZ);
        if (c51642MrZ.A02 != null) {
            C52073N1y c52073N1y = C52073N1y.A00;
            c222015v = AbstractC221915u.A00;
            C14360o3.A08(c222015v);
        } else {
            c222015v = null;
        }
        return AbstractC31172DnG.A0R(c222015v, A01, C68085V9q.class, C69988Vz7.class, false);
    }

    public static final C25621Ms A01(UserSession userSession, C51642MrZ c51642MrZ) {
        String str;
        Location A00 = A00(userSession);
        String str2 = null;
        C25621Ms A0M = AbstractC31177DnL.A0M(userSession);
        A0M.A0B("users/search/");
        A0M.A9s("q", c51642MrZ.A04);
        A0M.A9s("count", Integer.toString(c51642MrZ.A00));
        if (A00 != null) {
            str = Double.valueOf(A00.getLatitude()).toString();
        } else {
            str = null;
        }
        A0M.A9s("lat", str);
        if (A00 != null) {
            str2 = Double.valueOf(A00.getLongitude()).toString();
        }
        A0M.A9s("lng", str2);
        A0M.A9s("timezone_offset", Long.toString(C23831Eq.A00()));
        A0M.A9s("search_surface", c51642MrZ.A06);
        A0M.A0H("rank_token", c51642MrZ.A05);
        A0M.A0H("page_token", c51642MrZ.A03);
        A0M.A0H("audio_cluster_id_for_coauthoring_check", c51642MrZ.A01);
        A0M.A0H("for_post_in_group_id", c51642MrZ.A02);
        A0M.A9s("return_unconnected_private", "true");
        if (c51642MrZ.A09) {
            A0M.A9s("sponsor_profile_only", "true");
        }
        if (c51642MrZ.A07) {
            A0M.A9s("branded_content_creator_only", "true");
        }
        if (c51642MrZ.A0A) {
            A0M.A9s("support_professional_sticker_search", "true");
        }
        return A0M;
    }
}
