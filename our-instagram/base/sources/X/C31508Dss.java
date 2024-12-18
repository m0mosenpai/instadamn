package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Dss, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31508Dss {
    public final UserSession A00;

    public C31508Dss(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
    }

    public final void A00(C18920wW c18920wW, String str, String str2) {
        C14360o3.A0B(c18920wW, 0);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c18920wW, "ig_status_impression");
        if (A0f.isSampled()) {
            A0f.A9K("author_id", Long.valueOf(AbstractC25232BEp.A0t(AbstractC003100w.A0k(10, str))));
            A0f.A9K("media_id", Long.valueOf(AbstractC25232BEp.A0t(AbstractC003100w.A0k(10, ""))));
            A0f.A9K("inventory_count", AbstractC167007dF.A0d());
            A0f.AAP("status_text", "");
            A0f.AAP("emoji", "");
            AbstractC31171DnF.A1G(A0f, "profile");
            A0f.AAP("audio_cluster_id", str2);
            A0f.Cht();
        }
    }
}
