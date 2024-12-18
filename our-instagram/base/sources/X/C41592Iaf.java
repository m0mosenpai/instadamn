package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Iaf, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41592Iaf {
    public final long A00;
    public final C18920wW A01;
    public final C38321qM A02;
    public final String A03;
    public final boolean A04;
    public final UserSession A05;

    public static final void A00(C41592Iaf c41592Iaf, String str) {
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c41592Iaf.A01, "instagram_shopping_merchant_product_action_sheet_action");
        AbstractC37300Gc1.A0i(A0f, Long.valueOf(c41592Iaf.A00));
        AbstractC37301Gc2.A17(A0f, c41592Iaf.A03);
        AbstractC31171DnF.A1C(A0f, str);
        AbstractC37301Gc2.A1B(A0f, c41592Iaf.A04);
        AbstractC37303Gc4.A0f(A0f, c41592Iaf.A02);
        A0f.Cht();
    }

    public C41592Iaf(UserSession userSession, C38321qM c38321qM, InterfaceC60442pS interfaceC60442pS, String str, String str2, boolean z) {
        this.A05 = userSession;
        this.A00 = AbstractC167027dH.A03(str);
        this.A03 = str2;
        this.A04 = z;
        this.A02 = c38321qM;
        this.A01 = AbstractC12220kQ.A01(interfaceC60442pS, userSession);
    }
}
