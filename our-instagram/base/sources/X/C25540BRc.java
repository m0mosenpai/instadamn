package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.BRc, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25540BRc {
    public final InterfaceC11380iw A00;
    public final UserSession A01;
    public final C37604Ggz A02;

    public C25540BRc(InterfaceC11380iw interfaceC11380iw, UserSession userSession, C37604Ggz c37604Ggz) {
        AbstractC167027dH.A13(userSession, interfaceC11380iw, c37604Ggz);
        this.A01 = userSession;
        this.A00 = interfaceC11380iw;
        this.A02 = c37604Ggz;
    }

    public final void A00(Context context, C120985dq c120985dq, C37644Ghd c37644Ghd, String str, float f, float f2, float f3, float f4) {
        long j;
        Long l;
        int i;
        User A14;
        String A2u;
        Long A0j;
        AbstractC167017dG.A1O(context, c37644Ghd);
        UserSession userSession = this.A01;
        InterfaceC11380iw interfaceC11380iw = this.A00;
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC11380iw, userSession), "instagram_clips_playback_speed_changed");
        if (A0f.isSampled()) {
            AbstractC25229BEm.A1A(A0f, interfaceC11380iw);
            C38321qM c38321qM = c120985dq.A02;
            if (c38321qM != null && (A2u = c38321qM.A2u()) != null && (A0j = AbstractC166997dE.A0j(A2u)) != null) {
                j = A0j.longValue();
            } else {
                j = 0;
            }
            AbstractC25230BEn.A1B(A0f, j);
            AbstractC25229BEm.A19(A0f, c37644Ghd.A06());
            C37604Ggz c37604Ggz = this.A02;
            AbstractC25225BEi.A1P(A0f, c37604Ggz.A01);
            A0f.AAP("chaining_session_id", c37604Ggz.A00);
            AbstractC25233BEq.A17(A0f, "ranking_info_token", c120985dq.A0Q);
            C38321qM c38321qM2 = c120985dq.A02;
            if (c38321qM2 != null && (A14 = AbstractC25226BEj.A14(c38321qM2)) != null) {
                l = AbstractC25231BEo.A0k(A14);
            } else {
                l = null;
            }
            A0f.A9K("media_author_id", l);
            C75113Zb c75113Zb = c37644Ghd.A0E;
            if (c75113Zb != null) {
                i = c75113Zb.A05;
            } else {
                i = 0;
            }
            A0f.A8I(AbstractC111324zv.A00(4226), Double.valueOf(i));
            A0f.A9K(AbstractC111324zv.A00(2686), Long.valueOf(c37644Ghd.A08));
            A0f.A8I(AbstractC111324zv.A00(4265), Double.valueOf(AbstractC13890nF.A01(context)));
            A0f.A8I(AbstractC111324zv.A00(4263), Double.valueOf(AbstractC13890nF.A00(context)));
            A0f.A8I("playback_speed_from", Double.valueOf(f));
            A0f.A8I("playback_speed_to", Double.valueOf(f2));
            A0f.A8I("long_press_x_position", Double.valueOf(f3));
            A0f.A8I("long_press_y_position", Double.valueOf(f4));
            AbstractC25232BEp.A1L(A0f, "gesture_state", str);
        }
    }
}
