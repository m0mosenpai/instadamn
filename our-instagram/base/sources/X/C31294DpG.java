package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.DpG, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31294DpG {
    public final C18920wW A00;

    public final void A01(long j, String str, long j2, String str2) {
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(this.A00, "ig_birthday_opt_in_dismissed");
        if (A0f.isSampled()) {
            A0f.A9K("celebrant_id", Long.valueOf(j));
            A00(A0f, Long.valueOf(j2), str, str2, null);
        }
    }

    public static void A00(InterfaceC02590Ai interfaceC02590Ai, Long l, String str, String str2, String str3) {
        interfaceC02590Ai.A9K("viewer_id", l);
        interfaceC02590Ai.AAP("surface", str);
        interfaceC02590Ai.AAP(AbstractC111324zv.A00(930), str2);
        interfaceC02590Ai.AAP("option", str3);
        interfaceC02590Ai.AAP("device_os", "android");
        interfaceC02590Ai.Cht();
    }

    public final void A02(String str, String str2, String str3, long j, long j2) {
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(this.A00, "ig_birthday_opt_in_clicked");
        if (A0f.isSampled()) {
            A0f.A9K("celebrant_id", Long.valueOf(j));
            A00(A0f, Long.valueOf(j2), str, str2, str3);
        }
    }

    public C31294DpG(InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        AbstractC167017dG.A1P(userSession, interfaceC11380iw);
        C12210kP c12210kP = new C12210kP(userSession);
        c12210kP.A00 = interfaceC11380iw;
        this.A00 = c12210kP.A00();
    }
}
