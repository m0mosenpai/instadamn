package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.6mZ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C148646mZ {
    public C51622Yk A00;
    public boolean A01;
    public final Activity A02;
    public final View A03;
    public final UserSession A04;
    public final InterfaceC1118853a A05;
    public final AbstractC59962oe A06;

    public C148646mZ(Activity activity, View view, AbstractC59962oe abstractC59962oe, UserSession userSession, InterfaceC1118853a interfaceC1118853a) {
        C14360o3.A0B(userSession, 3);
        C14360o3.A0B(view, 4);
        this.A02 = activity;
        this.A06 = abstractC59962oe;
        this.A04 = userSession;
        this.A03 = view;
        this.A05 = interfaceC1118853a;
    }

    public final void A00(Context context, C41181vS c41181vS) {
        String str;
        String str2;
        User user;
        C105774po c105774po = c41181vS.A0B;
        C18C.A07(c105774po, "Share comment to story netego unit is missing comment share model.");
        if (c105774po != null) {
            InterfaceC38601qq interfaceC38601qq = c105774po.A00;
            C38321qM BQN = interfaceC38601qq.BQN();
            InterfaceC43555JLp Api = interfaceC38601qq.Api();
            if (Api != null) {
                str = Api.getOriginalCommentId();
            } else {
                str = null;
            }
            InterfaceC43555JLp Api2 = interfaceC38601qq.Api();
            if (Api2 != null) {
                str2 = Api2.getOriginalCommentText();
            } else {
                str2 = null;
            }
            if (BQN != null && str != null && str2 != null) {
                this.A05.EJE("dialog");
                Activity activity = this.A02;
                UserSession userSession = this.A04;
                AbstractC59962oe abstractC59962oe = this.A06;
                InterfaceC43555JLp Api3 = interfaceC38601qq.Api();
                if (Api3 != null) {
                    user = Api3.BZm();
                } else {
                    user = null;
                }
                C28422CgU.A00(activity, context, abstractC59962oe, C22P.A4p, userSession, BQN, user, str, str2);
            }
        }
    }

    public final void A01(C41181vS c41181vS) {
        C41181vS AuU = this.A05.AuU();
        if (AuU != null) {
            C105774po c105774po = AuU.A0B;
            C18C.A07(c105774po, "Share comment to story netego unit is missing comment share model.");
            if (c105774po != null) {
                String CAR = c105774po.A00.CAR();
                if (CAR == null) {
                    CAR = "";
                }
                UserSession userSession = this.A04;
                String str = c41181vS.A0j;
                C14360o3.A07(str);
                C3R6.A05(this.A06, userSession, null, "share_comment_to_story_netego", str, "cta_primary_click", CAR);
            }
        }
    }
}
