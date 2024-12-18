package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.I0f, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40647I0f {
    public static final void A00(InterfaceC11380iw interfaceC11380iw, UserSession userSession, C38321qM c38321qM) {
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC11380iw, userSession), "ig_bottomsheet_done");
        if (A0f.isSampled()) {
            A0f.AAP("detail", "swipe_collapse");
            String A2u = c38321qM.A2u();
            if (A2u != null) {
                A0f.A9K("ig_media_id", AbstractC166997dE.A0j(A2u));
                AbstractC31175DnJ.A14(A0f, interfaceC11380iw);
                A0f.Cht();
                return;
            }
            throw AbstractC166997dE.A0g();
        }
    }
}
