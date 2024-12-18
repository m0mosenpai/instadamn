package X;

import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.session.UserSession;
import java.util.HashMap;

/* loaded from: classes4.dex */
public final class AGF {
    public final C0JM A00;
    public final C73593Rl A01;
    public final C94E A02;
    public final C2048694u A03;
    public final UserSession A04;

    public static final void A00(AGF agf, String str, HashMap hashMap, boolean z) {
        InterfaceC10260gi interfaceC10260gi = agf.A03.A00;
        if (interfaceC10260gi != null && interfaceC10260gi.AhA(36325699518674217L)) {
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A02(agf.A04), "dcp_prediction_score");
            if (A0f.isSampled()) {
                A0f.A7v("is_success", Boolean.valueOf(z));
                A0f.AAP(TraceFieldType.FailureReason, str);
                A0f.AAP("features", hashMap.toString());
                A0f.AAP(MSV.A00(110), "odml_swipe_up");
                A0f.Cht();
            }
        }
    }

    public AGF(C0JM c0jm, C73593Rl c73593Rl, C94E c94e, UserSession userSession, C2048694u c2048694u) {
        AbstractC167027dH.A13(c0jm, c2048694u, c94e);
        C14360o3.A0B(userSession, 5);
        this.A00 = c0jm;
        this.A03 = c2048694u;
        this.A02 = c94e;
        this.A01 = c73593Rl;
        this.A04 = userSession;
    }
}
