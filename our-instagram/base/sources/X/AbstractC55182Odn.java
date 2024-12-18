package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Odn, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC55182Odn {
    public static final C1ON A02(UserSession userSession, Integer num, String str) {
        String str2;
        AbstractC167007dF.A1D(str, 1, num);
        C25621Ms A0c = AbstractC167017dG.A0c(userSession);
        A0c.A0L("live/%s/mute/audio/", str);
        if (num.intValue() != 0) {
            str2 = "unmuted";
        } else {
            str2 = "muted";
        }
        A0c.A9s("audio_mute", str2);
        return AbstractC31172DnG.A0R(null, A0c, C40781ul.class, C55702hA.class, true);
    }

    public static final C1ON A03(UserSession userSession, Integer num, String str) {
        String str2;
        AbstractC167007dF.A1D(str, 1, num);
        C25621Ms A0c = AbstractC167017dG.A0c(userSession);
        A0c.A0L("live/%s/mute/video/", str);
        if (num.intValue() != 0) {
            str2 = "unmuted";
        } else {
            str2 = "muted";
        }
        A0c.A9s("video_mute", str2);
        return AbstractC31172DnG.A0R(null, A0c, C40781ul.class, C55702hA.class, true);
    }

    public static final C1ON A04(UserSession userSession, Integer num, String str, String str2) {
        String str3;
        AbstractC167007dF.A1E(str, 0, userSession);
        C25621Ms A0c = AbstractC167017dG.A0c(userSession);
        A0c.A0L("live/%s/wave/", str);
        A0c.A9s("viewer_id", str2);
        if (num.intValue() != 0) {
            str3 = "wave_back";
        } else {
            str3 = "wave";
        }
        A0c.A9s("wave_type", str3);
        return MSZ.A0U(A0c);
    }

    public static final C1ON A05(UserSession userSession, String str, boolean z) {
        C14360o3.A0B(str, 1);
        C25621Ms A0M = AbstractC31177DnL.A0M(userSession);
        A0M.A0L("live/%s/info/", str);
        A0M.A0I("view_expired_broadcast", z);
        A0M.A9s("include_guests_in_vod", "false");
        return AbstractC31172DnG.A0R(null, A0M, C105824pt.class, C41655Ibn.class, true);
    }

    public static final C25621Ms A00(UserSession userSession, String str) {
        C25621Ms A0c = AbstractC167017dG.A0c(userSession);
        A0c.A0L("live/%s/heartbeat_and_get_viewer_count/", str);
        A0c.A0R(C67842UzF.class, C69989Vz8.class);
        return A0c;
    }

    public static final C1ON A01(UserSession userSession) {
        C25621Ms A0D = AbstractC31179DnN.A0D(userSession);
        A0D.A0B("users/live_settings/");
        return AbstractC25227BEk.A0e(A0D, N39.class, C54862ONn.class);
    }
}
