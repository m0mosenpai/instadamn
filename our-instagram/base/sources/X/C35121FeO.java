package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.FeO, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35121FeO {
    public final C18920wW A00;
    public final String A01;

    public static InterfaceC02590Ai A00(C35121FeO c35121FeO) {
        C18920wW c18920wW = c35121FeO.A00;
        return c18920wW.A00(c18920wW.A00, "auto_confirm_action");
    }

    public static void A01(InterfaceC02590Ai interfaceC02590Ai, C35121FeO c35121FeO) {
        interfaceC02590Ai.AAP("module", c35121FeO.A01);
        interfaceC02590Ai.Cht();
    }

    public C35121FeO(InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        AbstractC167017dG.A1P(userSession, interfaceC11380iw);
        this.A00 = AbstractC12220kQ.A01(interfaceC11380iw, userSession);
        this.A01 = interfaceC11380iw.getModuleName();
    }
}
