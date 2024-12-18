package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.F1f, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34052F1f {
    public static final void A00(UserSession userSession, String str) {
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC31176DnK.A0N(userSession), "send_quick_message");
        if (A0f.isSampled()) {
            A0f.AAP("target_id", str);
            A0f.AAP("view_module", "activity_feed");
            A0f.AAP("request_type", MSV.A00(515));
            A0f.Cht();
        }
    }
}
