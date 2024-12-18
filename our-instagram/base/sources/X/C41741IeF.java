package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.IeF, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41741IeF {
    public final C18920wW A00;
    public final Long A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final boolean A05;
    public final String A06;

    public C41741IeF(UserSession userSession, InterfaceC60442pS interfaceC60442pS, Long l, String str, String str2, String str3, String str4, boolean z) {
        AbstractC25233BEq.A0w(1, userSession, str, str2);
        this.A00 = AbstractC12220kQ.A01(interfaceC60442pS, userSession);
        this.A03 = str;
        this.A02 = str2;
        this.A06 = str3;
        this.A04 = str4;
        this.A01 = l;
        this.A05 = z;
    }

    public static final EnumC39650Hif A00(String str) {
        if (str != null) {
            if (str.equals("cart")) {
                return EnumC39650Hif.A03;
            }
            if (str.equals("wish_list")) {
                return EnumC39650Hif.A0B;
            }
            return EnumC39650Hif.A09;
        }
        return EnumC39650Hif.A0A;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.0Zx, X.38B] */
    public static final C38B A01(C41741IeF c41741IeF, String str) {
        ?? c0Zx = new C0Zx();
        c0Zx.A06("shopping_session_id", c41741IeF.A03);
        AbstractC37300Gc1.A0v(c0Zx, c41741IeF.A02);
        AbstractC37300Gc1.A0w(c0Zx, c41741IeF.A06);
        AbstractC37303Gc4.A0z(c0Zx, "submodule", str);
        return c0Zx;
    }

    public static final void A02(EnumC39651Hig enumC39651Hig, EnumC39644HiZ enumC39644HiZ, EnumC39650Hif enumC39650Hif, EnumC39649Hie enumC39649Hie, C41741IeF c41741IeF) {
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c41741IeF.A00, "commerce_storefront_click");
        if (A0f.isSampled()) {
            A0f.A8R(enumC39644HiZ, "referral_surface");
            AbstractC37300Gc1.A0t(A0f, c41741IeF.A03);
            A0f.A8R(enumC39651Hig, "analytics_component");
            A0f.A8R(enumC39649Hie, "analytics_page");
            A0f.A8R(enumC39650Hif, "analytics_module");
            A0f.AAP("navigation_chain", AbstractC25225BEi.A14());
            A0f.Cht();
        }
    }

    public static final void A03(EnumC39651Hig enumC39651Hig, EnumC39644HiZ enumC39644HiZ, EnumC39650Hif enumC39650Hif, EnumC39649Hie enumC39649Hie, C41741IeF c41741IeF) {
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c41741IeF.A00, "commerce_tab_feed_click");
        if (A0f.isSampled()) {
            A0f.A8R(enumC39651Hig, "analytics_component");
            A0f.A8R(enumC39649Hie, "analytics_page");
            A0f.A8R(enumC39644HiZ, "referral_surface");
            AbstractC37300Gc1.A0t(A0f, c41741IeF.A03);
            A0f.A8R(enumC39650Hif, "analytics_module");
            A0f.AAP("navigation_chain", AbstractC25225BEi.A14());
            A0f.Cht();
        }
    }
}
