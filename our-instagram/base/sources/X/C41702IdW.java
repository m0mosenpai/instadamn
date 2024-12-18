package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.Product;

/* renamed from: X.IdW, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41702IdW {
    public C38321qM A00;
    public C38642Gyj A01;
    public final C18920wW A02;
    public final UserSession A03;
    public final JI6 A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final InterfaceC60442pS A08;

    public C41702IdW(UserSession userSession, InterfaceC60442pS interfaceC60442pS, JI6 ji6, String str, String str2, String str3) {
        AbstractC25229BEm.A1I(str, 3, userSession);
        this.A08 = interfaceC60442pS;
        this.A04 = ji6;
        this.A07 = str;
        this.A05 = str2;
        this.A06 = str3;
        this.A03 = userSession;
        this.A02 = AbstractC12220kQ.A01(interfaceC60442pS, userSession);
    }

    public final void A02(Product product, int i) {
        String str;
        C14360o3.A0B(product, 0);
        C38683GzO A03 = C128205qp.A03(this.A03, product);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(this.A02, "instagram_ads_app_hero_carousel_load_success");
        if (A0f.isSampled()) {
            C38642Gyj c38642Gyj = this.A01;
            if (c38642Gyj == null || (str = c38642Gyj.A05) == null) {
                str = "";
            }
            AbstractC37300Gc1.A0o(A0f, A00(A0f, this, str));
            A01(A0f, this, C38683GzO.A00(A0f, A03));
            AbstractC37304Gc5.A11(A0f, i);
            A0f.Cht();
        }
    }

    public static String A00(InterfaceC02590Ai interfaceC02590Ai, C41702IdW c41702IdW, String str) {
        String str2;
        interfaceC02590Ai.AAP("m_pk", str);
        C38642Gyj c38642Gyj = c41702IdW.A01;
        return (c38642Gyj == null || (str2 = c38642Gyj.A06) == null) ? "" : str2;
    }

    public static void A01(InterfaceC02590Ai interfaceC02590Ai, C41702IdW c41702IdW, Long l) {
        interfaceC02590Ai.A9K("product_id", l);
        interfaceC02590Ai.AAP("prior_module", c41702IdW.A05);
        interfaceC02590Ai.AAP("prior_submodule", c41702IdW.A06);
    }

    public final void A03(Product product, String str) {
        String str2;
        C38683GzO A03 = C128205qp.A03(this.A03, product);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(this.A02, "instagram_ads_app_cta_click");
        if (A0f.isSampled()) {
            C38642Gyj c38642Gyj = this.A01;
            if (c38642Gyj == null || (str2 = c38642Gyj.A05) == null) {
                str2 = "";
            }
            AbstractC37300Gc1.A0o(A0f, A00(A0f, this, str2));
            A01(A0f, this, C38683GzO.A00(A0f, A03));
            AbstractC31171DnF.A1C(A0f, str);
            A0f.AAP("url", product.A0F);
            A0f.Cht();
        }
    }
}
