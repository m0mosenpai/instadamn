package X;

import com.instagram.common.session.UserSession;
import java.util.Map;

/* renamed from: X.Fa9, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C34923Fa9 {
    public final C18920wW A00;

    public C34923Fa9(InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = AbstractC12220kQ.A01(interfaceC11380iw, userSession);
    }

    public static final void A00(C34923Fa9 c34923Fa9, String str, String str2, Map map) {
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c34923Fa9.A00, "direct_icebreaker_settings_events");
        if (A0f.isSampled()) {
            AbstractC31171DnF.A1C(A0f, str);
            A0f.A9M("event_data", map);
            A0f.AAP("error_message", str2);
            A0f.Cht();
        }
    }
}
