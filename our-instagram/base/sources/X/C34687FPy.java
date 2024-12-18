package X;

import com.instagram.common.session.UserSession;
import java.util.Map;

/* renamed from: X.FPy, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C34687FPy {
    public final C18920wW A00;
    public final InterfaceC11380iw A01;
    public final UserSession A02;

    public C34687FPy(InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A02 = userSession;
        this.A01 = interfaceC11380iw;
        this.A00 = AbstractC12220kQ.A01(interfaceC11380iw, userSession);
    }

    public final void A00(String str, Map map) {
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(this.A00, "instagram_wellbeing_safety_check_action");
        AbstractC31171DnF.A1E(A0f, "evergreen_safety_check");
        A0f.AAP("entrypoint", "quick_promotion");
        A0f.A9M("extra_values", map);
        AbstractC31171DnF.A1C(A0f, "click");
        AbstractC31171DnF.A1A(A0f, str);
        A0f.Cht();
    }
}
