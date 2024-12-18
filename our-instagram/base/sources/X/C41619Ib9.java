package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Ib9, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41619Ib9 {
    public final EnumC39651Hig A00;
    public final EnumC39644HiZ A01;
    public final EnumC39650Hif A02;
    public final EnumC39649Hie A03;
    public final C18920wW A04;
    public final UserSession A05;
    public final C38933HCg A06;
    public final String A07;
    public final String A08;
    public final String A09;

    public static void A00(InterfaceC02530Ab interfaceC02530Ab, InterfaceC02530Ab interfaceC02530Ab2, InterfaceC02590Ai interfaceC02590Ai, C41619Ib9 c41619Ib9) {
        interfaceC02590Ai.AAP("shopping_session_id", c41619Ib9.A09);
        interfaceC02590Ai.AAP("navigation_chain", C1QM.A00.A02.A00);
        interfaceC02590Ai.A8R(interfaceC02530Ab, "analytics_module");
        interfaceC02590Ai.A8R(interfaceC02530Ab2, "analytics_component");
        interfaceC02590Ai.A8R(EnumC39649Hie.A09, "analytics_page");
        interfaceC02590Ai.A8R(c41619Ib9.A01, "analytics_referral_experience");
        interfaceC02590Ai.A8R(c41619Ib9.A03, "analytics_referral_page");
        interfaceC02590Ai.A8R(c41619Ib9.A02, "analytics_referral_module");
        interfaceC02590Ai.A8R(c41619Ib9.A00, "analytics_referral_component");
        C0Zx c0Zx = new C0Zx();
        C38933HCg c38933HCg = c41619Ib9.A06;
        c0Zx.A04("scroll_depth_height", Double.valueOf(c38933HCg.A00));
        c0Zx.A04(AbstractC111324zv.A00(5581), Double.valueOf(((Number) c38933HCg.A03.getValue()).floatValue()));
        interfaceC02590Ai.AAQ(c0Zx, "scroll_logging_info");
        String str = c41619Ib9.A07;
        if (str != null) {
            interfaceC02590Ai.AAP("legacy_referral_surface", str);
        }
    }

    public C41619Ib9(EnumC39651Hig enumC39651Hig, EnumC39644HiZ enumC39644HiZ, EnumC39650Hif enumC39650Hif, EnumC39649Hie enumC39649Hie, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C38933HCg c38933HCg, String str, String str2, String str3) {
        AbstractC167017dG.A1Q(userSession, str);
        AbstractC25234BEr.A0k(4, enumC39644HiZ, enumC39649Hie, enumC39650Hif, enumC39651Hig);
        this.A04 = AbstractC12220kQ.A01(interfaceC11380iw, userSession);
        this.A05 = userSession;
        this.A09 = str;
        this.A01 = enumC39644HiZ;
        this.A03 = enumC39649Hie;
        this.A02 = enumC39650Hif;
        this.A00 = enumC39651Hig;
        this.A07 = str2;
        this.A08 = str3;
        this.A06 = c38933HCg;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x005b, code lost:
    
        if (r12 != null) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x011c, code lost:
    
        r1 = X.C38685GzQ.A00(r3, r8, r1);
        r0 = "signal_type";
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0118, code lost:
    
        r1 = r12.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0116, code lost:
    
        if (r12 != null) goto L83;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:8:0x002f. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A01(X.EnumC39651Hig r6, X.EnumC39650Hif r7, X.C38685GzQ r8, X.C38321qM r9, com.instagram.user.model.Product r10, com.instagram.user.model.User r11, java.lang.Integer r12, java.util.Map r13) {
        /*
            Method dump skipped, instructions count: 314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C41619Ib9.A01(X.Hig, X.Hif, X.GzQ, X.1qM, com.instagram.user.model.Product, com.instagram.user.model.User, java.lang.Integer, java.util.Map):void");
    }
}
