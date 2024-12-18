package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public abstract class FCH {
    public static final C1ON A00(UserSession userSession, String str, String str2, String str3, String str4, boolean z) {
        String str5;
        C14360o3.A0B(userSession, 0);
        boolean A1a = AbstractC31175DnJ.A1a(str2);
        if (z) {
            str5 = "mute_media_note";
        } else {
            str5 = "unmute_media_note";
        }
        C25621Ms A0c = AbstractC167017dG.A0c(userSession);
        A0c.A0L("friendships/%s/", str5);
        A0c.A9s("container_module", str2);
        A0c.A9s("ranking_info_token", str3);
        AbstractC31171DnF.A1J(A0c, str);
        A0c.A9s(AbstractC43591JPw.A00(1164), str4);
        return AbstractC31175DnJ.A0D(A0c, C151516rx.class, C151526ry.class, A1a);
    }
}
