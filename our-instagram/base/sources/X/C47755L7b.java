package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.L7b, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C47755L7b {
    public final Context A00;
    public final InterfaceC11380iw A01;
    public final UserSession A02;
    public final C43931Jbg A03;

    public final void A00(C83403nh c83403nh, C2EC c2ec, L9G l9g) {
        String A0g;
        UserSession userSession = this.A02;
        if (c83403nh.A1e(userSession) || (c83403nh.A10 == C2EY.A0z && c83403nh.A1W())) {
            Context context = this.A00;
            User A04 = C4GQ.A04(userSession, c83403nh, c2ec);
            if (A04 != null) {
                C45093JxN A02 = AbstractC101604hV.A02(context, userSession, c83403nh, A04, C4GQ.A06(c2ec));
                C48734Lh2 c48734Lh2 = new C48734Lh2(A02, l9g);
                String A0h = c83403nh.A0h();
                if (A0h != null && (A0g = c83403nh.A0g()) != null) {
                    this.A03.A01(context, this.A01, c48734Lh2, A02, c2ec, A0h, A0g);
                    return;
                }
                return;
            }
            throw AbstractC166997dE.A0g();
        }
        C7KF c7kf = l9g.A03;
        C9GR.A0F(c7kf.A05, "failed_to_load_media_toast", 2131962084);
        C7KF.A00(c7kf);
    }

    public C47755L7b(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        this.A00 = context;
        this.A02 = userSession;
        this.A01 = interfaceC11380iw;
        this.A03 = new C43931Jbg(userSession);
    }
}
