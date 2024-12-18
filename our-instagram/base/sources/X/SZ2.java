package X;

import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;

/* loaded from: classes10.dex */
public final class SZ2 {
    public final C18920wW A00;
    public final UserSession A01;
    public final String A02;
    public final String A03;
    public final boolean A04;

    public static final void A00(SZ2 sz2, String str, String str2) {
        if (sz2.A04) {
            String str3 = sz2.A03;
            if (AbstractC167007dF.A1N(str3.length())) {
                C0w9.A03("Browser logger", "Error getting null IAB Session Id");
                return;
            }
            if (str2 != null && str2.length() != 0) {
                C0w9.A03("Browser logger", str2);
            }
            C25531Mh A0A = AbstractC31171DnF.A0A(AbstractC166987dD.A0f(sz2.A00, "iab_link_history_ux"), 179);
            if (!AbstractC25226BEj.A1Z(A0A)) {
                return;
            }
            A0A.A0R("sub_event", str);
            AbstractC58318PtA.A1J(A0A, str3);
            AbstractC58319PtB.A1F(A0A, System.currentTimeMillis());
            A0A.A0O("is_prefetch", false);
            A0A.A0R("error_info", str2);
            A0A.Cht();
        }
    }

    public final void A01(String str, String str2) {
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(this.A00, "mwb_safe_browsing_warning_events");
        if (A0f.isSampled()) {
            A0f.AAP("event_name", str2);
            A0f.AAP(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str);
            A0f.AAP("clicked_url", "");
            A0f.Cht();
        }
    }

    public SZ2(UserSession userSession, String str, String str2, boolean z) {
        AbstractC167017dG.A1P(userSession, str);
        this.A01 = userSession;
        this.A03 = str;
        this.A04 = z;
        this.A02 = str2;
        this.A00 = AbstractC12220kQ.A01(new C19270xB(str2), userSession);
    }
}
