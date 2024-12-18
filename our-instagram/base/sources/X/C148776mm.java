package X;

import android.os.Parcelable;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;

/* renamed from: X.6mm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C148776mm {
    public final C145826hf A00;

    public final void A00(C41551w4 c41551w4, String str, double d) {
        C145826hf c145826hf = this.A00;
        UserSession userSession = c145826hf.A06;
        C41181vS A08 = c41551w4.A08(userSession);
        FollowStatus followStatus = null;
        if (A08.CY4()) {
            C38321qM c38321qM = A08.A0b;
            c38321qM.getClass();
            C145836hg A01 = C145826hf.A01(c41551w4.A0H, c145826hf);
            C18920wW A012 = AbstractC12220kQ.A01(A01, userSession);
            C25531Mh c25531Mh = new C25531Mh(A012.A00(A012.A00, "reel_viewer_gestures_nux"), 372);
            if (((AbstractC02600Aj) c25531Mh).A00.isSampled()) {
                c25531Mh.A0R("reel_viewer_gestures_nux_action", str);
                c25531Mh.A0R("tray_session_id", c145826hf.A0H);
                c25531Mh.A0R("viewer_session_id", c145826hf.A0E.getSessionId());
                c25531Mh.A0R("source_of_action", A01.getModuleName());
                Parcelable.Creator creator = User.CREATOR;
                User A2E = c38321qM.A2E(userSession);
                if (A2E != null) {
                    followStatus = A2E.B7L();
                }
                c25531Mh.A0R("follow_status", AbstractC38851rI.A06(followStatus));
                String id = c38321qM.getId();
                if (id != null) {
                    c25531Mh.A0l(id);
                    c25531Mh.A0Q("m_t", Long.valueOf(c38321qM.BRp().A00));
                    c25531Mh.A0Q("m_ts", Long.valueOf(c38321qM.A1B()));
                    c25531Mh.A0P("reel_viewer_gestures_nux_impression_duration", Double.valueOf(d));
                    c25531Mh.Cht();
                    return;
                }
                throw new IllegalStateException("Required value was null.");
            }
        }
    }

    public C148776mm(C145826hf c145826hf) {
        this.A00 = c145826hf;
    }
}
