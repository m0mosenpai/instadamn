package X;

import com.instagram.common.session.UserSession;
import java.util.Map;

/* renamed from: X.Fzi, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36288Fzi implements InterfaceC13000lm {
    public final long A00;
    public final C18920wW A01;
    public final UserSession A02;
    public final String A03 = AbstractC167017dG.A0j();

    public static final void A00(C36288Fzi c36288Fzi, Integer num, String str, String str2, String str3, String str4, String str5, Map map) {
        C25531Mh A0E = C25531Mh.A0E(c36288Fzi.A01);
        if (AbstractC25226BEj.A1Z(A0E)) {
            AbstractC31180DnO.A1M(A0E, str3, str4, c36288Fzi.A00);
            A0E.A0o(str5);
            A0E.A0p("thread_view");
            A0E.A0h(AbstractC31179DnN.A0Z(A0E, AbstractC147806l5.A01(num), str, str2));
            AbstractC31175DnJ.A1E(A0E, c36288Fzi.A03, map);
        }
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        this.A02.A03(C36288Fzi.class);
    }

    public C36288Fzi(UserSession userSession) {
        this.A02 = userSession;
        this.A00 = AbstractC31178DnM.A03(AbstractC25231BEo.A0j(0, userSession.userId));
        C12210kP c12210kP = new C12210kP(userSession);
        c12210kP.A01 = "creator_broadcast_chat";
        this.A01 = c12210kP.A00();
    }
}
