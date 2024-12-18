package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* loaded from: classes5.dex */
public final class CU0 {
    public final FragmentActivity A00;
    public final UserSession A01;
    public final InterfaceC60442pS A02;

    public final void A00(C38321qM c38321qM, C75113Zb c75113Zb, Integer num) {
        long j;
        Long A0j;
        AbstractC167017dG.A1N(c38321qM, c75113Zb);
        InterfaceC60442pS interfaceC60442pS = this.A02;
        UserSession userSession = this.A01;
        String A2u = c38321qM.A2u();
        String A0o = AbstractC25233BEq.A0o(c38321qM);
        String A1G = AbstractC25226BEj.A1G(c38321qM);
        int position = c75113Zb.getPosition();
        C25531Mh c25531Mh = new C25531Mh(AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC60442pS, userSession), "instagram_clips_viewer_link_tap"), 289);
        if (AbstractC25226BEj.A1Z(c25531Mh)) {
            c25531Mh.A0R("containermodule", interfaceC60442pS.getModuleName());
            if (A2u != null && (A0j = AbstractC166997dE.A0j(A2u)) != null) {
                j = A0j.longValue();
            } else {
                j = 0;
            }
            c25531Mh.A0Q("media_id", Long.valueOf(j));
            ((AbstractC02600Aj) c25531Mh).A00.A8p("media_index", Integer.valueOf(position));
            c25531Mh.A0R("viewer_session_id", "");
            c25531Mh.A0Q("media_author_id", AbstractC25233BEq.A0n(A0o));
            c25531Mh.A0R("chaining_session_id", "");
            c25531Mh.A0M(BQL.A0Y, "action");
            c25531Mh.A0M(EnumC120795dP.A02, "action_source");
            c25531Mh.A0R("chaining_session_id", "");
            c25531Mh.A0R("ranking_info_token", A1G);
            c25531Mh.Cht();
        }
        ((C47719L5g) C27S.A00().A00.getValue()).A00(this.A00, new C29092CsJ(c75113Zb), interfaceC60442pS, userSession, c38321qM, num, null);
    }

    public CU0(FragmentActivity fragmentActivity, UserSession userSession, InterfaceC60442pS interfaceC60442pS) {
        this.A00 = fragmentActivity;
        this.A01 = userSession;
        this.A02 = interfaceC60442pS;
    }
}
