package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes11.dex */
public final class W99 {
    public final InterfaceC11380iw A00;
    public final C18920wW A01;
    public final InterfaceC72022XFk A02;
    public final OHQ A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final UserSession A07;

    public static String A00(InterfaceC02590Ai interfaceC02590Ai, W99 w99) {
        interfaceC02590Ai.AAP("container_module", w99.A00.getModuleName());
        String str = C1QM.A00.A02.A00;
        if (str == null) {
            return "";
        }
        return str;
    }

    public static void A01(InterfaceC02590Ai interfaceC02590Ai, W99 w99) {
        interfaceC02590Ai.AAP("text_response_id", w99.A03.A00());
    }

    public W99(InterfaceC11380iw interfaceC11380iw, UserSession userSession, InterfaceC72022XFk interfaceC72022XFk, OHQ ohq, String str, String str2, String str3) {
        this.A00 = interfaceC11380iw;
        this.A07 = userSession;
        this.A05 = str;
        this.A06 = str2;
        this.A04 = str3;
        this.A02 = interfaceC72022XFk;
        this.A03 = ohq;
        this.A01 = AbstractC12220kQ.A01(interfaceC11380iw, userSession);
    }
}
