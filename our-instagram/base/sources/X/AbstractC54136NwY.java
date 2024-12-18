package X;

import android.app.Activity;
import android.content.DialogInterface;
import com.instagram.common.session.UserSession;

/* renamed from: X.NwY, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC54136NwY {
    public static final void A00(Activity activity, DialogInterface.OnClickListener onClickListener, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C41181vS c41181vS) {
        C38321qM c38321qM;
        C14360o3.A0B(userSession, 2);
        C193328hC A0H = AbstractC31171DnF.A0H(activity);
        A0H.A0A(2131974522);
        A0H.A09(2131974521);
        C25531Mh A0C = C25531Mh.A0C(AbstractC12220kQ.A01(interfaceC11380iw, userSession));
        if (c41181vS != null) {
            c38321qM = c41181vS.A0b;
        } else {
            c38321qM = null;
        }
        if (AbstractC25226BEj.A1Z(A0C) && c38321qM != null) {
            String id = c38321qM.getId();
            if (id == null) {
                id = "";
            }
            A0C.A0l(id);
            A0C.A0Q("m_t", AbstractC31171DnF.A0V(c38321qM.BRp().A00));
            Double A0Y = MSY.A0Y();
            A0C.A0P("time_elapsed", A0Y);
            A0C.A0P("time_remaining", A0Y);
            A0C.A0R("tray_session_id", "");
            A0C.A0R("viewer_session_id", AbstractC166997dE.A0n());
            A0C.A0R("reel_id", c41181vS.A0k);
            A0C.A0j("tap");
            A0C.A0R("tapped_entity", "story_template_delete_button");
            A0C.Cht();
        }
        A0H.A0M(onClickListener, 2131957640);
        AbstractC31176DnK.A14(DialogInterfaceOnClickListenerC55306OgU.A00, A0H);
    }
}
