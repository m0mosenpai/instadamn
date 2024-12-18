package X;

import com.instagram.common.session.UserSession;
import java.util.Map;

/* renamed from: X.FaA, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C34924FaA {
    public final C18920wW A00;

    public C34924FaA(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = AbstractC12220kQ.A02(userSession);
    }

    public static final void A00(C34924FaA c34924FaA, String str, Map map) {
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c34924FaA.A00, "direct_custom_folder");
        AbstractC31171DnF.A1C(A0f, str);
        A0f.A9M("event_data", map);
        A0f.Cht();
    }
}
