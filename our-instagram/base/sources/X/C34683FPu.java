package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.FPu, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C34683FPu {
    public final InterfaceC11380iw A00;
    public final C18920wW A01;
    public final UserSession A02;

    public final void A00(String str, String str2, String str3) {
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(this.A01, "ig_detected_outcomes_funnel");
        if (A0f.isSampled()) {
            A0f.AAP("event_type", str);
            A0f.AAP("flow_step", "settings_entrypoint");
            A0f.AAP("seller_country", str2);
            A0f.AAP("seller_igid", str3);
            A0f.Cht();
        }
    }

    public C34683FPu(UserSession userSession) {
        this.A02 = userSession;
        C19270xB A0D = AbstractC31171DnF.A0D("AutomaticOrderDetectionLogger");
        this.A00 = A0D;
        this.A01 = AbstractC12220kQ.A01(A0D, userSession);
    }
}
