package X;

import com.instagram.common.session.UserSession;
import java.util.Map;

/* renamed from: X.Nw5, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC54107Nw5 {
    public static final void A00(UserSession userSession, String str, String str2, String str3, String str4, Map map) {
        String str5;
        C14360o3.A0B(userSession, 0);
        boolean A00 = C196218mC.A00(userSession);
        boolean A002 = C196008lp.A00(userSession);
        if (str2 != null) {
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A02(userSession), "ig_fb_xposting_client");
            EnumC222416a A0I = AbstractC166997dE.A0Y(userSession).A0I();
            AbstractC31171DnF.A1G(A0f, str2);
            A0f.AAP("event_name", str);
            MSW.A1U(A0f, str4);
            A0f.AAP("ig_userid", userSession.userId);
            A0f.A7v("story_auto_xposting_status", AbstractC31173DnH.A0d(A0f, AbstractC31173DnH.A0e(A0f, AbstractC31188DnX.A00(), str3, A00), "feed_auto_xposting_status", A002));
            if (A0I != null) {
                str5 = String.valueOf(A0I.A00);
            } else {
                str5 = null;
            }
            A0f.AAP("ig_user_account_type", str5);
            if (map == null) {
                map = AbstractC06930Yk.A0E();
            }
            A0f.A9M("story_pinned_elements", map);
            A0f.Cht();
        }
    }
}
