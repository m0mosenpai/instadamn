package X;

import com.instagram.common.session.UserSession;
import java.io.IOException;

/* renamed from: X.2h8, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C55682h8 {
    public static final InterfaceC19630xq A00(UserSession userSession) {
        return ((C55692h9) userSession.A01(C55692h9.class, new C9EO(userSession, 10))).A00;
    }

    public final C55602h0 A01(UserSession userSession) {
        C55602h0 c55602h0 = null;
        String string = A00(userSession).getString("qp_cooldown_response_json", null);
        if (string != null) {
            try {
                c55602h0 = AbstractC55592gz.parseFromJson(C16V.A00(string));
                return c55602h0;
            } catch (IOException e) {
                AbstractC31546DtW.A00(userSession, C05F.A0N, "failed to parse stored QP cooldown response.", e);
            }
        }
        return c55602h0;
    }
}
