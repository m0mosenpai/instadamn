package X;

import com.instagram.api.schemas.RankingInfo;
import com.instagram.common.session.UserSession;
import com.instagram.shopping.model.analytics.ShoppingGuideLoggingInfo;
import com.instagram.shopping.model.analytics.ShoppingSearchLoggingInfo;
import com.instagram.user.model.Product;

/* renamed from: X.Idy, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41727Idy {
    public C38321qM A00;
    public C38642Gyj A01;
    public final C9CO A02;
    public final RankingInfo A03;
    public final C18920wW A04;
    public final C18920wW A05;
    public final UserSession A06;
    public final InterfaceC60442pS A07;
    public final ShoppingGuideLoggingInfo A08;
    public final ShoppingSearchLoggingInfo A09;
    public final JI6 A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;
    public final String A0F;
    public final String A0G;
    public final String A0H;

    public C41727Idy(RankingInfo rankingInfo, UserSession userSession, InterfaceC60442pS interfaceC60442pS, ShoppingGuideLoggingInfo shoppingGuideLoggingInfo, ShoppingSearchLoggingInfo shoppingSearchLoggingInfo, JI6 ji6, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        AnonymousClass309 anonymousClass309;
        C14360o3.A0B(str, 3);
        AbstractC167017dG.A1U(userSession, str4);
        C14360o3.A0B(str5, 8);
        this.A07 = interfaceC60442pS;
        this.A0A = ji6;
        this.A0G = str;
        this.A0F = str2;
        this.A0D = str3;
        this.A06 = userSession;
        this.A0E = str4;
        this.A0H = str5;
        this.A09 = shoppingSearchLoggingInfo;
        this.A08 = shoppingGuideLoggingInfo;
        this.A03 = rankingInfo;
        this.A0B = str6;
        this.A0C = str7;
        this.A04 = AbstractC12220kQ.A01(interfaceC60442pS, userSession);
        this.A05 = AbstractC12220kQ.A00(interfaceC60442pS, C12180kM.A05, userSession);
        C11520jB c11520jB = null;
        if ((interfaceC60442pS instanceof AnonymousClass309) && (anonymousClass309 = (AnonymousClass309) interfaceC60442pS) != null) {
            c11520jB = anonymousClass309.E6P();
        }
        this.A02 = C128205qp.A01(c11520jB);
    }

    public final void A03(Product product) {
        C14360o3.A0B(product, 0);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(this.A04, "instagram_shopping_ar_try_on_tag_entry_point_impression");
        AbstractC37303Gc4.A0j(A0f, product);
        AbstractC37301Gc2.A17(A0f, AbstractC37301Gc2.A0o(product.A0B));
        AbstractC37302Gc3.A10(A0f, product);
        AbstractC37300Gc1.A0s(A0f, this.A0E);
        AbstractC37300Gc1.A0f(A0f, A00(this, null));
        A0f.Cht();
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.0Zx, X.38B] */
    public static final C38B A00(C41727Idy c41727Idy, String str) {
        ?? c0Zx = new C0Zx();
        AbstractC37300Gc1.A0v(c0Zx, c41727Idy.A0F);
        AbstractC37300Gc1.A0w(c0Zx, c41727Idy.A0D);
        c0Zx.A06("shopping_session_id", c41727Idy.A0H);
        AbstractC37303Gc4.A0z(c0Zx, "submodule", str);
        return c0Zx;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [X.0Zx, X.Gww] */
    public static final C38535Gww A01(C41727Idy c41727Idy, C41726Idx c41726Idx) {
        ?? c0Zx = new C0Zx();
        Product product = c41726Idx.A08;
        if (product != null) {
            c0Zx.A05(AbstractC111324zv.A00(222), AbstractC25231BEo.A0j(0, product.A0H));
        }
        Product product2 = c41726Idx.A09;
        if (product2 != null) {
            c0Zx.A05("pdp_product_id", AbstractC25231BEo.A0j(0, product2.A0H));
            c0Zx.A00.put("pdp_merchant_id", C4SX.A00(AbstractC37302Gc3.A0d(product2)).F7g());
        }
        c0Zx.A06("central_pdp_version", c41727Idy.A0B);
        return c0Zx;
    }

    public static void A02(InterfaceC02590Ai interfaceC02590Ai, C41727Idy c41727Idy) {
        interfaceC02590Ai.AAP("prior_module", c41727Idy.A0F);
        interfaceC02590Ai.AAP("prior_submodule", c41727Idy.A0D);
    }

    public final void A04(Product product, String str) {
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(this.A04, "instagram_shopping_pdp_restock_reminder_tap");
        AbstractC37303Gc4.A0j(A0f, product);
        AbstractC37301Gc2.A17(A0f, str);
        AbstractC37300Gc1.A0m(A0f, "variant_selector");
        AbstractC37300Gc1.A0t(A0f, this.A0H);
        A02(A0f, this);
        AbstractC37302Gc3.A10(A0f, product);
        AbstractC37302Gc3.A0t(A0f);
        String str2 = this.A0C;
        if (str2 != null && !AbstractC001900j.A0T(str2)) {
            A0f.A9K("collection_page_id", AbstractC166997dE.A0j(str2));
        }
        A0f.Cht();
    }
}
