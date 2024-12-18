package X;

import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.session.UserSession;

/* renamed from: X.CGy, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC27627CGy {
    public static final void A00(InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str, String str2, String str3, boolean z) {
        String str4;
        C14360o3.A0B(userSession, 0);
        C18920wW A01 = AbstractC12220kQ.A01(interfaceC11380iw, userSession);
        if (z) {
            str4 = "thumbs_up";
        } else {
            str4 = "thumbs_down";
        }
        C25531Mh c25531Mh = new C25531Mh(AbstractC166987dD.A0f(A01, "gen_ai_response_feedback"), 162);
        if (AbstractC25226BEj.A1Z(c25531Mh)) {
            c25531Mh.A0R("feedback_surface", str3);
            c25531Mh.A0R("feedback_type", str4);
            c25531Mh.A0R(TraceFieldType.RequestID, str);
            c25531Mh.A0R("response_id", str2);
            c25531Mh.Cht();
        }
    }
}
